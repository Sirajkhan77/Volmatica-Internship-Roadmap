package Week3.Day2;
import  java.util.*;
class UserRepository {
    private Map<Integer, User> map = new HashMap<>();
    public UserRepository() {
        map.put(1, new User(1, "Siraj", "sirajyounis890@gmail.com"));
        map.put(2, new User(2, "syaa", null));
    }
    public Optional<User> findById(int id){
        return Optional.ofNullable(map.get(id));
    }
}