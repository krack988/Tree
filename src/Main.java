
public class Main {
    public static void main(String args[]) {
        boolean sun = true;
        Size s = new Size(12, 1);
        Noise n = new Noise(3, 7, 6);
        Shadow sh = new Shadow(sun);
        Dry d = new Dry(58);
        Tree t = new Tree("Topol", n, s, sh, d);

        System.out.println("It's tree is "+t.vid);
        System.out.println("Razmery: hight is-"+s.height+" girth-"+s.girth);

        t.getNoise();
        t.getShadow();
        t.getDry();


    }
}
