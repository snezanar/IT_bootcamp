SELECT MAX(LENGTH) FROM film INNER JOIN film_categoty 
ON film.film_id=film_category.film_id 
GROUP BY category_id;