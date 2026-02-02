package employee;

import java.util.Scanner;

public class MAIN {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[100];
        int count= 0;
        while (true){
            System.out.println("--- Employee Management System ---");
            System.out.println("1 Add Manager");
            System.out.println("2 Add Developer");
            System.out.println("3 List Employee");
            System.out.println("4 Find Employee with Highest Salary");
            System.out.println("5 Exit");
            System.out.println("Choose An Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Name: ");
                    String mName =scanner.nextLine();
                    System.out.println("Enter Department: ");
                    String mDepartment =scanner.nextLine();
                    System.out.println("Enter Salary: ");
                    double mSalary =scanner.nextDouble();
                    System.out.println("Enter Bonus: ");
                    double mBonus = scanner.nextDouble();
                    employees[count++] = new Manager(mName,mDepartment,mSalary,mBonus );
                    break;
                case 2:
                    System.out.println("Enter Name: ");
                    String dName =scanner.nextLine();
                    System.out.println("Enter Department: ");
                    String dDepartment =scanner.nextLine();
                    System.out.println("Enter Salary: ");
                    double dSalary =scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Language: ");
                    String dLanguage = scanner.nextLine();
                    employees[count++] = new Developer(dName,dDepartment,dSalary, dLanguage);
                    break;
                case 3:
                    System.out.println("--- Employee ---");
                    for(int i = 0; i<count; i++) {
                        employees[i].displayInfo();
                        System.out.println();
                    }
                    break;
                case 4:
                    if(count == 0 ){
                        System.out.println("No Employees Has Added yet");
                        break;
                    }
                    //help ME HERE
                    Employee highest = employees[0];
                    for(int i = 0; i< count; i++){
                        if(employees[i].getSalary() > highest.getSalary()){
                            highest = employees[i];
                        };

                    }
                    System.out.println("--- Employee with Highest Salary");
                    highest.displayInfo();
                    break;
                case 5:
                    System.out.println("Exiting GoodBye");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Option Try Again.");
            }
        }
    }
}
