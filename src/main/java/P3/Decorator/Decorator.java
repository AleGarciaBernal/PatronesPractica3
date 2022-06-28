package P3.Decorator;

public abstract class Decorator implements IPersonaje {

    private IPersonaje componentBase;

    public Decorator(IPersonaje componentBase){
        this.componentBase=componentBase;
    }

    @Override
    public void showInfo() {
        componentBase.showInfo();
    }

    @Override
    public void operation() {
        componentBase.operation();
    }

    @Override
    public int getNivel() {
        return componentBase.getNivel();
    }

    @Override
    public int getPorcentajeArmadura() {
        return componentBase.getPorcentajeArmadura();
    }

    @Override
    public int getPuntosAtaque() {
        return componentBase.getPuntosAtaque();
    }

    @Override
    public int getPuntosDefensa() {
        return componentBase.getPuntosDefensa();
    }

    @Override
    public int getPuntosRegeneracion() {
        return componentBase.getPuntosRegeneracion();
    }

    @Override
    public String getArmas() {
        return componentBase.getArmas();
    }

    @Override
    public void setNivel(int nivel) {
        componentBase.setNivel(nivel);
    }

    @Override
    public void setPorcentajeArmadura(int porcentajeArmadura) {
        componentBase.setPorcentajeArmadura(porcentajeArmadura);
    }

    @Override
    public void setPuntosAtaque(int puntosAtaque) {
        componentBase.setPuntosAtaque(puntosAtaque);
    }

    @Override
    public void setPuntosDefensa(int puntosDefensa) {
        componentBase.setPuntosDefensa(puntosDefensa);
    }

    @Override
    public void setPuntosRegeneracion(int puntosRegeneracion) {
        componentBase.setPuntosRegeneracion(puntosRegeneracion);
    }

    @Override
    public void setArmas(String armas) {
        componentBase.setArmas(armas);
    }


}
