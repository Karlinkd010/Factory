
package Modelo;


import Interface.Interfaz;

public class factory {
        public static Interfaz getinsfig(String figura) {
        switch (figura) {
            case "cuadrado":
                return new cuadrado();
            case "rectangulo":
                return new rectangulo();
            case "triangulo":
                return new triangulo();
            case "circulo":
                return new circulo();
            case "octagono":
                return new octagonno();
            default:
                return null;
        }

    }
}
