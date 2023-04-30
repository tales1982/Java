package meusexercicios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String res = "";

        while(!res.equalsIgnoreCase("sair") ){
            System.out.println("Voçe diz: ");
            res = in.nextLine();
        }
        in.close();
    }
}
