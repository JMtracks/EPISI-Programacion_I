/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 * Clase Persona (CPersona)
 * @author JMTracks (Manrique Galvez Ernesto Joel)
 */
public class CPersona {
   private String DNI; //Debe ser anotado una sola vez. 
   private String nombre;
   private int edad;
   private double saldo;
   static int cnt;
   final String DEFAULT_NAME = "No identifcado";
   /**
    * Crear una Persona
    * @param DNI Anotas el DNI de la Persona
    * @param nombre Nombre de la Persona
    * @param edad Edad de la persona
    * @param saldo Saldo de la persona
    */
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

    public String getDNI() {return DNI;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        if(nombre.trim().isEmpty()) throw new IllegalArgumentException("Nombre Invalido");
         this.nombre = nombre;}
    private void setDNI(String DNI){
       if(!DNI.matches("\\d{8}")) throw new IllegalArgumentException("DNI Invalido");
       this.DNI = DNI;
    }

    public int getEdad() {return edad;}

    public void setEdad(int edad) {
        if(edad <0 &&edad>119) throw new IllegalArgumentException("Edad incorrecta"); 
        this.edad = edad;
    }

    public double getSaldo() {return saldo;}

    private void setSaldo(double saldo) {
        if(saldo<0) throw new IllegalArgumentException("Saldo Incorrecto");
        this.saldo = saldo;
    }

    public static int getCnt() { return cnt; }
    
    
    
   
}
