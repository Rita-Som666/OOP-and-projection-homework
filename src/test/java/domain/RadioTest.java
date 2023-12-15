package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseRadioStation1() {
        Radio radio = new Radio();
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void notShouldIncreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldDecreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolumeOfSound(0);
        radio.plus();
        int expected = 1;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolumeOfSound(99);
        radio.plus();
        int expected = 100;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeOfSound(100);
        radio.plus();
        int expected = 100;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeOfSound(1);
        radio.minus();
        int expected = 0;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeOfSound(0);
        radio.minus();
        int expected = 0;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolumeOfSound(101);
        int expected = 100;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolumeOfSound(-1);
        int expected = 0;
        int actual = radio.getCurrentVolumeOfSound();
        Assertions.assertEquals(expected, actual);
    }
}