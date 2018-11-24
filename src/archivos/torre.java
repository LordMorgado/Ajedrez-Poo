package archivos;

public class torre extends pieza implements movimiento {
    private int cantidadMovimientosRealizados;
    public torre(String color, int n){
        super("torre", color);
        cantidadMovimientosRealizados = 0;
        if(color.equals("negro"))
            this.posicion = new int[]{n - 1, 1};
        else
            this.posicion = new int[]{n - 1, 6};
    }
    @Override
    public void moverse() {
        cantidadMovimientosRealizados++;
    }

    @Override
    public void atacar(pieza p) {
        this.posicion = p.posicion;
        cantidadMovimientosRealizados++;
    }
}
