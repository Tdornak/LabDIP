/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;

import dip.lab2.student.solution1.TipCalculator.ServiceQuality;
import java.text.NumberFormat;


/**
 *
 * @author Tim
 */
public class Startup {
    
    
    public static void main(String[] args) {
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        //FoodService Constructor takes a service quality (GOOD, POOR, FAIR) and a double : BillAmount
        //BaggageService constructor take a service quality (GOOD, POOR, FAIR) and a int : number of bags
        TipCalculator tip1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5);
        TipCalculatorService calc = new TipCalculatorService(tip1);
        
        System.out.println(fmt.format(calc.getTip()));
    }
}
