package com.caofangqi.study;

public class ProductManager extends TaskHandler {


  public ProductManager(TaskHandler taskHandler) {
    super(taskHandler);
  }

  @Override
  public void handleTask(Task task) {
    if (TaskType.ANALYZE_DEMAND.equals(task.getTaskType())) {
      printHandling(task);
      task.markHandled();
    } else {
      super.handleTask(task);
    }
  }

  @Override
  public String toString() {
    return "产品经理";
  }
}
