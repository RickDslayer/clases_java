public class Lab04DiagnosticaYCorrige {
    public static void main(String[] args) {
        // En tu copia personal, activa un caso por vez, lee el error y repáralo.
        // Los casos están comentados para que esta plantilla pueda compilar.

        // Caso 1: String nombre = 'Ana';
        // TODO 1: Corregir las comillas, mostrar el nombre y explicar la causa.
        // Error: "unclosed character literal". Las comillas simples son para un solo char;
        // un texto (String) va entre comillas dobles.
        String nombre = "Ana";
        System.out.println("Nombre: " + nombre);

        // Caso 2: int temperatura = 23.5;
        // TODO 2: Conservar el valor decimal usando un tipo adecuado y mostrarlo.
        // Error: "incompatible types: possible lossy conversion from double to int".
        // int no admite decimales; se usa double para conservar 23.5.
        double temperatura = 23.5;
        System.out.println("Temperatura: " + temperatura);

        // Caso 3:
        // int edad;
        // System.out.println(edad);
        // TODO 3: Inicializar edad antes de mostrarla y explicar por qué es necesario.
        // Error: "variable edad might not have been initialized".
        // Las variables locales no tienen valor por defecto: hay que asignarles uno antes de leerlas.
        int edad;
        edad = 20;
        System.out.println("Edad: " + edad);

        // Caso 4:
        // final String CURSO = "Java";
        // CURSO = "Python";
        // TODO 4: Conservar CURSO como final y mostrar "Java", sin reasignarlo.
        // Error: "cannot assign a value to final variable CURSO".
        // final impide reasignar la variable; se elimina la reasignación.
        final String CURSO = "Java";
        System.out.println("Curso: " + CURSO);

        // TODO 5: Registrar los cuatro mensajes del compilador en tu README personal,
        // junto con la causa y la corrección aplicada a cada caso.
        // | Caso | Mensaje observado                                        | Causa                              | Corrección                  |
        // | 1    | unclosed character literal                               | Texto con comillas simples         | Usar comillas dobles        |
        // | 2    | incompatible types: possible lossy conversion from double to int | int no guarda decimales    | Cambiar el tipo a double    |
        // | 3    | variable edad might not have been initialized            | Leer una variable sin valor        | Asignar edad = 20 antes     |
        // | 4    | cannot assign a value to final variable CURSO            | Reasignar una constante final      | Eliminar la reasignación    |
    }
}
