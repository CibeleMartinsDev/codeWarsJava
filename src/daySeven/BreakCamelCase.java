package daySeven;

import java.util.ArrayList;


/**
 * Complete a solução para que a função quebre o camel casing, usando um espaço entre as palavras.
 *
 * Exemplo
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */
public class BreakCamelCase {


       public static String camelCase(String input) {
           String[] stringArray = input.split("");
           ArrayList<String> finalArray = new ArrayList<>();

           for (int i = 0; i < stringArray.length; i++){
                     finalArray.add(stringArray[i]);
                     if(Character.isUpperCase(input.charAt(i))){
                     finalArray.add(i, " ");
                 }
           }

           return String.join("", finalArray);
       }

}
