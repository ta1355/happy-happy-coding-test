-- 코드를 작성해주세요
select ID, case when SIZE_OF_COLONY <= 100 then 'LOW' when SIZE_OF_COLONY <= 1000 then 'MEDIUM'
when SIZE_OF_COLONY >1000 then 'HIGH' end as SIZE
from ECOLI_DATA 