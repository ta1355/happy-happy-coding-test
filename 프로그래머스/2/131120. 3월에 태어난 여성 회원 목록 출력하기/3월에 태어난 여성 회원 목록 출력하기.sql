-- 코드를 입력하세요
SELECT MEMBER_ID ,MEMBER_NAME ,GENDER ,date_format(DATE_OF_BIRTH, '%Y-%m-%d')
from MEMBER_PROFILE 
where  month(DATE_OF_BIRTH) = 3 and TLNO is not null and GENDER  ='W'
order by MEMBER_ID asc