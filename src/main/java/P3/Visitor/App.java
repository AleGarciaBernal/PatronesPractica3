package P3.Visitor;

import java.util.Random;

public class App implements IVisitor{

    @Override
    public void visitCelular(Celular celular) {
        System.out.println("Visitando un Celular");
        celular.showInfo();
        System.out.println("Se recomienda un mantenimiento preventivo");
    }

    @Override
    public void visiComputadora(Computadora computadora) {
        Random random = new Random();
        int number = random.nextInt(100);
        if(number%2==0){
            System.out.println("Visitando una Computadora");
            //computadora.showInfo();
            System.out.println("Se recomienda un mantenimiento preventivo");
        }
        else {
            System.out.println("Visitando una Computadora");
            //computadora.showInfo();
            System.out.println("Se recomienda un mantenimiento correctivo");
        }

    }

    @Override
    public void visitTele(Tele tele) {
        System.out.println("Visitando un Televisor");
        tele.showInfo();

    }
}
