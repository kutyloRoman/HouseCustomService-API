package com.kutylo.lab_2.controller;

import com.kutylo.lab_2.dto.teamDto.NewTeamDto;
import com.kutylo.lab_2.dto.teamDto.TeamDto;
import com.kutylo.lab_2.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teams")
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping("/")
    public ResponseEntity<List<TeamDto>> getAllTeams (){
        return new ResponseEntity<>(teamService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamDto> getById(@RequestBody @PathVariable int id){
        return new ResponseEntity<>(teamService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<TeamDto> create(@RequestBody NewTeamDto teamDto){
        return new ResponseEntity<>(teamService.save(teamDto), HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<TeamDto> update(@RequestBody TeamDto teamDto){
        return new ResponseEntity<>(teamService.update(teamDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(int id){
        teamService.delete(id);
    }
}
