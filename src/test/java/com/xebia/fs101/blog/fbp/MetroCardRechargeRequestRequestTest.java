package com.xebia.fs101.blog.fbp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MetroCardRechargeRequestRequestTest {

    @Test
    public void should_able_to_recharge_with_promo_code() {
        MetroCardRechargeRequest recharge = new MetroCardRechargeRequest
                .MetroCardRechargeBuilder()
                .tapOnMetroIcon()
                .addCardNumber( 123 )
                .addAmount( 256 )
                .proceed()
                .applyPromoCode( "Monthly52" )
                .payAmount()
                .build();

        Assertions.assertThat( recharge ).isNotNull();
    }

    @Test
    public void should_able_to_recharge_without_promo_code() {
        MetroCardRechargeRequest recharge = new MetroCardRechargeRequest.MetroCardRechargeBuilder()
                .tapOnMetroIcon()
                .addCardNumber( 24661235 )
                .addAmount( 25 )
                .proceed()
                .proceedToPay()
                .payAmount()
                .build();
        Assertions.assertThat( recharge ).isNotNull();
    }

}