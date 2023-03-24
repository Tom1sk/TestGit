public class Main {
    public static int soucet(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int vysledek = soucet(1, 3);
        System.out.println(vysledek);
        Zvire zvire = new Zvire("Hello", "world");
        System.out.println(zvire);
    }
}