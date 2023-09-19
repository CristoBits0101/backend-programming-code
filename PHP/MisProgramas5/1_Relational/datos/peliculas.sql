CREATE DATABASE IF NOT EXISTs DBPELICULAS;

USE DBPELICULAS;

CREATE TABLE IF NOT EXISTS peliculas (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `titulo` VARCHAR(19) CHARACTER SET utf8,
    `director` VARCHAR(24) CHARACTER SET utf8,
    `actores` VARCHAR(34) CHARACTER SET utf8,
    `genero` VARCHAR(16) CHARACTER SET utf8,
    `duracion` VARCHAR(8) CHARACTER SET utf8,
    `argumento` VARCHAR(150) CHARACTER SET utf8
);

INSERT INTO peliculas VALUES (1,'El padrino','Francis Ford Coppola','Marlon Brando, Al Pacino','Crimen, Drama','175 min.','En el verano de 1945, se celebra la boda de Connie (Talia Shire) y Carlo Rizzi (Gianni Russo). Connie es la única hija de Don Vito Corleone (Marlon...'),
	                         (2,'La vida es bella','Roberto Benigni','Roberto Benigni, Horst Buchholz','Drama, Comedia','117 min.','La Segunda Guerra Mundial está a punto de estallar en Europa. Mientras tanto, Guido llega a un pueblo italiano con la intención de abrir una...'),
	                         (3,'Vengadores: Endgame','Joe Russo, Anthony Russo','Robert Downey Jr., Chris Evans,...','Fantasía, Acción','181 min.','Después de los devastadores eventos ocurridos en Vengadores: Infinity War, el universo está en ruinas debido a las acciones de Thanos, el Titán...');