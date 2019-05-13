/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author austinwise
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if(value < upperLimit){
            value++;
        }else{
            value = 0;
        }
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        if(value < 0 || value > upperLimit){
            this.value = 0;
        }else{
            this.value = value;
        }
    }

    public String toString() {
        // write code here
        if(value < 10){
            return "0" + value;
        }else{
            return "" + value;
        }
        
    }
}
