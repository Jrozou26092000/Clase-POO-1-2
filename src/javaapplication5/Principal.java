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
public class Principal {
    public static void main(String[] args) {
        // clase- identificador
        Cuenta cuenta = new Cuenta();
        cuenta.number =5;
        cuenta.owner = "Valeria";
        cuenta.balance = 200;
        System.out.println(cuenta.number);
        System.out.println(cuenta.balance);
        cuenta.deposit(200);
    }
    
}
