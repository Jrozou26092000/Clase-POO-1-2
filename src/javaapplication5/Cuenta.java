/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    //Atributos
        public int number;
        public String owner;
        public float balance;
        
        //Metodos
        public void setOwner(String _owner){
            return null;
        }
        public String getOwner(){
            
        }
        public void deposit(float value){
            balance = balance + value;
        }
}
