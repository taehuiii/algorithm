-- 코드를 입력하세요
SELECT a.AUTHOR_ID, a.AUTHOR_NAME,b.CATEGORY, sum(bs.sales*b.price) as TOTAL_SALES
from book b
join AUTHOR a on b.AUTHOR_ID = a.AUTHOR_ID
join book_sales bs on b.BOOK_ID = bs.BOOK_ID
where bs.SALES_DATE like '2022-01-%'
group by AUTHOR_ID,CATEGORY
order by AUTHOR_ID, CATEGORY desc

