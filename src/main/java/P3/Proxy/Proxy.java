package P3.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServer {

    private Server1 server1;
    private Server2 server2;

    public Proxy(Server1 server1, Server2 server2) {
        this.server1 = server1;
        this.server2 = server2;
    }

    private List<Usuario> usuariosLogeados = new ArrayList<>();
    private List<Usuario> usuariosNoLogeados= new ArrayList<>();


    @Override
    public void logearUsuarios(Usuario usuario, String userName, String password) {
        if(usuario.getUserName().equals(userName) && usuario.getPassword().equals(password)){
            usuariosLogeados.add(usuario);
            if (usuario.getCi() % 2 == 0) {
                server1.logearUsuarios(usuario, userName, password);
            } else {
                server2.logearUsuarios(usuario, userName, password);
            }
        }else {
            usuariosNoLogeados.add(usuario);
        }
    }

    public void showTotalUsuarios(){
        System.out.println("                                     ");
        System.out.println("Usuarios que lograron Loggearse");
        for (Usuario usuario:usuariosLogeados){
            System.out.println(usuario.getNombre());
        }
    }

    public void showTotalUsuariosNoLogeados(){
        System.out.println("                                     ");
        System.out.println("Usuarios que no lograron Loggearse");
        for (Usuario usuario:usuariosNoLogeados){
            System.out.println(usuario.getNombre());
        }
    }
}

