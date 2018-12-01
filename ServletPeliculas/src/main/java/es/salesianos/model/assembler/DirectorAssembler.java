package es.salesianos.model.assembler;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.model.Director;

public class DirectorAssembler {

	
	public static Director assemblerDirector(HttpServletRequest req) {
		Director director = new Director();
		String nombre = req.getParameter("nomDirector");
		director.setNomDirector(nombre);
		return director;
	}
	
}
