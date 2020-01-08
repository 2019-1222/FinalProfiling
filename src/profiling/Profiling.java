package profiling;

import java.util.Scanner;

public class Profiling {

    int max = 1000;
    int index = 0;
    int profilenumber = 1;
    int deductor = 1000;

    String[] names = new String[max];
    String[] email = new String[max];
    String[] password = new String[max];
    String[] number = new String[max];
    String[] age = new String[max];

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Profiling name;
        name = new Profiling();
        name.Profile();

    }

    public void Profile() {
        Scanner sc = new Scanner(System.in);

        boolean profile = true;
        pro:
        while (profile) {
            System.out.println("Do you want to create a profile?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int yeah = sc.nextInt();
            if (yeah == 1) {
                ProfileEnter();
            } else if (yeah == 2) {
                System.exit(0);
            }

        }

    }

    public void ProfileEnter() {
        int profilenum = 1;
        Continue:
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Profile number " + profilenumber);
            System.out.print("Enter your name: ");
            names[index] = sc.next();
            System.out.print("Enter your age: ");
            age[index] = sc.next();
            System.out.print("Enter your contact number: ");
            number[index] = sc.next();
            System.out.print("Enter your email address: ");
            email[index] = sc.next();
            System.out.print("Enter your password: ");
            password[index] = sc.next();
            profilenumber++;
            index++;
            deductor--;

            boolean unsabuhaton = true;
            buhaton:
            while (unsabuhaton) {

                System.out.println("-----------------------------");
                System.out.println("What do you want to do next?");
                System.out.println("1. Add another profile.");
                System.out.println("2. Search profiles.");
                System.out.println("3. View all profiles.");
                System.out.println("4. Exit.");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        continue Continue;
                    case 2:
                        System.out.println("Enter name!");
                        sc.nextLine();
                        String namessearch = sc.nextLine();

                        for (int i = 0; i < names.length; i++) {

                            if (namessearch.equals(names[i])) {
                                while (namessearch.equals(names[i])) {
                                    System.out.println("-----------------------------");
                                    System.out.println("Name: " + names[i]);
                                    System.out.println("Age: " + age[i]);
                                    System.out.println("Email: " + email[i]);;
                                    System.out.println("Number: " + number[i]);
                                    System.out.println("-----------------------------");
                                    continue buhaton;
                                }
                            }
                        }
                    case 3:
                        for (int j = 0; j < names.length - deductor; j++) {
                            System.out.println("-----------------------------");
                            System.out.println("Profile No. " + profilenum++ + "\n");

                            System.out.println("Name: " + names[j]);
                            System.out.println("Age: " + age[j]);
                            System.out.println("Email: " + email[j]);
                            System.out.println("Password: " + number[j]);
                            System.out.println("-----------------------------");
                        }
                        continue buhaton;
                    case 4:
                        System.exit(0);
                }

            }
        }

    }
}