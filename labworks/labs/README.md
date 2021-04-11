# Java SE
 Java SE курс 2021 МАИС

 Список лаб и прочих заданий

 `labworks` список лаб

 1. [x] `labs.lab1` **Простое Приложение Здравствуй Мир**
 Создать проект на Java. Реализовать функциональность Hello, World, печатающую строку 100 раз."
 2. [x] `labs.lab2` **Алфавит**
 Вывести все буквы от A до Z с помощью цикла. Использовать тип данных char.
 3. [x] `labs.lab3` **Вспомнить все.**
 По введенному номеру дня недели вывести название дня недели, используя оператор множественного выбора (switch).
 Нумерация дней недели начинается с 1 – понедельник, 2 — вторник и т. д."
 4. [x] `labs.lab4` **Квадратное уравнение**
    По введённым трём коэффициентам, вывести решение квадратного уравнения вида ax^2+bx+c=0
    Использовать класс Scanner для ввода значений с клавиатуры.
5. [x] `labs.lab5` **Палиндром**
 Программа должна в качестве входных данных, принимать пятизначные числа и определять, является ли введенное пятизначное число палиндромом.
 Палиндром — это число или текст (набор символов), который читается одинаково и слева, и справа: 939; 49094; 11311.
 Научитесь пользоваться операцией — остаток от деления, тогда легко найдете способ решения данной задачи.
 ---
 Пример работы программы №1:\
 Введите пятизначное число: 54045\
 Это число палиндром

 -----
 Пример работы программы №2:\
 Введите пятизначное число: 5045\
 Введите пятизначное число

 ---
 Пример работы программы №3:\
 Введите пятизначное число: 54035\
 Это число не палиндром

6. [ ] **Драконий мир**
    Создать класс Dragon, добавить в него два свойства (поля) name и tooth.
    Создать два метода getter-а getName() getTooth()
    Добавить метод для удара огнем fire(). Этот метод принимает в качестве значения другого дракона Dragon и описывает в виде строки в консоли, что один дракон ударил другого.
   
7. [ ] **Наследие**
 Создать базовый абстрактный класс.
 Создать два интерфейса, которые являются носителями свойств (по одному свойству каждый).
 Реализовать конкретные классы вида:
   - наследник базового абстрактного класса и реализатор первого интерфейса.
   - наследник базового абстрактного класса и реализатор второго интерфейса.
   - наследник базового абстрактного класса и реализатор и первого и второго интерфейсов.

Затем создать класс `Main`, в котором создать экземпляры трех классов и продемонстрировать их работу посредством вызова всех их методов.

8. [ ] **Овладение ООП. "Полиморфизм"**
Придумать и реализовать иерархию из трёх классов. Каждый следующий — наследник предыдущего. Создайте ещё один класс, который наследует один из этих трёх классов (не базовый).
    К примеру: млекопитающие -> кошки -> гладкошерстные и т.д.
    И кошки -> вислоухие
    Пусть у всех таких классов будет одно общее свойство (кошки мяукают), но каждый подкласс делает это по-своему. После этого создать массив млекопитающих и попросить в цикле каждого из них выполнить общее для всех действие.
    
9. [ ] **Поиск геномных последовательностей**
   Задать массив целых чисел длиной 10 элементов.
   Заполнить его числами.
   Затем реализовать сортировку этой последовательности от меньшего к большему.
   Результат вывести в консоль компьютера.
   Нельзя использовать метод *Arrays.sort* и подобные ему.
    
10. [ ] **Незадачливый строитель.**
    Напишите программу, которая должна определить, пройдет ли кирпич в отверстие.
    Размеры отверстия (длина и высота) вводит пользователь.
    Тоже самое касается габаритов кирпича, пользователь вводит в программу значения длины, ширины и высоты кирпича.
    Умный строитель умеет вращать кирпич и может пытаться пропихнуть кирпич в отверстие разными сторонами.
    
11. [ ] `labs.codeDaVinchi` **Код Да Винчи**
    Вывести на экран N чисел Фибоначчи.
    Числа Фибоначчи - это ряд таких чисел, который начинается с 1 и 1 и затем каждое следующее число равно сумме двух предыдущих.
    Начало последовательности выглядит так: 1, 1, 2, 3, 5, 8, 13, 21, 34,
    Число N вводится пользователем с клавиатуры.
    Программа должна достаточно быстро работать для подсчета 500 чисел Фибоначчи.
    Алгоритм не должен использовать рекурсию.
    
12. [ ] `labs.matrix` **След матрицы**
    Найти след матрицы, след матрицы — сумма элементов главной диагонали. Размер матрицы вводит пользователь, матрицу заполнять случайными числами.
----------------
Пример работы программы:
Введите количество строк матрицы: 5

61  16  39  79  99  
66  42  71   5  68  
80  64  34  12  44  
63  64  40  21   3  
17  31  99  41  72

След матрицы: 230
Замечание: если в итоге для подсчета вы используете два вложенных цикла, проходящих по всем элементам двумерного массива, то вам нужно изменить алгоритм так, чтобы там был только один цикл.

13. [ ] **Односвязный список**
1) Реализовать класс Element && класс List для хранения данных типа int.
2) в классе List реализовать метод addElement() - добавление элемента в начало списка.
3) в классе List реализовать метод getSize () - возвращает размер списка. Нужно сделать так, чтобы при вызове этого метода он возвращал одно закешированное значение. Не нужно чтобы метод проходил по всему списку.
4) в классе List реализовать метод remove() - удаление первого элемента списка и возвращение этого значения в качестве результата работы метода.
   Проверить работу этого метода в совокупности с методом add()
   Запрещено использовать массивы и другие коллекции объектов.

