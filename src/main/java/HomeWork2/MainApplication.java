package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;
//import java.lang.Math;

public class MainApplication {
    public static void main(String[] args) {
        while (true) {// Добавлен цикл для проверки всех методов домашнего задания за один раз
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Введите число от 1 до 9 для выбора метода");
            System.out.println("1 - Знакомство с циклом For");
            System.out.println("2 - Определение суммы чисел массива больше 5");
            System.out.println("3 - Заполнение массива указанным числом");
            System.out.println("4 - Заполнение массива арифметической прогрессией");
            System.out.println("5 - Сравнение сумм первой и второй половины массива");
            System.out.println("6 - Суммирование массивов");
            System.out.println("7 - Поиск точки равновесия массива");
            System.out.println("8 - Проверка сортировки массива");
            System.out.println("9 - Зеркальное отражение массива");
            System.out.println("0 - Выход");

            int result = scanner.nextInt();
            if (result == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите любое текст");
                String str1 = sc.nextLine();
                System.out.println("Сколько раз напечатать этот текст?");
                int a1 = scanner.nextInt();
                forMe(a1, str1);
            }

            if (result == 2) {
                int[] a = new int[5];
                for (int i = 0; i < 5; i++) {
                    a[i] = (int) (Math.random() * 10);
                }
                System.out.println(Arrays.toString(a));
                sumMoreFive(a);
            }

            if (result == 3) {
                System.out.println("Введите любое число");
                int sc3 = scanner.nextInt();
                int[] arr3 = new int[10];
                arrFill(sc3, arr3);
            }
            if (result == 4) {
                System.out.println("Введите длину массива");
                int sc4 = scanner.nextInt();
                int[] arr4 = new int[sc4];
                System.out.println("Введите шаг");
                sc4 = scanner.nextInt();
                arrFillPlus(sc4, arr4);
            }
            if (result == 5) {
                int[] arr5 = new int[6];
                for (int i = 0; i < 6; i++) {
                    arr5[i] = (int) (Math.random() * 10);
                }
                System.out.println(Arrays.toString(arr5));
                comparison(arr5);
            }
            if (result == 6) {
                int a6 = (int) (Math.random() * 10 + 2);
                int b6 = (int) (Math.random() * 10 + 2);
                int c6 = (int) (Math.random() * 10 + 2);

                int[] arra6 = new int[a6];
                int[] arrb6 = new int[b6];
                int[] arrc6 = new int[c6];

                for (int i = 0; i < a6; i++) {
                    arra6[i] = (int) (Math.random() * 10);
                }
                for (int i = 0; i < b6; i++) {
                    arrb6[i] = (int) (Math.random() * 10);
                }
                for (int i = 0; i < c6; i++) {
                    arrc6[i] = (int) (Math.random() * 10);
                }

                System.out.println(Arrays.toString(arra6));
                System.out.println(Arrays.toString(arrb6));
                System.out.println(Arrays.toString(arrc6));
                sumArrays(arra6, arrb6, arrc6);

            }
            if (result == 7) {
                while (true) {
                    System.out.println();
                    System.out.println("Выберете массив для проверки работы метода");
                    System.out.println("1 - (1, 1, 1, 1, 1, 5)");
                    System.out.println("2 - (5, 3, 4 , -2)");
                    System.out.println("3 - (7, 2, 2, 2)");
                    System.out.println("4 - (9, 4)");
                    System.out.println("0 - Выход");
                    int result7 = scanner.nextInt();
                    if (result7 == 1) {
                        int[] arr7 = new int[]{1, 1, 1, 1, 1, 5};
                        indexArr(arr7);
                    } else if (result7 == 2) {
                        int[] arr7 = new int[]{5, 3, 4, -2};
                        indexArr(arr7);
                    } else if (result7 == 3) {
                        int[] arr7 = new int[]{7, 2, 2, 2};
                        indexArr(arr7);
                    } else if (result7 == 4) {
                        int[] arr7 = new int[]{9, 2};
                        indexArr(arr7);
                    } else if (result7 == 0) {
                        break;
                    }

                }
            }
            if (result == 8) {
                while (true) {
                    System.out.println();
                    System.out.println("Выберете массив для проверки работы метода");
                    System.out.println("1 - (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)");
                    System.out.println("2 - (0, 1, 2, 3, 4, 5, 7, 6, 8, 9)");
                    System.out.println("3 - (0, 1, 2, 3, 4, 5, 6, 6, 8, 9)");
                    System.out.println("4 - (9, 8, 7, 6, 5, 4, 3, 2, 1, 0)");
                    System.out.println("5 - (9, 8, 7, 6, 5, 4, 2, 3, 1, 0)");
                    System.out.println("6 - (9, 8, 7, 6, 5, 4, 4, 3, 1, 0)");
                    System.out.println("0 - Выход");
                    int result8 = scanner.nextInt();

                    if (result8 == 1) {
                        int[] arr8 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                        checkArr(arr8);
                        //System.out.println(Arrays.toString(arr8));
                    }
                    if (result8 == 2) {
                        int[] arr8 = new int[]{0, 1, 2, 3, 4, 5, 7, 6, 8, 9};
                        checkArr(arr8);
                    }
                    if (result8 == 3) {
                        int[] arr8 = new int[]{0, 1, 2, 3, 4, 5, 6, 6, 8, 9};
                        checkArr(arr8);
                    }
                    if (result8 == 4) {
                        int[] arr8 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
                        checkArr(arr8);
                    }
                    if (result8 == 5) {
                        int[] arr8 = new int[]{9, 8, 7, 6, 5, 4, 2, 3, 1, 0};
                        checkArr(arr8);
                    }
                    if (result8 == 6) {
                        int[] arr8 = new int[]{9, 8, 7, 6, 5, 4, 4, 3, 1, 0};
                        checkArr(arr8);
                    }
                    if (result8 == 0) {
                        break;
                    }

                }

            }


            if (result == 9) {
                System.out.println("Задайте длину массива");
                int sc9 = scanner.nextInt();
                int[] arr9 = new int[sc9];
                for (int i = 0; i < sc9; i++) {
                    arr9[i] = i;
                }
                System.out.println(Arrays.toString(arr9));
                overturn(arr9);
            }
            if (result == 0) {
                break;
            }

        }
    }

