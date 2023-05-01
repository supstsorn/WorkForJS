package com.example.projectdieforcoding.Repository;

import com.example.projectdieforcoding.entities.Announce;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnounceRepository extends JpaRepository<Announce,Integer> {
//    List<Announce> findAllAnnounce(Integer announceId);

}
