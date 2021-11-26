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
public class Course {
    String course_code;
    String topics;
    String evaluation;
    Map<Student, Integer>points = new HashMap<Student, Integer>();
}
