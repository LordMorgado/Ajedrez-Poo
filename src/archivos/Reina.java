package archivos;

public class Reina extends pieza implements movimiento{
    private int cantidadMovimientosRealizados;
    public Reina(String color, int n){
        super("reina", color);
        cantidadMovimientosRealizados = 0;
        if(color.equals("negro"))
            this.posicion = new int[]{n - 1, 1};
        else
            this.posicion = new int[]{n - 1, 6};
    }
    @Override
    public void moverse() {
        //La reina se puede mover en cualquier direccion
        cantidadMovimientosRealizados++;
    }

    @Override
    public void atacar(pieza p) {
        this.posicion = p.posicion;
        cantidadMovimientosRealizados++;
    }
}
