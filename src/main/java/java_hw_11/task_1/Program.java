package java_hw_11.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        CanBeClosed browser = new MyBrowser();
        CanBeClosed file = new MyFile();
        List<CanBeClosed>res = new ArrayList<>(Arrays.asList(browser, file));
        SessionCloser closer = list ->list.forEach(CanBeClosed::close);
        closer.closeSession(res);
    }
}
