# Write your MySQL query statement below

select customer_number
from Orders 
GROUP BY customer_number
order by count(customer_number)   desc
limit 1
