
SELECT DR_NAME, DR_ID, MCDP_CD, date_format(HIRE_YMD,'%Y-%m-%d') as HIRE_YMD
from DOCTOR
where mcdp_cd like 'cs' or mcdp_cd like 'gs'
order by HIRE_YMD desc, DR_NAME