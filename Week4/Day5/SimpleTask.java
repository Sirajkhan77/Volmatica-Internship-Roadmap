package Week4.Day5;

import java.util.List;
import java.util.concurrent.Callable;

public class SimpleTask implements Callable<Integer> {

    private String fileName;
    private List<String> sharedList;

    public SimpleTask(String fileName, List<String> sharedList) {
        this.fileName = fileName;
        this.sharedList = sharedList;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is working on " + fileName);

        // Simulate a 1-second delay for reading the file
        Thread.sleep(1000);

        // Safely add the file name to the shared list
        sharedList.add(fileName);

        // Pretend we counted exactly 100 words in this file
        return 100;
    }
}