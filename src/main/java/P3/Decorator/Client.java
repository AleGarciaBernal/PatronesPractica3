package P3.Decorator;

public class Client {

    public static void main(String[]args){

        IPersonaje personaje= new PersonajeHumano("Isindur", "Espada", 1);
        personaje.setPorcentajeArmadura(10);
        personaje.setPuntosAtaque(10);
        personaje.setPuntosDefensa(10);
        personaje.setPuntosRegeneracion(10);

        personaje.showInfo();

        personaje=new Armas(personaje,"Hacha");

        personaje=new Escudo(personaje);

        personaje=new PocionCuracion(personaje);

        personaje.operation();
        personaje.showInfo();


    }
}
