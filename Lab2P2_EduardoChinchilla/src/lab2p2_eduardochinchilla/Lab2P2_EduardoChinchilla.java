package lab2p2_eduardochinchilla;

import java.util.*;

public class Lab2P2_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList gerenciaI = new ArrayList<>();
        ArrayList chefs = new ArrayList<>();
        ArrayList meseros = new ArrayList<>();
        ArrayList bartenders = new ArrayList<>();
        ArrayList mesas = new ArrayList<>();

        int opcion = 0;

        while (opcion != 2) {
            opcion = menuG();
            switch (opcion) {
                case 1: {
                    String usuario = "gerente";
                    String password = "g3r$nt0";
                    read.nextLine();
                    System.out.println("Ingrese nombre de usuario");
                    String nombreU = read.nextLine();

                    System.out.println("Ingrese la password");
                    String pass = read.nextLine();

                    if (nombreU.equals(usuario) && pass.equals(password)) {
                        int opcionI = 0;

                        while (opcionI != 5) {
                            opcionI = menuInicial();

                            switch (opcionI) {
                                case 1: {
                                    int opcionC = 0;

                                    while (opcionC != 5) {
                                        opcionC = menuCRUD();

                                        switch (opcionC) {
                                            case 1: {
                                                int cont = 0;
                                                int matutinoC = 0;
                                                int despertinoC = 0;
                                                if (cont < 14 || matutinoC < 7 || despertinoC < 7) {
                                                    System.out.println("Chefs");
                                                    read.nextLine();
                                                    System.out.println("Ingrese nombre: ");
                                                    String nombreC = read.nextLine();
                                                    System.out.println("Ingrese Edad: ");
                                                    int edadC = read.nextInt();
                                                    read.nextLine();
                                                    System.out.println("Ingrese si es turno Matutino/Despertino: ");
                                                    String turnoC = read.nextLine().toLowerCase();
                                                    if (turnoC.equals("matutino")) {
                                                        matutinoC++;
                                                    } else {
                                                        despertinoC++;
                                                    }
                                                    System.out.println("Ingrese el numero de estrellas: ");
                                                    int estrellasC = read.nextInt();
                                                    System.out.println("Ingrese el sueldo: ");
                                                    double sueldoC = read.nextDouble();

                                                    chefs.add(new Chefs(nombreC, edadC, turnoC, estrellasC, sueldoC));
                                                    cont++;
                                                } else {
                                                    System.out.println("No pueden haber mas de 14 chefs");
                                                }
                                                break;
                                            }
                                            case 2: {
                                                System.out.println("modificar");
                                                System.out.println(listarChefs(chefs));
                                                System.out.println("Ingrese el indice del chef a modificar: ");
                                                int pos = read.nextInt();

                                                if (pos >= 0 && pos < chefs.size()) {
                                                    if (chefs.get(pos) instanceof Chefs) {
                                                        System.out.println("Atributo a modificar");
                                                        int atributoC = 0;
                                                        while (atributoC != 6) {

                                                            atributoC = menuModificar();

                                                            switch (atributoC) {
                                                                case 1: {
                                                                    read.nextLine();
                                                                    System.out.println("Ingrese nuevo nombre: ");
                                                                    String nombreNC = read.nextLine();
                                                                    ((Chefs) chefs.get(pos)).setNombre(nombreNC);
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    System.out.println("Ingrese nueva edad: ");
                                                                    int edadNC = read.nextInt();
                                                                    ((Chefs) chefs.get(pos)).setEdad(edadNC);
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    read.nextLine();
                                                                    System.out.println("Ingrese nuevo turno: ");
                                                                    String turnoNC = read.nextLine();
                                                                    ((Chefs) chefs.get(pos)).setTurno(turnoNC);
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    System.out.println("Ingrese numeros de estrellas: ");
                                                                    int estrellasNC = read.nextInt();
                                                                    ((Chefs) chefs.get(pos)).setEstrellas(estrellasNC);
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    System.out.println("Ingrese nuevo sueldo: ");
                                                                    double sueldoNC = read.nextDouble();
                                                                    ((Chefs) chefs.get(pos)).setSueldo(sueldoNC);
                                                                    break;
                                                                }
                                                                case 6: {
                                                                    System.out.println("Salir");
                                                                    break;
                                                                }
                                                            }
                                                        }

                                                    } else {
                                                        System.out.println("Indice fuera de rango");
                                                    }

                                                }
                                            }

                                            case 3: {
                                                System.out.println("Listar");
                                                System.out.println(listarChefs(chefs));
                                                break;
                                            }
                                            case 4: {
                                                System.out.println("Eliminar");
                                                System.out.println(listarChefs(chefs));
                                                System.out.println("Ingrese el indice del chef a eliminar: ");
                                                int pos = read.nextInt();

                                                if (pos >= 0 && pos < chefs.size()) {
                                                    if (chefs.get(pos) instanceof Chefs) {
                                                        chefs.remove(pos);
                                                    } else {
                                                        System.out.println("El indice ingresado esta fuera de rango");
                                                    }
                                                }
                                                break;
                                            }
                                            case 5: {
                                                System.out.println("Salir");
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }

                                case 2: {
                                    System.out.println("meseros");
                                    int opcionC = 0;

                                    while (opcionC != 5) {
                                        opcionC = menuCRUD();

                                        switch (opcionC) {
                                            case 1: {
                                                System.out.println("Agregar");
                                                int cont = 0;
                                                int matutinoC = 0;
                                                int despertinoC = 0;
                                                if (cont < 8 || matutinoC < 4 || despertinoC < 4) {
                                                    System.out.println("Meseros");
                                                    read.nextLine();
                                                    System.out.println("Ingrese nombre: ");
                                                    String nombreM = read.nextLine();
                                                    System.out.println("Ingrese Edad: ");
                                                    int edadM = read.nextInt();
                                                    read.nextLine();
                                                    System.out.println("Ingrese si es turno Matutino/Despertino: ");
                                                    String turnoM = read.nextLine().toLowerCase();
                                                    if (turnoM.equals("matutino")) {
                                                        matutinoC++;
                                                    } else {
                                                        despertinoC++;
                                                    }
                                                    System.out.println("Ingrese la propina: ");
                                                    double propinaM = read.nextDouble();
                                                    System.out.println("Ingrese el sueldo: ");
                                                    double sueldoM = read.nextDouble();

                                                    meseros.add(new Meseros(nombreM, edadM, turnoM, propinaM, sueldoM));
                                                    cont++;
                                                }
                                                break;
                                            }
                                            case 2: {
                                                System.out.println("Modificar");
                                                System.out.println(listarMeseros(meseros));
                                                System.out.println("Ingrese el indice del mesero a modificar: ");
                                                int pos = read.nextInt();

                                                if (pos >= 0 && pos < meseros.size()) {
                                                    if (meseros.get(pos) instanceof Meseros) {
                                                        System.out.println("Atributo a modificar");
                                                        int atributoM = 0;
                                                        while (atributoM != 6) {

                                                            atributoM = menuModificarM();

                                                            switch (atributoM) {
                                                                case 1: {
                                                                    read.nextLine();
                                                                    System.out.println("Ingrese nuevo nombre: ");
                                                                    String nombreNM = read.nextLine();
                                                                    ((Meseros) meseros.get(pos)).setNombre(nombreNM);
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    System.out.println("Ingrese nueva edad: ");
                                                                    int edadNM = read.nextInt();
                                                                    ((Meseros) meseros.get(pos)).setEdad(edadNM);
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    read.nextLine();
                                                                    System.out.println("Ingrese nuevo turno: ");
                                                                    String turnoNM = read.nextLine();
                                                                    ((Meseros) meseros.get(pos)).setTurno(turnoNM);
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    System.out.println("Ingrese la propina: ");
                                                                    double propinaNM = read.nextInt();
                                                                    ((Meseros) meseros.get(pos)).setPropina(propinaNM);
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    System.out.println("Ingrese nuevo sueldo: ");
                                                                    double sueldoNM = read.nextDouble();
                                                                    ((Meseros) meseros.get(pos)).setSueldo(sueldoNM);
                                                                    break;
                                                                }
                                                                case 6: {
                                                                    System.out.println("Salir");
                                                                    break;
                                                                }
                                                            }
                                                        }

                                                    } else {
                                                        System.out.println("Indice fuera de rango");
                                                    }

                                                }

                                                break;
                                            }
                                            case 3: {
                                                System.out.println("Listar");

                                                System.out.println(listarMeseros(meseros));
                                                break;
                                            }
                                            case 4: {
                                                System.out.println("Eliminar");
                                                System.out.println(listarMeseros(meseros));
                                                System.out.println("Ingrese el indice del mesero a eliminar: ");
                                                int pos = read.nextInt();

                                                if (pos >= 0 && pos < meseros.size()) {
                                                    if (meseros.get(pos) instanceof Meseros) {
                                                        meseros.remove(pos);
                                                    } else {
                                                        System.out.println("El indice ingresado esta fuera de rango");
                                                    }
                                                }
                                                break;
                                            }
                                            case 5: {
                                                System.out.println("Salir");
                                                break;
                                            }
                                        }
                                    }

                                    break;
                                }
                                case 3: {
                                    System.out.println("Bartender");
                                    int opcionC = 0;

                                    while (opcionC != 5) {
                                        opcionC = menuCRUD();

                                        switch (opcionC) {
                                            case 1: {
                                                System.out.println("Agregar");
                                                int cont = 0;
                                                int matutinoC = 0;
                                                int despertinoC = 0;
                                                if (cont < 4 || matutinoC < 2 || despertinoC < 2) {
                                                    System.out.println("Bartenders");
                                                    read.nextLine();
                                                    System.out.println("Ingrese nombre: ");
                                                    String nombreB = read.nextLine();
                                                    System.out.println("Ingrese Edad: ");
                                                    int edadB = read.nextInt();
                                                    read.nextLine();
                                                    System.out.println("Ingrese si es turno Matutino/Despertino: ");
                                                    String turnoB = read.nextLine().toLowerCase();
                                                    if (turnoB.equals("matutino")) {
                                                        matutinoC++;
                                                    } else {
                                                        despertinoC++;
                                                    }
                                                    System.out.println("Ingrese el numero de licores: ");
                                                    int licoresB = read.nextInt();
                                                    System.out.println("Ingrese el sueldo: ");
                                                    double sueldoB = read.nextDouble();

                                                    bartenders.add(new Bartenders(nombreB, edadB, turnoB, sueldoB, licoresB));
                                                } else {
                                                    System.out.println("Se ha excedido del limite de bartenders");
                                                }
                                                break;
                                            }
                                            case 2: {
                                                System.out.println("Modificar");
                                                System.out.println(listarBartenders(bartenders));
                                                System.out.println("Ingrese el indice del bartender a modificar: ");
                                                int pos = read.nextInt();

                                                if (pos >= 0 && pos < bartenders.size()) {
                                                    if (bartenders.get(pos) instanceof Bartenders) {
                                                        System.out.println("Atributo a modificar");
                                                        int atributoB = 0;
                                                        while (atributoB != 6) {

                                                            atributoB = menuModificarB();

                                                            switch (atributoB) {
                                                                case 1: {
                                                                    read.nextLine();
                                                                    System.out.println("Ingrese nuevo nombre: ");
                                                                    String nombreNB = read.nextLine();
                                                                    ((Bartenders) bartenders.get(pos)).setNombre(nombreNB);
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    System.out.println("Ingrese nueva edad: ");
                                                                    int edadNB = read.nextInt();
                                                                    ((Bartenders) bartenders.get(pos)).setEdad(edadNB);
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    read.nextLine();
                                                                    System.out.println("Ingrese nuevo turno: ");
                                                                    String turnoNB = read.nextLine();
                                                                    ((Bartenders) bartenders.get(pos)).setTurno(turnoNB);
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    System.out.println("Ingrese el nuevo numero de licores: ");
                                                                    int licoresB = read.nextInt();
                                                                    ((Bartenders) bartenders.get(pos)).setLicores(licoresB);
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    System.out.println("Ingrese nuevo sueldo: ");
                                                                    double sueldoNB = read.nextDouble();
                                                                    ((Bartenders) bartenders.get(pos)).setSueldo(sueldoNB);
                                                                    break;
                                                                }
                                                                case 6: {
                                                                    System.out.println("Salir");
                                                                    break;
                                                                }
                                                            }
                                                        }

                                                    } else {
                                                        System.out.println("Indice fuera de rango");
                                                    }

                                                }

                                                break;
                                            }
                                            case 3: {
                                                System.out.println("Listar");

                                                System.out.println(listarBartenders(bartenders));
                                                break;
                                            }
                                            case 4: {
                                                System.out.println("Eliminar");
                                                System.out.println(listarBartenders(bartenders));
                                                System.out.println("Ingrese el indice del bartender a eliminar: ");
                                                int pos = read.nextInt();

                                                if (pos >= 0 && pos < bartenders.size()) {
                                                    if (bartenders.get(pos) instanceof Bartenders) {
                                                        bartenders.remove(pos);
                                                    } else {
                                                        System.out.println("El indice ingresado esta fuera de rango");
                                                    }
                                                }
                                                break;
                                            }
                                            case 5: {
                                                System.out.println("Salir");
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("mesas");
                                    int opcionC = 0;

                                    while (opcionC != 5) {
                                        opcionC = menuCRUD();

                                        switch (opcionC) {
                                            case 1: {
                                                System.out.println("Agregar");
                                                int cont = 0;

                                                if (cont < 10) {

                                                    System.out.println("Ingrese numero de platos: ");
                                                    int platosM = read.nextInt();
                                                    System.out.println("Ingrese el numero de utensilios: ");
                                                    int utensiliosM = read.nextInt();
                                                    System.out.println("Ingrese el precio total: ");
                                                    double sueldoM = read.nextDouble();

                                                    mesas.add(new Mesas(platosM, utensiliosM, sueldoM));
                                                    cont++;
                                                } else {
                                                    System.out.println("Paso el limite de mesas");
                                                }
                                                break;
                                            }
                                            case 2: {
                                                System.out.println("Modificar");
                                                System.out.println(listarMesas(mesas));
                                                System.out.println("Ingrese el indice del mesero a modificar: ");
                                                int pos = read.nextInt();

                                                if (pos >= 0 && pos < mesas.size()) {
                                                    if (mesas.get(pos) instanceof Mesas) {
                                                        System.out.println("Atributo a modificar");
                                                        int atributoM = 0;
                                                        while (atributoM != 4) {

                                                            atributoM = menuModificarMesas();

                                                            switch (atributoM) {
                                                                case 1: {
                                                                    read.nextLine();
                                                                    System.out.println("Ingrese nuevo numero de Mesas:  ");
                                                                    int mesasM = read.nextInt();
                                                                    ((Mesas) mesas.get(pos)).setPlatos(mesasM);
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    System.out.println("Ingrese nuevo numero de utensilios: ");
                                                                    int utensiliosM = read.nextInt();
                                                                    ((Mesas) mesas.get(pos)).setUtensilios(utensiliosM);
                                                                    break;
                                                                }
                                                                case 3: {

                                                                    System.out.println("Ingresio el nuevo precio total:  ");
                                                                    double precioT = read.nextDouble();
                                                                    ((Mesas) mesas.get(pos)).setPrecio(precioT);
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    System.out.println("Salir");
                                                                    break;
                                                                }

                                                            }
                                                        }

                                                    } else {
                                                        System.out.println("Indice fuera de rango");
                                                    }

                                                }

                                                break;
                                            }
                                            case 3: {
                                                System.out.println("Listar");

                                                System.out.println(listarMesas(mesas));
                                                break;
                                            }
                                            case 4: {
                                                System.out.println("Eliminar");
                                                System.out.println(listarMesas(mesas));
                                                System.out.println("Ingrese el indice del bartender a modificar: ");
                                                int pos = read.nextInt();

                                                if (pos >= 0 && pos < mesas.size()) {
                                                    if (mesas.get(pos) instanceof Mesas) {
                                                        mesas.remove(pos);
                                                    } else {
                                                        System.out.println("El indice ingresado esta fuera de rango");
                                                    }
                                                }
                                                break;
                                            }
                                            case 5: {
                                                System.out.println("Salir");
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case 5: {
                                    System.out.println("salio");
                                    break;
                                }
                                // fin menu interno
                            }
                        }// fin  del inicio de sesion
                    } else {
                        System.out.println("Uno de los datos ingresados es incorrecto, vuelva a ingresar");
                    }
                    break;
                }

                case 2: {

                    break;
                }
            }

        }

    }

    private static int menuG() {
        int op = 0;

        System.out.println("1- Iniciar Sesion");
        System.out.println("2- Salir");

        op = read.nextInt();

        return op;
    }

    private static int menuInicial() {
        int op = 0;

        System.out.println("""
                            Menu Interno
                           1- Chefs
                           2- Meseros
                           3- Bartenders
                           4- Mesas
                           5- Salir
                           """);

        op = read.nextInt();

        return op;
    }

    private static int menuCRUD() {
        int op = 0;

        System.out.println("""
                           Menu CRUD
                           1- Agregar
                           2- Modificar
                           3- Listar
                           4- Eliminar
                           5- Salir
                           """);

        op = read.nextInt();

        return op;
    }

    private static String listarChefs(ArrayList chefs) {
        String salida = "";
        for (Object x : chefs) {
            if (x instanceof Chefs) {
                salida += chefs.indexOf(x) + "-" + x + "\n";
            }
        }
        return salida;
    }

    private static String listarMeseros(ArrayList meseros) {
        String salida = "";
        for (Object x : meseros) {
            if (x instanceof Meseros) {
                salida += meseros.indexOf(x) + "-" + x + "\n";
            }
        }
        return salida;
    }

    private static String listarBartenders(ArrayList bartenders) {
        String salida = "";
        for (Object x : bartenders) {
            if (x instanceof Bartenders) {
                salida += bartenders.indexOf(x) + "-" + x + "\n";
            }
        }
        return salida;
    }

    private static String listarMesas(ArrayList mesas) {
        String salida = "";
        for (Object x : mesas) {
            if (x instanceof Mesas) {
                salida += mesas.indexOf(x) + "-" + x + "\n";
            }
        }
        return salida;
    }

    private static int menuModificar() {
        int op = 0;

        System.out.println("""
                     1- nombre
                     2- edad
                     3- turno
                     4- estrellas
                     5- sueldo
                     6- salir
                     """);

        op = read.nextInt();

        return op;
    }

    private static int menuModificarM() {
        int op = 0;

        System.out.println("""
                     1- nombre
                     2- edad
                     3- turno
                     4- propina
                     5- sueldo
                     6- salir
                     """);

        op = read.nextInt();

        return op;
    }

    private static int menuModificarB() {
        int op = 0;

        System.out.println("""
                     1- nombre
                     2- edad
                     3- turno
                     4- Numero de Licores
                     5- sueldo
                     6- salir
                     """);

        op = read.nextInt();

        return op;
    }

    private static int menuModificarMesas() {
        int op = 0;

        System.out.println("""
                     1- Numero de Platos
                     2- Numero de Utensilios
                     3- Precio Total
                     4- Salir
                     """);

        op = read.nextInt();

        return op;
    }
}
