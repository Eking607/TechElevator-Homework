-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor (first_name, last_name)
VALUES            ('HAMPTON', 'AVENUE');
INSERT INTO actor (first_name, last_name)
VALUES            ('LISA', 'BYWAY');


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

INSERT INTO film (title, description, release_year, language_id, length)
VALUES           ('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.


INSERT INTO film_actor (actor_id, film_id)
VALUES                 (202, 1001);
INSERT INTO film_actor (actor_id, film_id)
VALUES                 (201, 1001);


-- 4. Add Mathmagical to the category table.

INSERT INTO category (name)
VALUES               ('Mathmagical');


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

SELECT * FROM film WHERE title IN ('EUCLIDEAN PI', 'EGG IGBY' , 'KARATE MOON' , 'RANDOM GO' , 'YOUNG LANGUAGE');


INSERT INTO film_category (film_id, category_id)
VALUES                    (274, 17);
INSERT INTO film_category (film_id, category_id)
VALUES                    (494, 17);
INSERT INTO film_category (film_id, category_id)
VALUES                    (714, 17);
INSERT INTO film_category (film_id, category_id)
VALUES                    (996, 17);
INSERT INTO film_category (film_id, category_id)
VALUES                    (1001, 17);


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

SELECT * FROM film WHERE film_id IN (274, 494 , 714 , 996 , 1001);

UPDATE film SET rating = 'G'
WHERE film_id IN (274, 494 , 714 , 996 , 1001);


-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory (film_id, store_id)
VALUES                (1001, 1);
INSERT INTO inventory (film_id, store_id)
VALUES                (1001, 2);


-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)


SELECT * FROM film where film_id = 1001;

DELETE FROM film
WHERE film_id = 1001;

-- < Delete failed because it violates foreign key constraint. 
--   It points to a row in film_actor so it can not be deleted>



-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)


SELECT * FROM category WHERE category_id = 17;

DELETE FROM category 
WHERE category_id = 17;

-- < Delete failed because it violates foreign key constraint. 
--   It points to a row in film_category table so it can not be deleted >



-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)


DELETE FROM film_category
WHERE category_id = 17;

-- <Delete successful. There are no constraints>



-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)


DELETE FROM category 
WHERE category_id = 17;

-- <Delete successful this time since the constraint is gone from the film_category table.>

DELETE FROM film
WHERE film_id = 1001;

-- < Delete failed because it violates foreign key constraint. 
--   It points to a row in film_actor table so it can not be deleted >



-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;

-- That movie cant be deleted until the foreign key constraints are gone.
-- So the foreign key constraints are in the category and inventory tables.
-- You have to delete rows where the film is connected to in the category and inventory tables.