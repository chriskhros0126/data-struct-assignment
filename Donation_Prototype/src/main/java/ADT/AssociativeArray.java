/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ADT;
import java.util.HashMap;
import Entity.Donations;
/**
 *
 * @author liawliaw
 */
public class AssociativeArray implements AssociativeArrayInterface{
    private HashMap<String,Donations> Donations = new HashMap<>();

//------Donations Stuff-----------------------------
    @Override
    public boolean addDonation(String Donor, Donations Details){
        Donations.put(Donor,Details);
        return true;
    }
    
    @Override
    public HashMap<String,Donations> getDonations(){
        if(CheckList()){
            throw new ArrayIndexOutOfBoundsException("Donations List is Empty");
        }
        return Donations;
    }
    
    public boolean CheckList(){
        return Donations.isEmpty();
    }
    
    
}
