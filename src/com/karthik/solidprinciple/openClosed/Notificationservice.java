package com.karthik.solidprinciple.openClosed;

public interface Notificationservice {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}
