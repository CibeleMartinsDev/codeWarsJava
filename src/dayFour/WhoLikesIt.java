package dayFour;

/**
 * Você provavelmente conhece o sistema "curtir" do Facebook e outras páginas. As pessoas podem "curtir" posts de blog, fotos ou outros itens.
 * Queremos criar o texto que deve ser exibido ao lado de tal item.
 * Implemente a função que recebe um array contendo os nomes das pessoas que gostam de um item. Ela deve retornar o texto de exibição conforme mostrado nos exemplos:
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 * Observação: para 4 ou mais nomes, o número "and 2 others"simplesmente aumenta.
 */
public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        String text = "no one likes this";
        if(names.length != 0){
            if(names.length >= 4){
                int others = names.length - 2;
                text = names[0] + ", " + names[1] + " and" + others +  "others like this";
            } else if (names.length % 2 == 0) {
                text = names[0] + " and " + names[1] + " like this";
            } else if(names.length % 2 != 0 && names.length > 1){
                text = names[0] + ", " + names[1] + " and " + names[2] + " like this";
            } else {
                text = names[0] + " likes this";
            }
            return text;
        }else {
            return text;
        }
    }
}
