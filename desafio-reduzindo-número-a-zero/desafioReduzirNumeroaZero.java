

// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class desafioReduzirNumeroaZero{
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        var step = 0;
//Para números impares
        while (num != 0) {
            if ((num % 2) != 0) num--;
            else num/=2;
            step++;
        }
        System.out.println(step);
    }
}
