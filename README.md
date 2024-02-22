# Итоговая контрольная работа

### 1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).

![](final-control-work_imgs/2024-02-20_23-06.png)

### 2. Создать директорию, переместить файл туда.

![](final-control-work_imgs/2024-02-20_23-16.png)

### 3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.

![](final-control-work_imgs/2024-02-20_23-23.png)
![](final-control-work_imgs/2024-02-20_23-25.png)
![](final-control-work_imgs/2024-02-20_23-26.png)
![](final-control-work_imgs/2024-02-20_23-27.png)

### 4. Установить и удалить deb-пакет с помощью dpkg.

![](final-control-work_imgs/2024-02-20_23-42.png)

### 5. Выложить историю команд в терминале ubuntu
![](final-control-work_imgs/2024-02-20_23-46.png)

<a href="final-control-work_files/task_5_command_history.txt">Файл истории.</a> Из файла удалены команды, которые вбивались до начала выполнения представленной контрольной работы.

### 6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы).
![](final-control-work_imgs/diagr_v2.png)


### 7. В подключенном MySQL репозитории создать базу данных “Друзья человека”

<a href="final-control-work_files/task_7-12.sql">Файл sql запросов, строки 1-5.</a>

### 8. Создать таблицы с иерархией из диаграммы в БД

<a href="final-control-work_files/task_7-12.sql">Файл sql запросов, строки 6-93</a>

### 9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения

<a href="final-control-work_files/task_7-12.sql">Файл sql запросов, строки 94-124</a>

### 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

<a href="final-control-work_files/task_7-12.sql">Файл sql запросов, строки 126-134</a>

### 11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице

<a href="final-control-work_files/task_7-12.sql">Файл sql запросов, строки 135-169</a>

### 12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

<a href="final-control-work_files/task_7-12.sql">Файл sql запросов, строки 170-190</a>

### 13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.

<a href="final-control-work_prog/src/model/animal/">Созданы классы в соответствии с диаграммой.</a>

### 14. Написать программу, имитирующую работу реестра домашних животных.

### В программе должен быть реализован следующий функционал:
#### 14.1 Завести новое животное
#### 14.2 определять животное в правильный класс
#### 14.3 увидеть список команд, которое выполняет животное
#### 14.4 обучить животное новым командам
#### 14.5 Реализовать навигацию по меню

### 15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной̆на 1 при нажатии “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведения животного заполнены все поля.