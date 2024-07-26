/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;
import java.util.HashMap;
import Entity.Donations;
/**
 *
 * @author liawliaw
 * @param <T>
 */
public interface AssociativeArrayInterface<T> {
    public boolean addDonation(String Donor,Donations Details);
    public HashMap<String,Donations> getDonations();
}
