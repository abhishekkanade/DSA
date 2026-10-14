# Write your MySQL query statement below
-- select num
-- from(
    -- select num, dense_rank() over(order by num desc) as ds
    -- from MyNumbers ;
-- ) as sq
-- where sq.ds=1;

select max(num) as num
from MyNumbers 
where num NOT IN (
    select num
    from MyNumbers
        group by num
        having count(*)>1
)
;
