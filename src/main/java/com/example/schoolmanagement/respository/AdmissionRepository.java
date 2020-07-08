/**
 * 
 */
package com.example.schoolmanagement.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.schoolmanagement.model.bo.AdmissionBO;

/**
 * @author laxma
 *
 */
@Repository
public interface AdmissionRepository extends JpaRepository<AdmissionBO, Integer> {
	Optional<AdmissionBO> findById(Integer id);
	
	
}
