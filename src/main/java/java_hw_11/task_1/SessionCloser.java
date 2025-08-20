package java_hw_11.task_1;

import java.util.List;

public interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);
}
