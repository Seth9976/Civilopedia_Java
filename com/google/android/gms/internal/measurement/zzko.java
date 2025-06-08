package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzko extends IOException {
    public static final int i;

    public zzko(String s) {
        super(s);
    }

    public static zzko a() {
        return new zzko("Protocol message had invalid UTF-8.");
    }

    public static zzko b() {
        return new zzko("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzko c() {
        return new zzko("Failed to parse the message.");
    }

    public static zzko d() {
        return new zzko("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

