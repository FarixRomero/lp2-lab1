Drop  table if exists RecetaMedica;
Drop table if exists Medicamento;
Drop table if exists LineaRecetaMedica;

CREATE TABLE RecetaMedica(
	id_recetaMedica INT AUTO_INCREMENT,    
    fid_diagnostico INT,
	cod_receta VARCHAR(90),
    PRIMARY KEY(id_recetaMedica),
	FOREIGN KEY(fid_diagnostico) REFERENCES Diagnostico(id_diagnostico)
)ENGINE=InnoDB;

CREATE TABLE Medicamento(
	id_medicamento INT AUTO_INCREMENT,
    codigo VARCHAR(50),
	nombre VARCHAR(90),
    PRIMARY KEY(id_medicamento)
)ENGINE=InnoDB;

CREATE TABLE LineaRecetaMedica(
	id_lineaRecetaMedica INT AUTO_INCREMENT,  
    fid_recetaMedica INT,
    fid_medicamento INT,
    cantidad INT,
    PRIMARY KEY(id_lineaRecetaMedica),
	FOREIGN KEY(fid_medicamento) REFERENCES Medicamento(id_medicamento),
    FOREIGN KEY(fid_recetaMedica) REFERENCES RecetaMedica(id_recetaMedica)
)ENGINE=InnoDB;




-- CREATE TABLE RecetaMedicaLineaRecetaMedica(
-- 	id_recetaMedica_lineaMedico INT AUTO_INCREMENT,   
--     fid_recetaMedica INT,
-- 	fid_lineaRecetaMedica INT,
--     PRIMARY KEY(id_recetaMedica_lineaMedico),
-- 	FOREIGN KEY(fid_recetaMedica) REFERENCES RecetaMedica(id_recetaMedica),
--     FOREIGN KEY(fid_lineaRecetaMedica) REFERENCES LineaRecetaMedica(id_lineaRecetaMedica)
-- )ENGINE=InnoDB;



