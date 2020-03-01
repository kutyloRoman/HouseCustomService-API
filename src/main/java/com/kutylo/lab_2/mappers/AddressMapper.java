package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.dto.AddressDto;
import com.kutylo.lab_2.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper implements Mapper<Address, AddressDto> {
    @Override
    public Address convertToModel(AddressDto addressDto) {
        Address address=new Address();
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setBuild(addressDto.getBuild());
        return address;
    }

    @Override
    public AddressDto convertToDto(Address address) {
        AddressDto addressDto=new AddressDto();
        addressDto.setCity(address.getCity());
        addressDto.setStreet(address.getStreet());
        addressDto.setBuild(address.getBuild());
        return addressDto;
    }
}
