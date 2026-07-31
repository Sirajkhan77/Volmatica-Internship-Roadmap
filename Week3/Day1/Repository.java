package Week3.Day1;
import java.util.*;
public class Repository <T> {
    private Map<Integer, T> database  = new HashMap<>();
    public void  save(int id, T item){
        database.put(id, item);
    }
    public List<T> findAll(){
        return new ArrayList<>(database.values());
    }
    public T findById(int id) {
        return database.get(id);
    }
    public void delete(int id)
    {
        database.remove(id);
    }


}
