package com.caofangqi.study;

/**
 * 天气类型
 */
public enum WeatherType {
  /**
   * 阳光明媚
   */
  SUNNY("阳光明媚"),
  /**
   * 雨
   */
  RAINY("雨一直下"),
  /**
   * 寒冷
   */
  COLD("寒冷刺骨"),
  /**
   * 狂风
   */
  GALE("狂风呼啸");

  String name;

  WeatherType(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }}
