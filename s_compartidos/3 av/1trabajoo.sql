
create user dam2 with password 'dam2';
\du
[local]:5432 postgres@dam1=# \du
                                     Lista de roles
 Nombre de rol |                         Atributos                          | Miembro de 
---------------+------------------------------------------------------------+------------
 dam1          |                                                            | {}
 dam12         |                                                            | {}
 dam2          |                                                            | {}
 postgres      | Superusuario, Crear rol, Crear BD, Replicación, Ignora RLS | {}
 vboxuser      | Superusuario                                               | {}


grant create on schema public to dam2;  // para crear tablas

create schema dam2 authorization dam2;
\dn
[local]:5432 postgres@dam1=# \dn
    Listado de esquemas
 Nombre |       Dueño       
--------+-------------------
 dam2   | dam2
 es     | dam12
 es1    | dam1
 public | pg_database_owner
(4 filas)

\c dam1 postgres
GRANT create ON SCHEMA ES to dam2;
\dn+
[local]:5432 postgres@dam1=# \dn+
                                     Listado de esquemas
 Nombre |       Dueño       |              Privilegios               |      Descripción       
--------+-------------------+----------------------------------------+------------------------
 dam2   | dam2              |                                        | 
 es     | dam12             | dam12=UC/dam12                        +| 
        |                   | dam2=C/dam12                           | 
 es1    | dam1              |                                        | 
 public | pg_database_owner | pg_database_owner=UC/pg_database_owner+| standard public schema
        |                   | dam12=UC/pg_database_owner            +| 
        |                   | dam2=C/pg_database_owner               | 
(4 filas)

GRANT connect on database dam1 to dam2;

Creamos la tabla

[local]:5432 postgres@dam1=# \c dam1 dam2
Ahora está conectado a la base de datos «dam1» con el usuario «dam2».
[local]:5432 dam2@dam1=> create table es.dam2(codigo varchar(10));
CREATE TABLE
[local]:5432 dam2@dam1=> \dt
No se encontró ninguna relación.
[local]:5432 dam2@dam1=> \dt es.*
      Listado de relaciones
 Esquema | Nombre | Tipo  | Dueño 
---------+--------+-------+-------
 es      | dam1   | tabla | dam12
 es      | dam1d  | tabla | dam12
 es      | dam2   | tabla | dam2
(3 filas)

[local]:5432 dam2@dam1=> create table public.dam2(codigo varchar(10));
CREATE TABLE
[local]:5432 dam2@dam1=> \dt public.*
         Listado de relaciones
 Esquema |  Nombre   | Tipo  |  Dueño   
---------+-----------+-------+----------
 public  | adestra   | tabla | dam12
 public  | colexiado | tabla | dam12
 public  | dam1      | tabla | dam12
 public  | dam1b     | tabla | postgres
 public  | dam1c     | tabla | postgres
 public  | dam1f     | tabla | dam12
 public  | dam1i     | tabla | dam12
 public  | dam2      | tabla | dam2
 public  | equipo    | tabla | dam12
 public  | estadio   | tabla | dam12
 public  | interven  | tabla | dam12
 public  | partido   | tabla | dam12
 public  | xoga      | tabla | dam12
 public  | xogador   | tabla | dam12
(14 filas)

