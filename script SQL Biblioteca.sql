create database Biblioteca;

create table Biblioteca.persona(
id int primary key, 
nombre varchar (50),
apellido varchar(50),
tipo varchar (50)
);

create table Biblioteca.usuario(
id_usuario int,
prestamos int,
FOREIGN KEY (id_usuario) REFERENCES Persona(id)
);

create table Biblioteca.bibliotecario (
id_bibliotecario int,
FOREIGN KEY (id_bibliotecario) REFERENCES Persona(id)
);

create table Biblioteca.libro (
id_libro int primary key,
titulo varchar (100),
autor varchar (100),
isbn varchar (100),
disponible boolean
); 

create table Biblioteca.prestamo (
id_prestamo int primary key auto_increment,
id_libro int,
id_usuario int,
fecha_prestamo date,
fecha_devolucion date,
FOREIGN KEY (id_libro) REFERENCES libro(id_libro),
FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

alter table Biblioteca.usuario
add primary key (id_usuario);

use Biblioteca; 

insert into libro (id_libro, titulo, autor, isbn, disponible)
values (1, 'Harry Potter 1', 'J.k R', '101', true),
(2, 'Harry Potter 2', 'J.k R', '102', true),
(3, 'Harry Potter 3', 'J.k R', '103', true),
(4, 'Harry Potter 4', 'J.k R', '104', true),
(5, 'Harry Potter 5', 'J.k R', '105', true);

insert into persona (id, nombre, apellido, tipo)
values (10, 'Juan', 'Pérez', 'Usuario'),
(11, 'María', 'Gómez', 'Usuario'),
(12, 'Carlos', 'Rodríguez', 'Usuario'),
(13, 'Ana', 'Martínez', 'Usuario'),
(14, 'Luis', 'Fernández', 'Usuario'),
(15, 'Laura', 'López', 'Bibliotecario'),
(16, 'Pedro', 'García', 'Bibliotecario'),
(17, 'Sofía', 'Hernández', 'Bibliotecario'),
(18, 'Miguel', 'Sánchez', 'Bibliotecario'),
(19, 'Elena', 'Ramírez', 'Bibliotecario');

insert into usuario (id_usuario, prestamos)
values (10, 1),
(11, 2),
(12, 3),
(13, 4),
(14, 5);

insert into bibliotecario (id_bibliotecario)
values (15),
(16),
(17),
(18),
(19);

select * from persona; 

select * from usuario; 

select * from bibliotecario; 

select * from libro; 

select * from prestamo; 








