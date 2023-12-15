package domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolumeOfSound;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolumeOfSound() {
        return currentVolumeOfSound;
    }

    public void setCurrentRadioStation(int radioStation) {

        if (radioStation < 0) {

            radioStation = 9;
        }

        if (radioStation > 9) {
            radioStation = 0;
        }
        currentRadioStation = radioStation;
    }

    public void setCurrentVolumeOfSound(int volume) {

        if (volume > 100) {
            volume = 100;
        }
        if (volume < 0) {
            volume = 0;
        }
        currentVolumeOfSound = volume;
    }

    public void next() {

        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);

    }

    public void prev() {

        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);
    }

    public void plus() {
        int target = currentVolumeOfSound + 1;
        setCurrentVolumeOfSound(target);
    }

    public void minus() {

        int target = currentVolumeOfSound - 1;
        setCurrentVolumeOfSound(target);
    }
}

