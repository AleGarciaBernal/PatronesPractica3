package P3.Adapter;

public class Programa1 implements IEmpresaPC{
    @Override
    public void iniciarSesion() {
        System.out.println("Programa 1 --> Iniciando sesion");

    }

    @Override
    public void cerrarSesion() {
        System.out.println("Programa 1 --> Cerrando sesion");
    }

    @Override
    public void generarDatos() {
        System.out.println("Programa 1 --> Generando Datos");


    }
}
