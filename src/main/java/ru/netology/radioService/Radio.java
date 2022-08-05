package ru.netology.radioService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int currentRadioStation;
    private int amountRadioStation = 10;
    private int currentVolume;

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
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
