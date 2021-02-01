package ru.netology.geo;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.Assert.*;

public class GeoServiceImplTest {

    @Test
    public void test_byIp_usa() {
        //given
        String ip = "96.44.183.149";
        GeoServiceImpl geoService = new GeoServiceImpl();

        //when
        Location result = geoService.byIp(ip);

        //then
        Assert.assertTrue(result.getCountry() == Country.USA);
    }

    @Test
    public void test_byIp_ru() {
        //given
        String ip = "172.42.42.63";
        GeoServiceImpl geoService = new GeoServiceImpl();

        //when
        Location result = geoService.byIp(ip);

        //then
        Assert.assertTrue(result.getCountry() == Country.RUSSIA);
    }
}