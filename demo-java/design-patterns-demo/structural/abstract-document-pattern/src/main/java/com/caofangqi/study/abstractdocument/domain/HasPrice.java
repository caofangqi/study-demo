package com.caofangqi.study.abstractdocument.domain;

import com.caofangqi.study.abstractdocument.Document;
import java.util.Optional;

public interface HasPrice extends Document {

  String PROPERTY = "price";

  default Optional<Number> getPrice() {
    return Optional.ofNullable((Number) get(PROPERTY));
  }
}
