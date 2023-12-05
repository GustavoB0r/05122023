package Atividades5;

import java.util.*;

public class Atividade3 {
    
    public static void main(String[] args) {
        
        short Ligado = 0;
        boolean continuar = true;
        Scanner ventiladorLigado = new Scanner(System.in);
        Scanner Prosseguir = new Scanner(System.in);
        String ligarVentilador;

        while (continuar) {

            switch (Ligado) {

                case 0:
                    System.out.println("O ventilador esta desligado. Deseja ligar?");
                    ligarVentilador = ventiladorLigado.nextLine();
                    if (ligarVentilador.equalsIgnoreCase("sim")) {
                        System.out.println("Ventilador ligado.");
                        Ligado = 1;
                    }
                    break;

                case 1:
                    System.out.println("O ventilador agora esta ligado. Deseja desligar?");
                    ligarVentilador = ventiladorLigado.nextLine();
                    if (ligarVentilador.equalsIgnoreCase("sim")) {
                        Ligado = 0;
                    }
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
            System.out.println("Deseja prosseguir?");
            String prosseguir = Prosseguir.nextLine();
            if (prosseguir.equalsIgnoreCase("nao")) {
                System.out.println("Ok, saindo");
                continuar = false;
                break;
            }
        }

        ventiladorLigado.close();
        Prosseguir.close();
    }
}
