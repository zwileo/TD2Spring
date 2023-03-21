package com.inti.SpringTest.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inti.SpringTest.model.Produit;

@Service
public interface ProduitService {
	
	public void saveProduit(Produit p);
	public List<Produit> getProduits();
	public void deleteProduit(int id);
	public Produit getProduit(int id);
	
	
}
