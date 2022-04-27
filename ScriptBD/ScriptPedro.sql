DROP TABLE IF EXISTS Comentario;
DROP TABLE IF EXISTS Chat;
DROP TABLE IF EXISTS HistorialClinico;


CREATE TABLE Comentario (
    descripcion VARCHAR(50),
    fecha_comentario DATE
) ENGINE = InnoDB;

CREATE TABLE Chat (
    comentario VARCHAR(200),
    fecha DATE,
    emisor VARCHAR(50),
    hora TIME
) ENGINE = InnoDB;

CREATE TABLE HistorialClinico (
    id_historia INT NOT NULL AUTO_INCREMENT,
    fid_paciente INT,
    PRIMARY KEY(id_historia),
    FOREIGN KEY(fid_paciente) REFERENCES Paciente(id_paciente)
) ENGINE = InnoDB;