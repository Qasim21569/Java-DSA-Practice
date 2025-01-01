package OOPs;

public class constructor2 {
    int id;
    String name;

    constructor2(int i, String n) {
        id = i;
        name = n;
    }

    void dsiplay() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        constructor2 c1 = new constructor2(1000802, "Ayyub");
        constructor2 c2 = new constructor2(210804, "Qasim");
        c1.dsiplay();
        c2.dsiplay();
    }
}
