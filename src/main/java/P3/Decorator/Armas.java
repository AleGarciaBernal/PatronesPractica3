package P3.Decorator;

public class Armas extends Decorator {

    private String arma;

    public Armas(IPersonaje personaje, String arma) {
        super(personaje);
        this.arma = arma;
    }

    @Override
    public void operation() {
        System.out.println("");
        super.operation();
        addBehavior();
        super.setArmas(super.getArmas()+" "+arma);
        super.setNivel(super.getNivel()*2);
        int porcentaje= (int)(super.getPuntosAtaque()*(30.0f/100.0f));
        super.setPuntosAtaque(porcentaje+super.getPuntosAtaque());

    }

    public void addBehavior(){
        System.out.println("                        ");
        System.out.println("Armas> nuevas armas ");
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
