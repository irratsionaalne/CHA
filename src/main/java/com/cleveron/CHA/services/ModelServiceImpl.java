package com.cleveron.CHA.services;

import com.cleveron.CHA.models.ChildModel;
import com.cleveron.CHA.models.GrandChildModel;
import com.cleveron.CHA.models.RootModel;
import com.cleveron.CHA.repos.ChildModelRepo;
import com.cleveron.CHA.repos.GrandChildModelRepo;
import com.cleveron.CHA.repos.RootModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private RootModelRepo rootModelRepo;
    @Autowired
    private ChildModelRepo childModelRepo;
    @Autowired
    private GrandChildModelRepo grandChildModelRepo;

    @Override
    public boolean createRootModel(RootModel rootModel){
        rootModelRepo.save(rootModel);
        return true;
    }

    @Override
    public boolean createChildModel(ChildModel childModel){
        childModelRepo.save(childModel);
        return true;
    }

    @Override
    public boolean createGrandChildModel(GrandChildModel grandChildModel){
        grandChildModelRepo.save(grandChildModel);
        return true;
    }
}
