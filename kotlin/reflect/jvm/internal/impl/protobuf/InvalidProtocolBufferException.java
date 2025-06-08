package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import w3.b;

public class InvalidProtocolBufferException extends IOException {
    public b i;

    public InvalidProtocolBufferException(String s) {
        super(s);
        this.i = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}

