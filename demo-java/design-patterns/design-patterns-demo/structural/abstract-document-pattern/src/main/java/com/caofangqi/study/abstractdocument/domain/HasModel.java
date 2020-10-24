package com.caofangqi.study.abstractdocument.domain;

import com.caofangqi.study.abstractdocument.Document;
import java.util.Optional;

public interface HasModel extends Document {

  String PROPERTY = "model";

  default Optional<String> getModel() {
    return Optional.ofNullable((String) get(PROPERTY));
  }
}
