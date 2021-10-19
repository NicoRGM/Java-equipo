/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLases;

/**
 *
 * @author Franco
 */
public class Pato {
    
    String color;
    String nombre;
    Integer edad;

    public Pato() {
    }

    public Pato(String color, String nombre, Integer edad) {
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Pato{" + "color=" + color + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
