package com.stackroute.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    private int id;
    private BigDecimal budget;
    private String title;
    private String catagory;
    private double collection;
    private String language;
    private String poster_path;
    private String[] comments;
    //private Date releaseDate;


}
