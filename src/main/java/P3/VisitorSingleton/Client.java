package P3.VisitorSingleton;

public class Client {

    public static void main(String [] args){

        Tecnico tecnico=new Tecnico();

        Laptop laptop=new Laptop("pequeña",100,"Asus");
        Tablet tablet=new Tablet("grande",100,"Samsung");
        PC pc=new PC("mediana",100,"HP");

        //laptop.accept(tecnico);
        //tablet.accept(tecnico);
        //pc.accept(tecnico);

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                PersonaCliente p1 = new PersonaCliente("Juan");
                p1.pagar(laptop.accept(tecnico));
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                PersonaCliente p2 = new PersonaCliente("Maria");
                p2.pagar(tablet.accept(tecnico));
            }
        });

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                PersonaCliente p3 = new PersonaCliente("Ana");
                p3.pagar(pc.accept(tecnico));

            }
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();




    }
}
