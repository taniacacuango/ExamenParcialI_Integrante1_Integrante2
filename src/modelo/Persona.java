/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ruby
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int cedula;
    private int edad;
    private int telefono;
    private String direccion;
    
  public Persona(){}
  public Persona(String nombre, String apellido, int cedula, int edad, int telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
    @Override
public String toString() {
    return "Persona{" +
           "nombre='" + nombre + '\'' +
           ", apellido='" + apellido + '\'' +
           ", cedula=" + cedula +
           ", edad=" + edad +
           ", telefono=" + telefono +
           ", direccion='" + direccion + '\'' +
           '}';
}

}
