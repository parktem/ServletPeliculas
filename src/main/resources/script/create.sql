create table IF NOT EXISTS Pelicula(
	codPelicula INT,
	titulo varchar(25),
	codDirector INT,
	PRIMARY KEY (codPelicula),
	FOREIGN KEY (codDirector) REFERENCES Director(codDirector)
);

create table IF NOT EXISTS Director(
	codDirector int IDENTITY,
	nomDirector varchar(25),
	PRIMARY KEY (codDirector)
);