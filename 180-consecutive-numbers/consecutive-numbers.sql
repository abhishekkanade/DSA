# Write your MySQL query statement below

SELECT DISTINCT num AS ConsecutiveNums 
FROM (
    SELECT *, LAG(num, 1) OVER(ORDER BY id) as lag1,
                LAG(num, 2) OVER(ORDER BY id) as lag2
    FROM Logs
) AS sq
where num = sq.lag1 AND num = sq.lag2;