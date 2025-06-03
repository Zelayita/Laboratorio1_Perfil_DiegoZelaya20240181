package Laboratorio1Perfil2DiegoZelaya20240181;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


//Laboratorio de Diego Alberto López Zelaya.
public class LibrosEjercicios {
    public static void main(String[] args) {
        //Declarados
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> librosTree = new TreeMap<>();
        Set<String> LibrosHash = new HashSet<>();
        HashMap<Integer, String> LibrosMap = new HashMap<>();
        LinkedList<String> LibrosList = new LinkedList<>();
        //Arrays declarados

        System.out.println("Buenas, Que desea hacer hoy?");
        System.out.println(" 1. Desea Insertar Libros  || 2. Desea Obtener Libro por Genero || 3.Desea Obtener los Ultimos Libros || 4.Desea Obtener Libro por ISBN ");
        int respuesta = sc.nextInt();
        do {
            switch (respuesta){
                case 1:

                    System.out.println("Bienvenido a Agregar Libros");
                    System.out.println("1. Agregar Libro ");
                    int res = sc.nextInt();
                    //Añadir al HashSet
                    System.out.println("Que Libro deseas añadr");
                    String Libro = sc.next();
                    boolean respuLibro = LibrosHash.contains(Libro);
                    if (respuLibro) {
                        System.out.println("Ese libro ya existe");
                    } else {
                        //Añadimos al HashSet
                        LibrosHash.add(Libro);
                        //Añadir al TreeMap
                        System.out.println("El ISBN del Libro");
                        sc.nextLine();
                        int ISBN = sc.nextInt();
                        librosTree.put(ISBN, Libro);
                        //Agregar al HAshMap
                        sc.nextLine();
                        System.out.println("EL Genero del Libro?");
                        String libroGenero = sc.next();
                        LibrosMap.put(ISBN, libroGenero);
                        //Agregarmos a la LinbkedList
                            if (LibrosList.size() > 10) {
                                System.out.println("Se eliminara el registro mas Antiguo");
                                LibrosList.removeLast();
                            } else {
                                LibrosList.add(Libro);
                            }
                            System.out.println("Se ha Añadido el Libro");
                        }
                    break;
                case 2:
                    System.out.println("Buscar Por Genero:");
                    sc.nextLine();
                    String Genero = sc.next();
                    boolean genero = LibrosMap.containsValue(Genero);
                    if (genero){
                        System.out.println("La clave " + Genero + " Existe en el HashMap");
                        System.out.println("Su Valor " + LibrosMap.get(Genero));
                    }else{
                        System.out.println("La clave "+ Genero + " No existe en La Libreria");
                    }
                    break;
                case 3:
                    System.out.println("Metodo Obtener Ultimos Libros:");
                    sc.nextLine();
                    System.out.println("Ultimos Libros añadidos de Mayor a Menor");
                    System.out.println("Rango de los libros (Mayor a Menor)");
                    int NumeroLibro = sc.nextInt();

                    break;
                case 4:

                    break;
                default:
                    break;
            }
        }while (respuesta <= 5);
    }


}