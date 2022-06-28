package P3.VisitorSingleton;

public class Cuenta {

    private static Cuenta cuenta;
    private int saldo;

    private Cuenta(){
        saldo=0;
    }

    public static Cuenta getCuenta(){
        if(cuenta ==null){
            multiHiloContol();
        }
        return cuenta;
    }

    private synchronized static void multiHiloContol(){
        if(cuenta ==null){
            cuenta =new Cuenta();
        }
    }

    public void cobro(int cantidad){
        showSaldo();
        saldo+=cantidad;
        showSaldo();
    }
    public void showSaldo(){
        System.out.println("Saldo: "+saldo);
    }

}
