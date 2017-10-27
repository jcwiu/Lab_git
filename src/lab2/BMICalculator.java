/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author jc171
 */
public class BMICalculator {
    
    int feet;
    int inches;
    int pounds;
    
    public  BMICalculator(int feet, int inches, int pounds){
       //constructor 
       this.feet = feet;
       this.inches = inches;
       this.pounds = pounds;
    }
    public float /*<<return type = int*/ calculateBMI(){
       //do BMI calcs
       float bmi;
       float inchHeight = feet * 12 + inches;
       
       bmi = (pounds * 703)/(inchHeight * inchHeight);
       return bmi;
   }
}
