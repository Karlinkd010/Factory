package Modelo;

import Interface.Interfaz;

public class circulo implements Interfaz {

    private double piii = 3.14;

    @Override
    public String descripcion() {
        return "Es un circulo";
    }

    @Override
    public double area(setfigura fig) {
        return piii * (Math.pow(fig.getRadio(), 2));
    }

    @Override
    public double perimetro(setfigura fig) {
        return (2 * piii) * fig.getRadio();
    }

}
