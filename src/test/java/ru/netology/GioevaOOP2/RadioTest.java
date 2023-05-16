package ru.netology.GioevaOOP2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetVolum() {
        Radio vol = new Radio();

        vol.setCurrentVolum(20);

        int expected = 20;
        int actual = vol.getCurrentVolum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolum() {
        Radio vol = new Radio();

        vol.setToMaxVolum();

        int expected = 100;
        int actual = vol.getCurrentVolum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolum() {
        Radio st = new Radio();

        st.setToMinVolum();

        int expected = 0;
        int actual = st.getCurrentVolum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumAboveMax() {
        Radio vol = new Radio();

        vol.setCurrentVolum(200);

        int expected = 0;
        int actual = vol.getCurrentVolum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumBelowMin() {
        Radio vol = new Radio();

        vol.setCurrentVolum(-1);

        int expected = 0;
        int actual = vol.getCurrentVolum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolum() {
        Radio vol = new Radio();
        vol.setCurrentVolum(15);

        vol.increaseVolume();

        int expected = 16;
        int actual = vol.getCurrentVolum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolum() {
        Radio vol = new Radio();
        vol.setCurrentVolum(15);

        vol.decreaseVolum();

        int expected = 14;
        int actual = vol.getCurrentVolum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio st = new Radio();

        st.setCurrentStation(5);

        int expected = 5;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToMaxStation() {
        Radio st = new Radio();

        st.setToMaxStation();

        int expected = 9;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio st = new Radio();

        st.setToMinStation();

        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio st = new Radio();
        st.setCurrentStation(5);

        st.setNextStation();

        int expected = 6;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio st = new Radio();

        st.setCurrentStation(5);
        st.setPrevStation();

        int expected = 4;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextStationIfMore9() {
        Radio st = new Radio();
        st.setCurrentStation(10);

        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetPrevStationIfLess0() {
        Radio st = new Radio();
        st.setCurrentStation(0);


        st.findPrev();

        int expected = 9;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio st = new Radio();

        st.setCurrentStation(-1);

        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio st = new Radio();

        st.setCurrentStation(10);

        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}