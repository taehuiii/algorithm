-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/', BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) AS FILE_PATH
from USED_GOODS_FILE
Where board_id = (
            select board_id
    from USED_GOODS_BOARD
    order by views desc
    limit 1
)
ORDER BY FILE_ID DESC