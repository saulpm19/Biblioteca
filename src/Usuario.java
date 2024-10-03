import java.util.ArrayList;
import java.util.List;

public class Usuario extends persona

{
    List<Libro> LibrosMaximo;
    public Usuario(String nombre, String apellido)
    {
        super(nombre, apellido);
        this.LibrosMaximo= new ArrayList<>();
    }

    @Override
    public void mostrardatos()
    {
        System.out.println("Informacion del Usuario");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
    }
}
