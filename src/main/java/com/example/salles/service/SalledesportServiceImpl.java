package com.example.salles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.salles.entities.SalledesportApplication;
import com.example.salles.repos.SalledesportRepository;
@Service
public class SalledesportServiceImpl implements SalledesportService{
	
	
	@Autowired
	SalledesportRepository salleRepository;
	

	@Override
	public SalledesportApplication saveProduit(SalledesportApplication s) {

		return salleRepository.save(s);
	}

	@Override
	public SalledesportApplication updateProduit(SalledesportApplication s) {
		// TODO Auto-generated method stub
		return salleRepository.save(s);	}

	@Override
	public void deleteSalle(SalledesportApplication s) {
		salleRepository.delete(s);		
	}

	@Override
	public void deleteSalleById(Long id) {
		salleRepository.deleteById(id);		
	}

	@Override
	public SalledesportApplication getSalle(Long id) {
		return salleRepository.findById(id).get();
	}

	@Override
	public List<SalledesportApplication> getAllSalles() {

		return salleRepository.findAll();
	}

}
