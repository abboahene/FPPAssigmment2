public class Prog6 {

    public static void main(String[] args) {

        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minValue = min(arr);
        System.out.println("Minimum value: "+ minValue);
    }

    static int min(int[] arrayOfInts){
        int min = Integer.MAX_VALUE;
        for (int num : arrayOfInts){
            if(num < min) min = num;
        }
        return min;
    }
}
