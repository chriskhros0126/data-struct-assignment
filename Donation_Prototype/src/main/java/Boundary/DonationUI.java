/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boundary;
import java.util.Scanner;
import java.util.HashMap;
import ADT.*;
import Entity.*;
/**
 *
 * @author liawliaw
 */
public class DonationUI {
    Scanner input = new Scanner(System.in);
    
    public int getMenuChoice(){   
        System.out.println("\nMAIN MENU");
        System.out.println("1. Add new Donations");
        System.out.println("2. List all Donations");
        System.out.println("0. Quit");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        input.nextLine();
        System.out.println();
        return choice;
    }
//    
//    public void listAllProducts(HashMap<String,String> Donations) {
//        System.out.println("\nList of Donations:\n");
//        Donations.forEach((key,value)->System.out.println("Donor: "+key +"Donation: "+ value));
//    }
    public void printDonationDetails(Donations don) {
    System.out.println("Donation Details");
    System.out.println("Donor name:" + don.getDonorName());
    System.out.println("Donor Phone Number: " + don.getDonorPhoneNumber());
    System.out.println("Details: " + don.getDonationDetails());
  }
    
//    public void inputDonationDetails(){
//        
//    }
}
