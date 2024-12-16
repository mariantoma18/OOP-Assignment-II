package org.example;

import java.util.Scanner;

public class PhoneChooser {

  static Scanner scanner;

  /*
   * Method used to choose what phone to use
   * It runs the specific method based on the input
   * Method is running until no more examples of actions with a phone are needed
   */
  public static void choosePhoneToUse() {
    scanner = new Scanner(System.in);
    boolean isRunning = true;
    System.out.println("Hello!");
    while (isRunning) {
      System.out.println(
          "\nChoose a phone to use:"
              + "\n(1)Iphone 13 Pro Max;"
              + "\n(2)Iphone 14 Pro Max;"
              + "\n(3)Samsung Galaxy S23;"
              + "\n(4)Samsung Galaxy S24;"
              + "\nAnswer: ");

      int answer = scanner.nextInt();
      switch (answer) {
        case 1:
          System.out.println("\n--- Iphone 13 Pro Max ---\n");
          useIphone13ProMax();
          break;
        case 2:
          System.out.println("\n--- Iphone 14 Pro Max ---\n");
          useIphone14ProMax();
          break;
        case 3:
          System.out.println("\n --- Samsung Galaxy S23 ---\n");
          useSamsungGalaxyS23();
          break;
        case 4:
          System.out.println("\n --- Samsung Galaxy S24 ---\n");
          useSamsungGalaxyS24();
          break;
        default:
          System.out.println("Not a valid choice. Please select one of the available phones!");
      }

      System.out.println("\nDo you want to choose another phone?" + "\n(1)Yes (2)No");
      answer = scanner.nextInt();

      switch (answer) {
        case 1:
          break;
        case 2:
          isRunning = false;
          System.out.println("See you next time! :D");
          break;
        default:
          System.out.println("Not a valid choice!");
      }
    }
  }

  // Iphone 13 Pro Max example
  public static void useIphone13ProMax() {
    // Creating a phone model
    Phone phone = new Iphone13ProMax("Metal", "Gold");

    // Adding contacts
    phone.addContact(1, "0710000001", "John", "Smith");
    phone.addContact(2, "0710000002", "Luke", "Brown");
    phone.addContact(3, "0710000003", "Phil", "Johnson");

    // Printing all contacts
    phone.displayContacts();

    // Getting first and last contacts
    System.out.println("The first contact: " + phone.contactList.getFirst());
    System.out.println("The last contact: " + phone.contactList.getLast());
    System.out.println("\n");
    // Sending some messages
    phone.sendMessage("0710000001", "Hello, John Smith!");
    phone.sendMessage("0710000001", "Hello, John Smith, it's me again!");
    phone.sendMessage("0710000001", "Hello, John Smith, it's me again! x3");
    phone.sendMessage("0710000001", "Hello, John Smith, it's me again! x4");
    phone.sendMessage("0710000002", "Hello, Luke Brown!");
    phone.sendMessage("0710000002", "Hello, Luke Brown, it's me again!");
    phone.sendMessage("0710000003", "Hello, Phil Johnson!");

    // Getting the first, the second and a certain message from a certain phone number
    System.out.println("\n");
    phone.getFirstMessage("0710000001");
    phone.getSecondMessage("0710000001");
    phone.getCertainMessage("0710000001", 4);

    // Calling some phone numbers
    System.out.println("\n");
    phone.call("0710000001");
    phone.call("0710000001");
    phone.call("0710000002");
    phone.call("0710000003");
    phone.call("0710000003");

    // Printing history of calls
    phone.viewHistory();

    // Checking the current battery life
    System.out.println("\nThe battery can last " + phone.getBatteryLife() + " more hours");
  }

  // Iphone 14 Pro Max example
  public static void useIphone14ProMax() {
    // Creating a phone model
    Phone phone = new Iphone14ProMax("Metal", "Black");

    // Adding contacts
    phone.addContact(1, "0720000001", "Sarah", "Williams");
    phone.addContact(2, "0720000002", "David", "Jones");
    phone.addContact(3, "0720000003", "James", "Miller");

    // Printing all contacts
    phone.displayContacts();

    // Getting first and last contacts
    System.out.println("The first contact: " + phone.contactList.getFirst());
    System.out.println("The last contact: " + phone.contactList.getLast());

    // Sending some messages
    phone.sendMessage("0720000001", "Hello, Sarah Williams!");
    phone.sendMessage("0720000001", "Hello, Sarah Williams, it's me again!");
    phone.sendMessage("0720000001", "Hello, Sarah Williams, it's me again! x3");
    phone.sendMessage("0720000001", "Hello, Sarah Williams, it's me again! x4");
    phone.sendMessage("0720000002", "Hello, David Jones!");
    phone.sendMessage("0720000002", "Hello, David Jones, it's me again!");
    phone.sendMessage("0720000003", "Hello, James Miller!");

    // Getting the first, the second and a certain message from a certain phone number
    phone.getFirstMessage("0720000001");
    phone.getSecondMessage("0720000001");
    phone.getCertainMessage("0720000001", 4);

    // Calling some phone numbers
    phone.call("0720000001");
    phone.call("0720000001");
    phone.call("0720000002");
    phone.call("0720000003");
    phone.call("0720000003");

    // Printing history of calls
    phone.viewHistory();

    // Checking the current battery life
    System.out.println("\nThe battery can last " + phone.getBatteryLife() + " more hours");
  }

