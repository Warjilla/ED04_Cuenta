/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Alvaro
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta("Antonio López", "1000-2365-85-1230456789", 2500);               
    }
    
    /**
    * Esta funcion gestiona la operativa de una cuenta corriente.
    * @param cantidad. cantidad inicial de la cuenta.
    * @param nombre_cuenta
    * @param numero_cuenta
    */
    public static void operativa_cuenta( String nombre_cuenta, String numero_cuenta, float cantidad){
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta(nombre_cuenta, numero_cuenta,2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        } 
    }
}
