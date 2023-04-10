package JavaTrning;
// Casting מה זה ??
// זה המרה מ סטרינג לאינטאגאר ולהפך
public class Casting {
    public static void main(String[] args) {
        int num1 = 25;
        String numAsstring = num1+"";     // רואים פה פעולות
        String num2 = "23";
        int num2AsInt = Integer.parseInt(num2);
        int sum = num2AsInt+4;
                System.out.println(sum);
    }
}
