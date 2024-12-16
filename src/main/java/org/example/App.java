package org.example;

/**
 * DESCRIPTION
 *
 * <p>create an application based on the following requirements All Phones offer the following
 * behavior:
 *
 * <p>you can create new contacts (as separate properties - create 2 contacts per phone) you can see
 * existing contacts you can send a text message you can see all messages for a specific contact (as
 * separate properties - create 2 messages per contact) you can make a call you can see all calls
 * history Implement a hierarchy of Phone classes where:
 *
 * <p>a Phone can be of certain manufacturers and it can have a specific model (Phone - Samsung -
 * SamsungGalaxyS6) properties which cannot change: battery life (in number of hours) properties
 * that are configurable: color, material properties that are instance specific: IMEI Behavior
 *
 * <p>a message can have maximum 500 chars every time a message is send an hour is taken from the
 * battery life every time a call is made two hours are taken from the battery life
 */
public class App {
  public static void main(String[] args) {
    PhoneChooser.choosePhoneToUse();
  }
}
