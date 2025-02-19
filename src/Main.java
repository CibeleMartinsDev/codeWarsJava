import dayOne.contagemBits.detectarPangram.Exercicio;
import dayTwo.CoutingSheep;
import dayTwo.EvenOrOdd;

public class Main {
    public static void main(String[] args) {
//        System.out.println(       Exercicio.countBits(2));
//        System.out.println(Exercicio.check("bab klzx"));
//        EvenOrOdd.evenOrOdd(10);
//        EvenOrOdd.evenOrOdd(23);
        Boolean[] sheeps = {true, false, true, false, true, false, true, false, false, false, false, true, true};
        CoutingSheep coutingSheep = new CoutingSheep(sheeps);
        System.out.println(coutingSheep.countSheeps());
    }
}