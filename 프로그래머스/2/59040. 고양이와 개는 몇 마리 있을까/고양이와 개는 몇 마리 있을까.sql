SELECT distinct ANIMAL_TYPE, count(ANIMAL_ID) as count
from ANIMAL_INS
where ANIMAL_TYPE like "Cat" OR ANIMAL_TYPE like "Dog"
group by ANIMAL_TYPE
order by field(ANIMAL_TYPE, "Cat","Dog")
