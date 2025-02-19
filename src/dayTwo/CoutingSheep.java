package dayTwo;

import java.util.ArrayList;
import java.util.List;

public class CoutingSheep {

    ArrayList sheepList;

    public CoutingSheep(Boolean[] arrayOfSheeps){

        this.sheepList = new ArrayList(List.of(arrayOfSheeps));
    }

    public Integer countSheeps() {
        return Math.toIntExact(this.sheepList.stream().filter(s -> s.equals(true)).count());
    }
}
