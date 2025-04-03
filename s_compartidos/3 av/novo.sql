vboxuser usuario de linux

sistema postgres;

usuario vboxuser
base de datos postgres

	"la base de datos busca dentro del sistema postgres busca un usuario que se llama vboxuser por lo cual el usuario tieneq ue tener el mismo nombre que un usuario ya registrado en linux"
	
	
\du "sirve para describir los usuarios que hay"

\l "Lista de bases de datos"

" postgres usa template0,1 para crear bases de datos para crear bases de datos a partir de ellas"

\d " Sirve para listar los esquemas "

\i url "lanzar script"

\dt " Sirve para listar las tablas "

\c " Para cambiar de usuario "

Vamos a crear un usuario que se llame dam1

create user dam12 with password 'dam1';

Observamos que por defecto con el \dt vemos todas las tablas por una configuracion interna de la bd deja poder ver que tablas existen pero deniega el permiso a ellas

[local]:5432 dam12@postgres=> 

\dt
         Listado de relaciones
 Esquema |  Nombre   | Tipo  |  Dueño   
---------+-----------+-------+----------
 public  | adestra   | tabla | vboxuser
 public  | colexiado | tabla | vboxuser
 public  | equipo    | tabla | vboxuser
 public  | estadio   | tabla | vboxuser
 public  | interven  | tabla | vboxuser
 public  | partido   | tabla | vboxuser
 public  | xoga      | tabla | vboxuser
 public  | xogador   | tabla | vboxuser
(8 filas)

[local]:5432 dam12@postgres=> select * from xogador;
ERROR:  permiso denegado a la tabla xogador

Ahora intentaremos mandar de nuevo el script, observamos que no deja y manda los siguientes mensajes

[local]:5432 dam12@postgres=> \i '/media/sf_s_compartidos/consultas/Futbol/futboltodoxuntov1p.sql' 
SET
SET
 DateStyle 
-----------
 SQL, DMY
(1 fila)

psql:/media/sf_s_compartidos/consultas/Futbol/futboltodoxuntov1p.sql:6: ERROR:  debe ser dueño de la tabla adestra

Probamos a realizarlo mediante manual 

[local]:5432 dam12@postgres=> drop table xogador;
ERROR:  debe ser dueño de la tabla xogador

Intentamos añadir la tabla mediante manual y podemos observar que no deja deja crear tabla en el esquema public

[local]:5432 dam12@postgres=> create table dam1(codigo varchar(10));
ERROR:  permiso denegado al esquema public
LÍNEA 1: create table dam1(codigo varchar(10));
                      ^
                     
Dar permisos a dam12  ( siempre estar en el usuario admin para ello )                   
                      
grant create on schema public to dam12;                     

COmprobacion de que se ha creado, como podemos observar el dueño en este caso es dam12

[local]:5432 dam12@postgres=> \dt
         Listado de relaciones
 Esquema |  Nombre   | Tipo  |  Dueño   
---------+-----------+-------+----------
 public  | adestra   | tabla | vboxuser
 public  | colexiado | tabla | vboxuser
 public  | dam1      | tabla | dam12
 public  | equipo    | tabla | vboxuser
 public  | estadio   | tabla | vboxuser
 public  | interven  | tabla | vboxuser
 public  | partido   | tabla | vboxuser
 public  | xoga      | tabla | vboxuser
 public  | xogador   | tabla | vboxuser
(9 filas)

Decidimos crear una base de datos nueva (dam1) siempre nos conectamos al usuario con permisos

[local]:5432 dam12@postgres=> \c postgres postgres
Ahora está conectado a la base de datos «postgres» con el usuario «postgres».
[local]:5432 postgres@postgres=# create database dam1;
CREATE DATABASE

Confirmacion de que la base ha sido creada, \l

  Nombre   |  Dueño   | Codificación |   Collate   |    Ctype    | configuración ICU | Proveedor de locale |      Privilegios      
-----------+----------+--------------+-------------+-------------+-------------------+---------------------+-----------------------
 dam1      | postgres | UTF8         | es_ES.UTF-8 | es_ES.UTF-8 |                   | libc                | 
 postgres  | postgres | UTF8         | es_ES.UTF-8 | es_ES.UTF-8 |                   | libc                | 
 template0 | postgres | UTF8         | es_ES.UTF-8 | es_ES.UTF-8 |                   | libc                | =c/postgres          +
           |          |              |             |             |                   |                     | postgres=CTc/postgres
 template1 | postgres | UTF8         | es_ES.UTF-8 | es_ES.UTF-8 |                   | libc                | =c/postgres          +
           |          |              |             |             |                   |                     | postgres=CTc/postgres
