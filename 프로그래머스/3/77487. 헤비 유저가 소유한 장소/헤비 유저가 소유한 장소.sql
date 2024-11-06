-- 코드를 입력하세요
SELECT a.ID ,a.name, a.host_id
from PLACES as a ,(select ID, NAME, HOST_ID from PLACES group by HOST_ID having count(HOST_ID) >=2) as b
where a.HOST_ID =b.HOST_ID
order by a.ID

