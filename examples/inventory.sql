/*Select only film titles that are not in the inventory*/
SELECT film.film_id, film.title, inventory.inventory_id FROM film
LEFT JOIN inventory ON film.film_id=inventory.film_id
WHERE inventory.film_id IS NULL;