package org.generation.italy.controllers;

import org.generation.italy.model.Country;
import org.generation.italy.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private CountryRepository repo;
	
	
	@GetMapping
	public String index(
				Model model,
				@RequestParam(defaultValue = "0") Integer pageNo, 
                @RequestParam(defaultValue = "10") Integer pageSize,
                @RequestParam(defaultValue = "name") String sortBy
               ) {
		model.addAttribute("countries", repo.findAll(Sort.by("name")));
		
		return "index";
	}
	
	@GetMapping("/country/{id}")
	public String country(@PathVariable Integer id, Model model) {
		Country c = repo.getById(id);
		model.addAttribute("country", c);
		model.addAttribute("region", c.getRegion().getName());
		model.addAttribute("continent", c.getRegion().getContinent().getName());
		model.addAttribute("languages", c.getLanguages());
		return "country";
	}
	
}
