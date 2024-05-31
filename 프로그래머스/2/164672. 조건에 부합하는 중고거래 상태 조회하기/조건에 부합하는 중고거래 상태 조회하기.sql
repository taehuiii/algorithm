-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE,PRICE,
case
when status like 'SALE' then "판매중"
when status like 'RESERVED' then "예약중"
else "거래완료"
end as STATUS
from USED_GOODS_BOARD
where CREATED_DATE like '2022-10-05'
order by BOARD_ID desc