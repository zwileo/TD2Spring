package com.inti.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.SpringTest.Service.ProduitService;
import com.inti.SpringTest.model.Produit;

@Controller
@RequestMapping("produit")
public class ProduitController {
	
	@Autowired
	ProduitService ps;

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
	
	
	@GetMapping("ajout")
	public String ajoutProduit()
	{
		return "ajoutProduit"; 
		
	}
	
	@PostMapping("saveProduit")
	public String enregistrerProduit(@ModelAttribute("prod") Produit p)
	{
		ps.saveProduit(p);
		return "redirect:/produit/ajout";

	}
	
		public String afficherProduits(Model m)
		{
		m.addAttribute("listeP", ps.getProduits());
		return "afficherProduits";
		}
		
		
	@GetMapping("deleteProduit/{id}")	
	public String deleteProduit(@PathVariable int id)
	{
		ps.deleteProduit(id);
		return "redirect:/produit/afficherProduits";
	}
	
	
	@GetMapping("getProduit/{id}")
	public String getProduit(@PathVariable int id, Model m)
	{
		m.addAttribute("produit", ps.getProduit(id));
		return "updateProduit";
	}

}
