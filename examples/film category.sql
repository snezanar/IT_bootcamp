/* Find films whose category is either Action or Drama*/
SELECT film.film_id, film.title, film_category.category_id FROM film 
FULL OUTER JOIN film_categoty ON film_category.film_id=film.film_id
WHERE category_id=1 OR category_id=7;