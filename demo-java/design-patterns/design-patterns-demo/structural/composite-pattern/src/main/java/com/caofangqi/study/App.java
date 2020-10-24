package com.caofangqi.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 组合模式
 */
public class App {
private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    LOGGER.info("Message from the orcs: ");

    LetterComposite orcMessage = new Messenger().messageFromOrcs();
    orcMessage.print();
    System.out.println();
    LOGGER.info("\nMessage from the elves: ");

    LetterComposite elfMessage = new Messenger().messageFromElves();
    elfMessage.print();
  }

}
