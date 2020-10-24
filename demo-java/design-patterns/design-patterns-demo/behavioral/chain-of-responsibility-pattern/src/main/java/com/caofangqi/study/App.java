package com.caofangqi.study;

/**
 * 责任链模式 应用主类
 *  模拟现实场景，
 *    项目经理 发出任务  架构师 -> 产品经理-> 程序员
 */
public class App {


  public static void main(String[] args) {

    ProjectManager projectManager=new ProjectManager();
    projectManager.disposeTask(new Task(TaskType.ANALYZE_DEMAND,"分析登录功能"));
    projectManager.disposeTask(new Task(TaskType.DESIGN_ARCHITECTURE,"设计系统架构"));
    projectManager.disposeTask(new Task(TaskType.CODEING,"写出登录功能"));

  }

}
