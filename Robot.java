public class Robot {
    private String modelName;
    private int batteryLevel;
    private String status;

    public Robot(String modelName, int batteryLevel, String status) {
        this.modelName = modelName;
        this.batteryLevel = batteryLevel;
        this.status = status;
    }

    public String getModelName() { return modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }

    public int getBatteryLevel() { return batteryLevel; }
    public void setBatteryLevel(int batteryLevel) { this.batteryLevel = batteryLevel; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void displayRobotInfo() {
        System.out.println("model: " + modelName + " battery: " + batteryLevel + " status: " + status);
    }

    public boolean isBatteryEnough(int requiredAmount) {
        return batteryLevel >= requiredAmount;
    }

    public void consumeBattery(int amount) {
        if (batteryLevel >= amount) {
            batteryLevel -= amount;
        } else {
            batteryLevel = 0;
        }
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel >= 100) {
            status = "Active";
            if (batteryLevel > 100) batteryLevel = 100;
        } else {
            status = "Charging";
        }
    }

    public void performTask(Task t) {
        System.out.println(modelName + " attempting task: " + t.getTaskName());

        if (status.equals("Charging")) {
            System.out.println("failure robot is charging cannot work");
            return;
        }

        if (isBatteryEnough(t.getEnergyCost())) {
            consumeBattery(t.getEnergyCost());
            System.out.println("success task completed: " + t.getTaskName());
        } else {
            System.out.println("failure not enough battery for: " + t.getTaskName());
        }
    }

    // BONUS Kısım!!!
    public void performTaskBatch(TaskBatch batch) {
        if (batch.getTaskCount() == 0) {
            System.out.println("error batch empty nothing to do");
            return;
        }

        int totalCost = batch.getTotalEnergyCost();

        // check total first
        if (!isBatteryEnough(totalCost)) {
            System.out.println("error not enough battery for batch required: " + totalCost + " available: " + batteryLevel);
            return;
        }

        System.out.println("batch processing started total cost: " + totalCost);

        Task[] tasks = batch.getTasks();
        for (int i = 0; i < batch.getTaskCount(); i++) {
            performTask(tasks[i]);
            displayRobotInfo();
        }
        System.out.println("batch processing done");
    }
}