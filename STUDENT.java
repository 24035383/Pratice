

import java.util.Scanner;
                
    class Student {
        String id;
        String name;
        int age;
        String email;
        String course;
                }
                
    class Main {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("*******************************");
            System.out.println("1.CAPTURE A NEW STUDENT");
            System.out.println("2.SEARCH FOR A STUDENT");
            System.out.println("3.DELETE A STUDENT");
            System.out.println("4.PRINT STUDENT REPORT");
            System.out.println("5.EXIT APPLICATION");
            //1.1 Sample nenu for the application

            System.out.print("Enter your choice: "); //1.2Capture user input for choice
            int choice = myObj.nextInt();
            myObj.nextLine(); // consume newline

            if (choice == 1) {
        Student student = new Student();
    
        System.out.print("Enter Student ID: ");
        student.id = myObj.nextLine();
    
        System.out.print("Enter Name: ");
        student.name = myObj.nextLine();
    
        // Validate age input
        int age = -1;
        while (true) {
            System.out.print("Enter Age (must be a number >= 16): "); //1.3 Age must be 16 or older
            if (myObj.hasNextInt()) {
                age = myObj.nextInt();
                myObj.nextLine(); // consume newline
                if (age >= 16) {
                    student.age = age;
                    break;
                } else {
                    System.out.println("Invalid age. Age must be 16 or older.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                myObj.nextLine(); // consume invalid input
            }
        }
    
        System.out.print("Enter Email: ");
        student.email = myObj.nextLine();
    
        System.out.print("Enter Course: ");
        student.course = myObj.nextLine();
    
        System.out.println("Student captured:");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Email: " + student.email);
        System.out.println("Course: " + student.course);

        //1.4 Confirmation message
        System.out.println("Student has been successfully captured.");
        }
    }
 } 