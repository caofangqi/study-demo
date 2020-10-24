package com.caofangqi.study.abstractdocument.domain;

import com.caofangqi.study.abstractdocument.Document;
import java.util.stream.Stream;

public interface HasParts extends Document {

  String PROPERTY = "parts";

  default Stream<Part> getParts(){
      return children(PROPERTY,Part::new);
  }

}
