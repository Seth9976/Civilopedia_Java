package q3;

import w3.p;

public enum i implements p {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),  // 此枚举字段已被移除
    ANNOTATION_CLASS(4),
    OBJECT(5),  // 此枚举字段已被移除
    COMPANION_OBJECT(6);

    public final int i;

    public i(int v1) {
        this.i = v1;
    }

    @Override  // w3.p
    public final int a() {
        return this.i;
    }
}

