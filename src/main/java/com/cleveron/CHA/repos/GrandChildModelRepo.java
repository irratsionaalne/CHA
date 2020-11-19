package com.cleveron.CHA.repos;

import com.cleveron.CHA.models.GrandChildModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrandChildModelRepo extends JpaRepository<GrandChildModel, String> {
}
