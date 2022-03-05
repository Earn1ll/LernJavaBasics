package less13;

public class ForLoop {

    int [] array = {1,2,3};

    public void foo(){

        /*for(int i = 0; i<=10; i = i+2){
            System.out.println(i);
        }*/
       /* for(int element: array){
            System.out.println(element);  !!!advanced!!!
        }*/
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
