public class S02Lab04EligeLaEntrega {
    public static void main(String[] args) {
        String tipoEntrega = "EXPRESS";

        // TODO 1: Resolver ESTANDAR=500, EXPRESS=1200 y RECOGIDA=0 centavos con switch.
        // TODO 2: Manejar default como opción inválida; no mostrar un costo válido.
        long costoCentavos = switch (tipoEntrega) {
            case "ESTANDAR" -> 500;
            case "EXPRESS" -> 1200;
            case "RECOGIDA" -> 0;
            default -> -1;
        };

        if (costoCentavos < 0) {
            // TODO 5 (rama inválida): mostrar solo "Tipo de entrega invalido".
            System.out.println("Tipo de entrega invalido");
        } else {
            // TODO 3: En opciones válidas mostrar "Costo (centavos): " con el valor.
            System.out.println("Costo (centavos): " + costoCentavos);

            // TODO 4: Usar un ternario para elegir "Retiro en tienda" o "Entrega a domicilio".
            String etiqueta = tipoEntrega.equals("RECOGIDA") ? "Retiro en tienda" : "Entrega a domicilio";

            // TODO 5: Mostrar la etiqueta con "Etiqueta: ".
            System.out.println("Etiqueta: " + etiqueta);
        }

        // TODO 6: Probar los tres tipos y DRON; opcionalmente comparar switch clásico y moderno
        // en tu copia personal. Entregar una versión y explicar break y las flechas.
        // ESTANDAR -> Costo 500,  Entrega a domicilio
        // EXPRESS  -> Costo 1200, Entrega a domicilio
        // RECOGIDA -> Costo 0,    Retiro en tienda
        // DRON     -> Tipo de entrega invalido
        // En el switch clásico (case X:) hace falta break para no "caer" al siguiente case.
        // Con flechas (case X ->) solo se ejecuta la rama elegida, sin break, y el switch
        // puede devolver un valor directamente.
    }
}
