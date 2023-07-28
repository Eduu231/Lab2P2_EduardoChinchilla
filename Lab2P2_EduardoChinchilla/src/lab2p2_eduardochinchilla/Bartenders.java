
package lab2p2_eduardochinchilla;

public class Bartenders {

private String nombre;
private int edad;
private String turno;
private double sueldo;
private int licores;

    public Bartenders(String nombre, int edad, String turno,double sueldo, int licores) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.sueldo = sueldo;
        this.licores = licores;
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

    public int getLicores() {
        return licores;
    }

    public void setLicores(int licores) {
        this.licores = licores;
    }

    @Override
    public String toString() {
        return "Bartender"+"\n" + "nombre: "+ nombre + "\n" + "edad: " + edad +"\n" +"turno: " + turno +"\n" + "sueldo: " + sueldo +"\n" + "licores: " + licores;
    }

  



    
}
