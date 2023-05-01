package com.example.projectdieforcoding.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;
@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {
        @Id
        @Column(name = "categoryId")
        private Integer announcementCategoryId;
        @Column(name = "categoryName")
        private String announcementCategory;

//        @JsonIgnore
//        @OneToMany(mappedBy = "category")
//        private Set<Announce> announces = new LinkedHashSet<>();
}
