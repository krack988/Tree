
public class Tree {
    String vid;
    Noise treeNoise;
    Size treeSize;
    Shadow treeShadow;

    public void getNoise(){
        if (treeNoise.wind>4){
            if (treeNoise.crona>5){
                if (treeNoise.poraGoda>3&treeNoise.poraGoda<10){
                    System.out.println("Tree noise!!!");
                }
            }else{System.out.println("Tree is little!!!");}
        }else {System.out.println("Wind is low");}
    }

}
