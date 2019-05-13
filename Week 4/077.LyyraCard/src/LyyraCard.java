/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author austinwise
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }
    
    public String toString(){
        return "The card has " + balance + " euros";
    }
    
    public void payEconomical(){
        double amount = 2.5;
        if(amount <= balance){
            balance = balance - amount;
        }
        
    }
    
    public void payGourmet(){
        double amount = 4.0;
        if(amount <= balance){
            balance = balance - amount;
        }
    }
    
    public void loadMoney(double amount){
        double maxAmount = 150;
        double money = balance + amount;
        
        if(amount < 0){
            //do nothing
        }else{
            if(money > maxAmount){
            balance = maxAmount;
            }else{
            balance = money;
            }   
        }
        
    }
}
