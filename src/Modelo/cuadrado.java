package Modelo;

import Interface.Interfaz;

public class cuadrado implements Interfaz {

    @Override
    public String descripcion() {
        return "Es un cuadrado ";
    }

    @Override
    public double perimetro(setfigura fig) {
        return fig.getLado() * 4;
    }

    @Override
    public double area(setfigura fig) {
        return fig.getLado() * fig.getLado();
    }

}
