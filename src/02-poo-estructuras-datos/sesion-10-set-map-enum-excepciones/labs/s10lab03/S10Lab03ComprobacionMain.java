package s10lab03;

public class S10Lab03ComprobacionMain {
    public static void main(String[] args) {
        ejecutar(new String[]{"abc", "", "80"});
        ejecutar(new String[]{"-10", "50"});
    }

    private static void ejecutar(String[] entradas) {
        RegistroTemperaturas registro = new RegistroTemperaturas();
        for (String entrada : entradas) {
            registro.registrar(entrada);
        }
        System.out.println("Lecturas: " + registro.lecturasComoTexto());
        System.out.println("Aceptadas: " + registro.aceptadas());
        System.out.println("Rechazadas: " + registro.rechazadas());
        System.out.println("Promedio: " + registro.promedioComoTexto());
        System.out.println("---");
    }
}
