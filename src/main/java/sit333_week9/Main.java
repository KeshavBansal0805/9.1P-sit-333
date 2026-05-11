package sit333_week9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OnTrackTask> tasks = Arrays.asList(
                new OnTrackTask("225191856", "9.1P", "TDD and CI", TaskStatus.SUBMITTED, 2),
                new OnTrackTask("225191856", "8.1P", "Mentor Update", TaskStatus.COMPLETED, 1),
                new OnTrackTask("222000111", "9.1P", "Other Student Task", TaskStatus.NOT_STARTED, 0)
        );

        OnTrackInboxService service = new OnTrackInboxService();
        List<OnTrackTask> inbox = service.getInboxForStudent("225191856", tasks);

        System.out.println("Inbox tasks found: " + inbox.size());
        for (OnTrackTask task : inbox) {
            System.out.println(task.getTaskCode() + " - " + task.getTitle() + " - " + task.getStatus());
        }
    }
}
