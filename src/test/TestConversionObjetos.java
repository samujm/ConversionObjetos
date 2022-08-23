package test;
import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        //Asignando una referencia de tipo hijo (linea 8) hacia la clase padre (linea 7)
        Empleado empleado; // 1.- COMIENZA COMO PADRE 
        empleado = new Escritor("Juan", 5000,TipoEscritura.CLASICO); // 2.- CAMBIA A HIJA
        //System.out.println("empleado = " + empleado);
        
        System.out.println("empleado = " + empleado.obtenerDetalles());

        //Convirtiendo referencia de tipo padre a tipo hijo (DOWNCASTING)
        //((Escritor)empleado).getTipoEscritura();// 
        //Convirtiendo referencia de tipo padre a tipo hijo (DOWNCASTING), pero en dos lineas
        Escritor escritor = (Escritor)empleado; // 3.- VUELVE A SER PADRE
        System.out.println("escritor = " + escritor.obtenerDetalles());
        
        //Asignar una variable de tipo Hija a una de tipo Padre el compilador lo hace automatico (UPCASTING)
        Empleado empleado2 = escritor; // 4.- VUELVE A SER HIJA
        System.out.println("empleado2 = " + empleado2.obtenerDetalles());
    }
    
    //DOWNCASTING: De padre a hija
    //UPCASTING: De hija a padre
}
