package com.example.ISMS_Demo.repository;

import com.example.ISMS_Demo.entity.ISMSUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ISMSUser, Long> {

}
