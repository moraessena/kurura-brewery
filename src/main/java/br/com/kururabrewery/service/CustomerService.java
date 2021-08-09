package br.com.kururabrewery.service;

import br.com.kururabrewery.web.model.BeerDto;
import br.com.kururabrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID id);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateCustomer(CustomerDto customerDto);

    void deleteCustomer(UUID id);
}
