package dayOne.contagemBits;

import java.util.Objects;

public class Exercicio {
    public static int countBits(int n){
        Integer manyOnes = 0;
        // Show me the code!
        if(n >= 0){
            String repBinaria = Integer.toBinaryString(n);
            String[] numerosBits = repBinaria.split("");

            for(String numeroBit : numerosBits){
                if(Objects.equals(numeroBit, "1")){
                    manyOnes++;
                }
            }
        }

        return manyOnes;
        // ou
        //Integer.bitCount(n);
    }
}
