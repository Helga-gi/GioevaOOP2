package ru.netology.GioevaOOP2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(20);

        int expected = 20;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio vol = new Radio();

        vol.setToMaxVolume();

        int expected = 100;
        int actual = vol.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio st = new Radio();

        st.setToMinVolume();

        int expected = 0;
        int actual = st.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio vol = new Radio();

        vol.setCurrentVolume(200);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio vol = new Radio();

        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(15);

        vol.increaseVolume();

        int expected = 16;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(15);

        vol.decreaseVolume();

        int expected = 14;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio st = new Radio(10);

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
        int actual = st.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio st = new Radio();

        st.setToMinStation();

        int expected = 0;
        int actual = st.getMinStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStation() {
        Radio st = new Radio();

        st.setCurrentStation(1);
        st.setPrevStation();

        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIf0() {
        Radio st = new Radio();

        st.setCurrentStation(0);
        st.setPrevStation();

        int expected = 9;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio st = new Radio();

        st.setCurrentStation(-1);


        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfMaxStation() {
        Radio st = new Radio();

        st.setCurrentStation(9);
        st.setPrevStation();

        int expected = 8;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfAboveMaxStation() {
        Radio st = new Radio();

        st.setCurrentStation(10);
        st.setPrevStation();

        int expected = 9;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio st = new Radio();
        st.setCurrentStation(8);

        st.setNextStation();

        int expected = 9;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextStationIfMax() {
        Radio st = new Radio();
        st.setCurrentStation(9);

        st.setNextStation();

        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextStationAboveMax() {
        Radio st = new Radio();

        st.setCurrentStation(10);

        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationLessMin() {
        Radio st = new Radio();

        st.setCurrentStation(-1);

        int expected = 0;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfMin() {
        Radio st = new Radio();

        st.setCurrentStation(0);
        st.setNextStation();

        int expected = 1;
        int actual = st.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}