package com.xebia.fs101.blog.cbp;

class MetroCardRecharge {
    private long cardNumber;
    private double amount;
    private String promoCode;

    private MetroCardRecharge(Builder builder) {
        cardNumber = builder.cardNumber;
        amount = builder.amount;
        promoCode = builder.promoCode;

    }

    public static final class Builder {
        private long cardNumber;
        private double amount;
        private String promoCode;

        Builder() {
        }

        Builder setCardNumber(long val) {
            cardNumber = val;
            return this;
        }

        public Builder setAmount(double val) {
            amount = val;
            return this;
        }

        Builder setPromoCode(String val) {
            promoCode = val;
            return this;
        }

        MetroCardRecharge build() {
            return new MetroCardRecharge( this );
        }
    }
}
