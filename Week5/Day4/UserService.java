//package Week5.Day4;
//
//public class UserService {
//
//    private final UserRepository repository;
//
//    public UserService(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    public String getUserName(int id) {
//
//        User user = repository.findById(id);
//
//        if (user == null) {
//            throw new IllegalArgumentException("User not found");
//        }
//
//        return user.getName();
//    }
//}

