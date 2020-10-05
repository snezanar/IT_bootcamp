/*Find customers who have ate least one payment whose amount is greater that 11*/
SELECT first_name, last_name FROM customer 
WHERE EXIST (SELECT * FROM payment 
WHERE payment.customer_id=customer.customer_id AND amount>11);