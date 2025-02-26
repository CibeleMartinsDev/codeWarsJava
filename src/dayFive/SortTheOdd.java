package dayFive;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        ArrayList<Integer> tempOddNumbersArray = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                tempOddNumbersArray.add(array[i]);
                array[i] = 0;
            }
        }
        List<Integer> listOddNumberOrdered =  tempOddNumbersArray.stream().sorted().toList();

        for (Integer integer : listOddNumberOrdered) {
            List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
            int indexZero = list.indexOf(0);
            array[indexZero] = integer;
        }

        return array;

    }
}
