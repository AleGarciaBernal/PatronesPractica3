package P3.Composite;

public class Client {

    public static void main(String[]args){

        Archivo a1= new Archivo("Archivo");
        a1.setNombre("Archivo 1");
        a1.setSpace("\t\t");
        a1.setWords(10);

        Archivo a2= new Archivo("Archivo");
        a2.setNombre("Archivo 2");
        a2.setWords(10);
        a2.setSpace("\t\t");

        Archivo a3= new Archivo("Archivo");
        a3.setNombre("Archivo 3");
        a3.setWords(10);
        a3.setSpace("\t\t");

        Archivo a4= new Archivo("Archivo");
        a4.setSpace("\t\t");
        a4.setNombre("Archivo 4");
        a4.setWords(10);

        CompositeArchivo f1=new CompositeArchivo("Folder");
        f1.setNombre("Folder 1");
        f1.setSpace("\t");

        f1.add(a1);
        f1.add(a2);
        f1.add(a3);
        f1.add(a4);

        CompositeArchivo f2=new CompositeArchivo("Folder");
        f2.setNombre("Folder 2");
        f2.setSpace("\t");

        f2.add(a1);
        f2.add(a2);
        f2.add(a3);
        f2.add(a4);


        CompositeArchivo disco1=new CompositeArchivo("Unidad De Disco");
        disco1.setNombre("Disco 1");
        disco1.add(f1);
        disco1.add(f2);

        disco1.showDetails();





    }
}
