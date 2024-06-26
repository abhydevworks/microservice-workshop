package abhy.microservices.customer.domain;

import lombok.Data;

@Data
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private Integer pinCode;
}
