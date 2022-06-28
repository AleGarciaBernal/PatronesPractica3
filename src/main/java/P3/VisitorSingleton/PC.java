package P3.VisitorSingleton;

public class PC implements IComputadora{

    private String tamanio;
    private int precio;
    private String marca;

    public PC(String tamanio, int precio, String marca) {
        this.tamanio = tamanio;
        this.precio = precio;
        this.marca = marca;
    }

    @Override
    public int accept(IVisitor visitor) {
        return visitor.visitPC(this);

    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
