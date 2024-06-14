/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;



/**
 *
 * @author Usuario
 */
public class Ejercicio11 {
     
    public static void main(String[] args) {
         
         CajaAhorro cajaAhorro = new CajaAhorro();
         
         cajaAhorro.depositar(100);
         
         System.out.println("Mostrar saldo: " + cajaAhorro.obtenerSaldo() );
         
         cajaAhorro.girar(50);
         
         System.out.println("Mostrar saldo: " + cajaAhorro.obtenerSaldo() );
         
          System.out.println("Mostrar transacciones: " + cajaAhorro.obtenerTransacciones());
        
          CajaAhorro caja2 = new CajaAhorro(200);
          System.out.println("Mostrar saldo: " + caja2.obtenerSaldo() );
          System.out.println("Mostrar transacciones: " + caja2.obtenerTransacciones());
    }
}
