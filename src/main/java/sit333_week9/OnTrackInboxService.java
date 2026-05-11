package sit333_week9;

import java.util.ArrayList;
import java.util.List;

public class OnTrackInboxService {

    /*
     * This method shows the task inbox for one student.
     * It only returns tasks that match the given student ID.
     */
    public List<OnTrackTask> getInboxForStudent(String studentId, List<OnTrackTask> allTasks) {
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }

        List<OnTrackTask> inbox = new ArrayList<>();

        if (allTasks == null) {
            return inbox;
        }

        for (OnTrackTask task : allTasks) {
            if (task != null && studentId.equals(task.getStudentId())) {
                inbox.add(task);
            }
        }

        return inbox;
    }

    /*
     * This method opens one task from the student inbox.
     * It checks both student ID and task code.
     */
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