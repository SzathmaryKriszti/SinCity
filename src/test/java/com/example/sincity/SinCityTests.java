package com.example.sincity;



class SinCityTests {

    //    @Test
//    void testAddCitizen() {
//        SinCity sinCity = new SinCity();
//        assertEquals(0, sinCity.getCitizens().length);
//
//        Passenger passenger = new Passenger("Esther the Evil", 3, 1000, false);
//        TaxiDriver taxiDriver = new TaxiDriver("Theodore the Thief", 4, 700);
//
//        sinCity.addCitizen(passenger);
//        sinCity.addCitizen(taxiDriver);
//
//        assertEquals(2, sinCity.getCitizens().length);
//        assertEquals(passenger, sinCity.getCitizens()[0]);
//        assertEquals(taxiDriver, sinCity.getCitizens()[1]);
//    }
//
//    @Test
//    void testCreateTaxi() {
//        SinCity sinCity = new SinCity();
//        assertEquals(0, sinCity.getTaxis().length);
//
//        TaxiDriver taxiDriver = new TaxiDriver("Theodore the Thief", 4, 700);
//        sinCity.createTaxi(taxiDriver, true);
//
//        assertEquals(1, sinCity.getTaxis().length);
//        assertEquals("Theodore the Thief", sinCity.getTaxis()[0].getTaxiDriver().getName());
//        assertTrue(sinCity.getTaxis()[0].hasSecuritySystem());
//    }
//
//    @Test
//    void testCatchATaxi_notEnoughCitizen_getCorrectResultMessage() {
//        SinCity sinCity = new SinCity();
//        assertEquals("Not enough citizen", sinCity.catchATaxi(0, 1));
//    }
//
//    @Test
//    void testCatchATaxi_sameCitizen_getCorrectResultMessage() {
//        SinCity sinCity = new SinCity();
//        sinCity.addCitizen(new TaxiDriver("Theodore the Thief", 4, 700));
//        sinCity.addCitizen(new Passenger("Esther the Evil", 3, 1000, false));
//        assertEquals("Same citizen", sinCity.catchATaxi(1, 1));
//    }
//
//    @Test
//    void testCatchATaxi_incorrectPassengerID_getCorrectResultMessage() {
//        SinCity sinCity = new SinCity();
//        sinCity.addCitizen(new TaxiDriver("Theodore the Thief", 4, 700));
//        sinCity.addCitizen(new Passenger("Esther the Evil", 3, 1000, false));
//        assertEquals("Wrong passenger ID", sinCity.catchATaxi(-2, 0));
//        assertEquals("Wrong passenger ID", sinCity.catchATaxi(2, 0));
//        assertEquals("Wrong passenger ID", sinCity.catchATaxi(0, 1));
//    }
//
//    @Test
//    void testCatchATaxi_incorrectTaxiDriverID_getCorrectResultMessage() {
//        SinCity sinCity = new SinCity();
//        sinCity.addCitizen(new Passenger("Esther the Evil", 3, 1000, false));
//        sinCity.addCitizen(new Passenger("Esther the Evil", 3, 1000, false));
//        sinCity.addCitizen(new TaxiDriver("Theodore the Thief", 4, 700));
//        assertEquals("Wrong taxi driver ID", sinCity.catchATaxi(0, -2));
//        assertEquals("Wrong taxi driver ID", sinCity.catchATaxi(0, 3));
//        assertEquals("Wrong taxi driver ID", sinCity.catchATaxi(0, 1));
//    }
//
//    @Test
//    void testCatchATaxi_taxiDriverDoNotHaveTaxi_getCorrectResultMessage() {
//        SinCity sinCity = new SinCity();
//        sinCity.addCitizen(new Passenger("Esther the Evil", 3, 1000, false));
//        sinCity.addCitizen(new TaxiDriver("Theodore the Thief", 4, 700));
//        assertEquals("Oh no! Some evil passenger has already stolen this taxi driver's taxi!", sinCity.catchATaxi(0, 1));
//    }
//
//    @Test
//    void testCatchATaxi_correctTaxiDriverID_getCorrectResultMessage() {
//        SinCity sinCity = new SinCity();
//        sinCity.addCitizen(new Passenger("Esther the Evil", 3, 1000, false));
//        TaxiDriver taxiDriver = new TaxiDriver("Theodore the Thief", 3, 700);
//        sinCity.addCitizen(taxiDriver);
//        sinCity.createTaxi(taxiDriver, true);
//        assertEquals("Passenger pays normal price", sinCity.catchATaxi(0, 1));
//    }


}
