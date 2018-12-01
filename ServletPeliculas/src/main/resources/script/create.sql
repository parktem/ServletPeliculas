create table IF NOT EXISTS Peliculas(
	codPelicula INT IDENTITY,
	titulo varchar(25),
	PRIMARY KEY (codPelicula)
);

create table IF NOT EXISTS Directores(
	codDirector int,
	nomDirector INT,
	codPelicula int,
	PRIMARY KEY (codDirector),
	FOREIGN KEY (codPelicula) REFERENCES PELICULAS(codPelicula)
);