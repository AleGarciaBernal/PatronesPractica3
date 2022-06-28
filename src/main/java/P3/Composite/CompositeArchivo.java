package P3.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeArchivo extends Component{

    private List<Component> componentList= new ArrayList<>();

    public CompositeArchivo(String type) {
        super(type);
    }

    @Override
    public void showDetails() {
        int temp=0;
        for (Component c: componentList) {
            c.showDetails();
            temp=temp+c.getWords();
        }
        this.setWords(temp);
        this.showInfo();
    }

    @Override
    public void add(Component component) {
        componentList.add(component);


    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int position) {
        return componentList.get(position);
    }
}
