select count(*) as FISH_COUNT
from FISH_INFO 
where LENGTH <= 10 or LENGTH is null;
