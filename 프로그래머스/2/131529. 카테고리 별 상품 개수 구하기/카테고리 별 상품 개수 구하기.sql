-- 코드를 입력하세요
SELECT substr(PRODUCT_CODE,1, 2) CATEGORY ,count(*) as PRODUCTS
from PRODUCT
group by CATEGORY
