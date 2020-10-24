package com.caofangqi.study;

/**
 * 任务模型
 */
public class Task {

  /**
   * 任务类型
   */
  private final TaskType taskType;


  /**
   * 任务描述
   */
  private final String taskDescription;

  /**
   * 是否完成任务 false 未完成 true 已完成
   */
  private  boolean handled;

  public void markHandled(){
   handled=true;
  }
  public Task(final TaskType taskType, final String taskDescription) {
    this.taskType = taskType;
    this.taskDescription = taskDescription;
  }

  public TaskType getTaskType() {
    return taskType;
  }

  public String getTaskDescription() {
    return taskDescription;
  }

  public boolean getHandled() {
    return handled;
  }

  @Override
  public String toString() {
    return getTaskDescription();
  }
}
