package com.kveola13.springmasterclass.cdi;

import javax.inject.Named;

@Named
public class CDIDAO {

    public int[] getData() {
        return new int[]{1, 2, 3, 4, 5};
    }

}
