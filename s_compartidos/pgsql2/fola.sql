create or replace function fola (a numeric, s varchar) returns varchar language plpgsql as $$ 

declare

	r varchar(100) ='';

begin

	for i iN 1..a loop

	r=r || s;

	end loop;

return r;

end;$$




