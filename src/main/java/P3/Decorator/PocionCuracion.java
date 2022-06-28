package P3.Decorator;

public class PocionCuracion extends Decorator {

    public PocionCuracion(IPersonaje componentBase) {
        super(componentBase);
    }

    @Override
    public void operation() {
        System.out.println("                        ");
        super.operation();
        addBehavior();
        int porcentaje= (int)(super.getPuntosRegeneracion()*(80.0f/100.0f));
        super.setPuntosDefensa(porcentaje+super.getPuntosRegeneracion());
    }

    public void addBehavior(){
        System.out.println("                        ");
        System.out.println("Pocion de Curacion ....");
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
