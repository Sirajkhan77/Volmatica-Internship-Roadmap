package Week3.Day3;
import  java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        Greeting g = () -> System.out.println("Hello this is A call from the greet method of Greeting Interface..!  "+ 1+ " call");
////        g.greet();
//        int x=9, y=8;
//        Calculator calc = (a,b)-> x*y;
//        System.out.println("The product is: "+calc.add(8,9));
//
//        Square s = n -> n*n;
//        System.out.println("Square is: "+ s.square(7));
////        System.out.println();
//
//        Printer p = (m)-> System.out.println(m);
//        p.print("Hello from the Printer Interface");
//
////        char a = 'A';
////        System.out.println((int) a);

                // ==========================================
                // Behavior as Data
                // ==========================================
                System.out.println("=== Behavior as Data ===");

                performOperation(10, 5, (a, b) -> a + b);
                performOperation(10, 5, (a, b) -> a - b);
                performOperation(10, 5, (a, b) -> a * b);

                // ==========================================
                // MINI TASK
                // Calculator Operations
                // ==========================================
                System.out.println("\n=== Calculator ===");

                CalculatorOperation add = (a, b) -> a + b;
                CalculatorOperation subtract = (a, b) -> a - b;
                CalculatorOperation multiply = (a, b) -> a * b;
                CalculatorOperation divide = (a, b) -> a / b;

                System.out.println(add.calculate(20, 10));
                System.out.println(subtract.calculate(20, 10));
                System.out.println(multiply.calculate(20, 10));
                System.out.println(divide.calculate(20, 10));

                // ==========================================
                // Lambda with No Parameter
                // ==========================================
                System.out.println("\n=== No Parameter ===");

                Greeting greeting = () -> System.out.println("Hello Java");

                greeting.sayHello();

                // ==========================================
                // Lambda with One Parameter
                // ==========================================
                System.out.println("\n=== One Parameter ===");

                Consumer<String> print = name ->
                        System.out.println("Hello " + name);

                print.accept("Ali");

                // ==========================================
                // Lambda with Multiple Parameters
                // ==========================================
                System.out.println("\n=== Multiple Parameters ===");

                BiFunction<Integer, Integer, Integer> sum =
                        (x, y) -> x + y;

                System.out.println(sum.apply(5, 7));

                // ==========================================
                // Predicate
                // ==========================================
                System.out.println("\n=== Predicate ===");
                Predicate<Integer> isEven = number -> number % 2 == 0;
                System.out.println(isEven.test(8));
                System.out.println(isEven.test(5));

                // ==========================================
                // Function
                // ==========================================
                System.out.println("\n=== Function ===");

                Function<String, Integer> length =
                        text -> text.length();

                System.out.println(length.apply("Spring"));

                // ==========================================
                // Consumer
                // ==========================================
                System.out.println("\n=== Consumer ===");

                Consumer<String> consumer =
                        text -> System.out.println(text.toUpperCase());

                consumer.accept("java");

                // ==========================================
                // Supplier
                // ==========================================
                System.out.println("\n=== Supplier ===");

                Supplier<String> supplier =
                        () -> "Generated Token";

                System.out.println(supplier.get());

                // ==========================================
                // Method Reference
                // ==========================================
                System.out.println("\n=== Method Reference ===");

                Consumer<String> printer = System.out::println;

                printer.accept("Method Reference Example");

                // ==========================================
                // REFACTOR TASK
                // Anonymous Class -> Lambda
                // ==========================================
                System.out.println("\n=== Refactor ===");

                // OLD STYLE
                Runnable oldRunnable = new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Anonymous Class");
                    }
                };

                oldRunnable.run();

                // NEW STYLE
                Runnable lambdaRunnable =
                        () -> System.out.println("Lambda");

                lambdaRunnable.run();

                // ==========================================
                // CODE REVIEW
                // Complex Lambda -> Named Method
                // ==========================================
                System.out.println("\n=== Code Review ===");

                Function<String, String> formatter =
                        Main::formatName;

                System.out.println(formatter.apply("siraj"));
            }

            static void performOperation(
                    double a,
                    double b,
                    CalculatorOperation operation) {

                System.out.println(operation.calculate(a, b));
            }

            // Named method for method reference
            static String formatName(String name) {
                return name.substring(0, 1).toUpperCase()
                        + name.substring(1).toLowerCase();
            }
        }
