package org.example;


public class Contact {

  int index;
  String phoneNumber;
  String firstName;
  String lastName;

  public Contact(int index, String phoneNumber, String firstName, String lastName) {
    this.index = index;
    this.phoneNumber = phoneNumber;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public String toString() {
    return "Contact{"
        + index
        + ", phoneNumber='"
        + phoneNumber
        + '\''
        + ", firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + '}';
  }
}
