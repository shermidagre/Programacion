create or replace function fsumapares (a numeric) returns INTEGER language plpgsql as $$ 

declare

	r integer =0;

begin

	for i iN 1..a loop

	r=r+1*(i-1);

	end loop;

return r;

end;$$




