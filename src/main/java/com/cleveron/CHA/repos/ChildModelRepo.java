package com.cleveron.CHA.repos;

import com.cleveron.CHA.models.ChildModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildModelRepo extends JpaRepository<ChildModel, String> {
}
