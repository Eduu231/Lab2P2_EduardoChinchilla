package lab2p2_eduardochinchilla;

import java.util.Date;

public class Meseros {

    private String nombre;
    private int edad;
    private String turno;
    private double sueldo;
    private double propina;

    public Meseros(String nombre, int edad, String turno, double sueldo, double propina) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        
        this.sueldo = sueldo;
        this.propina = propina;
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
             this.turno = "matutino";
        }else{
            this.turno = "despertino";
        }
        this.turno = turno;
    }
    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    @Override
    public String toString() {
        return "Mesero" + "\n" + "nombre:" + nombre + "edad: " + edad +"\n" + "turno: " + turno +"\n" + "sueldo: " + sueldo +"\n" + "propina: " + propina;
    }

}
