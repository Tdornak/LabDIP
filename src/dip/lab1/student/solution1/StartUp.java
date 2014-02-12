/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 *
 * @author Tim
 */
public class StartUp {
    
    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        //HourlyEmployee constructor takes double : payRate and double : totalYearlyHours
        //SalariedEmployee constructor takes double : annualSalary and double : annualBonus
        Employee e1 = new HourlyEmployee(8, 1000);
        HRService hr = new HRService();
        System.out.println(hr.getEmployeeType(e1) + " " + fmt.format(hr.getEmployeeAnnualWage(e1)) + " this year");
        
    }
    
}
