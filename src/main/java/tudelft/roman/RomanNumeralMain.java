package tudelft.roman;

public class RomanNumeralMain {
    public static void main(String [] args){

        RomanNumeral rn = new RomanNumeral();

        int n = rn.convert("VI");
        System.out.println(Integer.toString(n));
    }
}
