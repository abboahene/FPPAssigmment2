import java.util.Arrays;

public class Prog5 {

    public static void main(String[] args) {

        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        int[] combined = combine(a, b);
        System.out.println(Arrays.toString(combined));
    }

    public static int[] combine(int[] a, int[] b){
        int[] combined = new int[a.length + b.length];
        System.arraycopy(a, 0, combined,0,a.length);
        System.arraycopy(b, 0, combined,a.length,b.length);
        return combined;
    }

}
