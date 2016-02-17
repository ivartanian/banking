package com.skywell.banking.views.product;

import com.skywell.banking.api.ws.product.OperVar;
import com.skywell.banking.views.BaseRequest;

import java.util.List;

/**
 * Created by viv on 12.02.2016.
 */
public class LocalCardProduct extends BaseProduct {

    protected String resvLocalCard;

    public String getResvLocalCard() {
        return resvLocalCard;
    }

    public void setResvLocalCard(String resvLocalCard) {
        this.resvLocalCard = resvLocalCard;
    }
}
