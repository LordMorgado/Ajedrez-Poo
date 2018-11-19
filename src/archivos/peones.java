package archivos;


public class peones extends pieza implements  movimiento{

    public peones(String color, int n){
        super("peon", color);
        if(color.equals("negro"))
            this.posicion = new int[]{n - 1, 1};
        else
            this.posicion = new int[]{n - 1, 6};
    }

    @Override
    public void moverse() {
    }

    @Override
    public void atacar(pieza p) {
        this.posicion = p.posicion;
    }
}
