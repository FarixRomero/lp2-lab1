DROP TABLE IF EXISTS Paciente;
DROP TABLE IF EXISTS CitaMedica;
DROP TABLE IF EXISTS Diagnostico;

CREATE TABLE Paciente(
	id_paciente int AUTO_INCREMENT,
    seguro bool,
    fid_usuario int,
    PRIMARY KEY(id_paciente),
    FOREIGN KEY	(fid_usuario) REFERENCES Usuario(id_usuario)
)ENGINE = InnoDB;

CREATE TABLE CitaMedica (
	id_cita int AUTO_INCREMENT,
    fid_paciente int,
    fecha Date,
    PRIMARY KEY(id_cita),
    FOREIGN KEY (fid_paciente) REFERENCES Paciente(id_paciente)
)ENGINE = InnoDB;

CREATE TABLE Diagnostico(
	id_diagnostico int AUTO_INCREMENT,
    fid_cita int,
    resultado varchar(100),
    observacion varchar(100),
    PRIMARY KEY (id_diagnostico),
    FOREIGN KEY (fid_cita) REFERENCES CitaMedica(id_cita)
)ENGINE = InnoDB;
