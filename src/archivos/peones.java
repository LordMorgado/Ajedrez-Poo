package archivos;


public class peones extends pieza implements  movimiento{
    private int cantidadMovimientosRealizados;
    public peones(String color, int n){
        super("peon", color);
        cantidadMovimientosRealizados = 0;
        if(color.equals("negro"))
            this.posicion = new int[]{n - 1, 1};
        else
            this.posicion = new int[]{n - 1, 6};
    }

    @Override
    public void moverse() {
        if(cantidadMovimientosRealizados == 0){
            //Si no ha realiado movimiento, puede avanzar dos casillas al frente
        }else{
            //Solo puede moverse una casilla
        }
        cantidadMovimientosRealizados++;
    }

    @Override
    public void atacar(pieza p) {
        this.posicion = p.posicion;
        cantidadMovimientosRealizados++;
    }
}
