package archivos;

public class caballos extends pieza implements movimiento {
    private int cantidadMovimientosRealizados;
    public caballos(String color, int n){
        super("caballo", color);
        cantidadMovimientosRealizados = 0;
        if(color.equals("negro"))
            this.posicion = new int[]{n - 1, 1};
        else
            this.posicion = new int[]{n - 1, 6};
    }

    @Override
    public void moverse() {
        //Movimiento en forma de L
        cantidadMovimientosRealizados++;
    }

    @Override
    public void atacar(pieza p) {
        this.posicion = p.posicion;
        cantidadMovimientosRealizados++;
    }
}
