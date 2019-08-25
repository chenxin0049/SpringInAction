package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class ListSpittleRepository implements SpittleRepository {
    private List<Spittle> spittleList;

    public ListSpittleRepository(){
        spittleList = new ArrayList<>();
        spittleList.add(new Spittle("Hello world! The first ever spittle!", new Date()));
        spittleList.add(new Spittle("Here's another spittle", new Date()));
        spittleList.add(new Spittle("Spittle spittle spittle", new Date()));
        spittleList.add(new Spittle("Spittles go fourth!", new Date()));
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        int spittleListsize = spittleList.size();
        if(spittleListsize > count){
            return spittleList.subList(spittleListsize - count, spittleListsize);
        }
        else{
            return spittleList;
        }
    }

    @Override
    public Spittle findOne(int spittleId) {
        if(spittleId >= 0 && spittleId < spittleList.size()){
            return spittleList.get(spittleId);
        }
        else{
            return null;
        }
    }
}
