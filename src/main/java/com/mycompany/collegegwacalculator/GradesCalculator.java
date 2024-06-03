/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collegegwacalculator;


public class GradesCalculator {
    
    private int criteria1;
    private int criteria2;
    private int criteria3;
    private int criteria4;
    private int criteria5;
    private int criteria6;
    private int criteria7;
    private int criteria8;

    public int getCriteria1() {
        return criteria1;
    }

    public void setCriteria1(int criteria1) {
        this.criteria1 = criteria1;
    }

    public int getCriteria2() {
        return criteria2;
    }

    public void setCriteria2(int criteria2) {
        this.criteria2 = criteria2;
    }

    public int getCriteria3() {
        return criteria3;
    }

    public void setCriteria3(int criteria3) {
        this.criteria3 = criteria3;
    }

    public int getCriteria4() {
        return criteria4;
    }

    public void setCriteria4(int criteria4) {
        this.criteria4 = criteria4;
    }

    public int getCriteria5() {
        return criteria5;
    }

    public void setCriteria5(int criteria5) {
        this.criteria5 = criteria5;
    }

    public int getCriteria6() {
        return criteria6;
    }

    public void setCriteria6(int criteria6) {
        this.criteria6 = criteria6;
    }

    public int getCriteria7() {
        return criteria7;
    }

    public void setCriteria7(int criteria7) {
        this.criteria7 = criteria7;
    }

    public int getCriteria8() {
        return criteria8;
    }

    public void setCriteria8(int criteria8) {
        this.criteria8 = criteria8;
    }
    
    GradesCalculator(int attendance, int quiz, int assignment, int exam){
        this.criteria1 = attendance;
        this.criteria2 = quiz;
        this.criteria3 = assignment;
        this.criteria4 = exam;
    }
    GradesCalculator(int attendance, int quiz, int assignment, int exam, int others1){
        this.criteria1 = attendance;
        this.criteria2 = quiz;
        this.criteria3 = assignment;
        this.criteria4 = exam;
        this.criteria5 = others1;
    }
    GradesCalculator(int attendance, int quiz, int assignment, int exam, int others1, int others2){
        this.criteria1 = attendance;
        this.criteria2 = quiz;
        this.criteria3 = assignment;
        this.criteria4 = exam;
        this.criteria5 = others1;
        this.criteria6 = others2;
    }
    GradesCalculator(int attendance, int quiz, int assignment, int exam, int others1, int others2, int others3){
        this.criteria1 = attendance;
        this.criteria2 = quiz;
        this.criteria3 = assignment;
        this.criteria4 = exam;
        this.criteria5 = others1;
        this.criteria6 = others2;
        this.criteria7 = others3;
    }
    GradesCalculator(int attendance, int quiz, int assignment, int exam, int others1, int others2, int others3, int others4){
        this.criteria1 = attendance;
        this.criteria2 = quiz;
        this.criteria3 = assignment;
        this.criteria4 = exam;
        this.criteria5 = others1;
        this.criteria6 = others2;
        this.criteria7 = others3;
        this.criteria8 = others4;
    }
}
