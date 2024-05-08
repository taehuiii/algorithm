-- 코드를 입력하세요
SELECT A.CATEGORY, sum(B.SALES) as TOTAL_SALES
from BOOK A JOIN BOOK_SALES B
on A.BOOK_ID = B.BOOK_ID
where B.SALES_DATE like "2022-01%"
group by A.category
order by A.category