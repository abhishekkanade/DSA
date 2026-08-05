# Write your MySQL query statement below




select d.name as Department, s.name as Employee, s.salary as Salary
from (
    select name, salary, departmentId,
    DENSE_RANK() over(
    partition by departmentId
    order by Salary DESC
    ) as salary_rank
from Employee
) as s
join Department d
on s.departmentId = d.id
where s.salary_rank <=3;
