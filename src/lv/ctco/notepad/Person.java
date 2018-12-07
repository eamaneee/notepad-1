package lv.ctco.notepad;

import java.time.LocalDate;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String gender;
    private LocalDate birthdate;

    public LocalDate getBirthdate() { return birthdate; }

    public void setBirthdate(LocalDate birthdate) { this.birthdate = birthdate; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() { return gender;}

    public void setGender(String gender) { this.gender = gender;}

    private String getFormattedBirthdate() {
        return birthdate.format(Main.DATE_FORMATTER);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        return firstName.contains(str)
                || lastName.contains(str)
                || email.contains(str)
                || phone.contains(str)
                || gender.contains(str)
                || getFormattedBirthdate().contains(str);
    }

    @Override
    public void askData() {
         firstName = Main.askString("First Name");
         lastName = Main.askString("Last Name");
         email = Main.askString("Email");
         phone = Main.askPhone("Phone");
         gender = Main.askString("Gender");
         birthdate = Main.askDate("Birthdate");

    }
}
