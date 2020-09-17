package org.agoncal.fascicle.quarkus.reactive.messages.model;

import javax.json.bind.annotation.JsonbProperty;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class OrderLine {

  public String item;
  @JsonbProperty("unit_price")
  public Double unitPrice;
  public Integer quantity;

  public OrderLine() {
  }

  public OrderLine(String item, Double unitPrice, Integer quantity) {
    this.item = item;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }
}
