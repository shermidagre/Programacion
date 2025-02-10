

1) decir de  cantas instalacions dispomos
select count(*)from instalacions group by cinstala;

         7

2) amosar dias e horas nos que esta ocupada a instalacion  de codigo -i4-
select diasem,horaini from ocupa where cinstala='i4';



         3         16
         1         19
         3         17
         4         18

3) amosar nomes de socios dos que non se coñeza a data de nacemento
select noms from socios where datan is null;



antia
brais
aaron

4) amosar nomes de socios dos que non se conheza a data de nacemento e teñan polo menos unha letra -i-  e unha letra -a- no seu nome
select noms from socios where datan is null and noms like '%i%' and  noms like '%a%';



antia
brais

5-subselects) amosar nomes de cursos que non teñen edicions
select nomecurso from cursos where ccurso not in(select ccurso from edicions);

esgrima
tenis
patinaxe

6-subselects) amosar nomes de socios matriculados na edicion de curso -c1 1-
select noms from socios where csocio in(select csocio from matricula where ccurso='c1' and ngrupo='1');



ana
pedro

7-subselects) nomes de socios que non teñan abonos individuales nin abonos familiares

select noms from socios where csocio not in(select csocio from individual) and csocio not in(select csocio from agrupa);


antia
alberto
aaron
alejandro
isabel
luis
brais

8)  amosar de cantas edicions consta cada codigo de curso que ten edicions

select ccurso,count(ngrupo) from edicions  group by ccurso


c1              3
c2              2
c3              2
c4              3

9)  amosar  de cantas edicions constan todos os nomes de curso

select nomecurso,count(edicions.ccurso) from edicions right join cursos on edicions.ccurso=cursos.ccurso group by nomecurso; 

esgrima                                   0
tenis                                     0
natacion2                                 2
aikido                                    3
patinaxe                                  0
taichi                                    2
natacion1                                 3

10) amosar as franxas de edades inicial e final (fedadeini, fedadefin) do curso de nome -aikido-


select fedadeini,fedadefin from franxaedade where cfranxaedade in(select franxaedade from corresponde where ccurso in(select ccurso from cursos where nomecurso='aikido'));

        14         17
        18         64



