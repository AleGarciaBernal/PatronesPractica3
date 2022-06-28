package P3.Visitor;

public class Client {

    public static void main(String[]args){
        App app=new App();

        Tele tele=new Tele("Samsung","S8",5);
        Computadora computadora=new Computadora("Asus",1000,2018);
        Celular celular=new Celular("Apple","Iphone X",1000);

        tele.accept(app);
        System.out.println("                   ");
        computadora.accept(app);
        System.out.println("                   ");
        celular.accept(app);




    }
}
