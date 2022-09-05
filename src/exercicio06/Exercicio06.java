
package exercicio06;

import java.util.Scanner;

/**
 *
 * @author Wellington F.
 */
public class Exercicio06 {

    public static void main(String[] args) {
    float celsius;
    float fahrenheit;
    Scanner leitor = new Scanner(System.in);
        System.out.print("Qual a temperatura em Celsius: ");
        celsius = leitor.nextFloat();
        fahrenheit = (9*celsius + 160) / 5;
        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit +
                " graus Fahrenheit");
    }
    
}
