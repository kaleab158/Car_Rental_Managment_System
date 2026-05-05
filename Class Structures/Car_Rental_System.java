/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.car_rental_system;
import java.util.Scanner;

/**
 *
 * @author kaleb
 */
public class Car_Rental_System {

public void DashboardEmployee(String name ){
    Scanner S = new Scanner(System.in);
    
    int choice;
    
System.out.print("============================================================================== \n");
System.out.print("=================== WelCome To Car Rental System Managment " +name+ "========= \n");
System.out.print("============================================================================== \n");
System.out.print("1. Add Car \n");
System.out.print("2. Remove Car \n");
System.out.print("3. Update Car Details  \n");
System.out.print("4. View All Car \n");
System.out.print("5. View Customer Details \n");
System.out.print("6. View Reservation History  \n");
System.out.print("7. Exit ..  \n");
System.out.print("Enter Choise -> " ); choice = S.nextInt();
  switch(choice){
      case 1:
          // add car
              break;
      case 2:
          // remove car 
              break;
      case 3:
          // update car 
              break;
      case 4:
          //view all car 
              break;
      case 5:
          //view customer detail 
              break;
      case 6:
          //view reservation 
          break;
      case 7 :
          System.out.print("Thanks For Your Visit .....");
              break;
      case 8:
      default:
          break;  
}
}
  public void DashboardCustomer(String name){
    Scanner S = new Scanner(System.in);
    
    int choice;
    
System.out.print("============================================================================== \n");
System.out.print("=================== WelCome To Car Rental System Managment " +name+ "========= \n");
System.out.print("============================================================================== \n");
System.out.print("1. View Avilable Car \n");
System.out.print("2. Search Car \n");
System.out.print("3. Reserve a Car  \n");
System.out.print("4. View Car \n");
System.out.print("5. View Customer Details \n");
System.out.print("6. View Reservation History  \n");
System.out.print("7. Exit ..  \n");
System.out.print("Enter Choise -> " ); choice = S.nextInt();
  switch(choice){
      case 1:
          // add car
              break;
      case 2:
          // remove car 
              break;
      case 3:
          // update car 
              break;
      case 4:
          //view all car 
              break;
      case 5:
          //view customer detail 
              break;
      case 6:
          //view reservation 
          break;
      case 7 :
          System.out.print("Thanks For Your Visit .....");
              break;
      case 8:
      default:
          break;  
}




 
}
    public static void main(String[] args) {
    }
}
