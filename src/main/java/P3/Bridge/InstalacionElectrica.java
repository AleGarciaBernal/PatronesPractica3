package P3.Bridge;

public class InstalacionElectrica implements Instalacion{
    IPagos pagos;
    private int precio;
    private String nombreInstalador;

    public InstalacionElectrica(IPagos pagos, int precio, String nombreInstalador) {
        this.pagos = pagos;
        this.precio = precio;
        this.nombreInstalador = nombreInstalador;
    }

    @Override
    public void pago() {
        System.out.println("                                         ");
        System.out.println("Precio de instalacion electrica: "+precio);
        System.out.println("Nombre del Instalador: "+nombreInstalador);
        pagos.pagar(precio);
    }
}
