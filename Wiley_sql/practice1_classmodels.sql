use classicmodels;
-- 1st issue
select c1.city,c1.customerName,c2.customerName
from customers c1
inner join customers c2
on c1.city = c2.city and c1.customerName <> c2.customerName
order by c1.city;


-- 2nd 
select p1.productCode,p1.productName,p2.textDescription
from products p1
join productlines p2
on p1.productLine = p2.productLine;

-- 3rd 
select o.orderNumber,o.status,sum(o2.quantityOrdered*o2.priceEach) as total
from orders o
inner join orderdetails o2
on o.orderNumber = o2.orderNumber
group by o.orderNumber;

-- 4th 
select o1.orderNumber,o1.orderDate,o2.orderLineNumber,p.productName,o2.quantityOrdered,o2.priceEach
from orders o1
join orderdetails o2 on o1.orderNumber = o2.orderNumber
join products p on p.productCode = o2.productCode
order by o1.orderNumber,o2.orderLineNumber;

-- 5th
select o1.orderNumber,o1.orderDate,c.customerName,o2.orderLineNumber,p.productName,o2.quantityOrdered,o2.priceEach
from orders o1
join orderdetails o2
on o1.orderNumber = o2.orderNumber
join products p
on p.productCode = o2.productCode
join customers c
on c.customerNumber = o1.customerNumber
order by o1.orderNumber,o2.orderLineNumber;

-- 6th 
select o1.orderNumber,p.productName,p.msrp,o2.priceEach
from orders o1
join orderdetails o2
on o1.orderNumber = o2.orderNumber
join products p
on p.productCode = o2.productCode
where p.productCode = 'S10_1678' and p.msrp > o2.priceEach;

-- 7th  issue
select c.customerNumber,c.customerName,o.orderNumber,o.status
from customers c
inner join orders o
on c.customerNumber = o.customerNumber
order by o.orderNumber;

-- 8th
select c.customerNumber,c.customerName,o.orderNumber,o.status
from customers c
left join orders o
on c.customerNumber = o.customerNumber
where o.orderNumber is null and o.status is null;