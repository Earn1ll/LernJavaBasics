package less12;

import less11.OperatorSwitch;

public class LoopControl {
    boolean value = true;
    int a =5, b = 7;
    public void foo() {

        OperatorSwitch os = new OperatorSwitch();

        /*while (a!=0) {
            System.out.println();

        }*/
        do {
            a++;
            System.out.println(a);
        } while (a<b);
    }
}
