package com.skywell.banking.views.product;

import com.skywell.banking.api.ws.product.OperVar;
import com.skywell.banking.views.BaseRequest;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by viv on 12.02.2016.
 */
public class ClientProduct extends BaseProduct {

    protected long resvClientProductId;

    public long getResvClientProductId() {
        return resvClientProductId;
    }

    public void setResvClientProductId(long resvClientProductId) {
        this.resvClientProductId = resvClientProductId;
    }
}
