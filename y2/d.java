package Y2;

import O2.A;

public enum d {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    public final String i;

    public d(String s1) {
        if(s1 == null) {
            s1 = A.e0(this.name());
        }
        this.i = s1;
    }
}

