package com.example.sincity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaxiTest {

//    private Taxi taxi;
//    private TaxiDriver taxiDriver;
//    private Passenger passenger;
//
//    @BeforeEach
//    void init() {
//        taxiDriver = new TaxiDriver("Theodore the Thief", 3, 500);
//        taxi = new Taxi(taxiDriver, false);
//        taxi.setTaxiDriver(taxiDriver);
//        taxiDriver.setTaxi(taxi);
//        passenger = new Passenger("Esther the Evil", 3, 500, false);
//    }
//
//    @Test
//    void testStealTaxiAlso() {
//        taxi.stealTaxiAlso();
//
//        assertNull(taxi.getTaxiDriver());
//        assertNull(taxiDriver.getTaxi());
//    }
//
//    @Test
//    void testPayTime_citizenHasEnoughMoney_subtractDifference() {
//        taxi.payTime(taxiDriver, passenger, 300);
//        assertEquals(200, taxiDriver.getAmountOfMoney());
//        assertEquals(800, passenger.getAmountOfMoney());
//    }
//
//    @Test
//    void testPayTime_citizenDoesNotHaveEnoughMoney_takeAllMoney() {
//        taxi.payTime(passenger, taxiDriver, 1400);
//        assertEquals(0, passenger.getAmountOfMoney());
//        assertEquals(1000, taxiDriver.getAmountOfMoney());
//    }
//
//    @Test
//    void testSomeoneMustPay_equalEvilLevel_passengerPaysNormalPrice() {
//        String result = taxi.someoneMustPay(passenger);
//        assertEquals("Passenger pays normal price", result);
//        assertEquals(600, taxiDriver.getAmountOfMoney());
//        assertEquals(400, passenger.getAmountOfMoney());
//    }
//
//    @Test
//    void testSomeoneMustPay_taxiDriversEvilLevelIsGreaterByOne_passengerPaysDoublePrice() {
//        passenger.setEvilLevel(1);
//        taxiDriver.setEvilLevel(2);
//        String result = taxi.someoneMustPay(passenger);
//        assertEquals("Passenger pays higher price, because the taxi driver is more evil", result);
//        assertEquals(700, taxiDriver.getAmountOfMoney());
//        assertEquals(300, passenger.getAmountOfMoney());
//    }
//
//    @Test
//    void testSomeoneMustPay_taxiDriversEvilLevelIsGreaterByTwo_passengerPaysTriplePrice() {
//        passenger.setEvilLevel(1);
//        taxiDriver.setEvilLevel(3);
//        String result = taxi.someoneMustPay(passenger);
//        assertEquals("Passenger pays higher price, because the taxi driver is more evil", result);
//        assertEquals(800, taxiDriver.getAmountOfMoney());
//        assertEquals(200, passenger.getAmountOfMoney());
//    }
//
//    @Test
//    void testSomeoneMustPay_taxiDriversEvilLevelIsGreaterByThree_passengerPaysFourfoldPrice() {
//        passenger.setEvilLevel(1);
//        taxiDriver.setEvilLevel(4);
//        String result = taxi.someoneMustPay(passenger);
//        assertEquals("Passenger pays higher price, because the taxi driver is more evil", result);
//        assertEquals(900, taxiDriver.getAmountOfMoney());
//        assertEquals(100, passenger.getAmountOfMoney());
//    }
//
//    @Test
//    void testSomeoneMustPay_taxiDriversEvilLevelIsGreaterByFour_passengerPaysFivefoldPrice() {
//        passenger.setEvilLevel(1);
//        taxiDriver.setEvilLevel(5);
//        String result = taxi.someoneMustPay(passenger);
//        assertEquals("Passenger pays higher price, because the taxi driver is more evil", result);
//        assertEquals(1000, taxiDriver.getAmountOfMoney());
//        assertEquals(0, passenger.getAmountOfMoney());
//    }
//
//    @Test
//    void testSomeoneMustPay_evilPassengerHasGunTaxiDoesNotHaveSecuritySystem_taxiDriveLoseAllMoneyAndTaxi() {
//        passenger.setEvilLevel(4);
//        passenger.setGun(true);
//        String result = taxi.someoneMustPay(passenger);
//        assertEquals("Passenger robbed the taxi driver, and also stole his taxi", result);
//        assertEquals(0, taxiDriver.getAmountOfMoney());
//        assertEquals(1000, passenger.getAmountOfMoney());
//        assertNull(taxi.getTaxiDriver());
//        assertNull(taxiDriver.getTaxi());
//    }
//
//    @Test
//    void testSomeoneMustPay_evilPassengerHasGunTaxiHasSecuritySystem_taxiDriveLoseAllMoney() {
//        passenger.setEvilLevel(4);
//        passenger.setGun(true);
//        taxi.setSecuritySystem(true);
//        assertTaxiDriveRobbed();
//    }
//
//    @Test
//    void testSomeoneMustPay_evilPassengerDoesNotHaveGunTaxiHasSecuritySystem_taxiDriveLoseAllMoney() {
//        passenger.setEvilLevel(4);
//        taxi.setSecuritySystem(true);
//        assertTaxiDriveRobbed();
//    }
//
//    @Test
//    void testSomeoneMustPay_evilPassengerDoesNotHaveGunTaxiDoesNotHaveSecuritySystem_taxiDriveLoseAllMoney() {
//        passenger.setEvilLevel(4);
//        assertTaxiDriveRobbed();
//    }
//
//    private void assertTaxiDriveRobbed() {
//        String result = taxi.someoneMustPay(passenger);
//        assertEquals("Passenger robbed the taxi driver", result);
//        assertEquals(0, taxiDriver.getAmountOfMoney());
//        assertEquals(1000, passenger.getAmountOfMoney());
//        assertNotNull(taxi.getTaxiDriver());
//        assertNotNull(taxiDriver.getTaxi());
//    }

}
