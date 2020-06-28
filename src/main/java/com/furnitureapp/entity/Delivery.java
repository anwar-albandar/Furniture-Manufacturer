package com.furnitureapp.entity;

import java.util.Date;

public class Delivery {
    private int deliveryCode;
    private int saleCode;
    private int employeeCode;
    private String deliveryAddress;
    private Date dateTimeReceived;
    private Date dateTimeSet;
    private String trackingNum;
    private boolean deliveryStatus;

    public Delivery(DeliveryBuilder deliveryBuilder){
        this.deliveryCode = deliveryBuilder.deliveryCode;
        this.employeeCode = deliveryBuilder.employeeCode;
        this.saleCode = deliveryBuilder.saleCode;
        this.deliveryAddress = deliveryBuilder.deliveryAddress;
        this.dateTimeReceived = deliveryBuilder.dateTimeReceived;
        this.dateTimeSet = deliveryBuilder.dateTimeSet;
        this.trackingNum = deliveryBuilder.trackingNum;
        this.deliveryStatus = deliveryBuilder.deliveryStatus;
    }

    public int getDeliveryCode() {
        return deliveryCode;
    }

    public int getSaleCode() {
        return saleCode;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Date getDateTimeReceived() {
        return dateTimeReceived;
    }

    public Date getDateTimeSet() {
        return dateTimeSet;
    }

    public String getTrackingNum() {
        return trackingNum;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public static class DeliveryBuilder{
        private int deliveryCode;
        private int saleCode;
        private int employeeCode;
        private String deliveryAddress;
        private Date dateTimeReceived;
        private Date dateTimeSet;
        private String trackingNum;
        private boolean deliveryStatus;

        public DeliveryBuilder(){}

        public DeliveryBuilder setDeliveryCode(int deliveryCode) {
            this.deliveryCode = deliveryCode;
            return this;
        }

        public DeliveryBuilder setSaleCode(int saleCode) {
            this.saleCode = saleCode;
            return this;
        }

        public DeliveryBuilder setEmployeeCode(int employeeCode) {
            this.employeeCode = employeeCode;
            return this;
        }

        public DeliveryBuilder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public DeliveryBuilder setDateTimeReceived(Date dateTimeReceived) {
            this.dateTimeReceived = dateTimeReceived;
            return this;
        }

        public DeliveryBuilder setDateTimeSet(Date dateTimeSet) {
            this.dateTimeSet = dateTimeSet;
            return this;
        }

        public DeliveryBuilder setTrackingNum(String trackingNum) {
            this.trackingNum = trackingNum;
            return this;
        }

        public DeliveryBuilder setDeliveryStatus(boolean deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }

        public DeliveryBuilder copy(Delivery delivery){
            this.deliveryCode = delivery.deliveryCode;
            this.saleCode = delivery.saleCode;
            this.employeeCode = delivery.employeeCode;
            this.dateTimeReceived = delivery.dateTimeReceived;
            this.dateTimeSet = delivery.dateTimeSet;
            this.trackingNum = delivery.trackingNum;
            this.deliveryAddress = delivery.deliveryAddress;
            this.deliveryStatus = delivery.deliveryStatus;
            return this;
        }

        public Delivery build(){
            return new Delivery(this);
        }
    }
}
