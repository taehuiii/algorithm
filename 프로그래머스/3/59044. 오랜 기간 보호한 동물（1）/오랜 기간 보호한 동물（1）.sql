-- 코드를 입력하세요

SELECT A.NAME, A.DATETIME
from ANIMAL_INS A Left join ANIMAL_OUTS B
on A.ANIMAL_ID = B.ANIMAL_ID
where b.ANIMAL_ID is null
order by A.DATETIME asc
Limit 3