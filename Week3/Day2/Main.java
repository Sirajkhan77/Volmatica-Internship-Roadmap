package Week3.Day2;


import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
//        UserRepository repo = new UserRepository();
        UserRepository repo = new UserRepository();
        System.out.println("=== User Lookup ===");
//        Optional<User> user = repo.findById(1);
//        if (user.isPresent()) {
//            System.out.println(user.get());
//        }
//        user.ifPresent(u -> System.out.println("Welcome " + u.getName()));
//
//        User defaultUser = repo.findById(100)
//                .orElse(new User(0, "Guest", null));
        Optional<User> user =  repo.findById(1);
        if(user.isPresent()){
            System.out.println(user.get());
        }
        user.ifPresent(user1 -> System.out.println("Welcome: " + user1.getName()));

        User defaultUser = repo.findById(100)
                .orElse(new User(100, "Siraj", null));


        System.out.println(defaultUser);

        User lazyUser = repo.findById(200)
                .orElseGet(() -> {
                    System.out.println("Creating default user...");
                    return new User(0, "Lazy Guest", null);
                });

        System.out.println(lazyUser);

        // ===========================
        // map()
        // ===========================

        System.out.println("\n=== map() ===");

        String upperName = repo.findById(1)
                .map(User::getName)
                .map(String::toUpperCase)
                .orElse("Unknown");

        System.out.println(upperName);

        // ===========================
        // flatMap()
        // ===========================

        System.out.println("\n=== flatMap() ===");

        String email = repo.findById(1)
                .flatMap(User::getEmail)
                .orElse("No Email");

        System.out.println(email);

        String email2 = repo.findById(2)
                .flatMap(User::getEmail)
                .orElse("No Email");

        String email3 = repo.findById(100)
                        .flatMap(User::getEmail)
                                .orElse("No Email Adress");


        System.out.println(email2);
        System.out.println(email3);

        // ===========================
        // Optional.empty()
        // ===========================

        System.out.println("\n=== Optional.empty() ===");

        Optional<String> empty = Optional.empty();

        System.out.println(empty.isPresent());

        // ===========================
        // BUG TASK
        // Fix NullPointerExceptions
        // ===========================

        System.out.println("\n=== Fix NPE #1 ===");

        String name = null;

        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name is null");
        }

        System.out.println("\n=== Fix NPE #2 ===");

        User missingUser = null;

        if (missingUser != null) {
            System.out.println(missingUser.getName());
        } else {
            System.out.println("User not found");
        }

        System.out.println("\n=== Fix NPE #3 ===");

        List<String> list = null;

        if (list != null) {
            System.out.println(list.size());
        } else {
            System.out.println("List is null");
        }
    }
}
