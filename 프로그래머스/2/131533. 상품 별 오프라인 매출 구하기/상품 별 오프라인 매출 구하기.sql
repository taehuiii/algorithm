-- 코드를 입력하세요
SELECT A.PRODUCT_CODE, sum( A.PRICE * B.SALES_AMOUNT) as SALES
from PRODUCT A join OFFLINE_SALE B
on A.PRODUCT_ID = B.PRODUCT_ID
group by A.PRODUCT_CODE
order by SALES desc, A.PRODUCT_CODE asc
