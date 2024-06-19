-- 코드를 입력하세요
SELECT *
from places
where host_id in ( select host_id
       from places
       group by host_id
      having count(host_id)>=2)
       
order by id