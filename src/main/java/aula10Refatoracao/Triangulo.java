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

package aula10Refatoracao;

/**
 *
 * @author Pedro Spindola
 * @date 11/03/2024
 * @brief Class Triangulo
 */
public class Triangulo extends Figura{
    private double area;
    
    public Triangulo() {
    
    }
    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.area = ((base * altura) / 2);
    }
    @Override
    public String toString() {
        return "Triângulo: \nÁrea: " + area + "\nCor: " + super.getCor();
    }
}
