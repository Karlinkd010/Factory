
package Modelo;



import Interface.Interfaz;
public class rectangulo implements Interfaz {
    
        @Override
    public double perimetro(setfigura fig) {
        return fig.getLado() * 4;
    }

    @Override
    public double area(setfigura fig) {
        return fig.getLado() * fig.getAltura();
    }

    @Override
    public String descripcion() {
        return "Es un rectangulo";
    }
}
