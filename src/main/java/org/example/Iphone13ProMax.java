package org.example;

import java.util.ArrayList;

public class Iphone13ProMax extends Iphone {

  private static final String IMEI = "35 567890 123456 2";
  private int currentBatteryLife = super.getBatteryLife();

  public Iphone13ProMax(String material, String color) {
    super(material, color);
  }

  /*
   *Method that make a phone call (Printing the phone number) and adding the phone number to an ArrayList of calls
   */
  @Override
  public void call(String callPhoneNumber) {
    System.out.println(
        "You have called the phone number: " + callPhoneNumber + " from your Iphone 13 Pro Max .");
    calls.add(callPhoneNumber);

    setBatteryLife(this.currentBatteryLife -= 2);
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

    System.out.println("The message:  " + messageContent + "- delivered to " + phoneNumber);

    setBatteryLife(this.currentBatteryLife -= 1);
  }

  /*
   *Method used to get the first message from a certain phone number
   */
  public void getFirstMessage(String phoneNumber) {
    ArrayList<String> messages = phoneMessages.get(phoneNumber);
    System.out.println("The first message sent to " + phoneNumber + " : " + messages.get(0));
  }

  /*
   *Method used to get the second message from a certain phone number
   */
  public void getSecondMessage(String phoneNumber) {
    ArrayList<String> messages = phoneMessages.get(phoneNumber);
    System.out.println("The second message sent to " + phoneNumber + " : " + messages.get(1));
  }

  /*
   *Method used to get a certain message from a certain phone number
   */
  public void getCertainMessage(String phoneNumber, int index) {
    ArrayList<String> messages = phoneMessages.get(phoneNumber);
    System.out.println(
        "The message number "
            + index
            + ", sent to "
            + phoneNumber
            + " : "
            + messages.get(index - 1));
  }

  /*
   * Method used to print the history of calls
   */
  public void viewHistory() {
    int index = 1;
    System.out.println("\n---The history of calls---\n");
    for (String call : calls) {
      System.out.println(index + ": " + call);
      index++;
    }
  }

  public String getIMEI() {
    return IMEI;
  }
}
