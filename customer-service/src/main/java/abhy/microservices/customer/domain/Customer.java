package abhy.microservices.customer.domain;

import lombok.Data;

@Data
public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private Address address;
}
