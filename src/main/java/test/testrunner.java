package test;

import common.CalcTrackAndField;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testrunner {


    @Test

    public void myFirstTest() {

        //Deca100M

        CalcTrackAndField calcTrackAndField = new CalcTrackAndField();
        double A = 25.4347;
        double B = 18;
        double C = 1.81;
        int expected = 185;
        int actual = calcTrackAndField.calculateTrack(A, B, C, 15);

        assertEquals(expected, actual);

    }


    @Test

    public void myFirstTest1() {

        CalcTrackAndField calcTrackAndField = new CalcTrackAndField();
        double A = 1.53775;
        double B = 82;
        double C = 1.81;

        int expected = 3105;
        int actual = calcTrackAndField.calculateTrack(A, B, C, 15);
        assertEquals(expected, actual);

    }

    @Test

    public void deca110mHurdlesTest() {

        CalcTrackAndField calcTrackAndField = new CalcTrackAndField();
        double A = 5.74352;
        double B = 28.5;
        double C = 1.92;

        int expected = 850;
        int actual = calcTrackAndField.calculateTrack(A, B, C, 15);
        assertEquals(expected, actual);


    }

    @Test

    public void Deca400MTest() {

        CalcTrackAndField calc = new CalcTrackAndField();
        double A = 1.53775;
        double B = 82;
        double C = 1.81;

        int expected = 8530;
        int actual = calc.calculateTrack(A, B, C, 15);
        assertEquals(expected, actual);


    }

    @Test

    public void HyHy() {

        int result = 2 + 2;

        assertEquals(5, result);
    }




        @Test
        public void testCalculateField() {

            CalcTrackAndField calculator = new CalcTrackAndField();

            double A = 1.53775;
            double B = 82;
            double C = 1.81;
            double distance = 15.0;
            int expected = 3105;
            int actual = calculator.calculateField(A, B, C, distance);
            assertEquals(expected, actual);


        }

        @Test
        public void testTrack() {
            CalcTrackAndField calculator = new CalcTrackAndField();
            double A = 25.4347;
            double B = 18;
            double C = 1.81;
            double distance = 15.0; //
            int expected = 185;
            int actual = calculator.calculateTrack(A, B, C, distance);
            assertEquals(expected, actual);


        }
    }


