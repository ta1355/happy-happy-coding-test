-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, substr(HIRE_YMD, 1,11) hire_ymd
from DOCTOR 
where MCDP_CD ='CS' or  MCDP_CD ='Gs'
order by HIRE_YMD desc, DR_NAME asc 
