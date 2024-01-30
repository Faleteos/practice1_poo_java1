package Herencia;

import java.math.BigInteger;

public class Consultor extends Persona{

    String nombre_consultor;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(int id, String nombre, String apellido, String direccion, BigInteger num_tel, String nombre_consultor, int num_consultor) {
        super(id, nombre, apellido, direccion, num_tel);
        this.nombre_consultor = nombre_consultor;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }

    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
}
