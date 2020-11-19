package com.cleveron.CHA.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ChildModel {

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double id;
    @ManyToOne
    private RootModel rootModel;
    @OneToMany
    private List<GrandChildModel> grandChildModels;
}
