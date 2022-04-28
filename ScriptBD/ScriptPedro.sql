DROP TABLE IF EXISTS Comentario;
DROP TABLE IF EXISTS Chat;
DROP TABLE IF EXISTS HistorialClinico;


CREATE TABLE Comentario (
    id_comentario INT,
    descripcion VARCHAR(50),
    fecha_comentario DATE,
    fid_medico INT,
    PRIMARY KEY(id_comentario),
    FOREIGN KEY(fid_medico) REFERENCES Medico(id_medico)
) ENGINE = InnoDB;

CREATE TABLE Chat (
    id_chat INT,
    comentario VARCHAR(200),
    fecha DATE,
    emisor VARCHAR(50),
    hora TIME,
    fid_medico INT,
    fid_paciente INT,
    PRIMARY KEY(id_chat),
    FOREIGN KEY(fid_medico) REFERENCES Medico(id_medico),
    FOREIGN KEY(fid_paciente) REFERENCES Paciente(id_paciente)
) ENGINE = InnoDB;

CREATE TABLE HistorialClinico (
    id_historia INT NOT NULL AUTO_INCREMENT,
    fid_paciente INT,
    PRIMARY KEY(id_historia),
    FOREIGN KEY(fid_paciente) REFERENCES Paciente(id_paciente)
) ENGINE = InnoDB;
