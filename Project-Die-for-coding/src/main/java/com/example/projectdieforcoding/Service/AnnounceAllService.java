package com.example.projectdieforcoding.Service;

import com.example.projectdieforcoding.Repository.AnnounceRepository;
import com.example.projectdieforcoding.dtos.SimpleAnnounceDTO;
import com.example.projectdieforcoding.entities.Announce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AnnounceAllService {
    @Autowired
    private AnnounceRepository repository;
    @Autowired
    private ModelMapper modelMapper;
    public List<Announce> getAnnounce(){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        return repository.findAll(sort);
    }
    public Announce getAnnounces(Integer announceId) {
        return repository.findById(announceId).orElseThrow(()
                -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                "Announcement id" + announceId + " does not exist"));
    }

//    public List<SimpleAnnounceDTO> getAnnounce() {
//        List<Announce> announces = repository.findAll();
//        List<SimpleAnnounceDTO> simpleAnnouces = new ArrayList<>();
//        for (Announce announce : announces) {
////            System.out.println(announce.getAnnounceDescription());
//            SimpleAnnounceDTO simpleAnnouce = modelMapper.map(announces, SimpleAnnounceDTO.class);
//            simpleAnnouces.add(simpleAnnouce);
//        }
//        return simpleAnnouces;
//    }
}
