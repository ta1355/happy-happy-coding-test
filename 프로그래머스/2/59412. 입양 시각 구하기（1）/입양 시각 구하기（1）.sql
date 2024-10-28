-- 코드를 입력하세요
SELECT hour(DATETIME) as HOUR, count(*) as COUNT 
from ANIMAL_OUTS
where hour(datetime) between 9 and  20
group by hour
order by hour