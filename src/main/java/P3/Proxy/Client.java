package P3.Proxy;
public class Client {

    public static void main(String[] args) {


        Usuario usuario1 = new Usuario("Juan", 12, "juan", "123");
        Usuario usuario2 = new Usuario("Pedro", 55, "pedro", "123");
        Usuario usuario3 = new Usuario("Maria", 6667, "maria", "123");
        Usuario usuario4 = new Usuario("Nico", 12354, "nico", "123");

        Server1 s1=new Server1();
        Server2 s2=new Server2();

        Proxy proxy=new Proxy(s1,s2);

        s1.showUsuarios();
        s2.showUsuarios();

        proxy.logearUsuarios(usuario1, "juan", "123");
        proxy.logearUsuarios(usuario2, "pedro", "123");
        proxy.logearUsuarios(usuario3, "maria", "123");
        proxy.logearUsuarios(usuario4, "Nico", "123");

        s1.showUsuarios();
        s2.showUsuarios();
        proxy.showTotalUsuariosNoLogeados();
        proxy.showTotalUsuarios();

    }
}
