package Herencia;

import java.math.BigInteger;

public class Empleado  extends Persona{
int num_legajo;
String cargo;
double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String direccion, BigInteger num_tel, int num_legajo, String cargo, double sueldo) {
        super(id, nombre, apellido, direccion, num_tel);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
