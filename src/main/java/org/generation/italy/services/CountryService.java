package org.generation.italy.services;


import org.generation.italy.model.Country;
import org.generation.italy.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	@Autowired
	private CountryRepository repository;
	

	public Page<Country> findAllPageable(Integer pageNo, Integer pageSize, String sortBy ){
		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		Page<Country> pagedResult = repository.findAll(paging);
		return pagedResult;
	}
	
}
