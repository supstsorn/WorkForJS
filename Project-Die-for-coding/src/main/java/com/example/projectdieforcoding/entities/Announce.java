package com.example.projectdieforcoding.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;

import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name = "announce")
@Getter
@Setter
public class Announce {
    @Id
    @Column(name = "announceId")
    private Integer id;
    @Column(name = "announceTitle")
    private String  announcementTitle;
    @Column(name = "announceDescription")
    private String announcementDescription;
    @Column(name = "publishDate")
    private ZonedDateTime publishDate;
    @Column(name = "closeDate")
    private ZonedDateTime closeDate;
    @Column(name = "announceDisplay")
    private String announcementDisplay ;
    @Column(name = "categoryId")
    private Integer announcementCategoryId;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;
}
