package com.inti.SpringTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("produit")
public class ProduitController {
	

	@GetMapping("affichage")
	public String affichageNomProduit(@RequestParam("nomP") String nom, Model m)
	{
		
		//nomP: ce qu'on récupère sur la page et nom : ce qu'on envoie
		m.addAttribute("nomP", nom);
		
		//appeler la page 
		return "afficherNomProduit";
	}
	
	
	@GetMapping("prix")
	public String affichagePrixProduit(@RequestParam(value = "prixP", required = true, defaultValue = "4687") double prix, Model m)
	{
		m.addAttribute("prixP", prix);
		return "afficherPrixProduit";
	}
	
	
}
