package P3.Adapter;

public class Client {

    public static void main (String [] args){

        IEmpresaPC programa1 = new Programa1();
        programa1.iniciarSesion();
        programa1.cerrarSesion();
        programa1.generarDatos();

        IEmpresaPC programa2 = new Programa2();
        programa2.iniciarSesion();
        programa2.cerrarSesion();
        programa2.generarDatos();

        AppMovil1 app1 = new AppMovil1();
        AppMovil2 app2 = new AppMovil2();

        IEmpresaPC app1Adapter = new App1Adapter(app1);
        IEmpresaPC app2Adapter = new App2Adapter(app2);

        app1Adapter.iniciarSesion();
        app1Adapter.cerrarSesion();
        app1Adapter.generarDatos();

        app2Adapter.iniciarSesion();
        app2Adapter.cerrarSesion();
        app2Adapter.generarDatos();

    }

}
