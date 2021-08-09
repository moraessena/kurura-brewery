package br.com.kururabrewery.service.v1;

import br.com.kururabrewery.web.model.v1.CustomerDto;
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
