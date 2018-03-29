package pl.agnieszka;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class ListFiller implements BiConsumer<List<Integer>, Integer> {

    @Override
    public void accept(List<Integer> list, Integer integer) {
        Random r = new Random();
        for (int i = 0; i < integer; i++){
            list.add(r.nextInt());
        }
    }
}
