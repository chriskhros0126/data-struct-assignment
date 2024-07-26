/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author liawliaw
 */
import java.util.*;
import Entity.Donations;
import ADT.*;
import Boundary.*;

public class DonationMaintenance {
   private AssociativeArrayInterface<Donations> DonationList = new AssociativeArray();
   
   
   private DonationUI UI = new DonationUI();
    
   public boolean initializeProducts() {
    Donations don = new Donations("Liaw", "0128852612", "Test Donation Entry");
    DonationList.addDonation(don.getDonorName(),don);
    return true;
  }
   
   public void show(){
       HashMap<String,Donations> obj = DonationList.getDonations();
       for(Map.Entry<String,Donations> entry : obj.entrySet()){
           String Donor = entry.getKey();
           Donations Detail = entry.getValue();
           UI.printDonationDetails(Detail);
       }
   }
   public static void main(String[] args){
       DonationMaintenance ob = new DonationMaintenance();
       if(ob.initializeProducts()){
           ob.show();
       }else{
           System.out.println("not added");
       }
   }
}
