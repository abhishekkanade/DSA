# Write your MySQL query statement below

select d.name AS Department, e.name AS Employee, s.maxSalary as Salary
from(
    SELECT departmentId, MAX(salary) as maxSalary
    from Employee
    Group By departmentId
) AS s
join Employee e
on e.departmentId = s.departmentId AND e.salary = s.maxSalary
join Department d
on  e.departmentId=d.id;
    


-- SELECT d.name AS Department, e.name AS Employee, MAX(e.Salary) as Salary
-- FROM Employee e
-- JOIN Department d
-- ON e.departmentId = d.id
-- GROUP BY e.departmentId
-- ORDER BY e.Salary DESC;