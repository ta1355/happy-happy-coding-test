-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.name
from ANIMAL_INS as a left join ANIMAL_OUTS as b
on a.ANIMAL_ID = b.ANIMAL_ID
where b.DATETIME is not null
order by DATEDIFF(a.DATETIME, b.DATETIME)
limit 2