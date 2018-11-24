package archivos;

public class Rey extends pieza implements movimiento {
    private int cantidadMovimientosRealizados;
    public Rey(String color, int n){
        super("rey", color);
        cantidadMovimientosRealizados = 0;
        if(color.equals("negro"))
            this.posicion = new int[]{n - 1, 1};
        else
            this.posicion = new int[]{n - 1, 6};
    }
    @Override
    public void moverse() {
        //Es un peor con esteroides
        cantidadMovimientosRealizados++;
    }

    @Override
    public void atacar(pieza p) {
        this.posicion = p.posicion;
        cantidadMovimientosRealizados++;
    }
}
