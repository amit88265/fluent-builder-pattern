package com.xebia.fs101.blog.fbp;

class MetroCardRechargeRequest {
    private long cardNumber;
    private double amount;
    private String promoCode;

    private MetroCardRechargeRequest(long cardNumber, double amount, String promoCode) {
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.promoCode = promoCode;
    }

    public interface MetroIcon {
        SmartCardNumber tapOnMetroIcon();
    }

    public interface SmartCardNumber {
        SmartCardAmount addCardNumber(long number);
    }

    public interface SmartCardAmount {
        Proceed addAmount(double amount);
    }

    public interface Proceed {
        ProceedToPay proceed();
    }

    public interface ProceedToPay {
        Pay applyPromoCode(String promoCode);

        Pay proceedToPay();
    }

    public interface Pay {
        SmartCardBuild payAmount();
    }

    public interface SmartCardBuild {
        MetroCardRechargeRequest build();
    }


    public static class MetroCardRechargeBuilder implements
            MetroIcon, SmartCardNumber, SmartCardAmount, Proceed, ProceedToPay, Pay, SmartCardBuild {
        private long cardNumber;
        private double amount;
        private String promoCode;


        MetroCardRechargeBuilder() {
        }


        @Override
        public SmartCardNumber tapOnMetroIcon() {
            return this;
        }

        @Override
        public SmartCardAmount addCardNumber(long number) {
            this.cardNumber = number;
            return this;
        }

        @Override
        public Proceed addAmount(double amount) {
            this.amount = amount;
            return this;
        }

        @Override
        public ProceedToPay proceed() {
            return this;
        }

        @Override
        public Pay applyPromoCode(String promoCode) {
            this.promoCode = promoCode;
            return this;
        }

        @Override
        public Pay proceedToPay() {
            return this;
        }

        @Override
        public SmartCardBuild payAmount() {
            return this;
        }

        @Override
        public MetroCardRechargeRequest build() {
            return new MetroCardRechargeRequest( cardNumber, amount, promoCode );
        }
    }

}
