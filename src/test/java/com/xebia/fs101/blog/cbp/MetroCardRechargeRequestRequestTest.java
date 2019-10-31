package com.xebia.fs101.blog.cbp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MetroCardRechargeRequestRequestTest {

    @Test
    public void should_create_a_recharge_object() {
        // no restriction can make mistake like below
        MetroCardRechargeRequest recharge = new MetroCardRechargeRequest.Builder()
                .setAmount(556)
                .setPromoCode("MONTHLY100")
                .build();
        Assertions.assertThat(recharge).isNotNull();
    }
}