(4 filas)

(END)

Nos conectamos a la base dam1 con el usuario postgres(admin)

[local]:5432 postgres@postgres=# \c dam1 postgres
Ahora está conectado a la base de datos «dam1» con el usuario «postgres».

Intentamos crear una tabla con dam1 desde la base dam1

[local]:5432 dam1@dam1=> \i '/media/sf_s_compartidos/consultas/Futbol/futboltodoxuntov1p.sql' 
SET
SET
 DateStyle 
-----------
 SQL, DMY
(1 fila)

psql:/media/sf_s_compartidos/consultas/Futbol/futboltodoxuntov1p.sql:6: NOTICE:  la tabla «adestra» no existe, omitiendo

Le vamos a dar permisos a dam1 para el esquema public 

[local]:5432 dam1@dam1=> \c dam1 postgres
Ahora está conectado a la base de datos «dam1» con el usuario «postgres».
[local]:5432 postgres@dam1=# grant create on schema public to dam12;  
GRANT


Probamos a crear la tabla

[local]:5432 postgres@dam1=# \c dam1 dam12
Ahora está conectado a la base de datos «dam1» con el usuario «dam12».
[local]:5432 dam12@dam1=> \i '/media/sf_s_compartidos/consultas/Futbol/futboltodoxuntov1p.sql' 
SET
SET
 DateStyle 
-----------
 SQL, DMY
(1 fila)

psql:/media/sf_s_compartidos/consultas/Futbol/futboltodoxuntov1p.sql:6: NOTICE:  la tabla «adestra» no existe, omitiendo
DROP TABLE

Observamos que estan las dos tablas en las dos base

[local]:5432 vboxuser@dam1=# \c postgres vboxuser
Ahora está conectado a la base de datos «postgres» con el usuario «vboxuser».
[local]:5432 vboxuser@postgres=# select * from xogador;
 codx |   nomx   | codequ | salario | comision |   datan    
------+----------+--------+---------+----------+------------
 x1   | luis     | e1     |    2000 |          | 1990-01-03
 x2   | juan     | e3     |    1500 |        0 | 1991-04-13
 x3   | pedro    | e4     |    1000 |          | 1990-11-12
 x4   | alberto  | e2     |    1000 |        5 | 1990-07-01
 x5   | juan     | e1     |    1200 |       10 | 1990-08-23
 x6   | luis     | e1     |     800 |       20 | 1990-09-12
 x7   | carlos   | e3     |         |          | 1990-10-08
 x8   | pedro    | e4     |    3000 |        5 | 1990-06-07
 x9   | bent     | e4     |    1500 |       10 | 1990-04-23
 x10  | manuel   | e4     |         |       10 | 1990-12-25
 x11  | antonio  | e3     |    2000 |          | 1990-06-16
 x12  | eliseo   | e4     |    1350 |       10 | 1990-05-14
 x13  | juan     | e2     |    2000 |        5 | 1990-04-07
 x14  | federico | e1     |    1000 |       10 | 1990-01-05
 x15  | leon     | e1     |         |          | 1990-11-27
(15 filas)

[local]:5432 vboxuser@postgres=# \c dam1 dam12
Ahora está conectado a la base de datos «dam1» con el usuario «dam12».
[local]:5432 dam12@dam1=> select * from xogador;
 codx |   nomx   | codequ | salario | comision |   datan    
------+----------+--------+---------+----------+------------
 x1   | luis     | e1     |    2000 |          | 1990-01-03
 x2   | juan     | e3     |    1500 |        0 | 1991-04-13
 x3   | pedro    | e4     |    1000 |          | 1990-11-12
 x4   | alberto  | e2     |    1000 |        5 | 1990-07-01
 x5   | juan     | e1     |    1200 |       10 | 1990-08-23
 x6   | luis     | e1     |     800 |       20 | 1990-09-12
 x7   | carlos   | e3     |         |          | 1990-10-08
 x8   | pedro    | e4     |    3000 |        5 | 1990-06-07
 x9   | bent     | e4     |    1500 |       10 | 1990-04-23
 x10  | manuel   | e4     |         |       10 | 1990-12-25
 x11  | antonio  | e3     |    2000 |          | 1990-06-16
 x12  | eliseo   | e4     |    1350 |       10 | 1990-05-14
 x13  | juan     | e2     |    2000 |        5 | 1990-04-07
 x14  | federico | e1     |    1000 |       10 | 1990-01-05
 x15  | leon     | e1     |         |          | 1990-11-27
