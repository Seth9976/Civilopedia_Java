package com.google.gson;

import com.google.gson.internal.f;
import java.io.Serializable;
import java.math.BigInteger;

public final class m extends j {
    public final Serializable i;

    public m(Boolean boolean0) {
        boolean0.getClass();
        this.i = boolean0;
    }

    public m(Number number0) {
        number0.getClass();
        this.i = number0;
    }

    public m(String s) {
        s.getClass();
        this.i = s;
    }

    public final Number a() {
        Serializable serializable0 = this.i;
        return serializable0 instanceof String ? new f(((String)serializable0)) : ((Number)serializable0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(m.class == class0) {
                Serializable serializable0 = this.i;
                Serializable serializable1 = ((m)object0).i;
                if(serializable0 == null) {
                    return serializable1 == null;
                }
                if(m.i(this) && m.i(((m)object0))) {
                    return this.a().longValue() == ((m)object0).a().longValue();
                }
                if(serializable0 instanceof Number && serializable1 instanceof Number) {
                    double f = this.a().doubleValue();
                    double f1 = ((m)object0).a().doubleValue();
                    return f == f1 || Double.isNaN(f) && Double.isNaN(f1);
                }
                return serializable0.equals(serializable1);
            }
        }
        return false;
    }

    public final String h() {
        Serializable serializable0 = this.i;
        if(serializable0 instanceof Number) {
            return this.a().toString();
        }
        return serializable0 instanceof Boolean ? ((Boolean)serializable0).toString() : ((String)serializable0);
    }

    @Override
    public final int hashCode() {
        long v;
        Serializable serializable0 = this.i;
        if(serializable0 == null) {
            return 0x1F;
        }
        if(m.i(this)) {
            v = this.a().longValue();
            return (int)(v ^ v >>> 0x20);
        }
        if(serializable0 instanceof Number) {
            v = Double.doubleToLongBits(this.a().doubleValue());
            return (int)(v ^ v >>> 0x20);
        }
        return serializable0.hashCode();
    }

    // 去混淆评级： 中等(60)
    public static boolean i(m m0) {
        return m0.i instanceof Number && (((Number)m0.i) instanceof BigInteger || ((Number)m0.i) instanceof Long || ((Number)m0.i) instanceof Integer || ((Number)m0.i) instanceof Short || ((Number)m0.i) instanceof Byte);
    }
}

