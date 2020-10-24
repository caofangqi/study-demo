package com.caofangqi.study.abstractdocument.domain;

import com.caofangqi.study.abstractdocument.AbstractDocument;
import java.util.Map;

public class Car extends AbstractDocument implements HasModel,HasPrice,HasParts {

  public Car(Map<String, Object> properties) {
    super(properties);

  }
}
