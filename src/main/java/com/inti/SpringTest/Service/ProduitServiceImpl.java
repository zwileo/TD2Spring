package com.inti.SpringTest.Service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.inti.SpringTest.model.Produit;
import com.inti.SpringTest.util.HibernateUtil;

@Service
public class ProduitServiceImpl implements ProduitService {
	
	private static Session sess = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public void saveProduit(Produit p)
	{
		try {
			
			
			sess.beginTransaction();
			
			sess.save(p);
			
			sess.getTransaction().commit();
			
		} catch (Exception e) {

			sess.getTransaction().rollback();
		}
	}

	@Override
	public List<Produit> getProduits() {
		List<Produit> listeProduits = null;
		
		try 
		{
			
			sess.beginTransaction();
			
			sess.createQuery("from Produit", Produit.class).list();
			
			sess.getTransaction().commit();
			
		} catch (Exception e) {
			
			sess.getTransaction().rollback();
		}
		
		return null;
	}

	@Override
	public void deleteProduit(int id) {
		
		try 
		{
			
			sess.beginTransaction();
			
			sess.delete(sess.get(Produit.class, id));
			
			sess.getTransaction().commit();
			
		} catch (Exception e) {
			
			sess.getTransaction().rollback();
		}
		
	}

	@Override
	public Produit getProduit(int id) {
		
		try 
		{
			
			sess.beginTransaction();
			
			sess.get(Produit.class , id);
			
			sess.getTransaction().commit();
			
		} catch (Exception e) {
			
			sess.getTransaction().rollback();
		}
		
		return null;
	}
	
	
	
	

}
