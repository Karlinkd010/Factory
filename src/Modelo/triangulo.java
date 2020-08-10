
package Modelo;



import Interface.Interfaz;
public class triangulo implements Interfaz{
        @Override
    public double perimetro(setfigura fig) {
        return fig.getBase() * 3;
    }

    @Override
    public double area(setfigura fig) {
        return (fig.getBase() * fig.getAltura()) / 2;
    }

    @Override
    public String descripcion() {
        return "Es un trinagulo";
    }
}
