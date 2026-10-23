/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author USer
 */
public class CPersonal {
    
     private String dni;
    private String nombreCompleto;
    private String rol;
    private String usuario;
    private String contraseña;
    private String horarioDisponibilidad;


    public CPersonal() {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.horarioDisponibilidad = horarioDisponibilidad;
    }

    public CPersonal(String dni, String nombreCompleto, String rol, String usuario, String contrasena, String horarioDisponibilidad) {
        setDni(dni);
        setNombreCompleto(nombreCompleto);
        setRol(rol);
        setUsuario(usuario);
        setContraseña(contraseña);
        setHorarioDisponibilidad(horarioDisponibilidad);
    }


    public CPersonal(String dni, String nombreCompleto, String rol) {
        setDni(dni);
        setNombreCompleto(nombreCompleto);
        setRol(rol);
        this.usuario = "pendiente";
        this.contraseña = "123456";
        this.horarioDisponibilidad = "Por asignar";
    }

    // 5. Métodos Getters y Setters con validación (Requisito Semana 3)
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni != null && dni.length() == 8) {
            this.dni = dni;
        } else {
            throw new IllegalArgumentException(" El DNI debe tener exactamente 8 dígitos") ;
 
        }
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto != null && !nombreCompleto.trim().isEmpty()) {
            this.nombreCompleto = nombreCompleto;
        } else {
             throw new IllegalArgumentException("Error: El nombre no puede estar vacío.");
         }
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
            if (rol != null && (rol.equalsIgnoreCase("Fisioterapeuta") || rol.equalsIgnoreCase("Recepcionista"))) {
            
            if (rol.equalsIgnoreCase("Fisioterapeuta")) {
                this.rol = "Fisioterapeuta";
            } else {
                this.rol = "Recepcionista";
            }
        } else {
            throw new IllegalArgumentException( "Rol inválido. Debe ser Fisioterapeuta o Recepcionista");
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if (usuario != null && !usuario.trim().isEmpty()) {
            this.usuario = usuario;
        } else {
           throw new IllegalArgumentException("Error: El usuario no puede estar vacío.");
                }
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
               if (contraseña != null && contraseña.length() >= 6) {
            this.contraseña = contraseña;
        } else {
            throw new IllegalArgumentException("Error: La contraseña debe tener al menos 6 caracteres.");
        }
    }
    public String getHorarioDisponibilidad() {
        return horarioDisponibilidad;
    }

    public void setHorarioDisponibilidad(String horarioDisponibilidad) {
        if (horarioDisponibilidad != null && !horarioDisponibilidad.trim().isEmpty()) {
            this.horarioDisponibilidad = horarioDisponibilidad;
        } else {
            throw new IllegalArgumentException("Error: El horario no puede estar vacío.");
                    }
    }
    @Override
    public String toString() {
             return "Personal [DNI: " + dni + 
               " | Nombre: " + nombreCompleto + 
               " | Rol: " + rol + 
               " | Usuario: " + usuario + 
               " | Horario: " + horarioDisponibilidad + "]";
    }
}