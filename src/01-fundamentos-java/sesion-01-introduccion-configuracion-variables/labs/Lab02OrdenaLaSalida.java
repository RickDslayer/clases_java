public class Lab02OrdenaLaSalida {
    public static void main(String[] args) {
        // TODO 1: Predecir la salida de estas tres instrucciones en un comentario.
        // Predicción (versión original: print("A"), println("B"), println("C")):
        // Línea 1: AB  -> print no salta de línea, así que B queda junto a A.
        // Línea 2: C

        // TODO 2: Ejecutar y explicar cualquier diferencia con tu predicción.
        // Salida observada:
        // AB
        // C
        // Coincidió con la predicción: print deja el cursor en la misma línea.

        // TODO 3: Modificar las instrucciones anteriores para obtener:
        // A - B - C
        System.out.print("A - ");
        System.out.print("B - ");
        System.out.println("C");

        // TODO 4: Agregar debajo una segunda línea que diga "Fin del laboratorio".
        System.out.println("Fin del laboratorio");

        // TODO 5: Explicar qué instrucción produce cada salto de línea.
        // El primer salto lo produce println("C"), que termina la línea "A - B - C".
        // El segundo salto lo produce println("Fin del laboratorio").
        // Los dos print("A - ") y print("B - ") no generan salto de línea.
    }
}
