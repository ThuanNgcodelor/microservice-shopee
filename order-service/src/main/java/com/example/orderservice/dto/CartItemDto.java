package com.example.orderservice.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartItemDto {
    private String id;
    private int quantity;
    private double unitPrice;
    private double totalPrice;
    private String productId;
    private String cartId;
}
