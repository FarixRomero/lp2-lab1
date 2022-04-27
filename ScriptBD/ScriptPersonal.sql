DROP TABLE IF EXISTS Medico;
DROP TABLE IF EXISTS Administrador;
DROP TABLE IF EXISTS Especialidad;
DROP TABLE IF EXISTS Usuario;
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS Semestre;
DROP TABLE IF EXISTS Horario;
DROP TABLE IF EXISTS Consultorio;

CREATE TABLE Especialidad(
	id_especialidad INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NULL,
    estado TINYINT,
    cant_medicos INT,
    PRIMARY KEY(id_especialidad)
)ENGINE = InnoDB;

CREATE TABLE  Persona(
  id_persona INT NOT NULL AUTO_INCREMENT,
  DNI VARCHAR(8) NULL,
  nombre VARCHAR(50) NULL,
  apellido VARCHAR(50) NULL,
  edad INT,
  fecha_nacimiento DATE,
  PRIMARY KEY (id_persona)
)ENGINE = InnoDB;

CREATE TABLE Usuario(
	id_usuario INT NOT NULL AUTO_INCREMENT,
    fid_persona INT,
    email VARCHAR(50),
    username VARCHAR(50),
    password VARCHAR(50),
    estado TINYINT,
    PRIMARY KEY(id_usuario),
    FOREIGN KEY (fid_persona) REFERENCES Persona(id_persona)
)ENGINE = InnoDB;
CREATE TABLE Administrador(
	id_administrador INT NOT NULL AUTO_INCREMENT,
    fid_usuario INT UNIQUE,
    fid_especialidad INT UNIQUE,
    calificacion DECIMAL(10,2),
    cant_pacientes INT,
    PRIMARY KEY(id_administrador),
    FOREIGN KEY(fid_especialidad) REFERENCES Especialidad(id_especialidad),
    FOREIGN KEY(fid_usuario) REFERENCES Usuario(id_usuario)
)ENGINE = InnoDB;

CREATE TABLE Medico(
	id_medico INT NOT NULL AUTO_INCREMENT,
    fid_usuario INT UNIQUE,
    fid_especialidad INT UNIQUE,
    fid_administrador INT,
    calificacion DECIMAL(10,2),
    cant_pacientes INT,
    PRIMARY KEY(id_medico),
    FOREIGN KEY(fid_administrador) REFERENCES Administrador(id_administrador),
    FOREIGN KEY(fid_especialidad) REFERENCES Especialidad(id_especialidad),
    FOREIGN KEY(fid_usuario) REFERENCES Usuario(id_usuario)
)ENGINE = InnoDB;
CREATE TABLE Semestre(
	id_semestre INT AUTO_INCREMENT,
    nombre  VARCHAR(50),
    fecha_inicio DATE,
    fecha_fin DATE,
    PRIMARY KEY(id_semestre)
)ENGINE=InnoDB;

CREATE TABLE Horario(
	id_horario INT AUTO_INCREMENT,
    dia  VARCHAR(50),
    hora_inicio DATE,
    hora_fin DATE,
    fid_semestre INT,
    fid_medico INT,
    PRIMARY KEY(id_horario),
    FOREIGN KEY(fid_medico) REFERENCES Medico(id_medico),
    FOREIGN KEY(fid_semestre) REFERENCES Semestre(id_semestre)
)ENGINE=InnoDB;
CREATE TABLE Consultorio(
	id_consultorio INT AUTO_INCREMENT,
    disponible BOOL,
    PRIMARY KEY(id_consultorio)
)ENGINE=InnoDB;

