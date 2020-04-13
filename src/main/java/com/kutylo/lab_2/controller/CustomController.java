package com.kutylo.lab_2.controller;

import com.kutylo.lab_2.dao.CustomDao;
import com.kutylo.lab_2.dto.customDto.CustomDto;
import com.kutylo.lab_2.dto.customDto.NewCustomDto;
import com.kutylo.lab_2.service.CustomService;
import com.kutylo.lab_2.service.impl.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customs")
public class CustomController {

    @Autowired
    CustomDao customDao;
    @Autowired
    private CustomService customService;
    @Autowired
    private StatusService statusService;

    @GetMapping("/")
    public ResponseEntity<List<CustomDto>> getAllCustoms (){
        return new ResponseEntity<>(customService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomDto> getById(@RequestBody @PathVariable int id){
        return new ResponseEntity<>(customService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/{id}/user")
    public ResponseEntity<List<CustomDto>> getByUserId(@RequestBody @PathVariable int id){
        return new ResponseEntity<>(customService.getByUserId(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<CustomDto> createCustom(@RequestBody NewCustomDto customDto){
        return new ResponseEntity<>(customService.makeCustom(customDto), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomDto> updateCustom(@RequestBody NewCustomDto customDto,@PathVariable int id) {
        return new ResponseEntity<>(customService.update(customDto,id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteCustom(@PathVariable int id) {
        customService.delete(id);
    }

    @PostMapping(value = "id/status",params = {"id","status"})
    public ResponseEntity<CustomDto> changeStatus(@RequestParam("id") int id, @RequestParam("status") String status){
        return new ResponseEntity<>(statusService.setStatus(id,status), HttpStatus.OK);
    }
}
