package com.example.stockservice.request.cart;

import lombok.Data;

import java.util.List;

@Data
public class RemoveCartItemRequest {
    public String cartId;
    public List<String> productIds;
}
