public class PiezaIndustrial {
    /*
    2 — Control de Calidad en Línea de Producción

Contexto

En las plantas industriales automatizadas, las piezas fabricadas pasan por controles de calidad donde
 se evalúan sus dimensiones exactas respecto a un estándar establecido.

Consigna

Crear una estructura en Java basada en clases y objetos para registrar las mediciones de una pieza metálica
y verificar si cumple con los márgenes de tolerancia permitidos.

Desarrollo requerido

Definir la clase PiezaIndustrial con los atributos codigoPieza (String), longitudMilimetros (double) y longitudEstandar (double).

Incorporar un constructor parametrizado que asegure que las longitudes sean valores positivos.

Implementar un método booleano esAceptable() que retorne true si la diferencia absoluta entre longitudMilimetros
y longitudEstandar es menor o igual a 0.5 milímetros.

En el método main, instanciar al menos dos piezas con distintas medidas, invocar el método de control de
calidad e imprimir el dictamen final por consola.
     */

    String codigoPieza;
    double longitudMlm;
    double longitudEstandar;

    PiezaIndustrial (String codigoPieza, double longitudMlm, double longitudEstandar) {

        this.codigoPieza = codigoPieza;

        if (longitudEstandar > 0 && longitudMlm > 0) {
            this.longitudMlm = longitudMlm;
            this.longitudEstandar = longitudEstandar;
        }
        else {
            System.out.println("ERROR.");
        }

    }

    boolean esAceptable () {
        if (Math.abs(longitudMlm - longitudEstandar) <= 0.5) {
            return true;
        }
        else {
            return false;
        }
    }
}
