package ru.netology.radioService;

public class Radio {
    private int currentRadioStation;
    private int amountRadioStation = 10;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 & currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }

    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 & currentRadioStation < amountRadioStation) {
            this.currentRadioStation = currentRadioStation;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation == amountRadioStation - 1) {
            currentRadioStation = 0;
        } else currentRadioStation += 1;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = amountRadioStation - 1;
        } else currentRadioStation -= 1;
    }

}
