package com.bridgelabz;
import java.util.*;


public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    static  ArrayList<Person> adressBook = new ArrayList<Person>();
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Problem");
        AddressBook addressBookList=new AddressBook();
        System.out.println("1.add" + "\n" + "2.edit" );
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addressBookList.addContactDetails();
                break;
            case 2:
                addressBookList.editContactDetails();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public void addContactDetails() {
        Person details=new Person();
        System.out.println("Enter a first name:");
        String firstName=scanner.next();
        details.setFirstName(scanner.next());
        System.out.println("Enter a last name:");
        String lastName=scanner.next();
        details.setLastName(scanner.next());
        System.out.println("Enter a Address:");
        String address=scanner.next();
        details.setAddress(scanner.next());
        System.out.println("Enter a City name:");
        String city=scanner.next();
        details.setCity(scanner.next());
        System.out.println("Enter a state:");
        String state=scanner.next();
        details.setState(scanner.next());
        System.out.println("Enter a email:");
        String email=scanner.next();
        details.setEmail(scanner.next());
        System.out.println("Enter a zip code:");
        int  zip=scanner.nextInt();
        details.setZip(scanner.nextInt());
        System.out.println("Enter a phone number:");
        long phoneNumber=scanner.nextLong();
        details.setPhoneNumber(scanner.nextLong());

        adressBook.add(details);
        Person details1=new Person(firstName, lastName, address,  city, state, email,  zip, phoneNumber);
        adressBook.add(details1);
        System.out.print(adressBook);
        System.out.println("succesfully added person new contacts");
    }

    public void editContactDetails() {
        System.out.println("enter a name for edit:");
        String editName=scanner.next();
        for(int i=0; i<adressBook.size(); i++) {
            if(adressBook.get(i).getFirstName().equals(editName)) {
                System.out.println("select options");
                System.out.println("\n0.First Name\n1.Last Name\n2.Address\n3.City\n4.State\n5.Zip\n6.Phone Number");
                int editOption=scanner.nextInt();
                //System.out.println("message"+editOption);
                switch(editOption) {
                    case 1:
                        System.out.println("Enter a First name:");
                        String editFirstName=scanner.next();
                        adressBook.get(i).setFirstName(editFirstName);
                        System.out.println(editFirstName);
                        break;
                    case 2:
                        System.out.print("Enter a Last name:");
                        adressBook.get(i).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.print("Enter a Address:");
                        adressBook.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.print("Enter a city:");
                        adressBook.get(i).setCity(scanner.nextLine());
                        break;
                    case 5:
                        System.out.print("Enter a state:");
                        adressBook.get(i).setState(scanner.nextLine());
                        break;
                    case 6:
                        System.out.print("Enter a zip code:");
                        adressBook.get(i).setZip(scanner.nextInt());
                        break;
                    case 7:
                        System.out.print("Enter a phone number:");
                        adressBook.get(i).setPhoneNumber(scanner.nextLong());
                        break;
                    case 8:
                        System.out.print("Enter a email:");
                        adressBook.get(i).setEmail(scanner.nextLine());
                        break;
                    default:
                        System.out.println("enter valid contact");
                }
            }
            System.out.println("Edited list is:");
            System.out.println(adressBook);
        }
    }
}
