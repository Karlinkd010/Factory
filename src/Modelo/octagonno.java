
package Modelo;


import Interface.Interfaz;
public class octagonno implements Interfaz{
 
        @Override
    public double perimetro(setfigura fig) {
        return fig.getLado() * 8;
    }

    @Override
    public double area(setfigura fig) {
        return (perimetro(fig) * fig.getApotema() / 2);
    }

    @Override
    public String descripcion() {
        return "Tiene 8 lados iguales";
               
    }
}
