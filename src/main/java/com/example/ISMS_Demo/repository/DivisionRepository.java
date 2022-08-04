package com.example.ISMS_Demo.repository;

import com.example.ISMS_Demo.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DivisionRepository extends CrudRepository<Division, Long> {
    List<Division> findAllByDivisionId(Integer id);
    Division findByDivisionId(long id);
}
