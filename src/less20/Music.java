package less20;

public enum Music {
    CLASSIC(5,"classic"),ROCK(8,"rock"),POP(12,"pop");
    private int i;
    private String name;

    Music(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }
    public void foo(){
        System.out.println(Music.CLASSIC.getI());
    }
}







/*
package com.company;

        import less20.Music;

public class Main {

    public static void main(String[] args) {
        Music mc = Music.CLASSIC;
        for (Music element:Music.values()){
            System.out.println(element);
        }

    }
}
*/
/*
package com.company;

        import less20.Music;

public class Main {

    public static void main(String[] args) {
        Music mc = Music.CLASSIC;
        Music mc2 = Music.valueOf(Music.class,"ROCK");
        System.out.println(mc);
        System.out.println(mc2);
        System.out.println(mc.ordinal());

    }
}
*/
/*package com.company;

        import less20.Music;

public class Main {

    public static void main(String[] args) {
        Music mc = Music.CLASSIC;

        switch (mc){
            case CLASSIC:
                System.out.println("Classic");
                break;
            case POP:
                System.out.println("Pop");
                break;
            case ROCK:
                System.out.println("Rock");
                break;
        }


    }
}*/
/*package com.company;

        import less20.Music;

public class Main {

    public static void main(String[] args) {
        Music mc = Music.CLASSIC;
        System.out.println(mc.getI());
        System.out.println(mc.getName());

    }
}*/
