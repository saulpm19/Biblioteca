
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Libro> ListaLibros = new ArrayList<>();


        //Insertar libros
        Libro Libro1 = new Libro ("La torre Oscura", "Stephen King", "101", true);
        Libro Libro2 = new Libro ("Harry Potter y la piedra filosofal", "J.K. Rolling", "102", true);
        Libro Libro3 = new Libro ("IT", "Stephen King", "103", true);
        Libro Libro4 = new Libro ("Duna", "Frank Herbert", "104", true);


        ListaLibros.add(Libro1);
        ListaLibros.add(Libro2);
        ListaLibros.add(Libro3);
        ListaLibros.add(Libro4);

        //Insertar Bibliotecario
        Bibliotecario Bibliotecario1= new Bibliotecario( "Saúl","Peréz");

        //Insertar Usuarios
        Usuario Usuario1= new Usuario ("Catherine","Usme");
        Usuario Usuario2= new Usuario ("Noah","Peréz");
        Usuario Usuario3= new Usuario ("Liam","Peréz");

        //Mostrar datos personas
        Bibliotecario1.mostrardatos();
        Usuario1.mostrardatos();
        Usuario2.mostrardatos();
        Usuario3.mostrardatos();

        //Proceso prestar libro
        Bibliotecario1.prestarlibro(Usuario1,Libro2);
        Bibliotecario1.prestarlibro(Usuario1,Libro1);
        Bibliotecario1.prestarlibro(Usuario1,Libro3);
        Bibliotecario1.prestarlibro(Usuario1,Libro4);
        Bibliotecario1.prestarlibro(Usuario2,Libro3);

        //Devolver Libro
        Bibliotecario1.Devolverlibro(Usuario1,Libro3);

        //Prestar un libro despues de devuelto
        Bibliotecario1.prestarlibro(Usuario2,Libro3);



    }
}
