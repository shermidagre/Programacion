
/*(drop table if exists "name" cascade;) este comando sirve para borrar las entidades mal configuradas en caso de error*/

drop table if exists departamentos cascade;
drop table if exists profesores cascade;
drop table if exists cursos cascade;
drop table if exists imparten cascade;

create table departamentos ( /*create table sirve para añadir una nueva entidad*/
codd integer, /*Atributo primario de la entidad*/
/*En caso de atributo secundario de la entidad se debera declarar de la siguiente manera >> "name"varchar(20) unique,*/
nomd varchar(20), /*Atributos normales de la entidad*/
primary key (codd) /*Esto declara como unique y not nule, ya que lo estas declarando como atributo primario, es decir, "unique" estable variable unica, "not nule" declara que ese atributo es obligatorio de cubrir*/
);

create table profesores (
codp integer,
nomp varchar(15),not null, /*not null es para hacer que un atributo sea obligatorio para rellenarlo>*/
codd integer,
primary key (codp),
foreign key (codd) references departamentos (codd) /*foreign key sirve para señalar el atributo primario cogido de otra entidade, en este caso "departamentos"*/
);

create table cursos (
codc integer,
nomc varchar(20),
primary key (codc)
);

create table imparten (
codp integer,
codc integer,
primary key (codp,codc),
foreign key (codp) references profesores (codp),
foreign key (codc) references cursos (codc)
);

insert into departamentos values (1,'informatica'); /*insert into sirve para insertar un atributo en una entidad*//*Los atributos puestos entre comas simples 'name' sirven para declarar un atributo varchar (normal)*/

insert into departamentos
values (2,'matematicas');

insert into departamentos
values (3,'sostenibilidad');

insert into profesores values (1,'luis',2); /*Asignacion de nombre de profesores y su departamento, asi como su nombre es luis y su departamento es matematicas*/

insert into profesores values (2,'Luisa',1); /*Asignacion de nombre de profesores y su departamento, asi como su nombre es luis y su departamento es informatica*/

insert into profesores values (3,'Federico',2);
/* insert into profesores values (4,'Ana',null); */
/*Asignacion de nombre de profesores y su departamento, asi como su nombre es luis su departamento lo establacemos como vacio asi como hemos puesto "null"*/
/*La explicacion de que no podamos añadir a Ana como departamento vacio, es que hemos puesto la funcion not null en la entidad profesores, la cual nos obliga a establecer un departamento fijo*/
insert into profesores values (4,'Amalia',2);
insert into profesores values (5,'Amalia',3);

insert into cursos values (1,'dam1'); /*Añadimos el curso dam1 a la entidad cursos asignado como el 1 curso*/

insert into cursos values (2,'asir2'); /*Añadimos el curso asir2 a la entidad cursos asignado como el 2 curso*/

insert into imparten values (3,1); /*Añadimos el profesor 3 (Federico) a el curso 1 (dam1)*/