    private static void checkArr(int[] arr8) {// Метод №8 Проверка сортировки массива
        int a = arr8.length;
        System.out.println("Проверяем массив на сортировку по:\n1 - возрастанию\n2 - убыванию");
        Scanner sc8 = new Scanner(System.in);
        int result = sc8.nextInt();
        if (result == 1) {
            for (int i = 0; i < a - 1; i++) {
                if (arr8[i + 1] < arr8[i]) {
                    System.out.print("Массив: ");
                    System.out.print(Arrays.toString(arr8));
                    System.out.println(" не отсортирован по возрастанию");
                    break;
                }
                if (i == a - 2) {
                    System.out.print("Массив: ");
                    System.out.print(Arrays.toString(arr8));
                    System.out.println(" отсортирован по возрастанию");
                }
            }
        }
        if (result == 2) {
            for (int i = 0; i < a - 1; i++) {
                if (arr8[i + 1] > arr8[i]) {
                    System.out.print("Массив: ");
                    System.out.print(Arrays.toString(arr8));
                    System.out.println(" не отсортирован по убыванию");
                    break;
                }
                if (i == a - 2) {
                    System.out.print("Массив: ");
                    System.out.print(Arrays.toString(arr8));
                    System.out.println(" отсортирован по убыванию");
                }
            }
        }


    }


    private static void overturn(int[] arr9) {// Метод №9 Зеркальное отражение массива
        int a = arr9.length;
        for (int i = 0; i < a / 2; i++) {
            int b = a - i - 1;
            int exchange = arr9[b];
            arr9[b] = arr9[i];
            arr9[i] = exchange;
        }
        System.out.println(Arrays.toString(arr9));

    }

    private static void indexArr(int arr[]) {// Метод №7 "Поиск точки равновесия массива"
        int a = arr.length;
        System.out.println(Arrays.toString(arr));
        int index = -1;

        for (int i = 0; i < a - 1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 = sum1 + arr[j];
            }
            for (int k = i + 1; k < a; k++) {
                sum2 = sum2 + arr[k];
            }

            if (sum1 == sum2) {
                index = i;
                System.out.print("Точка находится между элементами №" + index + " и ");
                System.out.println(index + 1);
                break;
            }
            if (i == a-2) System.out.println("Такой точки не найдено");
        }
    }

    public static void forMe(int a, String str) { // Метод №1 "Знакомство с For"
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static void sumMoreFive(int[] b1) { // Метод №2 "Сумма элементов массива больше 5"
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (b1[i] > 5) sum += b1[i];
        }
        System.out.println(sum);
    }

    public static void arrFill(int b3, int[] arrb3) { // Метод №3 "Заполнение массива указанным числом"
        for (int i = 0; i < 10; i++) {
            arrb3[i] = b3;
        }
        System.out.println(Arrays.toString(arrb3));
    }

    public static void arrFillPlus(int b4, int[] arrb4) { // Метод №4 "Заполнение массива арифметической прогрессией"
        int a = arrb4.length;
//        for (int i = 0; i < a; i++) {
//            arrb4[i] += b4;
        for (int i = 0; i < a - 1; i++) {
            arrb4[i + 1] = arrb4[i] + b4;
        }
        System.out.println(Arrays.toString(arrb4));
    }

    public static void comparison(int[] arrb5) { // Метод №5 "Сравнение сумм первой и второй половины массива"
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arrb5.length / 2; i++) {
            sum1 += arrb5[i];
        }
        for (int i = arrb5.length / 2; i < arrb5.length; i++) {
            sum2 += arrb5[i];
        }
        if (sum1 > sum2)
            System.out.println("Сумма первой половины массива: " + sum1 + " больше суммы второй половины: " + sum2);
        else if (sum1 < sum2)
            System.out.println("Сумма первой половины массива: " + sum1 + " меньше суммы второй половины:" + sum2);
        else System.out.println("Сумма первой половины массива: " + sum1 + " равна сумме второй половины: " + sum2);
    }

    public static void sumArrays(int[] arra6, int[] arrb6, int[] arrc6) { // Метод №6 "Сложение массивов"

        int[] maxLenght = {arra6.length, arrb6.length, arrc6.length};
        for (int i = 0; i < 3; i++) {// сортировка по возрастанию для поиска самого длинного массива
            for (int j = 0; j < 2; j++) {
                if (maxLenght[j + 1] < maxLenght[j]) {
                    int exchange = maxLenght[j];
                    maxLenght[j] = maxLenght[j + 1];
                    maxLenght[j + 1] = exchange;
                }
            }
        }

        int a = arra6.length;// можно было передать длину массивов как аргумент, но в условиях задачи этого не было
        int b = arrb6.length;
        int c = arrc6.length;
        int[] sumArr = new int[maxLenght[2]];

        for (int i = 0; i < a; i++) {
            sumArr[i] = sumArr[i] + arra6[i];
        }
        for (int i = 0; i < b; i++) {
            sumArr[i] = sumArr[i] + arrb6[i];
        }
        for (int i = 0; i < c; i++) {
            sumArr[i] = sumArr[i] + arrc6[i];
        }
        System.out.println("Сумма данных массивов:");
        System.out.println(Arrays.toString(sumArr));

    }
}




