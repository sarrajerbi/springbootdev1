package com.example.salles.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@SpringBootApplication
public class SalledesportApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idsalledesport;
	private String nomsalledesport;
	private Double capacitesalledesport;
	private Date dateCreation;
	
	public Long getIdsalledesport() {
		return idsalledesport;
	}
	public void setIdsalledesport(Long idsalledesport) {
		this.idsalledesport = idsalledesport;
	}
	public String getNomsalledesport() {
		return nomsalledesport;
	}
	public void setNomsalledesport(String nomsalledesport) {
		this.nomsalledesport = nomsalledesport;
	}
	public Double getCapacitesalledesport() {
		return capacitesalledesport;
	}
	public void setCapacitesalledesport(Double capacitesalledesport) {
		this.capacitesalledesport = capacitesalledesport;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "SalledesportApplication [idsalledesport=" + idsalledesport + ", nomsalledesport=" + nomsalledesport
				+ ", capacitesalledesport=" + capacitesalledesport + ", dateCreation=" + dateCreation + "]";
	}
	public static void main(String[] args) {
		SpringApplication.run(SalledesportApplication.class, args);
	}
	public SalledesportApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalledesportApplication( String nomsalledesport, double capacitesalledesport,Date dateCreation) {
		super();
		this.nomsalledesport = nomsalledesport;
		this.capacitesalledesport = capacitesalledesport;
		this.dateCreation = dateCreation;
	}

}
