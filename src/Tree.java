
public class Tree {
    String vid;
    Noise treeNoise;
    Size treeSize;
    Shadow treeShadow;
    Dry treeDry;

    Tree(String vid, Noise treeNoise, Size treeSize, Shadow treeShadow, Dry treeDry) {
        this.vid = vid;
        this.treeNoise = treeNoise;
        this.treeSize = treeSize;
        this.treeShadow = treeShadow;
        this.treeDry = treeDry;

    }

    public void getNoise() {
        if (treeNoise.wind > 4) {
            if (treeNoise.crona > 5) {
                if (treeNoise.poraGoda > 3 & treeNoise.poraGoda < 10) {
                    System.out.println("Tree noise!!!");
                } else {
                    System.out.println("Holodno");
                }
            } else {
                System.out.println("Tree is little. No noise.");
            }
        } else {
            System.out.println("Wind is low. No noise");
        }
    }

    public void getShadow() {
        if (treeShadow.shine == true) {
            if (treeSize.height > 5 && treeSize.girth > 1) {
                System.out.println("We have shadow!!!");
            } else {
                System.out.println("Tree is small. No shadow.");
            }
        } else {
            System.out.println("The sun is not shine(");
        }
    }

    public void getDry() {
        if (treeDry.age > 150) {
            System.out.println("The tree is dry");
        } else {
            System.out.println("Tree is yang");
        }
    }


}
