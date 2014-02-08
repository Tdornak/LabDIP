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
public class HourlyEmployee implements Employee {

    private double totalHoursForYear;
    private double payRate;
    private static final String employeeType = "Hourly Employee";
    
    public HourlyEmployee(double payRate, double hours) {
        this.setPayRate(payRate);
        this.setTotalHoursForYear(hours);
    }
    
    @Override
    public final double getAnnualWage() {
        return totalHoursForYear * payRate;
    }

    @Override
    public String getEmployeeType() {
        return employeeType;
    }
    
    
    //getters
    public final double getTotalHoursForYear() {
        return totalHoursForYear;
    }

    public final double getPayRate() {
        return payRate;
    }

    
    //setters
    public final void setTotalHoursForYear(double hours) {
        if (hours > 8765 || hours < 0) {
            System.out.println("You must enter a valid number of hours");
        }
        else {
            this.totalHoursForYear = hours;
        }
    }

    public final void setPayRate(double payRate) {
        if (payRate < 7.25 || payRate > 1000) {
            System.out.println("You must enter a valid pay rate");
        }
        else {
            this.payRate = payRate;
        }
    }

    
    
    
    
}
