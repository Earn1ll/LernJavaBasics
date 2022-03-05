package less17;

public class Bus1 {
    public String model,color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "1045AB";
    public final int SERIAL_NUMBER_2 = 134563;

    public void go(){
        System.out.println("go!");
    }
    public void showDistance(String km2,String model){
        /*int km = 65;
        String str = "70";
        return str;*/
        /*engine = new Engine();
        return engine;*/
        km2 +=2;
        System.out.println(km2);
    }
}
