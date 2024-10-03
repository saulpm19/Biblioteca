public class Libro
{
    private String titulo;
    private String autor;
    private String isbn;
    private Boolean disponible;

    public Libro(String titulo, String autor, String isbn, Boolean disponible)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor=autor;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }

    public boolean getDisponible ()
    {
        return disponible;
    }

    private void setDisponible(boolean disponible)
    {
        this.disponible=disponible;
    }

    // Método para prestar el libro
    public boolean prestar()
    {
        if (disponible)
        {
            setDisponible(false);
            return true;
        } else
        {
            return false;
        }
    }

    // Método para devolver el libro
    public void devolver()
    {
        setDisponible(true);
    }










}
