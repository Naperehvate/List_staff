import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Persons_collect persons = new Persons_collect();
        persons.addPerson(new Persons("John", 25, "123456789"));
        persons.addPerson(new Persons("Jane", 30, "987654321"));
        persons.addPerson(new Persons("Bob", 20, "456789123"));
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit)
        {
            Menu.PrintMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter ID number:");
                    String idNumber = scanner.nextLine();
                    persons.addPerson(new Persons(name, age, idNumber));
                    break;
                case 2:
                    System.out.println("Enter ID number:");
                    idNumber = scanner.nextLine();
                    persons.removePerson(persons.SearchPersonsByIdNumber(idNumber));
                    break;
                case 3:
                    persons.PrintAllPersons();
                    break;
                case 4:
                    System.out.println("Enter ID number:");
                    idNumber = scanner.nextLine();
                    if(persons.SearchPersonsByIdNumber(idNumber) != null)
                    {
                        System.out.println(persons.SearchPersonsByIdNumber(idNumber));
                    }
                    else
                    {
                        System.out.println("Person not found");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}