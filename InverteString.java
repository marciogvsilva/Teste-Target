package Ex5;

import java.util.Scanner;

public class InverteString {
    public static void inverter(String string){
        for(int i = string.length() - 1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite a string a ser invertida");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        inverter(string);
    }
}