(15 filas)

Vamos a insertar un jugador en dam1 

[local]:5432 dam12@dam1=> insert into xogador values('x20','pedro','e3',2000,2,'1990-01-04')
;
INSERT 0 1

Comprobamos que solo se ha creado en la base dam1

[local]:5432 dam12@dam1=> select * from xogador;
 codx |   nomx   | codequ | salario | comision |   datan    
------+----------+--------+---------+----------+------------
 x1   | luis     | e1     |    2000 |          | 1990-01-03
 x2   | juan     | e3     |    1500 |        0 | 1991-04-13
 x3   | pedro    | e4     |    1000 |          | 1990-11-12
 x4   | alberto  | e2     |    1000 |        5 | 1990-07-01
 x5   | juan     | e1     |    1200 |       10 | 1990-08-23
 x6   | luis     | e1     |     800 |       20 | 1990-09-12
 x7   | carlos   | e3     |         |          | 1990-10-08
 x8   | pedro    | e4     |    3000 |        5 | 1990-06-07
 x9   | bent     | e4     |    1500 |       10 | 1990-04-23
 x10  | manuel   | e4     |         |       10 | 1990-12-25
 x11  | antonio  | e3     |    2000 |          | 1990-06-16
 x12  | eliseo   | e4     |    1350 |       10 | 1990-05-14
 x13  | juan     | e2     |    2000 |        5 | 1990-04-07
 x14  | federico | e1     |    1000 |       10 | 1990-01-05
 x15  | leon     | e1     |         |          | 1990-11-27
 x20  | pedro    | e3     |    2000 |        2 | 1990-01-04
(16 filas)

[local]:5432 dam12@dam1=> \c postgres vboxuser
Ahora está conectado a la base de datos «postgres» con el usuario «vboxuser».
[local]:5432 vboxuser@postgres=# select * from xogador;
 codx |   nomx   | codequ | salario | comision |   datan    
------+----------+--------+---------+----------+------------
 x1   | luis     | e1     |    2000 |          | 1990-01-03
 x2   | juan     | e3     |    1500 |        0 | 1991-04-13
 x3   | pedro    | e4     |    1000 |          | 1990-11-12
 x4   | alberto  | e2     |    1000 |        5 | 1990-07-01
 x5   | juan     | e1     |    1200 |       10 | 1990-08-23
 x6   | luis     | e1     |     800 |       20 | 1990-09-12
 x7   | carlos   | e3     |         |          | 1990-10-08
 x8   | pedro    | e4     |    3000 |        5 | 1990-06-07
 x9   | bent     | e4     |    1500 |       10 | 1990-04-23
 x10  | manuel   | e4     |         |       10 | 1990-12-25
 x11  | antonio  | e3     |    2000 |          | 1990-06-16
 x12  | eliseo   | e4     |    1350 |       10 | 1990-05-14
 x13  | juan     | e2     |    2000 |        5 | 1990-04-07
 x14  | federico | e1     |    1000 |       10 | 1990-01-05
 x15  | leon     | e1     |         |          | 1990-11-27
(15 filas)

Crearemos un nuevo esquema en dam1

[local]:5432 postgres@postgres=# \c dam1 postgres
Ahora está conectado a la base de datos «dam1» con el usuario «postgres».
[local]:5432 postgres@dam1=# create schema es authorization dam12;
CREATE SCHEMA

Comprobamos los esquemas y observamos que el esquema es pertenece a dam12

[local]:5432 dam12@dam1=> \dn
    Listado de esquemas
 Nombre |       Dueño       
--------+-------------------
 es     | dam12
 es1    | dam1
 public | pg_database_owner
(3 filas)

Creamos la tabla en el esquema es

[local]:5432 dam12@dam1=> create table es.dam1(codigo varchar(10));

Comprobamos que la tabla se ha creado correctamente

[local]:5432 dam12@dam1=> \dt es.*
      Listado de relaciones
 Esquema | Nombre | Tipo  | Dueño 
---------+--------+-------+-------
 es      | dam1   | tabla | dam12
(1 fila)

