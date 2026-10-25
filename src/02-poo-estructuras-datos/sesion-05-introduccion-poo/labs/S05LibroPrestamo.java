import org.w3c.dom.ls.LSOutput;

public class S05LibroPrestamo {
    // TODO 1: Declarar titulo (String) y prestado (boolean) como campos privados.
    private String titulo;
    private Boolean prestamo;

    public S05LibroPrestamo(String titulo) {
        // TODO 2: Guardar el titulo y establecer prestado en false.
        this.titulo = titulo;
        this.prestamo = false;
    }

    public String obtenerTitulo() {
        // TODO 3: Devolver el titulo del objeto.
        return this.titulo; // Retorno provisional: reemplazar (cambiado).
    }

    public boolean prestar() {
        // TODO 4: Rechazar un segundo prestamo; si esta disponible, prestarlo.
        if(this.prestamo == true){
            System.out.println("no esta disponible para prestamo");
            return false;
        }else{
            System.out.println("prestamo exitoso");
            this.prestamo = true;
        }
        return true; // Retorno provisional: reemplazar(cambiado).
    }

    public void devolver() {
        // TODO 5: Marcar el libro como no prestado.
        this.prestamo = false;
    }

    public boolean estaPrestado() {
        // TODO 6: Devolver el estado prestado del objeto.
        return this.prestamo = true; // Retorno provisional: reemplazar(cambiado).
    }
}
