package less29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorExample {

    private ABC abc;

    public void foo()  throws FileNotFoundException {
/*        // System.out.println(1/0);
//        int [] array = {1,2,3};
//        array[5] = 3;

        try {
            abc.show();
            System.out.println(1 / 0);
        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();

        }*/
        FileInputStream fileInputStream = new FileInputStream("");
        fileInputStream
    }
}
