/*
 * Copyright (C) 2024 aluno
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package aula10Refatoracao;
import java.util.Scanner;

/**
 *
 * @author Pedro Spindola
 * @date 11/03/2024
 * @brief Class Principal
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int navegation = 0;
        
        do {
            System.out.println("Selecione o tipo de figura. \n");
            System.out.println("1 - Quadrado \n" + "2 - Retângulo \n" + "3 - Triângulo \n" + "4 - Círculo \n" + "5 - Sair");
            navegation = scanner.nextInt();
            
            if(navegation == 1){
                scanner.nextLine();
                System.out.print("\nInforme a cor do quadrado: ");
                String cor = scanner.nextLine();
                System.out.print("\nInforme o lado do quadro: ");
                double lado = scanner.nextDouble();
                Quadrado quadrado = new Quadrado(cor, lado);
                System.out.println(quadrado);
            } else if(navegation == 2) { //Retângulo
                System.out.print("\nInforme a cor do retângulo: ");
                String cor = scanner.nextLine();
                System.out.print("\nInforme o primeiro lado retângulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("\nInforme o segundo lado retângulo: ");
                double lado2 = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(cor, lado1, lado2);
                System.out.println(retangulo);
            } else if(navegation == 3) { //Triângulo
                System.out.print("\nInforme a cor do triângulo: ");
                String cor = scanner.nextLine();
                System.out.print("\nInforme a base do triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("\nInforme a altura do triângulo: ");
                double altura = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(cor, base, altura);
                System.out.println(triangulo);
            } else if(navegation == 4) { //Círculo
                scanner.nextLine();
                System.out.print("Informe a cor do círculo: ");
                String cor = scanner.nextLine();
                System.out.print("Informe o raio do círculo: ");
                double raio = scanner.nextDouble();
                Circulo circulo = new Circulo(cor, raio);
                System.out.println(circulo);
            } else if (navegation == 5) {
                System.out.println("Programa finalizado.");
                break;
                // Sair
            } else {
                System.out.println("Opção incorreta.");
            }
            
        } while(true);

    }
}
