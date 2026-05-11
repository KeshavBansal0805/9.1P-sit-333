package sit333_week9;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class OnTrackInboxServiceTest {

    private OnTrackInboxService service;
    private List<OnTrackTask> tasks;

    @Before
    public void setUp() {
        service = new OnTrackInboxService();

        tasks = Arrays.asList(
                new OnTrackTask("225191856", "9.1P", "TDD and CI", TaskStatus.SUBMITTED, 2),
                new OnTrackTask("225191856", "8.1P", "Mentor Update", TaskStatus.COMPLETED, 1),
                new OnTrackTask("225191856", "7.2D", "Functional Testing", TaskStatus.FEEDBACK_READY, 5),
                new OnTrackTask("222000111", "9.1P", "Other Student Task", TaskStatus.NOT_STARTED, 0)
        );
    }

    @Test
    public void testInboxOnlyShowsTasksForSelectedStudent() {
        List<OnTrackTask> result = service.getInboxForStudent("225191856", tasks);

        // This test should fail in this failure project because the method returns 0 tasks.
        assertEquals(3, result.size());

        for (OnTrackTask task : result) {
            assertEquals("225191856", task.getStudentId());
        }
    }

    @Test
    public void testViewTaskShowsCorrectTaskDetails() {
        OnTrackTask task = service.viewTask("225191856", "9.1P", tasks);

        assertNotNull(task);
        assertEquals("TDD and CI", task.getTitle());
        assertEquals(TaskStatus.SUBMITTED, task.getStatus());
        assertEquals(2, task.getMessageCount());
    }

    @Test
    public void testViewTaskReturnsNullWhenTaskNotFound() {
        OnTrackTask task = service.viewTask("225191856", "1.1P", tasks);

        assertNull(task);
    }
}
