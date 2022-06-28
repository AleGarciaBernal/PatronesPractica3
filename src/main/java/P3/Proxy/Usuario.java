package P3.Proxy;

public class Usuario {

    private String nombre;
    private int ci;
    private String userName;
    private String password;

    public Usuario(String nombre, int ci, String userName, String password) {
        this.nombre = nombre;
        this.ci = ci;
        this.userName = userName;
        this.password = password;
    }

    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("CI: "+ci);
        System.out.println("UserName: "+userName);
        System.out.println("Password: "+password);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
