-- ACTUAL QUERY
delete p1 
from person p1,person p2 
where p1.email=p2.email and p1.id>p2.id;


-- LOOKS CORRECT BUT HAVE SOME ERROR
-- delete from Person
-- where id not in(
-- select min(id) from Person
-- group by email
-- );