  // Samsung Galaxy S23 example
  public static void useSamsungGalaxyS23() {
    // Creating a phone model
    Phone phone = new SamsungGalaxyS23("Plastic & Glass", "Silver");

    // Adding contacts
    phone.addContact(1, "0730000001", "Daniel", "Garcia");
    phone.addContact(2, "0730000002", "Sophia", "Martinez");
    phone.addContact(3, "0730000003", "Andrew", "Anderson");

    // Printing all contacts
    phone.displayContacts();

    // Getting first and last contacts
    System.out.println("The first contact: " + phone.contactList.getFirst());
    System.out.println("The last contact: " + phone.contactList.getLast());

    // Sending some messages
    phone.sendMessage("0730000001", "Hello, Daniel Garcia!");
    phone.sendMessage("0730000001", "Hello, Daniel Garcia, it's me again!");
    phone.sendMessage("0730000001", "Hello, Daniel Garcia, it's me again! x3");
    phone.sendMessage("0730000001", "Hello, Daniel Garcia, it's me again! x4");
    phone.sendMessage("0730000002", "Hello, Sophia Martinez!");
    phone.sendMessage("0730000002", "Hello, Sophia Martinez, it's me again!");
    phone.sendMessage("0730000003", "Hello, Andrew Anderson!");

    // Getting the first, the second and a certain message from a certain phone number
    phone.getFirstMessage("0730000001");
    phone.getSecondMessage("0730000001");
    phone.getCertainMessage("0730000001", 4);

    // Calling some phone numbers
    phone.call("0730000001");
    phone.call("0730000001");
    phone.call("0730000002");
    phone.call("0730000003");
    phone.call("0730000003");

    // Printing history of calls
    phone.viewHistory();

    // Checking the current battery life
    System.out.println("\nThe battery can last " + phone.getBatteryLife() + " more hours");
  }

  // Samsung galaxy S24 example
  public static void useSamsungGalaxyS24() {
    // Creating a phone model
    Phone phone = new SamsungGalaxyS24("Plastic & Glass", "Purple");

    // Adding contacts
    phone.addContact(1, "0740000001", "Olivia", "Wilson");
    phone.addContact(2, "0740000002", "Benjamin", "Moore");
    phone.addContact(3, "0740000003", "Jessica", "Taylor");

    // Printing all contacts
    phone.displayContacts();

    // Getting first and last contacts
    System.out.println("The first contact: " + phone.contactList.getFirst());
    System.out.println("The last contact: " + phone.contactList.getLast());

    // Sending some messages
    phone.sendMessage("0740000001", "Hello, Olivia Wilson!");
    phone.sendMessage("0740000001", "Hello, Olivia Wilson, it's me again!");
    phone.sendMessage("0740000001", "Hello, Olivia Wilson, it's me again! x3");
    phone.sendMessage("0740000001", "Hello, Olivia Wilson, it's me again! x4");
    phone.sendMessage("0740000002", "Hello, Benjamin Moore!");
    phone.sendMessage("0740000002", "Hello, Benjamin Moore, it's me again!");
    phone.sendMessage("0740000003", "Hello, Jessica Taylor!");

    // Getting the first, the second and a certain message from a certain phone number
    phone.getFirstMessage("0740000001");
    phone.getSecondMessage("0740000001");
    phone.getCertainMessage("0740000001", 4);

    // Calling some phone numbers
    phone.call("0740000001");
    phone.call("0740000001");
    phone.call("0740000002");
    phone.call("0740000003");
    phone.call("0740000003");

    // Printing history of calls
    phone.viewHistory();

    // Checking the current battery life
    System.out.println("\nThe battery can last " + phone.getBatteryLife() + " more hours");
  }
}
