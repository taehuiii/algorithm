-- 코드를 작성해주세요
select d.DEPT_ID, d.DEPT_NAME_EN, round(avg(e.SAL),0) as AVG_SAL
from HR_DEPARTMENT d
join HR_EMPLOYEES e on d.DEPT_ID = e.DEPT_ID
group by DEPT_ID
order by AVG_SAL desc