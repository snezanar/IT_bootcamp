/*Find customer who have payment*/
SELECT customer.customer_id, amount FROM customer
INNER JOIN payment ON customer.customer_id=payment.customer_id
WHERE amount>0
ORDER BY amount;