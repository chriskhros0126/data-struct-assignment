/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author liawliaw
 */
public class Donations {
    private String DonorName;
    private String DonorPhoneNumber;
    private String DonationDetails;
    
    public Donations(){
    }
    
    public Donations(String donorName, String donorPhoneNumber, String donationDetails){
        this.DonorName = donorName;
        this.DonorPhoneNumber = donorPhoneNumber;
        this.DonationDetails = donationDetails;
    }
    public void setDonorName(String donorName){
        this.DonorName = donorName;
    }
    public void setDonorPhoneNumber(String donorPhoneNumber){
        this.DonorPhoneNumber = donorPhoneNumber;
    }
    public void setDonationDetails(String donationDetails){
        this.DonationDetails = donationDetails;
    }
    public String getDonorName(){
        return DonorName;
    }
    public String getDonorPhoneNumber(){
        return DonorPhoneNumber;
    }
    public String getDonationDetails(){
        return DonationDetails;
    }
}
