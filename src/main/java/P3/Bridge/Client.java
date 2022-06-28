package P3.Bridge;

public class Client {

    public static void main(String[] args) {

        IPagos efectivo = new PagoEfectivo();
        IPagos tigo = new TigoMoney();
        IPagos transferencia = new Tranferencia();
        IPagos app= new App();

        Instalacion instalacionDeAgua = new InstalacionDeAgua(tigo,100,"Juan");
        Instalacion instalacionLuz=new InstalacionElectrica(transferencia,100,"Maria");
        Instalacion instalacionAlc = new InstalacionAlcantarillado(app,100,"Pedro");

        instalacionDeAgua.pago();
        instalacionLuz.pago();
        instalacionAlc.pago();

    }
}

