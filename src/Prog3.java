import java.util.Arrays;

public class Prog3 {

    public static void main(String[] args) {
        String[] arr = new String[]{"horse", "dog", "cat", "horse", "dog"};
        System.out.println(Arrays.toString(removeDups(arr)));
    }

    static public String[] removeDups(String[] arr){
        String[] uniques = new String[arr.length];
        int uniquesIndex = 0;
        for (String s : arr) {
            boolean isDup = contains(s, uniques);
            if (!isDup) {
                uniques[uniquesIndex] = s;
                uniquesIndex++;
            }
        }
        String[] result = new String[uniquesIndex];
        System.arraycopy(uniques, 0, result, 0, result.length);

        return result;
    }

    public static boolean contains(String item, String[] arr){
        for (String el : arr){
            if(el == null) break;
            if(el.equals(item)) return true;
        }
        return false;
    }
}
