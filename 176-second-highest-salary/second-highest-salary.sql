# Write your MySQL query statement below
select max(salary) as SecondHighestSalary from(

select id,salary  ,
dense_rank()
over(

    order by salary desc
) as sal
from Employee

) as t
 where sal=2;
