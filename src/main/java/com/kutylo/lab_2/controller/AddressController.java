package com.kutylo.lab_2.controller;

import com.kutylo.lab_2.dao.AddressDao;
import com.kutylo.lab_2.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/addresses")
public class AddressController {
    @Autowired
    AddressDao addressDao;

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById( @PathVariable int id) {
        return new ResponseEntity<>(addressDao.getById(id), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Address>> getAllAddress() {
        return new ResponseEntity<>(addressDao.getAll(), HttpStatus.OK);
    }


}
