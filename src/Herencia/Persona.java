package Herencia;

import java.math.BigInteger;

public class Persona {

    int id;
    String nombre;
    String apellido;
    String direccion;
    BigInteger num_tel;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String direccion, BigInteger num_tel) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.num_tel = num_tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(BigInteger num_tel) {
        this.num_tel = num_tel;
    }

    public void mostrarNombre(){
        System.out.println("El nombre de la persona es: "+ nombre);
    }
}
