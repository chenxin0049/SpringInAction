package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spitter;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ListSpitterRepository implements SpitterRepository {
    private List<Spitter> spitterList;

    public ListSpitterRepository(){
        spitterList = new ArrayList<>();
    }

    @Override
    public Spitter save(Spitter spitter) {
        spitterList.add(spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        for(Spitter spitter : spitterList){
            if(spitter.getUsername().equals(username)){
                return spitter;
            }
        }
        return null;
    }
}
