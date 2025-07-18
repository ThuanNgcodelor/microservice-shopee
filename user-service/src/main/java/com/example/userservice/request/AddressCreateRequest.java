package com.example.userservice.request;

import lombok.Data;

@Data
public class AddressCreateRequest {
    public String userId;
    public String recipientName;
    public String recipientPhone;
    public String province;
    public String streetAddress;
    public Boolean isDefault;
}
