package com.caofangqi.study.abstractdocument.domain;

import com.caofangqi.study.abstractdocument.AbstractDocument;
import java.util.Map;

public class Part extends AbstractDocument implements HasType, HasPrice,HasModel {

  public Part(Map<String, Object> properties) {
    super(properties);
  }

}
