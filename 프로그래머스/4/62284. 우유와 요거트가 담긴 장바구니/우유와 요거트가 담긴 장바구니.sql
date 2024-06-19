-- 코드를 입력하세요
SELECT CART_ID
from CART_PRODUCTS
where name like 'Milk'
and cart_id in ( select cart_id
               from CART_PRODUCTS
               where name like 'Yogurt')
group by cart_id 
order by cart_id