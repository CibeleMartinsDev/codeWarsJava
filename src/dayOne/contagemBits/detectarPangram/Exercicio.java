package dayOne.contagemBits.detectarPangram;


import java.util.Arrays;
import java.util.Objects;

public class Exercicio {


    public static Boolean check(String string){
        String[] arrayLetters = string.split("");

        for(int i = 0; i <= arrayLetters.length; i++){
            for(int j= 0; j <= arrayLetters.length; i++){
                if(Objects.equals(arrayLetters[i], arrayLetters[j]) && i != j) {
                    Arrays.toString(arrayLetters).replaceAll(arrayLetters[i], "duplicata");
                }
            }
        }

       Boolean isPangrama = Arrays.stream(arrayLetters).filter(i -> !i.equalsIgnoreCase("duplicata")).distinct().count() == 26;
        return isPangrama;

    }
}
