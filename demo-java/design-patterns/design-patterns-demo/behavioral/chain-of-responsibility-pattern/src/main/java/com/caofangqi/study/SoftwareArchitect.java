package com.caofangqi.study;
/**
 * 架构师
 */
public class SoftwareArchitect extends TaskHandler {


  public SoftwareArchitect(TaskHandler taskHandler) {
    super(taskHandler);
  }

  @Override
  public void handleTask(Task task) {
    if (TaskType.DESIGN_ARCHITECTURE.equals(task.getTaskType())){
      printHandling(task);
      task.markHandled();
    }else {
      super.handleTask(task);

    }
  }

  @Override
  public String toString() {
    return "架构师";
  }
}
