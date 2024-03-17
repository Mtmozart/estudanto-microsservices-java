package br.tabelafip.demo.principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOptions {


    public String exibiTiposVeiculos() {
        Scanner sc = new Scanner(System.in);
        int options = 0;
        String tipoVeiculo = null;

        try {
            System.out.println(("Digite 1 para carros, 2 para motos ou 3 para caminhoes e zero para sair:"));
            options = sc.nextInt();
            switch (options) {
                case 1:
                    tipoVeiculo = "carros";
                    break;
                case 2:
                    tipoVeiculo = "motos";
                    break;
                case 3:
                    tipoVeiculo = "caminhoes";
                    break;
                default:
                    options = 0;
                    System.out.println("Obrigado! volte sempre!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite apenas númerais, preferencialmente os do menu.");
            sc.nextLine();
        } finally {
            sc.close();
        }
        return tipoVeiculo;
    }


}
