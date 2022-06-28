package P3.Adapter;

public class AppMovil2 implements IEmpresaMovil{
    @Override
    public void login() {
        System.out.println("App 2 -->loggin in");

    }

    @Override
    public void logout() {
        System.out.println("App 2 -->loggin out");

    }

    @Override
    public void reports() {
        System.out.println("App 2 --> showing reports");


    }
}
