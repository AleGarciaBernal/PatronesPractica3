package P3.Bridge;

public class App implements IPagos {

    @Override
    public void pagar(int precio) {
        int porcentaje= (int)(precio*(10.0f/100.0f));
        System.out.println("Pago por la App: " + (precio-porcentaje));
    }
}

