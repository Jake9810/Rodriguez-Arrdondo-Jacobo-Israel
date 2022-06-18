public class Test4 implements IExtraerProducto {
    private int id;
    private String Nombre;
    private Double Precio;
    private int Existencias;
    @Override
    public int getID(){
        return this.id;
    }
    @Override
    public String getNombre() {
        return this.Nombre;
    }
    @Override
    public Double getPrecio() {
        return this.Precio;
    }
    @Override
    public int getExistencias() {
        return this.Existencias;
    }
}
