package dayThree;

import java.util.ArrayList;
import java.util.List;

/*
Complete a solução para que ela divida a string em pares de dois caracteres.
Se a string contiver um número ímpar de caracteres, ela deverá substituir
o segundo caractere ausente do par final por um sublinhado ('_').
https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
Exemplos:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
 */
public class SplitStrings {

    public static String[] solution(String s) {
        String[] result;
        List<String> tempStringList = new ArrayList<>();
        int count = 0;

        while (count <= s.length() - 1){
            if(s.length() % 2 != 0){
                s+= "_";
            }
            int finalIndex = count+2;
            String twoChars = s.substring(count, finalIndex);
            tempStringList.add(twoChars);
            count+= 2;
        }
        result = tempStringList.toArray(new String[tempStringList.size()]);
        return result;

    }
}
