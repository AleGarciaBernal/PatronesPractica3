package P3.Bridge;

public class InstalacionAlcantarillado implements Instalacion{
    IPagos pagos;
    private int precio;
    private String nombreInstalador;

    public InstalacionAlcantarillado(IPagos pagos, int precio, String nombreInstalador) {
        this.pagos = pagos;
        this.precio = precio;
        this.nombreInstalador = nombreInstalador;
    }

    @Override
    public void pago() {
        System.out.println("                                         ");
        System.out.println("Precio de instalacion de Alcantirillado: "+precio);
        System.out.println("Nombre del Instalador: "+nombreInstalador);
        pagos.pagar(precio);
    }
}
