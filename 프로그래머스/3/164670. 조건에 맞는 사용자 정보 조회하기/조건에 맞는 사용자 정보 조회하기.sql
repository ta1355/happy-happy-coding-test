-- 코드를 입력하세요
SELECT b.USER_ID, b.NICKNAME, CONCAT(CITY, ' ', STREET_ADDRESS1, ' ' , STREET_ADDRESS2) AS 전체주소, concat(substr(TLNO,1,3), "-", substr(TLNO, 4, 4), "-", substr(TLNO,8, 11)) as 전화번호
from USED_GOODS_BOARD as a left join USED_GOODS_USER as b
on a.WRITER_ID = b.USER_ID
group by b.user_id
having count(*) >= 3
order by b.USER_ID desc