-- 코드를 입력하세요
SELECT MCDP_CD as 진료과코드, count(PT_NO) as 월예약건수
from APPOINTMENT 
where APNT_YMD like '%2022-05%'
group by MCDP_CD
order by 월예약건수 , 진료과코드