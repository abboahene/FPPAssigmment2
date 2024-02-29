public class Prog4 {
    public static void main(String[] args) {
        float float1 = 1.27F;
        float float2 = 3.881F;
        float float3 = 9.6F;

        float floatSum = float1 + float2 + float3;
        int intSum = (int) floatSum; // cast floats sum
        int RoundedSum = Math.round(floatSum); // round floats sum

        System.out.println("Floats sum casted to int: "+ intSum);
        System.out.println("Floats sum rounded to nearest int: "+ RoundedSum);

    }
}
