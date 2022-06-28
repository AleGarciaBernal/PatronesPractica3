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

}
