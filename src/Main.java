import Herencia.Consultor;
import Herencia.Empleado;
import Herencia.Jefe;
import Herencia.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Poliformmismo la clase Persona puede estar en 3 formas diferentes (Empleado, Consultor, Jefe)
        Persona vector [] = new Persona [5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();

        Persona per1 = new Persona();
        Empleado emply1 = new Empleado();

        //Se puede asignar un objeto de subclase a la superclase pero no en inverso
        per1 = emply1;




//        Persona per1 = new Persona();

//        Empleado employ1 = new Empleado();
//        employ1.setNum_legajo(10);
//        employ1.setNombre("Thiago");
//
//        employ1.mostrarNombre();


//        Scanner input = new Scanner(System.in);
//
//        int valid;
//
//        System.out.println("Por favor ingrese los datos de la persona:");
//        try {
//
//            System.out.println("Id persona:");
//            per1.setId(input.nextInt());
//            System.out.println("Nombre persona:");
//            per1.setNombre(input.next());
//            System.out.println("Apellido persona:");
//            per1.setApellido(input.next());
//            System.out.println("Direccion persona:");
//            per1.setDireccion(input.next());
//            System.out.println("Telefono persona:");
//            per1.setNum_tel(input.nextBigInteger());
//
//        }catch (Exception e) {
//
//            System.out.println("Dato mal ingresado");
//
//        }
//
//        System.out.println("Desea mostrar el nombre de la persona ingresada?");
//
//        System.out.println("1.= Si 2.= No");
//
//        valid = input.nextInt();
//
//        if (valid == 1 ){
//            per1.mostrarNombre();
//        }

    }
}