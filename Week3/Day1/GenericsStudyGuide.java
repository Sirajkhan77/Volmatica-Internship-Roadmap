package Week3.Day1;

public class GenericsStudyGuide {
    public static void main(String[] args) {

        System.out.println("--- Testing Generic Class ---");

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("String Box contains: " + stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(404);
        System.out.println("Integer Box contains: " + integerBox.get());


        System.out.println("\n--- Testing Generic Methods ---");

        Integer[] intArray = { 10, 20, 30, 40 };
        String[] strArray = { "Java", "Python", "C++" };

        System.out.print("Integer Array: ");
        ArrayUtils.printArray(intArray);

        System.out.print("String Array: ");
        ArrayUtils.printArray(strArray);

        Integer firstInt = ArrayUtils.getFirstElement(intArray);
        String firstStr = ArrayUtils.getFirstElement(strArray);

        System.out.println("First Integer: " + firstInt);
        System.out.println("First String: " + firstStr);
    }
}