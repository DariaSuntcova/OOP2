package ru.netology.radioService;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 & currentVolume <= 10) {
            this.currentVolume = currentVolume;
        }

    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 & currentRadioStation <= 9) {
            this.currentRadioStation = currentRadioStation;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else currentRadioStation += 1;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else currentRadioStation -= 1;
    }

}
