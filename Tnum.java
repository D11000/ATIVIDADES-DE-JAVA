import java.util.Scanner;

public class Tnum {
    public static void main(String[] args) {
        double a,b,c,d ;
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite esses valores ");

        a=dados.nextDouble();
        b=dados.nextDouble();
        c=dados.nextDouble();
        d= a*b/c;
        System.out.println("O valor é "+d);



    }
}
