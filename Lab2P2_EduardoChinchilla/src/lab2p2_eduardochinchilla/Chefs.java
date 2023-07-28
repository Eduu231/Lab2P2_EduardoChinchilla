
package lab2p2_eduardochinchilla;

import java.util.Date;

public class Chefs {
   
    private String nombre;
    private int edad;
    private String turno;
   
    private int estrellas;
    private double sueldo;

    public Chefs(String nombre, int edad, String turno, int estrellas, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno= turno;
        this.estrellas = estrellas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno.equals("matutino")){
             this.turno = "matutnio";
        }else{
            this.turno = "despertino";
        }
        this.turno = turno;
    }

  

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Chef"+"\n" + "nombre:" + nombre +"\n" + "edad:" + edad +"\n" + "turno:" + turno +"\n" + "estrellas: " + estrellas +"\n" + "sueldo: " + sueldo;
    }
    
    
    
    
    
}
