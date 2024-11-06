-- 코드를 입력하세요
SELECT a.FLAVOR
from FIRST_HALF as a join JULY as b
on a.FLAVOR = b.FLAVOR
group by a.FLAVOR
having (sum(a.TOTAL_ORDER) + sum(b.TOTAL_ORDER))
order by (sum(a.TOTAL_ORDER) + sum(b.TOTAL_ORDER)) desc
limit 3