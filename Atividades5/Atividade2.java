package Atividades5;

import java.util.*;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        Scanner inputText = new Scanner(System.in);

        while (true) {
            System.out.println("Você gostaria de ascender alguma luz da casa?");
            String resp = inputText.nextLine();

            if (resp.equalsIgnoreCase("sim") || resp.equalsIgnoreCase("s")) {
                System.out.println("Escolha em qual local você gostaria de ascender a luz:\n 1) Sala\n 2) Cozinha\n 3) Quarto\n 4) Banheiro\n 5) Quintal");
                int opcao = inputText.nextInt();
                inputText.nextLine();
                
                switch (opcao) {
                    case 1:
                        System.out.println("Luz da sala acesa!");break;
                    case 2:
                        System.out.println("Luz da cozinha acesa!");break;
                    case 3:
                        System.out.println("Luz do quarto acesa!");break;
                    case 4:
                        System.out.println("Luz do banheiro acesa!");break;
                    case 5:
                        System.out.println("Luz quintal acesa!");break;

                    default:
                        break;
                }

            } else if (resp.equalsIgnoreCase("nao") || (resp.equalsIgnoreCase("n"))){
                System.out.println("Ok entendido");
                break;

            } else {
                System.out.println("Ocorreu um erro");
                break;
            } 

        }
        inputText.close();
    }
}
