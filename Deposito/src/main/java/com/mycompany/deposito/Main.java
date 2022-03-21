package com.mycompany.deposito;


import com.mycompany.deposito.CCuenta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try{
           Scanner teclado = new Scanner(System.in);
           System.out.print("Ingresar cantidad a ingresa");
           float cantidad=teclado.nextFloat();
           operativa_cuenta(cuenta1,cantidad);
        }catch(Exception e){
            System.out.println("Fallo al crear la cuenta");
        }
    }
    
    
    public static void operativa_cuenta(CCuenta cuenta,float cantidad)throws Exception{
        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    
    }
}
