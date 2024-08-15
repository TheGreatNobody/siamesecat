package com.nobody.siamesecat.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.nobody.siamesecat.model.vo.CountryPo;

@Repository
public interface CountryRepository extends JpaRepository<CountryPo, String> {

}
