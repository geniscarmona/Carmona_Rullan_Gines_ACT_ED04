
package com.mycompany.deposito;

/**
 * @version 1.1
 * @author Gines Carmona Rullan
 */

public class CCuenta {


    private String nombre; //Atributo de la clase
    private String cuenta; //Atributo de la clase
    private double saldo; //Atributo de la clase
    private double tipoInterés; //Atributo de la clase

    public CCuenta()
    {
    }
    
      /** 
     * Crea una Cuenta
     * @param nom Nombre del cliente
     * @param cue cuenta del cliente
     * @param sal saldo del cliente.
     * @param tipo tipo de cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
    public double estado()
    {
        return saldo;
    }
    
       /** 
     * Clase Ingresar sirve para insertar una cantidad de la cuenta
     * @param cantidad valor a ingresar
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
     /** 
     * Clase retirar sirve para retirar una cantidad de la cuenta
     * @param cantidad valor a ingresar
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
