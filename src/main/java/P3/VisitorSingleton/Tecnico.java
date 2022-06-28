package P3.VisitorSingleton;

public class Tecnico implements IVisitor{

    @Override
    public int visitTablet(Tablet tablet) {
        System.out.println("Reparando Tablet con mi Kit para Tablets");
        if(tablet.getTamanio().equals("pequeña")){
            return 100;
        }else if(tablet.getTamanio().equals("mediana")){
            return 200;
        }else if(tablet.getTamanio().equals("grande")){
            return 300;
        }
        else {
            return 1;
        }
    }

    @Override
    public int visitPC(PC pc) {
        System.out.println("Reparando PC con mi Kit para PC's");
        if(pc.getTamanio().equals("pequeña")){
            return  150;
        }else if(pc.getTamanio().equals("mediana")){
            return 250;
        }else if(pc.getTamanio().equals("grande")){
            return 350;
        }
        else {
            return 1;
        }
    }

    @Override
    public int visitLaptop(Laptop laptop) {
        System.out.println("Reparando Laptop con mi Kit para Laptops");
        if(laptop.getTamanio().equals("pequeña")){
            return 200;
        }else if(laptop.getTamanio().equals("mediana")){
            return 400;
        }else if(laptop.getTamanio().equals("grande")){
           return 600;
        }else {
            return 1;
        }
    }



}
