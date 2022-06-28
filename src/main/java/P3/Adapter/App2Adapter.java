package P3.Adapter;

public class App2Adapter implements IEmpresaPC{

    AppMovil2 app2;

    public App2Adapter(AppMovil2 app2) {
        this.app2 = app2;
    }


    @Override
    public void iniciarSesion() {
        app2.login();

    }

    @Override
    public void cerrarSesion() {
        app2.logout();
    }

    @Override
    public void generarDatos() {
        app2.reports();

    }
}
