/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab1.student.solution1;


/**
 *
 * @author Tim
 */
public class HRService {
    
    public String getEmployeeType(Employee e) {
        return e.getEmployeeType();
    }
    
    public double getEmployeeAnnualWage(Employee e) {
        return e.getAnnualWage();
    }
    
}
