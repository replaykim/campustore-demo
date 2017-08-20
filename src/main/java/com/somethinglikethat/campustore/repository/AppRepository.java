package com.somethinglikethat.campustore.repository;

import com.somethinglikethat.campustore.model.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<App, Long>{

}
