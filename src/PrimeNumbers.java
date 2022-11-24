import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
//                Первое простое число очевидно, поскольку оно следующее за 1
//                и других делителей иметь не может
                primeNumbers[i] = 2;
            } else {
//                В рамках этого блока ищем простые числа только среди нечетных.
//                Единственное четное простое число найдено в предыдущем блоке
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;

//                0 - значение элемента массива int'ов по умолчанию.
//                Если значение все еще 0 - мы не нашли простое число
                while (primeNumbers[i] == 0) {
                    int j = 0;
                    boolean isPrime = true;

//                    Перебираем все простые делители из массива, которые меньше половины текущего числа.
//                    Составные делители проверять нет смысла - они состоят из простых.
//                    Перебирать делители, большие половины числа смысла нет - деления нацело не будет.
//                    При number / primeNumbers[j] == 1 делитель уже больше, чем 0.5*number.
                    while (isPrime && j < i && number / primeNumbers[j] > 1) {
//                        Если число поделилось на простой делитель - оно составное.
//                        Проверять остальные делители смысла не имеет
                        if (number % primeNumbers[j] == 0) {
                            isPrime = false;
                        } else {
//                            В ином случае переходим к следующему делителю
                            j++;
                        }
                    }
//                    Если проверили все подходящие делители, а флаг еще true - число простое
                    if (isPrime) {
                        primeNumbers[i] = number;
                    } else {
//                        Если текущее число не подошло - переходим к следующему нечетному
                        number += 2;
                    }
                }
            }
        }

        int result = 0;

        for (int i : primeNumbers) {
            result += i;
        }

        System.out.println(result);
    }
}
