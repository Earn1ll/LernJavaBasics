package less21;

public class Birds {
    private String name;
    private String wings;

    public Birds(String name, String wings) {
        this.name = name;
        this.wings = wings;
    }

    public void walk(){

        System.out.println("hohoho!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }
}
