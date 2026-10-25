public class S05Lab01PrestamoLibro {
    public static void main(String[] args) {
        // TODO 7: Crear primerLibro con El principito y segundoLibro con Matilda.
        S05LibroPrestamo libro1 = new S05LibroPrestamo("El principito");
        S05LibroPrestamo libro2 = new S05LibroPrestamo("Matilda");
        // TODO 8: Mostrar titulo, dos intentos de prestamo y estado del primer libro.
        System.out.println(libro1.obtenerTitulo());
        libro1.prestar();
        libro1.prestar();
        libro1.estaPrestado();
        // TODO 9: Devolver el primer libro y mostrar el estado de ambos libros.
        libro1.devolver();
        System.out.println(libro1.estaPrestado());
        System.out.println(libro2.estaPrestado());
    }
}
