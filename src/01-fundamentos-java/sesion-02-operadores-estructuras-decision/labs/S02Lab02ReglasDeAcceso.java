public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Escribir la regla de acceso en lenguaje natural.
        // Puede entrar quien sea mayor de edad (18 o más), tenga membresía o invitación,
        // y no esté bloqueado.

        // TODO 2: Construir puedeEntrar combinando edad, membresía, invitación y bloqueo.
        boolean puedeEntrar = edad >= 18 && (esMiembro || tieneInvitacion) && !bloqueado;

        // TODO 3: Mostrar "Acceso permitido" o "Acceso denegado" con if/else.
        // TODO 6 (opcional): Colocar un breakpoint en if y observar puedeEntrar antes de elegir la rama.
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        // TODO 4: Probar los tres casos mínimos del README; las otras combinaciones son opcionales.
        // edad=18, esMiembro=false, tieneInvitacion=true, bloqueado=false -> Acceso permitido
        // edad=17, esMiembro=false, tieneInvitacion=true, bloqueado=false -> Acceso denegado
        // edad=18, esMiembro=false, tieneInvitacion=true, bloqueado=true  -> Acceso denegado

        // TODO 5: Explicar por qué el bloqueo impide siempre el acceso.
        // !bloqueado se une con &&: si bloqueado es true, ese término es false y toda la
        // expresión es false, sin importar la invitación o la membresía.
    }
}
