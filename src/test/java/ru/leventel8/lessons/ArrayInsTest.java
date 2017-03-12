package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayInsTest {
    /**
     * проверка вставки
     */
    @Test
    public void testInsert() {
        ArrayIns arrayIns = new ArrayIns(10);       //создание объекта массива, размером 10
        arrayIns.insert(5);                        // вставка элементов
        arrayIns.insert(7);
        assertEquals(5,arrayIns.getFirst());     // сравнение ожидаемого результата с возвращаемым значением

    }//end testInsert()

    /**
     * проверка вставки
     */
    @Test
    public void testInsertionSort() {
        ArrayIns arrayIns = new ArrayIns(10);
        arrayIns.insert(5);
        arrayIns.insert(7);
        arrayIns.insert(10);
        arrayIns.insert(2);
        arrayIns.insert(1);
        arrayIns.insertionSort();                       // сортировка от меньшего к большему
        assertEquals(1, arrayIns.getFirst());
    }//end testInsertionSort()

}//end class ArrayInsTest