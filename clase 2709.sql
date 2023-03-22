--create database Deportes
use Deportes  

 if object_id ('cursos') is not null
 drop table cursos
 go
 if object_id ('socios') is not null
 drop table cursos
 go
 if object_id ('profesores') is not null
 drop table cursos
 go 
 if object_id ('inscripciones') is not null
 drop table cursos
 go 

 create table socios(
 Idsocio int constraint pksocio primary key ,
 Nombre varchar(50),
 Direccion varchar(50)
 )
 go

 --select * from socios
 create table profesores(
 Idprofesores int constraint pkprofesores primary key ,
 Nombre varchar(50),
 Direccion varchar(50)
 )
 go
 --select * from profesores
create table cursos(
numero int identity constraint pknumerocurso primary key,
Nombre_deporte varchar(50),
Dia varchar(20) constraint chDias check(dia in('Lunes','Martes','Miercoles',
'Jueves','viernes')),
IdProfesor int,-- profesor responsable del curso o deporte a impartir
Constraint fkDocenteresponsable foreign key(IdProfesor)
references profesores(Idprofesores)
)
go
