package P3.VisitorSingleton;

public class PersonaCliente {
    private String name;

    public PersonaCliente(String name){
        this.name=name;
    }
    
    public void pagar(int cantidad){
        Cuenta.getCuenta().cobro(cantidad);
    }
}
