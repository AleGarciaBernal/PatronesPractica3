package P3.Bridge;

public class InstalacionDeAgua implements Instalacion{
    IPagos pagos;
    private int precio;
    private String nombreInstalador;

    public InstalacionDeAgua(IPagos pagos, int precio, String nombreInstalador) {
        this.pagos = pagos;
        this.precio = precio;
        this.nombreInstalador = nombreInstalador;
    }

    public IPagos getPagos() {
        return pagos;
    }

    public void setPagos(IPagos pagos) {
        this.pagos = pagos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombreInstalador;
    }

    public void setNombre(String nombre) {
        this.nombreInstalador = nombre;
    }

    @Override
    public void pago() {
        System.out.println("                                         ");
        System.out.println("Precio de instalacion de Agua: "+precio);
        System.out.println("Nombre del Instalador: "+nombreInstalador);
        pagos.pagar(precio);
    }
}
