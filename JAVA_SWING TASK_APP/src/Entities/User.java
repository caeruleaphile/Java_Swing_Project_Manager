package Entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;
import java.util.regex.Pattern;

/**
 * Represents a user in the system.
 */
public class User implements Serializable {
    private final String id;
    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;
    private LocalDate birthDay;
    private String email;
    private String role;
    private final LocalDate registrationDate;
    private Sex sex;

    /**
     * Constructs a new User with the specified parameters.
     *
     * @param username    The username of the user.
     * @param password    The password of the user.
     * @param fullName    The full name of the user.
     * @param phoneNumber The phone number of the user.
     * @param birthDay    The birthday of the user.
     * @param email       The email address of the user.
     * @param role        The role of the user.
     * @param sex         The gender of the user.
     * @param skill
     */
    public User(String username, String password, String fullName, String phoneNumber, LocalDate birthDay, String email, String role, Sex sex, Skill skill) {
        this.id = generateRandomId();
        setUsername(username);
        setPassword(password);
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
        setBirthDay(birthDay);
        setEmail(email);
        this.role = role;
        this.registrationDate = LocalDate.now();
        this.sex = sex;
    }


    /**
     * Generates a random alphanumeric ID.
     *
     * @return The randomly generated alphanumeric ID.
     */
    private String generateRandomId() {
        int length = 4;
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String generatedId = "";

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            generatedId += characters.charAt(randomIndex);
        }

        return generatedId;
    }



    /**
     * Sets the phone number of the user.
     *
     * @param phoneNumber The phone number to be set.
     * @throws IllegalArgumentException if the phone number is invalid.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    /**
     * Checks if the provided phone number is valid.
     *
     * @param phoneNumber The phone number to be validated.
     * @return true if the phone number is valid, false otherwise.
     */
    private boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches("\\+?[0-9. ()-]{10,25}", phoneNumber);
    }

    /**
     * Sets the full name of the user.
     *
     * @param fullName The full name to be set.
     * @throws IllegalArgumentException if the full name is null or empty.
     */
    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Full name cannot be null or empty");
        }
        this.fullName = fullName;
    }

    /**
     * Sets the username of the user.
     *
     * @param username The username to be set.
     * @throws IllegalArgumentException if the username is null or empty.
     */
    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the birthday of the user.
     *
     * @param birthDay The birthday to be set.
     * @throws IllegalArgumentException if the birthday is in the future.
     */
    public void setBirthDay(LocalDate birthDay) {
        if (birthDay.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birthday cannot be in the future");
        }
        this.birthDay = birthDay;
    }

    /**
     * Sets the email address of the user.
     *
     * @param email The email address to be set.
     * @throws IllegalArgumentException if the email address is invalid.
     */
    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }

    /**
     * Checks if the provided email address is valid.
     *
     * @param email The email address to be validated.
     * @return true if the email address is valid, false otherwise.
     */
    private boolean isValidEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
    }

    /**
     * Sets the password of the user.
     *
     * @param password The password to be set.
     * @throws IllegalArgumentException if the password is null, empty, or doesn't meet the criteria.
     */
    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }

        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Password must include at least one uppercase letter, one lowercase letter, one digit, and one special character");
        }

        this.password = password;
    }

    /**
     * Checks if the provided password meets the criteria.
     *
     * @param password The password to be validated.
     * @return true if the password is valid, false otherwise.
     */
    private boolean isValidPassword(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).+$");
    }


}
