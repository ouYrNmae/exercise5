//Jocelin Martinez-Reyes Exercise 5 2/11/25
//roblox

import java.util.*;

public class AddressBook {
    static Scanner input = new Scanner(System.in);
    static ArrayList<ContactInfo> phoneBook = new ArrayList<>();

    public static void main(String[] args) {

        int quit = 0;
        while (quit == 0) {
            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("Email: ");
            String email = input.nextLine();
            phoneBook.add(new ContactInfo(name, email));
            System.out.println("Person successfully added!\nAnother? (Use Y/y for yes and N/n for no)");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
            } else if (answer.equalsIgnoreCase("N")) {
                quit = 1;
                System.out.println("Goodbye. But WAITTTT! ");
                System.out.println("Would you like update any emails :D? (Y/y for yes, N/n for no)");
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("Y")) {
                    System.out.println("Whom?: ");
                    String emailUpdate = input.nextLine();

                    boolean found = false;
                    for (ContactInfo contact : phoneBook) {
                        if (contact.getName().equalsIgnoreCase(emailUpdate)) {
                            System.out.println("What should the email be now:");
                            String newEmail = input.nextLine();
                            contact.setEmail(newEmail);
                            System.out.println("Email has been updated successfully for " + emailUpdate + ":D!!!(please add roblox)\n");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact with the name '" + emailUpdate + "' not found.\n");
                    }
                } else if (choice.equalsIgnoreCase("N")) {
                } else {
                    quit = 1;
                    System.out.println("That wasn't an option.");
                }
            }
        }
        System.out.println("Your complete address book is" + phoneBook);
    }
}