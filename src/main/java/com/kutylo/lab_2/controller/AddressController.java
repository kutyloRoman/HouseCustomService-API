package com.kutylo.lab_2.controller;

import com.kutylo.lab_2.dto.addressDto.AddressDto;
import com.kutylo.lab_2.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> getAddressById(@PathVariable int id) {
        return new ResponseEntity<>(addressService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<AddressDto>> getAllAddress() {
        return new ResponseEntity<>(addressService.getAll(), HttpStatus.OK);
    }


}
