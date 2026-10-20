public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predecir los resultados en un comentario antes de ejecutar.
        // Predicción: Suma 9, Resta 5, Producto 14, Division entera 3, Division decimal 3.5,
        // Resto 1, Sin parentesis 14, Con parentesis 20, Contador 4 y luego 3.

        // TODO 2: Calcular y mostrar suma, resta, producto, división entera y resto.
        int suma = unidades + capacidad;
        int resta = unidades - capacidad;
        int producto = unidades * capacidad;
        int divisionEntera = unidades / capacidad;
        int resto = unidades % capacidad;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Division entera: " + divisionEntera);

        // TODO 3: Mostrar 7.0 / capacidad y explicar por qué conserva decimales.
        // 7.0 es double, así que capacidad se promueve a double y la división es decimal.
        double divisionDecimal = 7.0 / capacidad;
        System.out.println("Division decimal: " + divisionDecimal);

        System.out.println("Resto: " + resto);

        // TODO 4: Comparar 2 + 3 * 4 con (2 + 3) * 4.
        // La multiplicación tiene mayor precedencia; los paréntesis fuerzan la suma primero.
        System.out.println("Sin parentesis: " + (2 + 3 * 4));
        System.out.println("Con parentesis: " + ((2 + 3) * 4));

        // TODO 5: Incrementar contador en una sentencia, mostrarlo; decrementar y mostrarlo.
        contador++;
        System.out.println("Contador incrementado: " + contador);
        contador--;
        System.out.println("Contador decrementado: " + contador);

        // TODO 6 (opcional): Probar unidades = 8 y explicar qué cambia. Mantener capacidad = 2.
        // Con unidades = 8: Suma 10, Resta 6, Producto 16, Division entera 4, Resto 0.
        // Division decimal sigue en 3.5 porque usa el literal 7.0, no la variable unidades.

        // TODO 7: Registrar predicción, resultado y causa de cualquier diferencia.
        // | Expresión     | Predicción | Resultado |
        // | Suma          | 9          | 9         |
        // | Resta         | 5          | 5         |
        // | Producto      | 14         | 14        |
        // | Div. entera   | 3          | 3         |
        // | Div. decimal  | 3.5        | 3.5       |
        // | Resto         | 1          | 1         |
        // | Sin paréntesis| 14         | 14        |
        // | Con paréntesis| 20         | 20        |
        // | Incrementado  | 4          | 4         |
        // | Decrementado  | 3          | 3         |
        // Sin diferencias: la división entre int descarta el decimal y por eso 7 / 2 da 3.
    }
}
