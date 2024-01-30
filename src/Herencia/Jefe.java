package Herencia;

import java.math.BigInteger;

public class Jefe extends Persona{
    int id_jefe;
    String dep_jefe;

    public Jefe() {
    }

    public Jefe(int id, String nombre, String apellido, String direccion, BigInteger num_tel, int id_jefe, String dep_jefe) {
        super(id, nombre, apellido, direccion, num_tel);
        this.id_jefe = id_jefe;
        this.dep_jefe = dep_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDep_jefe() {
        return dep_jefe;
    }

    public void setDep_jefe(String dep_jefe) {
        this.dep_jefe = dep_jefe;
    }
}
