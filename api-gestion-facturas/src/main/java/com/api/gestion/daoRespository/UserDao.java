package com.api.gestion.daoRespository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.gestion.pojoEntity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
	User findByEmail(@Param(("email")) String email);
	

}
