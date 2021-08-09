package br.com.kururabrewery.service.v1;

import br.com.kururabrewery.web.model.v1.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID id);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateCustomer(CustomerDto customerDto);

    void deleteCustomer(UUID id);
}
