package com.iset.test;
import com.iset.dao.ClientDao;
import com.iset.entities.Client;
public class ClientTest {
public static void main(String[] args) {
//créer un objet client
	Client c = new Client();
	c.setNom("Gaouet Ayoub");
	c.setVille("Nabeul");
//ajouter l'objet client à la BD
	ClientDao cltDao = new ClientDao();
	cltDao.ajouter(c);
	System.out.println("Appel de la méthode listerTous");
	for (Client cl : cltDao.listerTous())
		System.out.println(cl.getCode()+" "+cl.getNom()+""+cl.getVille());
	System.out.println("Appel de la méthode listerParNom");
	for (Client cl : cltDao.listerParNom("ayou"))
		System.out.println(cl.getCode()+" "+cl.getNom()+""+cl.getVille());
//tester les autres méthodes de la classe ClientDao
}
}