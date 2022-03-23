use classicmodels;
-- 1
select p.customerNumber,p.checkNumber,p.amount from customers c join payments p
on c.customerNumber = p.customerNumber
where p.amount > (select avg(amount) from payments)
order by p.customerNumber;

-- 2
select customerName from customers 
where customerNumber not in
(select customerNumber from orders);

-- 3 issue
select max(item),min(item),floor(avg(item)) from
(select count(orderNumber) as item from orderdetails group by orderNumber) as d;

-- 4 
select productName,buyPrice from products
where buyPrice >
(select avg(buyPrice) from products);

-- 5 
select o.orderNumber,sum(o2.quantityOrdered*o2.priceEach) as total
from orders o
inner join orderdetails o2
on o.orderNumber = o2.orderNumber
group by o.orderNumber
having total>60000;

-- 6

select c.customerNumber,c.customerName from customers c
where exists
(select o.orderNumber,sum(o2.quantityOrdered*o2.priceEach) as total
from orders o inner join orderdetails o2
on o.orderNumber = o2.orderNumber AND o.customerNumber = c.customerNumber
group by o.orderNumber
having total>60000);

-- 7 
select productcode,sum(quantityordered*priceeach) as sales from orderdetails inner join orders 
using(ordernumber) where year(shippedDate)='2003'
group by productcode 
order by sales desc
limit 5;

-- 8 
select productName,sales from 
(select productcode,sum(quantityordered*priceeach) as sales from orderdetails inner join orders 
using(ordernumber) where year(shippedDate)=2003 
group by productcode 
order by sales desc 
limit 5) as top5product2003 join products using(productCode);

-- 9
select customerNumber,sum(quantityOrdered*priceEach) as sales,
(case
	when sales < 10000 then 'Silver'
    when sales between 10000 and 100000 then 'Gold'
    when sales > 100000 then 'Platinum'
 end) as customerGroup from orderdetails,orders;
 
delimiter //
create procedure getAllEmp()
begin
select concat(e.firstName," ",e.lastName),o.city,o.state,o.country from employees e
inner join offices o on o.officecode = e.officecode;
end //
delimiter ;

call getAllEmp();
-- task
DELIMITER //
CREATE PROCEDURE getFact(
        INOUT counter INT)
BEGIN
        SET counter = counter + step;
END //
DELIMITER ;
SET @myCounter = 1;
CALL setCounter(@myCounter);
SELECT @myCounter;