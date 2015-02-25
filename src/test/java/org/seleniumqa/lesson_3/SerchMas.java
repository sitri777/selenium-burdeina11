package org.seleniumqa.lesson_3;


        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Test;
        import static  org.testng.Assert.assertTrue;


public class SerchMas {
    public int number;

    @BeforeTest
    public void setUp(){
        number=6;
    }
    @Test
    public void isPrimeTest(){

        assertTrue(serch(number));
    }
    @AfterTest
    public void tearDown(){
        number=0;
    }

    public static boolean serch(int n) {
        int[] mas = {1, 3, 6, 7, 90,8};
        {
            for (int i = 0; i <= 5; i++) {
                if (mas[i] == n) {
                    return false;

                }
                return true;
            }
        }
        return false;
    }
}



