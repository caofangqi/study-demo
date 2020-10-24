package com.caofangqi.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class People implements WeatherObserver {

  public static final Logger LOGGER = LoggerFactory.getLogger(People.class);

  @Override
  public void update(WeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        LOGGER.info("寒冷的天气，人们都在床上睡懒觉。。。。。。。。");
        break;
      case GALE:
        LOGGER.info("大风呼啸，人们被风推着走。。。。。。。。。");
        break;
      case RAINY:
        LOGGER.info("下雨了，人们被淋成了落汤鸡。。。。。。。。");
        break;
      case SUNNY:
        LOGGER.info("眼光明媚，人们都出门打王者了。。。。");
    }
  }
}
