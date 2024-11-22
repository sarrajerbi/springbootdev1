package com.example.salles.service;

import java.util.List;

import com.example.salles.entities.SalledesportApplication;

public interface SalledesportService {
	SalledesportApplication saveProduit(SalledesportApplication s);
	SalledesportApplication updateProduit(SalledesportApplication s);
	void deleteSalle(SalledesportApplication s);
	 void deleteSalleById(Long id);
	 SalledesportApplication getSalle(Long id);
	List<SalledesportApplication> getAllSalles();
}
