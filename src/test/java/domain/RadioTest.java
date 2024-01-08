package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    Radio radioS = new Radio(15);

    @Test
    public void shouldIncreaseRadioStation1() {
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation2() {
        radio.setCurrentRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void notShouldIncreaseRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation1() {
        radio.setCurrentRadioStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation2() {
        radio.setCurrentRadioStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldDecreaseRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1() {
        radio.setCurrentVolumeOfSound(0);
        radio.plus();
        int expected = 1;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        radio.setCurrentVolumeOfSound(99);
        radio.plus();
        int expected = 100;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldIncreaseVolume() {
        radio.setCurrentVolumeOfSound(100);
        radio.plus();
        int expected = 100;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolumeOfSound(1);
        radio.minus();
        int expected = 0;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldDecreaseVolume() {
        radio.setCurrentVolumeOfSound(0);
        radio.minus();
        int expected = 0;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetRadioStationAboveMax() {
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetRadioStationBelowMin() {
        radio.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetVolumeAboveMax() {
        radio.setCurrentVolumeOfSound(101);
        int expected = 100;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetVolumeBelowMin() {
        radio.setCurrentVolumeOfSound(-1);
        int expected = 0;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStationIfHaveSize() {
        int expected = 14;
        int actual = radioS.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetMinRadioStationIfHaveSize(){
        int expected = 0;
        int actual = radioS.getMinRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        int expected = 9;
        int actual = radio.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetMinRadioStation(){
        int expected = 0;
        int actual = radio.getMinRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}