package es.salesianos.model;

public class Director {

	/*create table IF NOT EXISTS Directores(
	codDirector int,
	nomDirector INT,
	codPelicula int,
	PRIMARY KEY (codDirector),
	FOREIGN KEY (codPelicula) REFERENCES PELICULAS(codPelicula)
);*/
	
	private int codDirector;
	private String nomDirector;
	
	public int getCodDirector() {
		return codDirector;
	}
	
	public void setCodDirector(int codDirector) {
		this.codDirector = codDirector;
	}
	
	public String getNomDirector() {
		return nomDirector;
	}
	
	public void setNomDirector(String nomDirector) {
		this.nomDirector = nomDirector;
	}
	
	
}
