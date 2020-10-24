package com.caofangqi.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 任务处理器
 */
public abstract class TaskHandler {

  private static final Logger  LOGGER= LoggerFactory.getLogger(TaskHandler.class);

  private TaskHandler next;

  public TaskHandler(TaskHandler taskHandler){
    this.next=taskHandler;
  }

  public void handleTask(Task task){
    if (next!=null){
      next.handleTask(task);
    }
  }

  protected void printHandling(Task req) {
    LOGGER.info("{} handling task \"{}\"", this, req);

  }


  @Override
  public abstract String toString();
}
