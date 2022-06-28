package P3.VisitorSingleton;

public interface IVisitor {

    int visitTablet(Tablet tablet);
    int visitPC(PC pc);
    int visitLaptop(Laptop laptop);

}
