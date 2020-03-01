package com.kutylo.lab_2.controller;

import com.kutylo.lab_2.dto.FullPlanDto;
import com.kutylo.lab_2.dto.PlanDto;
import com.kutylo.lab_2.dto.TeamDto;
import com.kutylo.lab_2.model.Plan;
import com.kutylo.lab_2.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/plans")
public class PlanController {

    @Autowired
    PlanService planService;

    @GetMapping("/")
    public ResponseEntity<List<PlanDto>> getAllPlans (){
        return new ResponseEntity<>(planService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}/fullPlan")
    public ResponseEntity<FullPlanDto> getFullPlan (@RequestBody @PathVariable int id){
        return new ResponseEntity<>(planService.getFullPlan(id), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<PlanDto> getById(@RequestBody @PathVariable int id){
        return new ResponseEntity<>(planService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<PlanDto> create(@RequestBody PlanDto planDto){
        return new ResponseEntity<>(planService.save(planDto), HttpStatus.OK);
    }
}
