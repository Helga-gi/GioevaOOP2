package ru.netology.GioevaOOP2;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int currentStation;

    public Radio(int countStation){
        this.maxStation = countStation-1;

    }
    public Radio(){
        this.maxStation = 9;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxVolume(){
        return maxVolume;
    }public int getMinVolume(){
        return minVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }
    public int getMaxStation(){
        return maxStation;
    }
    public int getMinStation(){
        return minStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
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

        currentVolume = maxVolume;
    }

    public void setToMinVolume() {

        currentVolume = minVolume;
    }

    public void setNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = setToMinStation();
        }

    }

    public int setToMaxStation() {
        currentStation = maxStation;
        return 0;
    }

    public int setToMinStation() {
        currentStation = minStation;
        return 0;

    }

    public void setPrevStation() {

        int count = currentStation - 1;

        if (currentStation == minStation) {
            setToMaxStation();
        } else {
            setCurrentStation(count);
        }
    }
}



