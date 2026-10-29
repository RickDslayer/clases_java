package s10lab02;

public class S10Lab02ComprobacionMain {
    public static void main(String[] args) {
        Incidencia media = new Incidencia(Prioridad.MEDIA);
        media.registrarMinutos(60);
        System.out.println(media.resumen());
        media.registrarMinutos(61);
        System.out.println(media.resumen());
        Incidencia baja = new Incidencia(Prioridad.BAJA);
        baja.registrarMinutos(120);
        System.out.println(baja.resumen());
    }
}
