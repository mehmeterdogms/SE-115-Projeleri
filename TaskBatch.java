public class TaskBatch {
    private Task[] tasks;
    private int taskCount;

    public TaskBatch() {
        this.tasks = new Task[5]; // size 5 as requested
        this.taskCount = 0;
    }

    public void addTask(Task t) {
        if (taskCount < 5) {
            tasks[taskCount] = t;
            taskCount++;
        } else {
            System.out.println("error batch is full cannot add");
        }
    }

    public int getTotalEnergyCost() {
        if (taskCount == 0) {
            System.out.println("warning batch is empty");
            return 0;
        }
        int total = 0;
        for (int i = 0; i < taskCount; i++) {
            total += tasks[i].getEnergyCost();
        }
        return total;
    }

    public Task[] getTasks() {
        if (taskCount == 0) {
            System.out.println("warning no tasks here");
        }
        return tasks;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public void printBatchInfo() {
        if (taskCount == 0) {
            System.out.println("batch is currently empty");
        } else {
            System.out.println("batch content:");
            for (int i = 0; i < taskCount; i++) {
                tasks[i].describeTask();
            }
        }
    }
}
