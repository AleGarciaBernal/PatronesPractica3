package P3.Adapter;

public class App1Adapter implements IEmpresaPC{

    AppMovil1 app1;

    public App1Adapter(AppMovil1 app1) {
        this.app1 = app1;
    }


    @Override
    public void iniciarSesion() {
        app1.login();

    }

    @Override
    public void cerrarSesion() {
        app1.logout();
    }

    @Override
    public void generarDatos() {
        app1.reports();

    }
}
