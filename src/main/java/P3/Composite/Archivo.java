package P3.Composite;

public class Archivo extends Component {

    public Archivo(String type) {
        super(type);
    }

    @Override
    public void showDetails() {
        this.showInfo();
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int position) {
        return null;
    }
}

