void main() {
    //1. Пользователь вводит радиус круга (double). Вывести:
    //длину окружности;
    //площадь круга.

    /*System.out.println("Введите радиус:");
    Scanner console = new Scanner(System.in);
    double radius = console.nextDouble();
    System.out.println("Длина окружности равна: " + Math.round((2 * Math.PI * radius) * 10000) / 10000.0);
    System.out.println("Площадь круга равна: " + Math.round((Math.PI * radius * radius) * 10000) / 10000.0);

    console.close();*/

    //2. Пользователь вводит температуру в градусах Цельсия (double).
    //Перевести её в Фаренгейты по формуле

    /*System.out.println("Введите температуру в градусах Цельсия: ");
    Scanner console = new Scanner(System.in);
    double temp = console.nextDouble();

    System.out.println("Температура в градусах Фаренгейта равна: "+Math.round((temp*9/5+32)*10000)/10000.0);
    console.close();*/


    //3. Пользователь вводит символ (char).
    //Определить:
    //является ли он цифрой;
    //является ли он буквой;
    //является ли он заглавной буквой.

    /*System.out.println("Введите символ: ");
    Scanner console = new Scanner(System.in);
    String input = console.next();

    if (input.length() != 1) {
        System.out.println("Ошибка, Вы ввели: " + input.length() + " символов, а нужно только один");
        console.close();
        return;
    }

    char symbol = input.charAt(0);

    if (symbol >= '0' && symbol <= '9') {
        System.out.println("Символ '" + symbol + "' является цифрой");
    } else if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'А' && symbol <= 'Я')) {
        System.out.println("Символ '" + symbol + "' является заглавной буквой");
    } else if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'а' && symbol <= 'я')) {
        System.out.println("Символ '" + symbol + "' является строчной буквой");
    } else
        System.out.println("Символ '" + symbol + "' является специальным символом");

    console.close();*/

    //4. Дан символ. Вывести следующий символ таблицы Unicode.

    /*System.out.println("Введите символ: ");
    Scanner console = new Scanner(System.in);
    String input = console.next();

    if (input.length() != 1) {
        System.out.println("Ошибка, Вы ввели: " + input.length() + " символов, а нужно только один");
        console.close();
        return;
    }

    char symbol = input.charAt(0);

    System.out.println(symbol == 65535 ? "Следующего символа нет" :
            "Следующий символ: " + (char)(symbol + 1));*/

    //Задача 5
    //Создать массив из 10 целых чисел. Заполнить его числами от 1 до 10 и вывести на экран

    /*Random rand = new Random();

    int[] array = new int[10];

    for (int i=0;i<array.length;i++){
        array[i]= rand.nextInt(10)+1;
        System.out.print(array[i]+" ");
    }*/

    //Задача 6
    //Найти сумму всех элементов массива.

    /*Random rand = new Random();

    System.out.println("Введите длину массива: ");
    Scanner console = new Scanner(System.in);
    int size = console.nextInt();

    int[] array= new int [size];

    int sum=0;

    for (int i=0;i<size;i++){
        array[i]= rand.nextInt(199)-99;
        System.out.print(array[i]+" ");
        sum+=array[i];
    }

    System.out.println();
    System.out.println("Сумма элементов массива: "+sum);*/

    //Задача 7
    //Найти максимальный элемент массива.

    /*Random rand = new Random();

    System.out.println("Введите длину массива: ");
    Scanner console = new Scanner(System.in);
    int size = console.nextInt();

    int[] array= new int [size];

    for (int i=0;i<array.length;i++) {
        array[i] = rand.nextInt(101);
        System.out.print(array[i] + " ");
    }

    int max = array[0];
    for (int arr:array) {
        if (arr>max)
            max=arr;
    }

    System.out.println();
    System.out.println("Максимальный элемент массива: "+max);*/


    //Задача 8
    //Посчитать количество чётных чисел в массиве.

    /*Random rand = new Random();

    System.out.println("Введите длину массива: ");
    Scanner console = new Scanner(System.in);
    int size = console.nextInt();

    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
        array[i] = rand.nextInt(101);
        System.out.print(array[i] + " ");
    }

    int count=0;

    for (int arr:array) {
        if (arr%2==0)
            count++;
    }
    System.out.println();
    System.out.println("Четных элементов в массиве: "+count);*/


    //Задача 9
    //Создать двумерный массив 4×4.
    //Заполнить его числами от 1 до 16 и красиво вывести на экран.

    /*int[][] array= new int[4][4];

    int count=1;
    for (int i=0;i<4;i++){
        for (int j=0;j<4;j++){
            array[i][j]=count;
            count++;
        }
    }

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.printf("%4d", array[i][j]);
        }
        System.out.println();
    }*/

    //Задача 10
    //Написать метод: int square(int number)
    //который возвращает квадрат числа.

    /*System.out.println("Введите число: ");
    Scanner console = new Scanner(System.in);
    int number = console.nextInt();

    System.out.println("Квадрат числа: " + Square.square(number));*/

    //Задача 11
    //Написать метод: double average(double a, double b, double c)
    //который возвращает среднее арифметическое трёх чисел.

    /*System.out.println("Введите 3 числа: ");
    Scanner console = new Scanner(System.in);
    double a = console.nextDouble();
    double b = console.nextDouble();
    double c = console.nextDouble();

    System.out.println("Среднее арифметическое введенных чисел: " + average(a, b, c));*/

    //Задача 12
    //Написать метод: boolean isEven(int number)
    //который определяет, является ли число чётным.

    /*System.out.println("Введите число: ");
    Scanner console = new Scanner(System.in);
    int number = console.nextInt();

    System.out.println("Является ли число " + number + " четным: " + isEven(number));*/

    //Задача 13
    //Написать метод char toUpperCase(char ch)
    //который переводит английскую букву в верхний регистр.

    /*System.out.println("Введите символ: ");

    Scanner scanner = new Scanner(System.in);
    char symbol = scanner.next().charAt(0);

    System.out.println(toUpperCase(symbol));*/

    //Задача 14
    //Написать метод int[] createArray(int size)
    //который создаёт массив заданного размера и заполняет его числами от 1 до size.

    /*System.out.println("Введите размер массива: ");
    Scanner console = new Scanner(System.in);
    int size = console.nextInt();

    int[] array = createArray(size);

    for (int i = 0; i < size; i++) {
        System.out.print(array[i] + " ");
    }*/

}

static double average(double a, double b, double c) {
    return Math.round((a + b + c) / 3 * 100) / 100.00;
}

static boolean isEven(int number) {
    if (number % 2 == 0)
        return true;
    else
        return false;
}

static char toUpperCase(char ch) {
    return Character.toUpperCase(ch);
}

static int[] createArray(int size) {
    Random rand = new Random();
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
        array[i] = rand.nextInt(size) + 1;
    }

    return array;
}
