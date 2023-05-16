package ru.netology.GioevaOOP2;

public class Radio {
    public int currentVolum;

    public int getCurrentVolum() {
        return currentVolum;
    }

    public void setCurrentVolum(int newCurrentVolum) {
        if (newCurrentVolum < 0) {
            return;
        }
        if (newCurrentVolum > 100) {
            return;
        }

        currentVolum = newCurrentVolum;
    }

    public void increaseVolume() {
        int target = currentVolum + 1;
        currentVolum = target;

    }

    public void decreaseVolum() {
        int target = currentVolum - 1;
        currentVolum = target;
    }

    public void setToMaxVolum() {
        currentVolum = 100;
    }

    public void setToMinVolum() {
        currentVolum = 0;
    }

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        int count = currentStation + 1;
        currentStation = count;
    }

    public int setToMaxStation() {
        currentStation = 9;
        return 0;
    }

    public int setToMinStation() {
        currentStation = 0;
        return 0;

    }

    public void setPrevStation() {

        int count = currentStation - 1;
        currentStation = count;
    }


    public void findPrev() {
        if (currentStation == setToMinStation()) {
            setToMaxStation();

        }
    }
}