Quitamos permisos de crear objetos a public, public engloba a todos los usuarios que se vayan creando y a parte tambien lde debemos anular el crear a dam12 ya que antes le habiamos dado esos permisos. 

[local]:5432 postgres@dam1=# REVOKE USAGE ON SCHEMA PUBLIC FROM PUBLIC;
REVOKE
[local]:5432 postgres@dam1=# REVOKE CREATE ON SCHEMA PUBLIC FROM dam12;
REVOKE


[local]:5432 postgres@dam1=# \c dam1 dam12
Ahora está conectado a la base de datos «dam1» con el usuario «dam12».

[local]:5432 dam12@dam1=> create table public.dam1j(codigo varchar(10));
ERROR:  permiso denegado al esquema public
LÍNEA 1: create table public.dam1j(codigo varchar(10));
                      ^

Devolvemos permisos de uso a dam12 en el esquema public

[local]:5432 postgres@dam1=# GRANT USAGE ON SCHEMA PUBLIC to dam12;
GRANT

Comprobamos que esta bien

[local]:5432 dam12@dam1=> insert into dam1 values ('ana');
INSERT 0 1
[local]:5432 dam12@dam1=> \dt
         Listado de relaciones
 Esquema |  Nombre   | Tipo  |  Dueño   
---------+-----------+-------+----------
 public  | adestra   | tabla | dam12
 public  | colexiado | tabla | dam12
 public  | dam1      | tabla | dam12
 public  | dam1b     | tabla | postgres
 public  | dam1c     | tabla | postgres
 public  | dam1f     | tabla | dam12
 public  | equipo    | tabla | dam12
 public  | estadio   | tabla | dam12
 public  | interven  | tabla | dam12
 public  | partido   | tabla | dam12
 public  | xoga      | tabla | dam12
 public  | xogador   | tabla | dam12
(12 filas)

[local]:5432 dam12@dam1=> select * from dam1;
 codigo 
--------
 ana
(1 fila)

Volvemos a darle permisos para creacion de tablas

[local]:5432 dam12@dam1=> \c dam1 postgres
Ahora está conectado a la base de datos «dam1» con el usuario «postgres».
[local]:5432 postgres@dam1=# GRANT create ON SCHEMA PUBLIC to dam12;
GRANT

Comprobamos que esta bien

[local]:5432 postgres@dam1=# \c dam1 dam12
Ahora está conectado a la base de datos «dam1» con el usuario «dam12».
[local]:5432 dam12@dam1=> create table dam1i(codigo varchar(10));
CREATE TABLE
[local]:5432 dam12@dam1=> \dt
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
 public  | equipo    | tabla | dam12
 public  | estadio   | tabla | dam12
 public  | interven  | tabla | dam12
 public  | partido   | tabla | dam12
 public  | xoga      | tabla | dam12
 public  | xogador   | tabla | dam12
(13 filas)

Quitmos todos los permisos a la base de dam1 por lo cual no nos podemos conectar excepto el admin

[local]:5432 dam12@dam1=> \c dam1 postgres
Ahora está conectado a la base de datos «dam1» con el usuario «postgres».
[local]:5432 postgres@dam1=# REVOKE ALL ON DATABASE DAM1 FROM PUBLIC;
REVOKE

Para darle el privilegio de entrar a algun usuario

[local]:5432 postgres@dam1=# GRANT CONNECT ON DATABASE DAM1 TO dam12;
GRANT


Cambiar el propietario a un esquema

[local]:5432 postgres@dam1=# alter schema sb owner to ub;
ALTER SCHEMA

Para crear una tabla con las mismas caracteristicas que otra es asi 

[local]:5432 ua@dam1=> create table t3 as select * from t1;
SELECT 2

[local]:5432 ua@dam1=> \dt

      Listado de relaciones
 Esquema | Nombre | Tipo  | Dueño 
---------+--------+-------+-------
 public  | t1     | tabla | ua
 public  | t2     | tabla | ua
 public  | t3     | tabla | ua
(3 filas)

[local]:5432 ua@dam1=> select * from t3;
 a 
---
 1
 3
(2 filas)


Para cambar el camino de busqueda para la creacion de tablas y vision de ellas (temporal) mientras se este conectado con ese usuario

set search_path to sb 

Sirve para comprobar la ruta en la que se insertan las tablas por defecto

[local]:5432 dam12@dam1=> show search_path;
   search_path   
-----------------
 "$user", public
(1 fila)

