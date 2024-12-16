package org.example;

import java.util.ArrayList;

public abstract class Samsung extends Phone {

  private String color;
  private String material;

  public Samsung(String material, String color) {
    this.material = material;
    this.color = color;
  }

  /*
   *Method that make a phone call (Printing the phone number) and adding the phone number to an ArrayList of calls
   */
  @Override
  public void call(String callPhoneNumber) {
    System.out.println(
        "You have called the phone number: " + callPhoneNumber + " from your Samsung.");
    calls.add(callPhoneNumber);
  }

  /*
   * Method that sends a message based on the phone number;
   * The putIfAbsent method is used in case that the phone number does not exist in the phoneMessages HashMap;
   * That creates a new ArrayList (to add messages) for the provided phone number.
   * If the phone number already exist in the Map, the method is ignored.
   */
  @Override
  public void sendMessage(String phoneNumber, String messageContent) {
    if (messageContent.length() > 100) {
      System.out.println("Message too long\nMaximum 100 chars allowed!");
      return;
    }

    phoneMessages.putIfAbsent(phoneNumber, new ArrayList<>());

    phoneMessages.get(phoneNumber).add(messageContent);
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

  /*
   * Method used to print the history of calls
   */
  public void viewHistory() {
    int index = 1;
    System.out.println("---Call History---\n");
    for (String call : calls) {
      System.out.println(index + ": " + call);
      index++;
    }
  }

  public String getColor() {
    return color;
  }

  public String getMaterial() {
    return material;
  }
}
