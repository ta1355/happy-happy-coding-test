-- 코드를 입력하세요
SELECT concat('/home/grep/src/',concat(b.BOARD_ID,concat('/', concat( FILE_ID ,concat(FILE_NAME, FILE_EXT))))) as FILE_PATH
from USED_GOODS_BOARD as a join USED_GOODS_FILE as b
on a.BOARD_ID = b.BOARD_ID
where a.VIEWS = (select max(VIEWS) from USED_GOODS_BOARD)
order by b.FILE_ID desc
