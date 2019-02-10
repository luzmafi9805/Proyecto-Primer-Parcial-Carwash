/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Maryf
 */
public class Persona {
    String nombre;
    String Apellido;
    String TipoC;
    int celular;

    public Persona() {
        this.nombre = " ";
        this.Apellido = " ";
        this.TipoC = " ";
        this.celular = 0;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTipoC() {
        return TipoC;
    }

    public void setTipoC(String TipoC) {
        this.TipoC = TipoC;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
}
