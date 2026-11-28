/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;
/**
 *
 * @author Marlon Gallarday Lara
 */

import java.util.ArrayList;
import java.util.List;

public class CPersonal extends CPersona {
    private String rol;
    private String usuario;
    private String contraseña;
    private String horarioDisponibilidad;
    private List<CHorario> horarios; // COMPOSICIÓN

    public CPersonal() {
        super();
        this.horarios = new ArrayList<>();
    }

    public CPersonal(String DNI, String nombre, int edad, String rol,
                     String usuario, String contrasena, String horarioDisponibilidad) {
        super(DNI, nombre, edad);
        setRol(rol);
        setUsuario(usuario);
        setContraseña(contrasena);
        setHorarioDisponibilidad(horarioDisponibilidad);
        this.horarios = new ArrayList<>();
    }

    public String getRol() { return rol; }

    public void setRol(String rol) {
        if (rol != null && (rol.equalsIgnoreCase("Fisioterapeuta") || rol.equalsIgnoreCase("Recepcionista"))) {
            this.rol = rol.equalsIgnoreCase("Fisioterapeuta") ? "Fisioterapeuta" : "Recepcionista";
        } else {
            throw new IllegalArgumentException("Rol inválido. Debe ser Fisioterapeuta o Recepcionista");
        }
    }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) {
        if (usuario != null && !usuario.trim().isEmpty()) this.usuario = usuario;
        else throw new IllegalArgumentException("Usuario no puede estar vacío");
    }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) {
        if (contraseña != null && contraseña.length() >= 6) this.contraseña = contraseña;
        else throw new IllegalArgumentException("Contraseña debe tener al menos 6 caracteres");
    }

    public String getHorarioDisponibilidad() { return horarioDisponibilidad; }
    public void setHorarioDisponibilidad(String horarioDisponibilidad) {
        if (horarioDisponibilidad != null && !horarioDisponibilidad.trim().isEmpty())
            this.horarioDisponibilidad = horarioDisponibilidad;
        else throw new IllegalArgumentException("Horario no puede estar vacío");
    }

    public List<CHorario> getHorarios() { return horarios; }
    public void agregarHorario(CHorario horario) {
        if (horario == null) throw new IllegalArgumentException("Horario no puede ser nulo");
        this.horarios.add(horario);
    }

    @Override
    public String toString() {
        return "Personal [DNI: " + getDNI() +
               " | Nombre: " + getNombre() +
               " | Edad: " + getEdad() +
               " | Rol: " + rol +
               " | Usuario: " + usuario +
               " | Horario: " + horarioDisponibilidad +
               " | Bloques horarios: " + horarios.size() + "]";
    }
}