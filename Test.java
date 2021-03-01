import java.util.Random;


public class Test {

    public static int rand(int min, int max) {
        Random random = new Random();
        return random.nextInt(max + 1 - min) + min;
    }


    public static void main(String[] args) {
int i=-2,j=3,k=4;if (i>0)if (j>0)i++;else if (k>0)i--;else i=0;System.out.println(i);
}


}
