/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;
public class CPersona {
    protected String DNI;
    protected String nombre;
    protected int edad;
    protected double saldo;
    static int cnt;
    final String DEFAULT_NAME = "No identificado";

    public CPersona(String DNI, String nombre, int edad, double saldo) {
        setDNI(DNI);
        setEdad(edad);
        setNombre(nombre);
        setSaldo(saldo);
        cnt++;
    }

    public CPersona(String DNI, String nombre, int edad) {
        setDNI(DNI);
        setEdad(edad);
        setNombre(nombre);
        this.saldo = 0;
        cnt++;
    }

    public CPersona(String DNI, int edad) {
        this.nombre = DEFAULT_NAME;
        setDNI(DNI);
        setEdad(edad);
        this.saldo = 0;
        cnt++;
    }

    public CPersona() {
        this.DNI = "00000000";
        this.nombre = DEFAULT_NAME;
        this.edad = 0;
        this.saldo = 0;
        cnt++;
    }

    public String getDNI() { return DNI; }
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("Nombre Inválido");
        this.nombre = nombre;
    }

    protected void setDNI(String DNI) {
        if (DNI == null || !DNI.matches("\\d{8}")) throw new IllegalArgumentException("DNI Inválido");
        this.DNI = DNI;
    }

    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 119) throw new IllegalArgumentException("Edad incorrecta");
        this.edad = edad;
    }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) {
        if (saldo < 0) throw new IllegalArgumentException("Saldo Incorrecto");
        this.saldo = saldo;
    }

    public static int getCnt() { return cnt; }

    @Override
    public String toString() {
        return "Persona [DNI: " + DNI + " | Nombre: " + nombre +
               " | Edad: " + edad + " | Saldo: S/." + saldo + "]";
    }
}
    
    
    
   