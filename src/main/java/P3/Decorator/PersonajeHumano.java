package P3.Decorator;

public class PersonajeHumano implements IPersonaje {

    private String nombre;
    private String armas;
    private int nivel;
    private int porcentajeArmadura;
    private int puntosAtaque;
    private int puntosDefensa;
    private int puntosRegeneracion;

    public PersonajeHumano(String nombre, String armas, int nivel, int porcentajeArmadura, int puntosAtaque, int puntosDefensa, int puntosRegeneracion) {
        this.nombre = nombre;
        this.armas = armas;
        this.nivel = nivel;
        this.porcentajeArmadura = porcentajeArmadura;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.puntosRegeneracion = puntosRegeneracion;
    }

    @Override
    public void showInfo() {
        System.out.println("Personaje Humano");
        System.out.println("Nombre: " + nombre);
        System.out.println("Armas: " + armas);
        System.out.println("Nivel: " + nivel);
        System.out.println("Porcentaje Armadura: " + porcentajeArmadura);
        System.out.println("Puntos Ataque: " + puntosAtaque);
        System.out.println("Puntos Defensa: " + puntosDefensa);
        System.out.println("Puntos Regeneracion: " + puntosRegeneracion);
    }

    @Override
    public void operation() {
        System.out.println("Personaje Humano> operation -> realizando operacion del objeto base");
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public int getPorcentajeArmadura() {
        return porcentajeArmadura;
    }

    @Override
    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    @Override
    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    @Override
    public int getPuntosRegeneracion() {
        return puntosRegeneracion;
    }

    @Override
    public String getArmas() {
        return armas;
    }

    @Override
    public PersonajeHumano getPersonaje() {
        return this;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setArmas(String armas) {
        this.armas = armas;
    }

    @Override
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void setPorcentajeArmadura(int porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }

    @Override
    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    @Override
    public void setPuntosRegeneracion(int puntosRegeneracion) {
        this.puntosRegeneracion = puntosRegeneracion;
    }
}
