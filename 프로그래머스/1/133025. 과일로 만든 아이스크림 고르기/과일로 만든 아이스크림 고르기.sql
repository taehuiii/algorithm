-- 코드를 입력하세요
SELECT h.flavor
from FIRST_HALF h
join ICECREAM_INFO i
on h.flavor = i.flavor
where i.INGREDIENT_TYPE = 'fruit_based'
and h.TOTAL_ORDER >3000
order by TOTAL_ORDER desc

