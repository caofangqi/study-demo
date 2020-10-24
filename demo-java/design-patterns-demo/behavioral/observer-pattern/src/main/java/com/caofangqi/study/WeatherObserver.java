package com.caofangqi.study;
/**
 * 天气观察者
 */
public interface WeatherObserver {
  void update(WeatherType currentWeather);
}
