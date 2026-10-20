public class Lab03DatosConSentido {
    public static void main(String[] args) {
        // TODO 1: Elegir y justificar los tipos para nombre, edad, temperatura,
        // inicial y activo. Usa String, int, double, char y boolean.
        // nombre -> String  (texto de varios caracteres)
        // edad -> int  (número entero, no tiene decimales)
        // temperatura -> double  (puede tener decimales, como 23.5)
        // inicial -> char  (un solo carácter)
        // activo -> boolean  (solo puede ser true o false)

        // TODO 2: Declarar e inicializar las cinco variables con nombres claros.
        // TODO 4: Probar el caso A del README; el caso B es opcional.
        // Caso A: Ana, 20, 23.5, 'A', true
        // Caso B: Luis, 25, 18.0, 'L', false
        String nombre = "Ana";
        int edad = 20;
        double temperatura = 23.5;
        char inicial = 'A';
        boolean activo = true;

        // TODO 3: Mostrar cada dato en su propia línea, con una etiqueta.
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Activo: " + activo);

        // TODO 5: Explicar por qué String no es un tipo primitivo.
        // String representa texto y es una clase (un tipo de referencia), no un tipo primitivo
        // como int, double, char o boolean.
    }
}
