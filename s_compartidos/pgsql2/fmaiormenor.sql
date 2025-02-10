create or replace function fmaiormenor (a integer,b integer) returns varchar language plpgsql as $$ 

declare

	resultado varchar(200);

begin

if a > b then 

resultado = a ||'e maior que' || b;

elsif a<b then

resultado=  a ||'e menor que'|| b;

elsif a = b then 

resultado = a ||'e igual que '|| b;

END if;

return resultado;

end;$$




