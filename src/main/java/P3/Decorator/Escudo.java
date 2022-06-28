package P3.Decorator;

public class Escudo extends Decorator {

    public Escudo(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void operation() {
        System.out.println("                        ");
        super.operation();
        addBehavior();
        int porcentaje= (int)(super.getPuntosDefensa()*(35.0f/100.0f));
        super.setPuntosDefensa(porcentaje+super.getPuntosDefensa());

        porcentaje = (int)(super.getPorcentajeArmadura()*(10.0f/100.0f));
        super.setPorcentajeArmadura(porcentaje+super.getPorcentajeArmadura());
    }

    public void addBehavior(){
        System.out.println("                        ");
        System.out.println("Escudo> nuevo Escudo ....");
    }

    @Override
    public void showInfo(){
        super.showInfo();
    }

    @Override
    public int getNivel() {
        return 0;
    }

    @Override
    public int getPorcentajeArmadura() {
        return 0;
    }

    @Override
    public int getPuntosAtaque() {
        return 0;
    }

    @Override
    public int getPuntosDefensa() {
        return 0;
    }

    @Override
    public int getPuntosRegeneracion() {
        return 0;
    }

    @Override
    public String getArmas() {
        return null;
    }

    @Override
    public PersonajeHumano getPersonaje() {
        return null;
    }

    @Override
    public void setNivel(int nivel) {

    }

    @Override
    public void setPorcentajeArmadura(int porcentajeArmadura) {

    }

    @Override
    public void setPuntosAtaque(int puntosAtaque) {

    }

    @Override
    public void setPuntosDefensa(int puntosDefensa) {

    }

    @Override
    public void setPuntosRegeneracion(int puntosRegeneracion) {

    }

    @Override
    public void setArmas(String armas) {

    }
}
