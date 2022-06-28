package P3.Composite;

public abstract class Component {

    private String type;
    private String nombre;
    private String space="";
    private int words;

    public Component(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public void showInfo(){
        System.out.println("                   ");
        System.out.println(space+"Tipo: "+type);
        System.out.println(space+"Nombre: "+nombre);
        System.out.println(space+"Palabras: "+words);

    }

    public abstract void showDetails();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int position);


}
