package com.caofangqi.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cat implements WeatherObserver {

  public static final Logger LOGGER = LoggerFactory.getLogger(Cat.class);

  @Override
  public void update(WeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        LOGGER.info("寒冷的天，小猫冻得瑟瑟发抖。。。。。。。。");
        break;
      case GALE:
        LOGGER.info("大风呼啸，小猫被吹得滚来滚去。。。。。。。。。");
        break;
      case RAINY:
        LOGGER.info("下雨了，小猫顺便洗了个澡");
        break;
      case SUNNY:
        LOGGER.info("眼光明媚，小猫的春天也到了。。。。");
    }
  }
}
