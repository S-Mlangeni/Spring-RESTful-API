package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.entity.OurEntity;

@Repository /* Declares this interface as a connection point to the database 
using the JpaRepository extension to take in the created table and its 
primary key variable type. */
public interface OurRepository extends JpaRepository<OurEntity, Long> {
	
	//Additional methods for searching database using the other table properties/columns:
	public OurEntity findByEmail(String useremail);
	public OurEntity findByPassword(String userpassword);
}
