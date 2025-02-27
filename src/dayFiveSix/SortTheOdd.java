package dayFiveSix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Tarefa
 * Você receberá um array de números. Você tem que classificar os números ímpares em ordem crescente, deixando os números pares em suas posições originais.
 *
 * Exemplos
 * [7, 1]  =>  [1, 7]
 * [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
 * [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */
public class SortTheOdd {


    public static int[] sortArray(int[] array) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> oddIndices = new ArrayList<>();

        // Armazena números ímpares e seus índices
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers.add(array[i]);
                oddIndices.add(i);
            }
        }

        // Ordena os números ímpares
        Collections.sort(oddNumbers);

        // Substitui os números ímpares ordenados nos índices originais
        for (int i = 0; i < oddNumbers.size(); i++) {
            array[oddIndices.get(i)] = oddNumbers.get(i);
        }

        return array;
    }
}
