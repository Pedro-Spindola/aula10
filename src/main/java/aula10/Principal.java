/*
 * Copyright (C) 2024 Pedro Spindola
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

package aula10;

/**
 *
 * @author Pedro Spindola
 * @date 11/03/2024
 * @brief Class Principal
 */
public class Principal {
        public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);
        
        quadrado.setCor("Roxo");
        quadrado.setLado1(4);
        
        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);
        
        
    }
}
