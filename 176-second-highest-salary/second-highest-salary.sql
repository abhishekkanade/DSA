# Write your MySQL query statement below
Select MAX(salary) as SecondHighestSalary 
from Employee


where salary < (select MAX(salary) FROm Employee)
LIMIT 1;

