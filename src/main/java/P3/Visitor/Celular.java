package P3.Visitor;

public class Celular implements IElectronicos {

    private String marca;
    private String modelo;
    private int precio;

    public Celular(String marca, String modelo, int android) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = android;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("Marca: "+marca+" Modelo: "+modelo+" Android: "+ precio);
    }

    public void accept(IVisitor visitor) {
        visitor.visitCelular(this);
    }

}
