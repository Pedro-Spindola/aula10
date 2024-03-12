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
 * @brief Class Figura
 */
/* Uma classe abstrata em Java serve como modelo para outras classes, não podendo ser instanciada diretamente, e
pode conter métodos abstratos, que devem ser implementados pelas subclasses. */
public abstract class Figura { 
    private String cor;
    
    public Figura() {
        
    }
    public Figura(String cor) {
        super(); // super(); invoca o construtor padrão da superclasse antes de executar o código no construtor da subclasse.
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Figura [cor=" + cor + "]";
    }
    
    public abstract double area();
}
