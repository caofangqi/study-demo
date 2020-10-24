package com.caofangqi.study;

public class ProjectManager {

  TaskHandler chain;

  public ProjectManager(){
    buildChain();
  }

  private void buildChain(){
   chain=new ProductManager(new SoftwareArchitect(new Programmer(null)));
  }
  public void disposeTask(Task t){
    chain.handleTask(t);
  }
}
