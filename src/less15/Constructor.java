package less15;

public class Constructor {
    public void foo(){
        Flower flower = new Flower();
        flower.name = "Romashka";
        flower.color = "White";

        Flower flower1 = new Flower("Rose","red");
        Flower flower2 = new Flower("Tulpan","orange");
        System.out.println(flower.name + " " + flower.color);
        System.out.println(flower1.name + " " + flower1.color);
        System.out.println(flower2.name + " " + flower2.color);
    }
}
