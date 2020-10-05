/*Find each Staff name for each customer who have payment*/
SELECT staff.staff_id, staff.first_name, payment.customer_id, amount FROM staff
INNER JOIN payment ON staff.staff_id=payment.staff_id
WHERE amount>0
ORDER BY staff_id;