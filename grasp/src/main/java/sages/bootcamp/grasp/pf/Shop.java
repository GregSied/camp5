package sages.bootcamp.grasp.pf;

import java.util.Map;

public class Shop {
  String name;
  Map<String, Integer> productToPrice;

  String displayProducts() {
    // some code to display
    return null;
  }

  Integer getPrice(String product) {
    return productToPrice.get(product);
  }

  void saveInDatabase() {
    // saving in database
  }

}
