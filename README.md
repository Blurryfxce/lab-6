### Мета
У цій лабораторній роботі студентам необхідно створити програму на Java, яка використовує багатовимірні масиви, маніпуляції з масивами та складні алгоритми для вирішення реальної проблеми, сприяючи глибшому розумінню масивів в Java.

### Завдання
Уявіть, що вам потрібно створити Java-додаток для кінотеатру. У кінотеатрі п'ять залі, кожен з яких має розміщення місць у 10 рядів та 20 місць. Місця представлені 3D масивом, де перший вимір представляє зал, другий - ряд, а третій - місце.

1. **Ініціалізація Масиву:** Створіть 3D масив для представлення кінотеатру. Ініціалізуйте масив нулями, що вказує на те, що всі місця вільні.

2. **Бронювання Місць:** Напишіть метод bookSeats(int hallNumber, int row, int[] seats), який приймає номер залу, номер ряду, номери місць для бронювання. Метод повинен позначити заброньовані місця, змінивши відповідні нулі на одиниці. Якщо місця заброньовані, система повинна сповістити про це користувача.

4. **Скасування Бронювання:** Напишіть метод cancelBooking(int hallNumber, int row, int[] seats), який скасовує бронювання, змінюючи відповідні одиниці назад на нулі.

5. **Перевірка Наявності:** Напишіть метод checkAvailability(int screen, int numSeats), який перевіряє, чи доступна задана кількість послідовних місць в будь-якому ряду зазначеного залу.

6. **Друк Схеми Розміщення Місць:** Напишіть метод printSeatingArrangement(int hallNumber), який друкує схему розміщення місць для даного залу, вказуючи заброньовані та доступні місця.

### Висновок:
Поглябив знання в роботі з багатовимірними масивами.
