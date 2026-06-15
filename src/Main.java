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


}