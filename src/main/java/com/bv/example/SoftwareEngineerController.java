package com.bv.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService){
        this.softwareEngineerService = softwareEngineerService;
    }


    @GetMapping("/get")
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getSoftwareEngineer();
    }

    @PostMapping
    public void setSoftwareEngineerService(SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
