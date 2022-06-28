package P3.Bridge;

public class PagoEfectivo implements IPagos {

    @Override
    public void pagar(int precio) {
        System.out.println("Pago en efectivo: " + precio);
    }
}

