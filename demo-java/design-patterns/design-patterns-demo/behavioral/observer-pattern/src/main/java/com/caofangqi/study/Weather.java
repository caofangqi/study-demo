package com.caofangqi.study;

import java.util.LinkedList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 天气
 */
public class Weather {

  private static final Logger LOGGER = LoggerFactory.getLogger(Weather.class);

  /**
   * 当前天气
   */
  private WeatherType currentWeather;

  /**
   * 观察者
   */
  private List<WeatherObserver> observers;


  public Weather() {
    currentWeather = WeatherType.SUNNY;
    observers = new LinkedList<>();
  }


  /**
   * 添加观察者
   */
  public void addObserver(WeatherObserver observer) {
    observers.add(observer);
  }

  /**
   * 删除观察者
   */
  public void removeObserver(WeatherObserver observer) {
    observers.remove(observer);
  }

  /**
   * 改变天气
   */
  public void timePasses() {
    WeatherType[] enumValues = WeatherType.values();
    currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
    LOGGER.info("=================随着时间的流逝，天气变成了 {}   ====================", currentWeather);
    notifyObservers();
  }

  private void notifyObservers(){
    observers.forEach(o->o.update(currentWeather));
  }

}
