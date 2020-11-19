package com.cleveron.CHA.services;

import com.cleveron.CHA.models.ChildModel;
import com.cleveron.CHA.models.GrandChildModel;
import com.cleveron.CHA.models.RootModel;

public interface ModelService {

    boolean createRootModel(RootModel rootModel);
    boolean createChildModel(ChildModel childModel);
    boolean createGrandChildModel(GrandChildModel grandChildModel);
}
