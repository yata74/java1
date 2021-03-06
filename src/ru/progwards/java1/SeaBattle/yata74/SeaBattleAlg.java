package ru.progwards.java1.SeaBattle.yata74;
import ru.progwards.java1.SeaBattle.SeaBattle;
import ru.progwards.java1.SeaBattle.SeaBattle.FireResult;

import java.util.Arrays;


public class SeaBattleAlg {
        // Тестовое поле создаётся конструктором
        //     SeaBattle seaBattle = new SeaBattle(true);
        //
        // Обычное поле создаётся конструктором по умолчанию:
        //     SeaBattle seaBattle = new SeaBattle();
        //     SeaBattle seaBattle = new SeaBattle(false);
        //
        // Посомтреть результаты стрельбы можно в любой момент,
        // выведя объект класса SeaBattle на консоль. Например так:
        //     System.out.println(seaBattle);
        //
        //
        // Вид тестового поля:
        //
        //           0 1 2 3 4 5 6 7 8 9    координата x
        //         0|.|.|.|.|.|.|.|X|.|.|
        //         1|.|.|.|.|.|X|.|.|.|.|
        //         2|X|X|.|.|.|.|.|.|.|.|
        //         3|.|.|.|.|.|.|.|X|X|X|
        //         4|.|.|.|.|X|.|.|.|.|.|
        //         5|.|.|.|.|X|.|.|Х|.|.|
        //         6|.|.|.|.|.|.|.|Х|.|X|
        //         7|X|.|X|.|.|.|.|Х|.|X|
        //         8|X|.|.|.|.|.|.|X|.|.|
        //         9|X|.|.|.|X|.|.|.|.|.|
        char [][] pole;
        void init (SeaBattle seaBattle){
            pole = new char[seaBattle.getSizeX()][seaBattle.getSizeY()];
            for (int i=0; i<10; i++){
                Arrays.fill(pole[i],' ');
            }
        }
        public void battleAlgorithm(SeaBattle seaBattle) {
            // сколько клеточек-целей подбито.
            int cel=0;
            init(seaBattle);
            // пример алгоритма:
            // стрельба по всем квадратам поля полным перебором
            for (int y = 0; y < seaBattle.getSizeX(); y++) {
                for (int x = 0; x < seaBattle.getSizeY(); x++) {
                    if (pole[x][y]==' '){
                    SeaBattle.FireResult fireResult = seaBattle.fire(x, y);

                    if (fireResult!=FireResult.MISS) {
                        pole[x][y] = '*';

                    }
                        if (fireResult==FireResult.HIT) {
                            cel += 1;
                        }
                         if (fireResult==FireResult.DESTROYED){
                             cel += 1;
                         }
                        if (cel >= 20)
                            return;
                    }
                }
            }
        }

        // функция для отладки
        public static void main(String[] args) {
            System.out.println("Sea battle");
            SeaBattle seaBattle = new SeaBattle(true);
            new SeaBattleAlg().battleAlgorithm(seaBattle);
            System.out.println(seaBattle.getResult());
        }
    }



