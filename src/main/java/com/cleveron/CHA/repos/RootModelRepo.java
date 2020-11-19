package com.cleveron.CHA.repos;

import com.cleveron.CHA.models.RootModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RootModelRepo extends JpaRepository<RootModel, String> {
}
