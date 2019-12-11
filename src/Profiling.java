
import java.util.Scanner;

public class Profiling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int profilesCount = 0;
        String[] names = new String[100];
        String[] email = new String[100];
        String[] password = new String[100];
        String[] addressLocation = {"Urban", "Rural", "Remote"};
        int[] age = new int[100];
        int deductor = 100;
        int ctr = 100;

        System.out.println("What to do?");
        sc.nextLine();
        boolean profiling = true;
        while (profiling) {
            System.out.println("\n");
            System.out.println("1. Create Profile");
            System.out.println("2. Search Profile");
            System.out.println("3. Show all Profiles");

            int select = sc.nextInt();

            if (select == 1) {

                System.out.println("There are still " + ctr + " null profiles remaining.");

                if (ctr == 0) {
                    System.out.println("Sorry");
                    continue;
                }
                if (deductor == 0) {
                    System.out.println("Ooops profiles limit reached ");
                    continue;
                }

                sc.nextLine();
                System.out.print("Enter Name: ");
                names[names.length - deductor] = sc.nextLine();
                System.out.print("Enter Email: ");
                email[names.length - deductor] = sc.nextLine();
                System.out.print("Enter Password: ");
                password[names.length - deductor] = sc.nextLine();
                System.out.print("Enter Age: ");
                age[names.length - deductor] = sc.nextInt();
                sc.nextLine();
                System.out.println("Please Select your Address location Type");
                System.out.print("Urban ");
                System.out.print("Rural ");
                System.out.print("Remote ");
               

                addressLocation[names.length - deductor] = sc.nextLine();

                if (addressLocation[names.length - deductor].equalsIgnoreCase("Urban")) {
                    System.out.println("You lived in a  " + addressLocation[0] + " area");
                } else if (addressLocation[names.length - deductor].equalsIgnoreCase("Rural")) {
                    System.out.println("You lived in a " + addressLocation[1] + " area");
                } else if (addressLocation[names.length - deductor].equalsIgnoreCase("Remote")) {
                    System.out.println("You lived in a " + addressLocation[2] + " area");
                } else {
                    System.err.println("Invalid Input");
                    System.exit(0);
                }
                profilesCount++;
                deductor--;
                ctr--;

            } else if (select == 2) {

                /*System.out.println("-------------------");
        //Print Profile
            System.out.println("There are "+profilesCount+" select from 0 to "+(profilesCount-1)+".");
            int search= sc.nextInt();
        
        System.out.println("Name: " + names[search]);
        System.out.println("Email: " + email[search]);
        System.out.println("Password: " + password[search]);
        System.out.println("Age: " + age[search]);
        System.out.println("Address:  "+ addressLocation[search]);*/
                String searchName = sc.nextLine();

                for (int i = 0; i < names.length - deductor; i++) {
                    if (searchName.equals(names[i])) {
                        System.out.println("Name: " + names[i]);
                        System.out.println("Email: " + email[i]);
                        System.out.println("Password: " + password[i]);
                        System.out.println("Age: " + age[i]);
                        System.out.println("Address:  " + addressLocation[i]);
                    } else {
                        System.out.println("Profile Not Found!");
                    }
                    sc.nextLine();

                }
            } else if (select == 3) {

                for (int j = 0; j < names.length - deductor; j++) {

                    System.out.println("Profile No. " + j + "\n");

                    System.out.println("Name: " + names[j]);
                    System.out.println("Email: " + email[j]);
                    System.out.println("Password: " + password[j]);
                    System.out.println("Age: " + age[j]);
                    System.out.println("Civil Status: " + addressLocation[j]);
                    System.out.println("\n");
                }
            } else {
                System.err.println("Invalid Input");
            }

        }
    }
}
