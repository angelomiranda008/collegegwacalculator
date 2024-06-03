/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collegegwacalculator;

import java.util.ArrayList;

public class GWACalculator {
    
    private String [] subjects;
    private int [] units;
    private double [] grades;
    
    int total;
    double subXunits;
    
    GWACalculator(String[]subjects,int[]units,double[]grades){
        this.subjects = subjects;
        this.units = units;
        this.grades = grades;
    }
    public String [] getSubjects(){
        return subjects ;
    }
    public void setSubjects(){
        this.subjects = subjects;
    }
    public int [] getUnits(){
        return units;
    }
    public void setUnits(){
        this.units = units;
    }
    public double [] getGrades(){
        return grades;
    }
    public void setGrades(){
        this.grades = grades;
    }
    public double multiplyUnitsAndGrades(){
        for (int i = 0; i < grades.length; i++){
            subXunits += (grades[i]*units[i]);
        }
        return subXunits;
    }
    public int totalUnits(){
        for (int i = 0; i < units.length; i++){
            total += units[i];
        }
        return total;
    }
    void GWA(){
        double gwa;
        gwa = (multiplyUnitsAndGrades() / totalUnits());
        System.out.println(gwa);
    }
    public static void main(String[]args){
        String [] subjects = {"ccna","ds1","pe"};
        int [] units = {3,3,3,2,3,2,1,3};
        double [] grades = {3.00,2.50,1.50,2.00,1.50,1.25,2.25,1.50};
        
        GWACalculator cal = new GWACalculator(subjects,units,grades);
        System.out.println(cal.multiplyUnitsAndGrades());
        System.out.println(cal.totalUnits());
        cal.GWA();
    }
}
