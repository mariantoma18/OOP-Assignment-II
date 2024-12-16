package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Phone implements TextAndCallFeatures {

  private int batteryLife = 24;

  ArrayList<Contact> contactList = new ArrayList<>();
  HashMap<String, ArrayList<String>> phoneMessages = new HashMap<>();
  ArrayList<String> calls = new ArrayList<>();

  /*
   *Method that make a phone call (Printing the phone number) and adding the phone number to an ArrayList of calls
   */
  @Override
  public void call(String callPhoneNumber) {

    System.out.println(
        "You have called the phone number: " + callPhoneNumber + " from your phone.");
    calls.add(callPhoneNumber);

    batteryLife -= 2;
  }

  /*
   * Method that sends a message based on the phone number;
   * The putIfAbsent method is used in case that the phone number does not exist in the phoneMessages HashMap;
   * That creates a new ArrayList (to add messages) for the provided phone number.
   * If the phone number already exist in the Map, the method is ignored.
   */
  @Override
  public void sendMessage(String phoneNumber, String messageContent) {
    if (messageContent.length() > 500) {
      System.out.println("Message too long\nMaximum 500 chars allowed!");
      return;
    }

    phoneMessages.putIfAbsent(phoneNumber, new ArrayList<>());

    phoneMessages.get(phoneNumber).add(messageContent);

    batteryLife -= 1;
  }

  /*
   *Method used to get the first message from a certain phone number
   */
  public void getFirstMessage(String phoneNumber) {
    ArrayList<String> messages = phoneMessages.get(phoneNumber);
    System.out.println(messages.get(0));
  }

  /*
   *Method used to get the second message from a certain phone number
   */
  public void getSecondMessage(String phoneNumber) {
    ArrayList<String> messages = phoneMessages.get(phoneNumber);
    System.out.println(messages.get(1));
  }

  /*
   *Method used to get a certain message from a certain phone number
   */
  public void getCertainMessage(String phoneNumber, int index) {
    ArrayList<String> messages = phoneMessages.get(phoneNumber);
    System.out.println(messages.get(index - 1));
  }

  public int getBatteryLife() {
    return batteryLife;
  }

  public void setBatteryLife(int currentBatteryLife) {
    this.batteryLife = currentBatteryLife;
  }

  /*
   * Method used to add a contact to contact list
   */
  public void addContact(int index, String phoneNumber, String firstName, String lastName) {
    Contact contact = new Contact(index, phoneNumber, firstName, lastName);
    contactList.add(contact);
  }

  /*
   * Method used to print the history of calls
   */
  public void viewHistory() {
    for (String call : calls) {
      System.out.println(call);
    }
  }

  /*
   * Method that display the list of contacts
   */
  public void displayContacts() {
    System.out.println("\n---Full ContactList---");
    for (Contact contact : contactList) {
      System.out.println(contact);
    }
  }
}
