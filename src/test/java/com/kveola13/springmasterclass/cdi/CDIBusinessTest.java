package com.kveola13.springmasterclass.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CDIBusinessTest {

    @InjectMocks
    CDIBusiness business;

    @Mock
    CDIDAO daoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2, 3, 4, 5, 6});
        assertEquals(6, business.findHighest());
    }
    @Test
    public void testNullScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, business.findHighest());
    }
    @Test
    public void testDualScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,2});
        assertEquals(2, business.findHighest());
    }



}