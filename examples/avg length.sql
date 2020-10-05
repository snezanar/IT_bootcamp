/*Find films whose lengths are greater than the list of the average lengths*/
SELECT film_id, length FROM film
HAVING length > ALL (SELECT AVG(length) FROM film GROUP BY rating);