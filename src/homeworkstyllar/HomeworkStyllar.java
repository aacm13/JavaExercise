/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkstyllar;

import java.util.*;

/**
 *
 * @author alvar
 */
public class HomeworkStyllar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeworkStyllar x = new HomeworkStyllar();
        x.runForA();
    }
    public void runForA(){
        HomeworkStyllar x = new HomeworkStyllar();
        ArrayList<Student> grades = new ArrayList<Student>();
        grades = x.populate();
        x.showGrades(grades);
        x.Average(grades);
    }
    
    //A
    public ArrayList<Student> populate(){
        ArrayList<Student> grades = new ArrayList<Student>();
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
            
            s.student_id = 0;
            s.name = "Joe";
            s.examPoints.put("Math", 87);
            //s.examPoints.put("Science", grade);
            s1.student_id = 0;
            s1.name = "Melvin";
            s1.examPoints.put("Math", 76);
            //s.examPoints.put("Science", grade);
            s2.student_id = 0;
            s2.name = "Monroa";
            s2.examPoints.put("Math", 85);
            //s.examPoints.put("Science", grade);
            s3.student_id = 0;
            s3.name = "Henry";
            s3.examPoints.put("Math", 97);
            //s.examPoints.put("Science", grade);
            s4.student_id = 0;
            s4.name = "Richard";
            s4.examPoints.put("Math", 57);
            //s.examPoints.put("Science", grade);
            grades.add(s);
            grades.add(s1);
            grades.add(s2);
            grades.add(s3);
            grades.add(s4);
            
        
        return grades;
    }
    public void Average(ArrayList<Student> grades){
        float avg = 0;
        for(int i = 0; i<grades.size();i++){
            avg = avg + grades.get(i).examPoints.get("Math");
        }
        avg = avg/grades.size();
        System.out.println("Math Average: " + avg);
    }
    public void showGrades(ArrayList<Student> grades){
        System.out.println("MATH");
        for(int i =0; i<grades.size();i++){
            System.out.println(grades.get(i).name + ": "+ grades.get(i).examPoints.get("Math"));
        }
    }
    
    
}
