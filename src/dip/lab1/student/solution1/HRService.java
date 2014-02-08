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
public class HRService {
    
    Employee employee;
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    public HRService(Employee e) {
        this.employee = e;
    }
    
    public void getEmployeeInfo() {
        System.out.println(employee.getEmployeeType() + " made " + fmt.format(employee.getAnnualWage()) + " this year");
    }
    
}
