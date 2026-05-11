package sit333_week9;

import java.util.ArrayList;
import java.util.List;

public class OnTrackInboxService {

    /*
     * This file is intentionally wrong for the TDD red step.
     * The test expects this method to return tasks for the selected student.
     * But this method returns an empty list, so the test will fail.
     */
    public List<OnTrackTask> getInboxForStudent(String studentId, List<OnTrackTask> allTasks) {
        return new ArrayList<>();
    }

    public OnTrackTask viewTask(String studentId, String taskCode, List<OnTrackTask> allTasks) {
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }

        if (taskCode == null || taskCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Task code cannot be empty");
        }

        if (allTasks == null) {
            return null;
        }

        for (OnTrackTask task : allTasks) {
            if (task != null
                    && studentId.equals(task.getStudentId())
                    && taskCode.equals(task.getTaskCode())) {
                return task;
            }
        }

        return null;
    }
}
