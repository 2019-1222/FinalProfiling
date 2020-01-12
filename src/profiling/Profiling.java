package Profiling;

import java.util.Scanner;


public class Profiling {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
           
             int p=1000; 
           int i = 0;
           
        
        String[] names = new String[p];
        String[] email = new String[p];
        String[] password = new String[p];
        String[] contact =new String[p];
        int[] age = new int[p];
      
        
       boolean profile=true;
       pro:
       while(profile){
           System.out.println("-----------------------------------------------------------------------------------------");
           System.out.println("Enter a profile to start.");
           System.out.println("1. Continue Entering Profile");
           System.out.println("2. Exit");
           int t=in.nextInt();
           switch (t){
               
               case 1: break;
               
               case 2: System.out.println("Thank you for the Support.");
                   System.out.println("\n");
                   System.out.println("Do wish to use the program?");
                   System.out.println("1. Yes");
                   System.out.println("2. No");
                   String yn=in.next();
                   switch(yn){
                       case "1": continue pro;
                       
                       case "2": System.exit(0);
                   }
           }
           
          
           boolean sit=true;
       int u=1;
        sit:
           while(sit){
        
     
       System.out.println("Enter necessary informations for profile # "+u);
            System.out.print("Enter Name: ");
            in.nextLine();
            names [i]= in.nextLine();
            
            System.out.print("Enter Email: ");
            email[i] = in.nextLine();
            
            System.out.print("Enter Password: ");
            password[i] = in.nextLine();
            
            System.out.print("Enter Age: ");
            age[i] = in.nextInt();
            
            System.out.print("Enter contact number: ");
            contact[i]=in.nextLine();
            in.nextLine();
            i++;
            
       
        
               System.out.println("\n\n");
               System.out.println("Do you wish to add more profiles?");
               System.out.println("1. Add Profile ");
               System.out.println("2. No ");
               String add=in.next();
               switch(add){
                   case "1":  
                             u++;
                             
                            
                     continue sit;
                   case "2": 
                       System.out.println("---------------------------------------------------------------------------------");
                     
                   break;
                   
               }break;
           
           } System.out.println("\n\n");
           boolean go=true;
           choiced:
           while(go){
               System.out.println("------------------------------------------------------------------------------------------");
           System.out.println("Which action do you want to do?");
           System.out.println("1. Search profile.");
           System.out.println("2. Edit profile.");
           System.out.println("3. Add profile.");
           
           System.out.println("4. View all profiles.");
               System.out.println("5.Exit.");
           int w=in.nextInt();
           switch(w){
               case 1: 
                   System.out.println("Enter the name you want to view");
                   in.nextLine();
                   String dd=in.nextLine();
                   for(int que = 0 ;que< names.length;que++){
                     
                   if(dd.equals (names[que])){
                       System.out.println("Names: "+names[que]);
                       System.out.println("Email: "+email[que]);
                       System.out.println("Age: "+age[que]);
                       System.out.println("Contact Number: "+contact[que]);
                       
                    continue choiced;
                       
                   
                   }
                    
                   
               
                   }System.out.println("Profile not found!");
                   continue choiced;
              
               case 2:  int kits=0;    
               for(int f=1; f<=i; f++){
            System.out.println("Select " +kits+" to edit profile "+f+". "+names [kits]);
           kits++;}
               int ho=in.nextInt();
                   
                            System.out.println("Name: "+names [ho]); 
                            System.out.println("Email: "+email [ho]);
                            System.out.println("Password: "+password [ho]);
                            System.out.println("Age: "+age [ho]);
                            System.out.println("Contact: " + contact[ho]);
                            System.out.println("---------------------------------------------------------------------------------");
                   System.out.println("\n");
                   System.out.println("Enter the following data for the chosen profile.");
            System.out.print("Enter Name: ");
            in.nextLine();
            names [ho]= in.nextLine();
            System.out.print("Enter Email: ");
            email[ho] = in.nextLine();
            System.out.print("Enter Password: ");
            password[ho] = in.nextLine();
            System.out.print("Enter Age: ");
            age[ho] = in.nextInt();
            System.out.print("Enter Contact Number: ");
            in.nextLine();
            contact[ho]=in.nextLine();
                   System.out.println("You succesfully edited this profile.");
                   continue choiced;
                   
               case 3:
                   true1:
                  while(true){
                  
                   u++;
                   
            System.out.println("");
            System.out.println("Profile # "+u);
            
            System.out.print("Enter Name: ");
            in.nextLine();
            names [i]= in.nextLine();
            System.out.print("Enter Email: ");
            email[i] = in.nextLine();
            System.out.print("Enter Password: ");
            password[i] = in.nextLine();
            System.out.print("Enter Age: ");
            age[i] = in.nextInt();
            System.out.print("Enter Contact Number: ");
            in.nextLine();
            contact[i]=in.nextLine();
            i++;
             System.out.println("\n\n");
               System.out.println("Do you wish to add more?");
               System.out.println("1. Add profile.");
               System.out.println("2. No.");
               String add=in.next();
               switch(add){
                   case "1":  
                             u++;
                             
                    continue true1;
                   case "2": 
                       continue choiced;
                  
                   
               }}
               case 5:
                   System.out.println("Thank you and God bless.");
                   System.out.println("\n\n\n");
                   System.out.println("Do wish to use the program?");
                   System.out.println("1. Yes");
                   System.out.println("2. No");
                   String ans=in.next();
                   switch(ans){
                       case "1": continue pro;
                       
                       case "2": System.exit(0);
                   
               }
               case 4: for(int nahh=0; nahh<u;nahh++){
                   System.out.println("-------------------------------------------------------------------");
                   System.out.println("Name: "+names[nahh]);
                   System.out.println("Email: "+email[nahh]);
                   System.out.println("Password: "+password[nahh]);
                   System.out.println("Age: "+age[nahh]);
                   System.out.println("Contact number: "+contact[nahh]);
                   System.out.println("-------------------------------------------------------------------");
              
               }continue choiced;
  
           }

       }

    }
       
    }
    
}