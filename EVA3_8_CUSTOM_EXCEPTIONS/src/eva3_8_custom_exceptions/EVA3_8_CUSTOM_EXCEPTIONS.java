/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_custom_exceptions;

/**
 *
 * @author invitado
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        Persona per1=new Persona("Juan","asedghjk",-9);
        Persona per1=new Persona();
        per1.setNombre("juan");
        per1.setApellido("aaa");
        try {
            per1.setEdad(-4);
        } catch (DatoEntradaCheckedEx e) {
            System.out.println(e.getMessage());
        }
    }
    
}


class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) throws DatoEntradaCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
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

    public int getEdad() {
        return edad;
    }

    //el throws es para quien la use la capture
    public void setEdad(int edad) throws DatoEntradaCheckedEx {
        if(edad<0){
//            throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        }
        this.edad = edad;
    }
    
    
    
    
}


class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("Dato incorrecto, el valor debe ser positivo");
    }
    
    
    
}



class DatoEntradaCheckedEx extends Exception{

    public DatoEntradaCheckedEx() {
        super("Dato incorrecto, el valor debe ser positivo");
    }
    
} 