14. [ ] **Средний по больнице**
Разработать функцию, в которую передается в качестве аргументов массив типа float.
Функция должна возвращать среднее арифметическое элементов массива.
Если размер массива - нуль, то среднее арифметическое должно быть также нуль.
    
15. [ ] **Вычисление Функции Высшего Порядка.**
Посчитать факториал числа, вводимого пользователем. Пользователь может ввести отрицательное число или буквенные символы. Алгоритм не должен использовать рекурсию.
    
16. [ ] **Анализ Креативности Текста.**
Подсчитать количество слов и букв в строке. Слово - это последовательность символов, разделенных одним или несколькими символами-разделителями. Буква - это символ, не являющийся разеделителем.
Разделители слов: пробел, табуляция, перевод каретки, знаки препинания. Полный список: "",.!?:;()""
Нельзя использовать для разбора строки класс StringTokenizer, String.split(), substring() и подобные им.
В программе нельзя использовать вложенные циклы. Так же не рекомендуется использовать метод String.indexOf().
Программа не должна создавать дополнительные строки сравнимого размера с введенной строкой.
Программа должна проходить тест на следующих данных:
1) ""    xxx,    xx x   x""
2) ""xxxxxxx""
3) ""xxxxxxx.    ""
4) ""xxx,xxxx""
5) ""xxx,xxxx""
6) ""........""
7) ""... xxx...  ""
8) """" - пустая строка"
   
17. [ ] **Математический Аппарат Вычисления Произвольной Функции**
   Установить правильность расстановки скобок в математическом выражении. Программа должна на введенную строку выдавать ответ “правильно/неправильно”. Входная строка может выглядеть вот так: “(a)(b) c (d(efg))”, “(a(b)c)d)”.
   Программа должна проходить тест на следующих данных:
1) ""()()()"" OK
2) ""()(())"" OK
3) "")("" Error
4) ""(()())"" OK
5) """" OK
6) ""((())"" Error
7) ""(()))"" Error
9) ( () )) (( () )  - Error
   Модифицировать введенный текст нельзя.
   Создавать структуры сходного размера нельзя.
   
18. [ ] **Подсчет действий пользователя.**
   Создать простой графический интерфейс с подсчетом количества нажатий на кнопку, прокручаваемой областью текста, радио-кнопками и ползунком. 
    
19. [ ] **Notepad Killer.**
   Вывести в графическую форму содержимое текстового файла. Предусмотреть возможность открытия и сохранения файла через меню а также редактирования этого файла.
   
20. [ ] **Длинный и короткий**
   Поиск в массиве целых чисел минимума и максимума значений.
   Нельзя использовать метод Arrays.sort и подобные ему. Нельзя сортировать массив значений.
    
21. [ ] **Хорошая попытка**
   Отработка try-catch-finally-throw
   реализовать пример:
   ```try {
   sout (1) - должен вывести на экран
   throw new Exception ()
   sout (2) - Не должен скомпилироваться.
   } catch (Exception e)
   sout (3) - должен вывести на экран при брошенном исключении
   finally {
   sout (4) - должен вывести на экран
   }
   ```
   
22. [ ] **Matrix has you**
1) Создать класс Matrix, у которого есть приватное поле matrix представляющее из себя двумерный массив размерностями m на n.
   Значения m и n задаются в конструкторе класса Matrix.
2) В классе Matrix реализовать метод add(Matrix x) который к старому содержимому матрицы прибавляет содержимое матрицы x (параметра)
3) Предусмотреть в классе Matrix возможность сложения матриц разных резмерностей. В этом случае метод add() должен выдавать ошибку и не совершать сложение. Старая матрица при этом должна остаться как есть."
   
23. [ ] **Параллельное программирование.**
   Продемонстрировать одновременную работу двух или более потоков исполнения (Threads) программы. Их состояние отображать на экране с помощью компонента JProgressBar.
   Изменение состояний компонентов progressbar должно происходить от 0 до максимальных их значений линейно с различной скоростью для двух компонентов.
   Нельзя использовать два разных класса-наследника класса Thread.
   Нельзя использовать глобальные переменные.
   
24. [ ] **Графическая визуализация зависимости параметров.**
   Построить график произвольной функции. Функция задается в виде выражения на языке Java.
   
25. [ ] **База данных клиентов.**
   В приложении, написанном на Java, установить соединение с базой данных. (Просто так создать БД и показать ее схему недостаточно. Нужно именно Java-приложение).
   Приложение должно отправлять на исполнение несколько различных запросов : select, update, insert. Можно воспользоваться JavaDB, которая встроена в среду разработки NetBeans.
    
26. [ ] **Реализация сетевого клиента и сервера.**
   Проверить, что сервер отсылает сообщение на клиента.
   Проверить, что клиент отсылает сообщение на сервер.
   Клиент отправляет на сервер серию из нескольких чисел. Признак окончания - присланный нуль.
   Сервер принимает всю серию из этих данных и производит поиск самого большого числа и самого маленького числа среди них.
   Сервер отправляет обратно на клиент самое большое число и самое малое числа, найденные в серии.
   Если клиент не присылает ни одного значения, то `min=0, max=0;`
   
27. [ ] **Какое ваше ФИО?**
   Реализовать графическое приложение для хранения записей о контактах: ФИО,
   дата рождения, адрес, телефон. Приложение должно предоставлять возможность
   редактировать контакты, добавлять, удалять и сохранять и восстанавливать контент с диска. Хранилищем
   данных может быть:
1) текстовый файл
2) XML файл
   
28. [ ] **Написать модульные тесты (JUnit) на задание про подсчет слов и букв в предложении.**

29. [ ] **Написать модульные тесты (JUnit) на задание про подсчет скобок.**