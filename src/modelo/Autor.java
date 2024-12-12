/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ruby
 */
public class Autor extends Persona {
    private String biografia;
    private String nacionalidad;

    public Autor(){}
    
    public Autor(String biografia, String nacionalidad, String nombre, String apellido, int cedula, int edad, int telefono, String direccion) {
        super(nombre, apellido, cedula, edad, telefono, direccion);
        this.biografia = biografia;
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
  
  
}
