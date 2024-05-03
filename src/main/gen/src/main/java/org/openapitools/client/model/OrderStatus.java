/*
 * Iced Latte Order API
 * API allows users to access orders and related operations.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: zufar.sunagatov@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Order status: &#39;CREATED&#39; - new order recently created, &#39;DELIVERY&#39; - order was sent, &#39;FINISHED&#39; - order was delivered
 */
@JsonAdapter(OrderStatus.Adapter.class)
public enum OrderStatus {
  
  CREATED("CREATED"),
  
  DELIVERY("DELIVERY"),
  
  FINISHED("FINISHED");

  private String value;

  OrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderStatus fromValue(String value) {
    for (OrderStatus b : OrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderStatus.fromValue(value);
    }
  }
}

