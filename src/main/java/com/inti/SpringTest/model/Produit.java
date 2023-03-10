package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class Produit {
	
	private int id;
	private String nom;
	private String reference;
	private double prix; 
	private double poids;
	
	
	public Produit() {
		super();
	}


	public Produit(String nom, String reference, double prix, double poids) {
		super();
		this.nom = nom;
		this.reference = reference;
		this.prix = prix;
		this.poids = poids;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public double getPoids() {
		return poids;
	}


	public void setPoids(double poids) {
		this.poids = poids;
	}


	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", reference=" + reference + ", prix=" + prix + ", poids=" + poids
				+ "]";
	} 
	
	

}
