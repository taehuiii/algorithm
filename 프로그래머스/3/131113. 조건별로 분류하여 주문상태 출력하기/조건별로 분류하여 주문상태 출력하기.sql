

SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d') AS OUT_DATE, 
CASE
    when OUT_DATE <= '2022-05-01' Then '출고완료'
    when OUT_DATE > '2022-05-01' Then '출고대기'
    else '출고미정'
END as '출고여부'
from FOOD_ORDER
order by ORDER_ID

