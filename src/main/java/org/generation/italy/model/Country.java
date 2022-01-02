package org.generation.italy.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_id")
	private Integer id;
	private String name;
	private BigDecimal area;
	@Column(name="national_day", columnDefinition = "DATE")
	private LocalDate nationalDay;
	private String countryCode2;
	private String countryCode3;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="region_id")
	private Region region;
	
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
        name = "country_languages", 
        joinColumns = { @JoinColumn(name = "country_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "language_id") }
    )
	private Set<Language> languages;
	
	
	
	
	public Set<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	public LocalDate getNationalDay() {
		return nationalDay;
	}
	public void setNationalDay(LocalDate nationalDay) {
		this.nationalDay = nationalDay;
	}
	public String getCountryCode2() {
		return countryCode2;
	}
	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}
	public String getCountryCode3() {
		return countryCode3;
	}
	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	
}
