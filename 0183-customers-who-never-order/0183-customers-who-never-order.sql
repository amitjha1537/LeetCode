# Write your MySQL query statement below
Select name as Customers from Customers Left join Orders on Customers.id=Orders.customerId where Orders.customerId is NULL;
