package br.com.kururabrewery.service;

import br.com.kururabrewery.web.model.BeerDto;
import br.com.kururabrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Jonh Doe")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto beerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Jonh Doe")
                .build();
    }

    @Override
    public void updateCustomer(CustomerDto beerDto) {
        // TODO: update customer
    }

    @Override
    public void deleteCustomer(UUID id) {
        // TODO: delete a customer
    }
}
