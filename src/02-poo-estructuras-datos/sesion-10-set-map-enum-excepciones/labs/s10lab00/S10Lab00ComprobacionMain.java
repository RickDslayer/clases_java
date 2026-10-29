package s10lab00;

import java.util.Set;

public class S10Lab00ComprobacionMain {
    public static void main(String[] args) {
        MaterialesTaller taller = new MaterialesTaller();
        taller.requerir("CARTULINA");
        taller.requerir("PEGAMENTO");
        taller.requerir("TIJERAS");
        taller.disponer("cartulina");
        taller.disponer("REGLA");
        taller.disponer("PEGAMENTO");
        taller.disponer("TIJERAS");
        System.out.println("Faltantes tras TIJERAS: " + taller.faltantes());
        System.out.println("Requeridos: " + taller.cantidadRequeridos());

        System.out.println("Disponer null: " + taller.disponer(null));
        System.out.println("Disponer blanco: " + taller.disponer("   "));
        System.out.println("Repetir cartulina: " + taller.disponer(" cartulina "));
        System.out.println("Disponibles: " + taller.cantidadDisponibles());

        MaterialesTaller otro = new MaterialesTaller();
        otro.requerir("CARTULINA");
        Set<String> copia = otro.faltantes();
        copia.clear();
        System.out.println("Copia vaciada, faltantes reales: " + otro.faltantes());
    }
}
