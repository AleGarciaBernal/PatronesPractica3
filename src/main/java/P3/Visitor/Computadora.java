package P3.Visitor;

public class Computadora implements IElectronicos {

    private String marca;
    private int precio;
    private int anio;

    public Computadora(String marca, int precio, int anio) {
        this.marca = marca;
        this.precio = precio;
        this.anio = anio;
    }

    public void showInfo() {
        System.out.println("Marca: " + marca+"\nPrecio: "+precio+"\nAño: "+anio);
    }

    public void accept(IVisitor visitor) {
        visitor.visiComputadora(this);
    }
}

