package P3.Visitor;

public class Tele implements IElectronicos {

    private String marca;
    private String modelo;
    private int pulgadas;

    public Tele(String marca, String modelo, int pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    public void accept(IVisitor visitor) {
        visitor.visitTele(this);
    }

    public void showInfo() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nPulgadas: " + pulgadas);
    }
}
