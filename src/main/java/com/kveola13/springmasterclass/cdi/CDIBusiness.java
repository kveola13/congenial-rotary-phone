package com.kveola13.springmasterclass.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIBusiness {

    @Inject
    CDIDAO cdidao;

    public CDIDAO getCdidao() {
        return cdidao;
    }

    public void setCdidao(CDIDAO cdidao) {
        this.cdidao = cdidao;
    }

    public int findHighest() {
        int highest = Integer.MIN_VALUE;
        int[] data = cdidao.getData();
        for (int i : data) {
            if (i > highest) {
                highest = i;
            }
        }
        return highest;
    }
}
