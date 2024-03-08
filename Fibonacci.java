import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        int num = 0; // número a ser verificado
        int a = 0;
        int b = 1;

        System.out.println("Informe um valor para saber se faz parte da sequencia Fibonacci:");
        num = en.nextInt();

        while (b < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        if (b == num) {
            System.out.println("O número " + num + " pertence a sequência de Fibonacci.");
        }
        else{
            System.out.println("O número " + num + " não pertence a sequência de Fibonacci.");
        }
        
        en.close();
    }
    
}