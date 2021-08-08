package br.com.kururabrewery.service;

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
}
