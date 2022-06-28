package P3.Bridge;

public class TigoMoney implements IPagos {

    @Override
    public void pagar(int precio) {
        int porcentaje= (int)(precio*(2.0f/100.0f));
        System.out.println("Pago por Tigo Money: " + (precio-porcentaje));
    }
}

