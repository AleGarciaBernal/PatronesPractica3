package P3.Adapter;

public class AppMovil1 implements IEmpresaMovil{
    @Override
    public void login() {
        System.out.println("App 1 --> loggin in");

    }

    @Override
    public void logout() {
        System.out.println("App 1 --> loggin out");

    }

    @Override
    public void reports() {
        System.out.println("App 1 --> showing reports");


    }
}
