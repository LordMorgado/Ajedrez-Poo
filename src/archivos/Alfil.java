package archivos;

public class Alfil extends pieza implements movimiento{
    private int cantidadMovimientosRealizados;
    public Alfil(String color, int n){
        super("alfil", color);
        cantidadMovimientosRealizados = 0;
        if(color.equals("negro"))
            this.posicion = new int[]{n - 1, 1};
        else
            this.posicion = new int[]{n - 1, 6};
    }
    @Override
    public void moverse() {
        //Movimiento en diagonal, pudiendo hacer una cruz
        cantidadMovimientosRealizados++;
    }

    @Override
    public void atacar(pieza p) {
        this.posicion = p.posicion;
        cantidadMovimientosRealizados++;
    }
}
