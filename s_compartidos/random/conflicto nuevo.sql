create table Conflicto (
CodC integer,
Nome varchar(10),
primary key (Codc)
);

create table Paises (
CodP integer,
Nome varchar(10),
primary key (Codp)
);

Create table Persoas (
Tipo integer,
primary key (Tipo),
);

create table Traficantes (
Codt integer,
Nome varchar(30),
primary key (Codt),
);

create table Armas (
Codoa integer,
Nome varchar(10),
Capacidade destructiva varchar(15),
primary key (Coda),
);

create table Grupos armados (
Codarm integer,
Nome varchar(10),
Baixas totais varchar(30000000000),
primary key (Coda),
);

create table Division (
Codarm integer,
d integer,
primary key (Codarm,d),
foreign key (Codarm) references Grupos armados (Codarm),
);

create table Lideres (
Codarm integer,
li integer,
Apoios varchar(10),
primary key (Codarm,li),
foreign key (Codarm) references Grupos armados (Codarm),
);

create table Xefes militares (
Cx integer,
Nome varchar(10),
Rango varchar(10);
Codarm,li integer,
Codarm,d integer,
primary key (Cx),
foreign key (Codarm,l) references Lideres (Codarml),
foreign key (Codarm,d) references Division (Codarm,d)
);

create table Organizacions medievais (
Codom integer,
Nome varchar(10),
Tipo varchar(10),
Codom1 varchar(20),
primary key (Codom),
);

create table suceden (
Codp integer,
Codc integer,
Feridos varchar(10),
Mortos varchar(10),
Inicio varchar(10),
Fin varchar(10),
primary key (Codp,Codc)
foreign key (Codp) references conflicto (Codp),
foreign key (Codc) references conflicto (Codc),
);

create table Tienen1(
Codom integer,
Codc integer,
Saida varchar(20),ºº
Entrada varchar(20),
primary key (Codom,Codc)
foreign key (Codom) references conflicto (Codom),
foreign key (Codc) references conflicto (Codc)
);

create table Tienen2(
Tipo integer,
Codc integer,
primary key (Tipo,Codc),
foreign key (Tipo) references conflicto (Tipo),
foreign key (Codc) references conflicto (Codc)
);

create table Tienen3(
Codarm integer,
Codc integer,
primary key (Codarm,Codc)
foreign key (Codarm) references conflicto (Codarm),
foreign key (Codc) references conflicto (Codc),
);

create table Dependen(
Tipo integer,
Codom integer,
primary key (Tipo,Codom)
foreign key (Tipo) references conflicto (Tipo),
foreign key (Codom) references organizacions medievais (Codom),
);

create table Venden(
Codt integer,
Coda integer,
Codarm integer,
primary key (Codt,Coda,Codarm)
foreign key (Codt) references conflicto (Codt),
foreign key (Coda) references conflicto (Coda),
foreign key (Codarm) references conflicto (Codarm),
);

create table Compren(
Codt integer,
Coda integer,
primary key (Codt,Coda)
foreign key (Codt) references conflicto (Codt),
foreign key (Coda) references conflicto (Coda),


