# Write your MySQL query statement below
with sal as(
select salary,
dense_rank() over(
    order by salary desc

)as rnk
from Employee
)

select (
select salary 
from sal
where rnk=2 
limit 1
)as SecondHighestSalary 