-- 코드를 입력하세요
select count(*) as USERS
from USER_INFO
where AGE is null
group by AGE;