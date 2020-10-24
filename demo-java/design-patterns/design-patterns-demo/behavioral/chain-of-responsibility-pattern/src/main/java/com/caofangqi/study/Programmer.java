package com.caofangqi.study;

public class Programmer extends TaskHandler {


  public Programmer(TaskHandler taskHandler) {
    super(taskHandler);
  }

  @Override
  public void handleTask(Task task) {
    if (TaskType.CODEING.equals(task.getTaskType())) {
      printHandling(task);
      task.markHandled();
    }else {
      super.handleTask(task);
    }
  }

  @Override
  protected void printHandling(Task req) {
    super.printHandling(req);
  }

  @Override
  public String toString() {
    return "程序猿";
  }
}
