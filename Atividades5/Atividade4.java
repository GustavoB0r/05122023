package Atividades5;

import java.util.Scanner;

public class Atividade4 {
    
    public static void main(String[] args) {
        
            Scanner letra = new Scanner(System.in);

        System.out.println(" Se sua idade for entre 1 a 12 anos, letra 'a'. \n Se sua idade for entre 13 a 17 anos, letra 'b'. \n Se sua idade for entre 18 a 25 anos, letra 'c'. \n Se sua idade for entre 26 a 59 anos, letra 'd'. \n Se sua idade for de 60 anos pra cima, letra 'e'. ");

        System.out.println("Digite em letra minuscula qual indica a sua idade");
        String n1 = letra.nextLine();

        switch (n1) {
            case "a":
                System.out.println("Favor dirija-se a sala 1, acompanhado de um responsavel.");
                break;
            case "b":
                System.out.println("Favor dirija-se a sala 2.");
                break;
            case "c":
                System.out.println("Favor dirija-se a sala 3.");
                break;
            case "d":
                System.out.println("Favor dirija-se a sala 4.");
                break;
            case "e":
                System.out.println("Favor dirija-se a sala 5.");
                break;
            default:
                System.out.println("Letra invalida");
                break;
        }

        letra.close();
    }

}
