package pl.agnieszka;

import java.util.List;
import java.util.function.Consumer;

public class ForEachOperator implements Consumer<List<Integer>>{

    @Override
    public void accept(List<Integer> list) {
        for(Integer integer : list){
            Integer element = integer;
        }
    }
}
