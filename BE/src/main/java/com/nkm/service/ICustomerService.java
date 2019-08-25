package com.nkm.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.nkm.api.input.building.AssignmentCustomerInput;
import com.nkm.builder.CustomerSearchBuilder;
import com.nkm.dto.AssignmentCustomerDTO;
import com.nkm.dto.CustomerDTO;

public interface ICustomerService {
	CustomerDTO save(CustomerDTO customerDTO);
	List<CustomerDTO> findAll(CustomerSearchBuilder builder, Pageable pageable);
	CustomerDTO findById(Long id);
	void deleteCustomers(Long[] ids);
	int count(CustomerSearchBuilder builder);
	void handoverBuilding(AssignmentCustomerInput ass);
	List<AssignmentCustomerDTO> findAllByKeyAndId(Long id, String key);
	void activityUpdate(AssignmentCustomerDTO dto);
}
