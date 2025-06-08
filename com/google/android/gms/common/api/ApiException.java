package com.google.android.gms.common.api;

public class ApiException extends Exception {
    public final Status i;

    public ApiException(Status status0) {
        super(status0.getStatusCode() + ": " + (status0.getStatusMessage() == null ? "" : status0.getStatusMessage()));
        this.i = status0;
    }

    public Status getStatus() {
        return this.i;
    }

    public int getStatusCode() {
        return this.i.getStatusCode();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.i.getStatusMessage();
    }
}

