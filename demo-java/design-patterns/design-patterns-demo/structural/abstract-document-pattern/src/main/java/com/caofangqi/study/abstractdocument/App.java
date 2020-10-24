package com.caofangqi.study.abstractdocument;


import com.caofangqi.study.abstractdocument.domain.Car;
import com.caofangqi.study.abstractdocument.domain.HasModel;
import com.caofangqi.study.abstractdocument.domain.HasParts;
import com.caofangqi.study.abstractdocument.domain.HasPrice;
import com.caofangqi.study.abstractdocument.domain.HasType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Abstract Document pattern enables handling additional, non-static properties. This pattern
 * uses concept of traits to enable type safety and separate properties of different classes into
 * set of interfaces.
 * <p>
 * <p>
 * In Abstract Document pattern,({@link AbstractDocument}) fully implements {@link Document})
 * interface. Traits are then defined to enable access to properties in usual, static way.
 *
 * @author : Cao FangQi
 * @date : Created in 10:15 2019/5/21
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

public App(){
  LOGGER.info("Constructing parts and car");

  Map<String, Object> carProperties = new HashMap<>();
  carProperties.put(HasModel.PROPERTY, "300SL");
  carProperties.put(HasPrice.PROPERTY, 10000L);

  Map<String, Object> wheelProperties = new HashMap<>();
  wheelProperties.put(HasType.PROPERTY, "wheel");
  wheelProperties.put(HasModel.PROPERTY, "15C");
  wheelProperties.put(HasPrice.PROPERTY, 100L);

  Map<String, Object> doorProperties = new HashMap<>();
  doorProperties.put(HasType.PROPERTY, "door");
  doorProperties.put(HasModel.PROPERTY, "Lambo");
  doorProperties.put(HasPrice.PROPERTY, 300L);

  carProperties.put(HasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties));

  Car car = new Car(carProperties);

  LOGGER.info("Here is our car:");
  LOGGER.info("-> model: {}", car.getModel().get());
  LOGGER.info("-> price: {}", car.getPrice().get());
  LOGGER.info("-> parts: ");
  car.getParts().forEach(p -> LOGGER.info("\t{}/{}/{}", p.getType().get(), p.getModel().get(), p.getPrice().get()));
}
  public static void main(String[] args) {
   new App();
  }

}
