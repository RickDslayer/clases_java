public class S05Rectangulo {
    // TODO 1: Declarar base y altura como campos privados double.
    private double base;
    private double altura;
    public S05Rectangulo(double base, double altura) {
        // TODO 2: Guardar los dos parametros en los campos usando this.
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        // TODO 3: Devolver el area calculada con base y altura.
        double area = this.altura * this.base;
        return area; // Retorno provisional: reemplazar(cambiado).
    }

    public double calcularPerimetro() {
        // TODO 4: Devolver el perimetro calculado con base y altura.
        double perimetro = 2 * (this.altura+this.base);
        return perimetro; // Retorno provisional: reemplazar.
    }

    public boolean esCuadrado() {
        // TODO 5: Devolver si base y altura son iguales.
        if(this.base == this.altura){
            return true;
        }
        return false; // Retorno provisional: reemplazar(no hubo necesidad).
    }
}
