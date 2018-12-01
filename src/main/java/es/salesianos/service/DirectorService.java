package es.salesianos.service;

import es.salesianos.model.Director;
import es.salesianos.repository.Repository;

public class DirectorService {
	
	private Repository repository = new Repository();
	
	public void añadirDirector(Director director) {
		repository.insert(director);
	}

}
