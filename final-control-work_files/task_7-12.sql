-- 7. Создать базу данных “Друзья человека”
DROP DATABASE IF EXISTS human_frends;
CREATE DATABASE human_frends;
USE human_frends;

-- 8. Создать таблицы с иерархией из диаграммы в БД
-- Я не понимаю, что нужно делать. Предположу, что то, что я написала.

CREATE TABLE animals (
    id SERIAL PRIMARY KEY,
    animal_type VARCHAR(50)
);

INSERT INTO animals (animal_type) VALUES
('Домашние животные'),
('Вьючные животные');

CREATE TABLE pets (
    id SERIAL PRIMARY KEY,
    animal_type INT REFERENCES animals(id),
    animal_kind VARCHAR(50)
);

CREATE TABLE pack_animals (
    id SERIAL PRIMARY KEY,
    animal_type INT REFERENCES animals(id),
    animal_kind VARCHAR(50)
);

INSERT INTO pets (animal_type, animal_kind) VALUES
(1, 'Кошки'),
(1, 'Собаки'),
(1, 'Хомяки');

INSERT INTO pack_animals (animal_type, animal_kind) VALUES
(2, 'Лошади'),
(2, 'Верблюды'),
(2, 'Ослы');

CREATE TABLE dogs (
    id SERIAL PRIMARY KEY,
    animal_kind INT REFERENCES pets(id),
    name VARCHAR(50),
    birthday DATE,
    commands TEXT,
    color VARCHAR(50)
);

CREATE TABLE cats (
    id SERIAL PRIMARY KEY,
    animal_kind INT REFERENCES pets(id),
    name VARCHAR(50),
    birthday DATE,
    commands TEXT,
    color VARCHAR(50)
);

CREATE TABLE hamsters (
    id SERIAL PRIMARY KEY,
    animal_kind INT REFERENCES pets(id),
    name VARCHAR(50),
    birthday DATE,
    commands TEXT,
    color VARCHAR(50)
);

CREATE TABLE horses (
    id SERIAL PRIMARY KEY,
    animal_kind INT REFERENCES pack_animals(id),
    name VARCHAR(50),
    birthday DATE,
    commands TEXT,
    capacity VARCHAR(50)
);

CREATE TABLE camels (
    id SERIAL PRIMARY KEY,
    animal_kind INT REFERENCES pack_animals(id),
    name VARCHAR(50),
    birthday DATE,
    commands TEXT,
    capacity VARCHAR(50)
);

CREATE TABLE donkeys (
    id SERIAL PRIMARY KEY,
    animal_kind INT REFERENCES pack_animals(id),
    name VARCHAR(50),
    birthday DATE,
    commands TEXT,
    capacity VARCHAR(50)
);

-- 8. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения

INSERT INTO dogs (animal_kind, name, birthday, commands, color) VALUES
(2, 'Бобик', '2010-05-20', 'сидеть, лежать, бежать', 'коричневый'),
(2, 'Робик', '2012-11-15', 'кричать, бежать, дать лапу', 'черный'),
(2, 'Гобик', '2015-03-10', 'лежать', 'белый');

INSERT INTO cats (animal_kind, name, birthday, commands, color) VALUES
(1, 'Муська', '2013-07-08', 'лежать', 'черепаховый'),
(1, 'Мурка', '2012-09-25', 'лежать, мурчать', 'черный'),
(1, 'Элизабет', '2015-04-12', 'лежать', 'белый');

INSERT INTO hamsters (animal_kind, name, birthday, commands, color) VALUES
(3, 'Скоромрун', '2021-02-14', 'бежать', 'серый'),
(3, 'Пушок', '2022-05-30', 'лежать', 'рыжий'),
(3, 'Пипетка', '2020-11-08', 'замереть', 'белый');

INSERT INTO horses (animal_kind, name, birthday, commands, capacity) VALUES
(1, 'Стремительный', '2005-04-17', 'тпрууу', '80 кг'),
(1, 'Буцефал', '2010-12-25', 'бежать быстрее', '100 кг'),
(1, 'Находка', '2012-07-30', 'бежать галопом, стоять', '50 кг');

