public class Bibliotecario extends persona implements Gestionable

{
    public Bibliotecario(String nombre, String apellido)
    {
        super(nombre, apellido);

    }

    @Override
    public void mostrardatos()
    {
        System.out.println("Informacion del Bibliotecario");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
    }

    @Override
    public void prestarlibro(Usuario Usuario, Libro Libro)
    {
        if (Usuario.LibrosMaximo.size() > 2)
        {
            System.out.println("Usuario: " + Usuario.getNombre() + " " + Usuario.getApellido() +" tiene prestados el maximo de libros permitidos por persona");
        }
        else
        {
            if(Libro.getDisponible()==true) {
                Libro.prestar();
                Usuario.LibrosMaximo.add(Libro);
                System.out.println("Usuario: " + Usuario.getNombre() + " " + Usuario.getApellido() + " presto el libro "
                        + Libro.getTitulo() + " Correctamente");
            }
            else
            {
                System.out.println("El libro " + Libro.getTitulo()+ " No se encuentra disponible para prestamo");
            }

        }
    }

    @Override
    public void Devolverlibro(Usuario Usuario, Libro Libro)
    {
        Libro.devolver();
        Usuario.LibrosMaximo.remove(Libro.getIsbn());
        System.out.println("El usuario: "+Usuario.getNombre()+" "+Usuario.getApellido()+" devolvio el libro "+Libro.getTitulo());

    }
}
