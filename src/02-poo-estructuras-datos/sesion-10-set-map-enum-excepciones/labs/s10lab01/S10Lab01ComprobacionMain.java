package s10lab01;

public class S10Lab01ComprobacionMain {
    public static void main(String[] args) {
        RecuentoVotos reordenado = new RecuentoVotos();
        String[] secuencia = {"C", "A", "B", "A", "B", "A"};
        for (String voto : secuencia) {
            reordenado.votar(voto);
        }
        System.out.println("Reordenado: " + reordenado.reporte() + " total " + reordenado.total());

        RecuentoVotos vacio = new RecuentoVotos();
        String[] sinVotos = {};
        for (String voto : sinVotos) {
            vacio.votar(voto);
        }
        System.out.println("Vacio: " + vacio.reporte() + " total " + vacio.total());

        System.out.println("Votar \" a \": " + vacio.votar(" a "));
        System.out.println("Votar null: " + vacio.votar(null));
        System.out.println("Votar X: " + vacio.votar("X"));
        System.out.println("Final: " + vacio.reporte() + " total " + vacio.total());
    }
}
