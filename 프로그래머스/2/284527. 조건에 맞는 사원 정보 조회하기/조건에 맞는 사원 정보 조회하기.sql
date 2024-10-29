-- 코드를 작성해주세요
select SCORE, h.EMP_NO, EMP_NAME, POSITION,EMAIL
from HR_EMPLOYEES as h join (select EMP_NO , sum(SCORE) as SCORE from HR_GRADE group by EMP_NO) as s
on h.EMP_NO =s.EMP_NO
order by SCORE desc
limit 1
