package sit333_week9;

public class OnTrackTask {
    private final String studentId;
    private final String taskCode;
    private final String title;
    private final TaskStatus status;
    private final int messageCount;

    public OnTrackTask(String studentId, String taskCode, String title, TaskStatus status, int messageCount) {
        this.studentId = studentId;
        this.taskCode = taskCode;
        this.title = title;
        this.status = status;
        this.messageCount = messageCount;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public int getMessageCount() {
        return messageCount;
    }
}