INSERT INTO camels (animal_kind, name, birthday, commands, capacity) VALUES
(2, 'Горбатый', '2004-10-12', 'идти', '120 кг'),
(2, 'Охота', '2009-01-28', 'нести, идти', '100 кг'),
(2, 'Петр', '2011-06-15', 'бежать, стоять, подойти', '90 кг');

INSERT INTO donkeys (animal_kind, name, birthday, commands, capacity) VALUES
(3, 'Умник', '2003-08-22', 'идти', '40 кг'),
(3, 'Иа', '2007-11-18', 'нести', '30 кг'),
(3, 'Иннокентий', '2010-04-05', 'стоять, нести', '50 кг');

-- 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

DELETE FROM camels;

CREATE TABLE horses_and_donkeys AS
SELECT * FROM horses
UNION ALL
SELECT * FROM donkeys;

-- 11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице

-- Ну вот тут я запуталась.

-- CREATE TABLE yang_animals AS
-- SELECT name, birthday, 
--        DATE_PART('year', age(CURRENT_DATE, birthday)) * 12 + DATE_PART('month', age(CURRENT_DATE, birthday)) AS age_months
-- FROM cats
-- WHERE birthday <= CURRENT_DATE - INTERVAL '1 year' AND birthday > CURRENT_DATE - INTERVAL '3 year'
-- UNION ALL
-- SELECT name, birthday, 
--        DATE_PART('year', age(CURRENT_DATE, birthday)) * 12 + DATE_PART('month', age(CURRENT_DATE, birthday)) AS age_months
-- FROM dogs
-- WHERE birthday <= CURRENT_DATE - INTERVAL '1 year' AND birthday > CURRENT_DATE - INTERVAL '3 year'
-- UNION ALL
-- SELECT name, birthday, 
--        DATE_PART('year', age(CURRENT_DATE, birthday)) * 12 + DATE_PART('month', age(CURRENT_DATE, birthday)) AS age_months
-- FROM hamsters
-- WHERE birthday <= CURRENT_DATE - INTERVAL '1 year' AND birthday > CURRENT_DATE - INTERVAL '3 year'
-- UNION ALL
-- SELECT name, birthday, 
--        DATE_PART('year', age(CURRENT_DATE, birthday)) * 12 + DATE_PART('month', age(CURRENT_DATE, birthday)) AS age_months
-- FROM horses
-- WHERE birthday <= CURRENT_DATE - INTERVAL '1 year' AND birthday > CURRENT_DATE - INTERVAL '3 year'
-- UNION ALL
-- SELECT name, birthday, 
--        DATE_PART('year', age(CURRENT_DATE, birthday)) * 12 + DATE_PART('month', age(CURRENT_DATE, birthday)) AS age_months
-- FROM camels
-- WHERE birthday <= CURRENT_DATE - INTERVAL '1 year' AND birthday > CURRENT_DATE - INTERVAL '3 year'
-- UNION ALL
-- SELECT name, birthday, 
--        DATE_PART('year', age(CURRENT_DATE, birthday)) * 12 + DATE_PART('month', age(CURRENT_DATE, birthday)) AS age_months
-- FROM donkeys
-- WHERE birthday <= CURRENT_DATE - INTERVAL '1 year' AND birthday > CURRENT_DATE - INTERVAL '3 year';

-- 12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

-- Это "визуально" или прям объединить в новую таблицу?..
-- CREATE TABLE all_animals AS
SELECT 'cats' AS animal_type, id, animal_kind, name, birthday, commands, color, null AS capacity 
FROM cats
UNION ALL
SELECT 'dogs' AS animal_type, id, animal_kind, name, birthday, commands, color, null AS capacity 
FROM dogs
UNION ALL
SELECT 'hamsters' AS animal_type, id, animal_kind, name, birthday, commands, color, null AS capacity 
FROM hamsters
UNION ALL
SELECT 'horses' AS animal_type, id, animal_kind, name, birthday, commands, null AS color, capacity
FROM horses
UNION ALL
SELECT 'camels' AS animal_type, id, animal_kind, name, birthday, commands, null AS color, capacity
FROM camels
UNION ALL
SELECT 'donkeys' AS animal_type, id, animal_kind, name, birthday, commands, null AS color, capacity
FROM donkeys;