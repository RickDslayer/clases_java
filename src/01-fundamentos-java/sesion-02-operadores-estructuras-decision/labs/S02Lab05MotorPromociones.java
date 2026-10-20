public class S02Lab05MotorPromociones {
    public static void main(String[] args) {
        long subtotalCentavos = 18_500;
        int cantidad = 4;
        boolean esMiembro = true;
        String tipoEntrega = "EXPRESS";

        // TODO 1: Predecir descuento, importe neto, envío y total antes de programar.
        // Miembro con subtotal >= 10000 -> 10%. Descuento = 1850, neto = 16650,
        // envío EXPRESS = 1200, total = 17850.

        // TODO 2: Validar subtotal entre 0 y 1000000 inclusive y cantidad mayor que cero.
        boolean datosValidos = subtotalCentavos >= 0 && subtotalCentavos <= 1_000_000 && cantidad > 0;

        if (!datosValidos) {
            System.out.println("Pedido invalido: subtotal o cantidad fuera de rango");
        } else {
            // TODO 3: Rechazar entrega desconocida; no mostrar un desglose válido.
            long envioCentavos = switch (tipoEntrega) {
                case "ESTANDAR" -> 500;
                case "EXPRESS" -> 1200;
                case "RECOGIDA" -> 0;
                default -> -1;
            };

            if (envioCentavos < 0) {
                System.out.println("Pedido invalido: tipo de entrega desconocido");
            } else {
                // TODO 4: Elegir 10%, 5% o 0% con if/else if/else según las reglas del README.
                int porcentajeDescuento;
                if (esMiembro && subtotalCentavos >= 10_000) {
                    porcentajeDescuento = 10;
                } else if (!esMiembro && subtotalCentavos >= 20_000) {
                    porcentajeDescuento = 5;
                } else {
                    porcentajeDescuento = 0;
                }

                // TODO 5: Calcular descuento y neto en centavos; truncar fracciones de centavo.
                long descuentoCentavos = subtotalCentavos * porcentajeDescuento / 100;
                long netoCentavos = subtotalCentavos - descuentoCentavos;

                // TODO 6: Elegir costo de envío con switch y aplicar gratuidad solo al ESTANDAR
                // cuando el neto alcanza 25000 centavos.
                // TODO 9 (opcional): Inspeccionar con Debug descuentoCentavos, netoCentavos y envioCentavos.
                if (tipoEntrega.equals("ESTANDAR") && netoCentavos >= 25_000) {
                    envioCentavos = 0;
                }
                long totalCentavos = netoCentavos + envioCentavos;

                // TODO 7: Mostrar el desglose con las etiquetas indicadas en el README.
                System.out.println("Subtotal (centavos): " + subtotalCentavos);
                System.out.println("Descuento (%): " + porcentajeDescuento);
                System.out.println("Descuento (centavos): " + descuentoCentavos);
                System.out.println("Neto (centavos): " + netoCentavos);
                System.out.println("Envio (centavos): " + envioCentavos);
                System.out.println("Total (centavos): " + totalCentavos);
            }
        }

        // TODO 8: Probar los cinco casos mínimos del README; registrar resultados.
        // 18500, 4, true,  EXPRESS  -> 10%, desc 1850, neto 16650, envío 1200, total 17850
        // 26314, 1, false, ESTANDAR -> 5%,  desc 1315, neto 24999, envío 500,  total 25499
        // 26315, 1, false, ESTANDAR -> 5%,  desc 1315, neto 25000, envío 0,    total 25000
        // cantidad = 0              -> Pedido invalido: subtotal o cantidad fuera de rango
        // tipoEntrega = "DRON"      -> Pedido invalido: tipo de entrega desconocido

        // TODO 10: Mejorar nombres y repetir las pruebas sin alterar las reglas.
        // Los nombres ya indican la unidad (Centavos) y el significado de cada valor.
        // El envío gratis depende del neto porque es lo que el cliente paga realmente por los
        // productos después del descuento, no el subtotal antes de descontar.
    }
}
