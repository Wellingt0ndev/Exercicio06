
package exercicio06;

import java.util.Scanner;

/**
 *
 * @author Wellington F.
 */
public class Exercicio06 {

    public static void main(String[] args) {
    float c;
    float f;
    Scanner leitor = new Scanner(System.in);
        System.out.print("Qual a temperatura em Celsius: ");
        c = leitor.nextFloat();
        f = (9*c + 160) / 5;
        System.out.println(c + " graus Celsius é igual a " + f +
                " graus Fahrenheit");
    }
    
}
