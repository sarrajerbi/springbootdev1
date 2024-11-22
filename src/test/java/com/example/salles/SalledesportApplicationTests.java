package com.example.salles;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.salles.entities.SalledesportApplication;
import com.example.salles.repos.SalledesportRepository;

@SpringBootTest
class SalledesportApplicationTests {
	@Autowired
	private SalledesportRepository salleRepository;
	@Test
	public void testCreateProduit() {
	SalledesportApplication salle = new SalledesportApplication("Fitness",40,new Date());
	salleRepository.save(salle);
}
	@Test
	public void testFindSalle()
	{
	SalledesportApplication s = salleRepository.findById(1L).get();
	System.out.println(s);
	}
	@Test
	public void testUpdateSalle()
	{
		SalledesportApplication s = salleRepository.findById(1L).get();
	s.setCapacitesalledesport(20.0);
	salleRepository.save(s);
	}
	@Test
	public void testDeleteSalle()
	{
	salleRepository.deleteById(1L);;
	}
	@Test
	public void testDFindAllSalle()
	{
		List<SalledesportApplication> salles=salleRepository.findAll();
		for(SalledesportApplication s:salles)
		{
			System.out.println(s);
		}
	}

	
	}

	
