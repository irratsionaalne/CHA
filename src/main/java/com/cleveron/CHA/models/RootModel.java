package com.cleveron.CHA.models;

import javax.persistence.*;
import java.util.List;


@Entity
public class RootModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double id;
    private String name;
    @OneToMany
    private List<ChildModel> childModels;

}
