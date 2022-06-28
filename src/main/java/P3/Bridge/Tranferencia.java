package P3.Bridge;

public class Tranferencia implements IPagos {

    @Override
    public void pagar(int precio) {
        int porcentaje= (int)(precio*(5.0f/100.0f));
        System.out.println("Pago por Tranferencia Bancaria " + (precio-porcentaje));
    }
}

