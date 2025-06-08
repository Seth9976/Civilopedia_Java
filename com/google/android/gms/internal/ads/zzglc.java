package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzglc extends IOException {
    public zzgma i;
    public boolean j;

    public zzglc(IOException iOException0) {
        super(iOException0.getMessage(), iOException0);
    }

    public zzglc(String s) {
        super(s);
    }

    public static zzglb a() {
        return new zzglb("Protocol message tag had invalid wire type.");
    }

    public static zzglc b() {
        return new zzglc("Protocol message had invalid UTF-8.");
    }

    public static zzglc c() {
        return new zzglc("CodedInputStream encountered a malformed varint.");
    }

    public static zzglc d() {
        return new zzglc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzglc e() {
        return new zzglc("Failed to parse the message.");
    }

    public static zzglc f() {
        return new zzglc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzglc zzh(zzgma zzgma0) {
        this.i = zzgma0;
        return this;
    }
}

