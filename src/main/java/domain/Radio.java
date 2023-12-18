package domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolumeOfSound;

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio (int size) {
        maxRadioStation = size - 1;
    }
    public Radio(){}
    public int getMaxRadioStation(){return maxRadioStation;}
    public int getMinRadioStation (){return minRadioStation;}


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolumeOfSound() {
        return currentVolumeOfSound;
    }

    public void setCurrentRadioStation(int radioStation) {

        if (radioStation < minRadioStation) {

            radioStation = maxRadioStation;
        }

        if (radioStation > maxRadioStation) {
            radioStation = minRadioStation;
        }
        currentRadioStation = radioStation;
    }

    public void setCurrentVolumeOfSound(int volume) {

        if (volume > maxVolume) {
            volume = maxVolume;
        }
        if (volume < minVolume) {
            volume = minVolume;
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

