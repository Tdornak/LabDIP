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
public class SalariedEmployee implements Employee {
    
    private double yearlySalary;
    private double annualBonus;
    private static final String employeeType = "Salaried Employee";

    public SalariedEmployee(double salary, double annualBonus) {
        this.yearlySalary = salary;
        this.annualBonus = annualBonus;
    }
    
    @Override
    public double getAnnualWage() {
        return yearlySalary + annualBonus;
    }

    @Override
    public String getEmployeeType() {
        return employeeType;
    }

    public final double getYearlySalary() {
        return yearlySalary;
    }

    public final double getAnnualBonus() {
        return annualBonus;
    }

    public final void setYearlySalary(double yearlySalary) {
        if (yearlySalary < 0) {
            System.out.println("You can't make less then $0 per year");
        }
        else {
            this.yearlySalary = yearlySalary;
        }       
    }

    public final void setAnnualBonus(double annualBonus) {
        if (annualBonus > yearlySalary) {
            System.out.println("Can't recieve a bonus larger then your annual Salary");
        }
        else {
            this.annualBonus = annualBonus;
        }      
    }
    
    
    
}
