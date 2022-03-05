package less24;

public class Mi8 extends Helicopter implements VerticalTakeoff{
    @Override
    public void fly() {
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void vertivalTakeoff() {
        System.out.println("Helicopter Mi8 vertical");
    }
}
