/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author alberto samper
 */
public class Refactorizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operativa_cuenta(1000);
    }

    public static void operativa_cuenta(float cantidad) {
        // TODO code application logic here
        CCuenta cuenta1,cuenta2;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio López","10000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual);
        cuenta2 = new CCuenta("Antonio Perez","3000-6543-23-12345600343",3400,0);
        System.out.println("El saldo actual es"+ saldoActual);
        try{
            cuenta1.retirar(2300);
            cuenta2.retirar(2000);
        }catch (Exception e){
            System.out.println("Fallo al retirar");
        }
        try{
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            cuenta2.ingresar(300);
        }catch (Exception e){
            System.out.println("Fallo al ingresar");
        }
    }
    
}
