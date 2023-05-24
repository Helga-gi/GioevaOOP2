package ru.netology.GioevaOOP2;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }

        currentVolume = newCurrentVolume;
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

    public void increaseVolume() {
        int target = currentVolume + 1;
        currentVolume = target;

    }

    public void decreaseVolume() {
        int target = currentVolume - 1;
        currentVolume = target;
    }

    public void setToMaxVolume() {

        currentVolume = 100;
    }

    public void setToMinVolume() {

        currentVolume = 0;
    }

    public void setNextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = setToMinStation();
        }

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

        if (currentStation == 0) {
            setToMaxStation();
        } else {
            setCurrentStation(count);
        }
    }
}



