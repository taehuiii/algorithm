-- 코드를 입력하세요
SELECT distinct r.CAR_ID
from CAR_RENTAL_COMPANY_CAR r
join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on r.CAR_ID = h.CAR_ID
where Month(START_DATE)=10 and r.CAR_TYPE like '세단'
order by CAR_ID desc
