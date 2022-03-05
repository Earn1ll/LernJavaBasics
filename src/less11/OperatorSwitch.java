package less11;

public class OperatorSwitch {
    final int VALUE = 2, firstValue = 1,secondValue = 2,thridValue = 3;
    public void foo(){
        /*
        switch (48){
            case 25:
            System.out.println(25);
            break;
            case 73:
                System.out.println(73);
                break;
            case 48:
                System.out.println(48);
                break;
            default:
                System.out.println("Not found!");
        }
         */
        switch (VALUE){
            case firstValue:
                System.out.println(25);
                break;
            case secondValue:
                System.out.println(73);
                break;
            case thridValue:
                System.out.println(48);
                break;
            default:
                System.out.println("Not found!");
        }
    }
}
