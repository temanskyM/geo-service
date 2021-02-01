package ru.netology.i18n;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.Assert.*;

public class LocalizationServiceImplTest {

    @Test
    public void test_locale_ru() {
        //given
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        //when
        String result = localizationService.locale(Country.RUSSIA);

        //then
        Assert.assertTrue(result.equals("Добро пожаловать"));
    }
    @Test
    public void test_locale_usa() {
        //given
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        //when
        String result = localizationService.locale(Country.USA);

        //then
        Assert.assertTrue(result.equals("Welcome"));
    }
}