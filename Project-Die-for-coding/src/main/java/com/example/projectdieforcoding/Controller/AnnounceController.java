package com.example.projectdieforcoding.Controller;

import com.example.projectdieforcoding.Service.AnnounceAllService;
import com.example.projectdieforcoding.dtos.SimpleAnnounceDTO;
import com.example.projectdieforcoding.entities.Announce;
import com.example.projectdieforcoding.utils.ListMapper;
import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5173/")
@RequestMapping("/api/announcements")
public class AnnounceController {
@Autowired
    private AnnounceAllService service;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ListMapper listMapper;
    @GetMapping("")
    public List<SimpleAnnounceDTO> getAnnounces() {
        List<Announce> announceList = service.getAnnounce();
        return listMapper.mapList(announceList,SimpleAnnounceDTO.class,modelMapper);
    }

    @GetMapping("/{announceId}")
    public SimpleAnnounceDTO getAnnounceById(@PathVariable Integer announceId){
        return modelMapper.map(service.getAnnounces(announceId),SimpleAnnounceDTO.class);

    }




//    @GetMapping
//    public List<SimpleAnnounceDTO> getSimpleAnnounce(){
//        List<Announce> announceList= service.getAnnounce();
//        return listMapper.mapList(announceList,SimpleAnnounceDTO.class, modelMapper);
//    }


}
