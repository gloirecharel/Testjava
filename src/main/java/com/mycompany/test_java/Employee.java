/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_java;

import java.util.List;

/**
 *
 * @author hp
 */
public class Employee {
    
    protected String name ;
    protected String position ;
    protected  double salary ;
    
    public Employee(String name , String position , double salary){
        
        this.name = name ;
        this.position = position ;
        this.salary = salary ;   
    }
    
    public static List<Employee> listeEmployeeSalaireDecroi(List<Employee> employes){
        
       employes.sort((a , b) -> Double.compare(b.salary, a.salary));
        
       return employes ;
             
    }
    
    
    public double CalculePrimeAnnuel(){
            double prime ;
            if (position.equals("Manage")){
                prime = salary*0.10;
                return prime ;
            }
            else{
                prime = salary*0.05 ;
                return prime ;
            }
            
        }
  }
    
    

