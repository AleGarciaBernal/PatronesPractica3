package P3.Adapter;

public class Programa2 implements IEmpresaPC{
    @Override
    public void iniciarSesion() {
        System.out.println("Programa 2 --> Iniciando sesion");

    }

    @Override
    public void cerrarSesion() {
        System.out.println("Programa 2 --> Cerrando sesion");
    }

    @Override
    public void generarDatos() {
        System.out.println("Programa 2 --> Generando Datos");



    }
}
