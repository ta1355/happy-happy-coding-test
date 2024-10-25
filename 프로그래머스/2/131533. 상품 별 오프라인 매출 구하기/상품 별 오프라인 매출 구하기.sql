-- 코드를 입력하세요
SELECT o.PRODUCT_CODE , o.price * sum(f.sales_amount) as SALES
from PRODUCT as o  join OFFLINE_SALE as f
on o.PRODUCT_ID = f.PRODUCT_ID
group by o.PRODUCT_ID
order by SALES desc , PRODUCT_CODE asc