/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;



/**
 *
 * @author Tim
 */
public class TipCalculator {
    
    TipCalculatorService tipCalculator;
    
    public TipCalculator(TipCalculatorService tip) {
        this.tipCalculator = tip;
    }
    
    public double getTip() {
        return tipCalculator.getCalculatedTip();
    }
}
