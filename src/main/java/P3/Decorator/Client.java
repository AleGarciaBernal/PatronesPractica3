package P3.Decorator;

public class Client {

    public static void main(String[]args){

        IPersonaje personaje= new PersonajeHumano("Isindur", "Espada", 1,
                10, 10, 10, 10);

        personaje.showInfo();

        personaje=new Armas(personaje,"Hacha");
        personaje.operation();
        personaje.showInfo();

        personaje=new Escudo(personaje);
        personaje.operation();
        personaje.showInfo();

        personaje=new PocionCuracion(personaje);
        personaje.operation();
        personaje.showInfo();

    }
}
