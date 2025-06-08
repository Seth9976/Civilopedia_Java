package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
@ShowFirstParty
public abstract class FastJsonResponse {
    @KeepForSdk
    @ShowFirstParty
    @Class(creator = "FieldCreator")
    public static class Field extends AbstractSafeParcelable {
        public static final zaj CREATOR;
        public final int i;
        public final int j;
        public final boolean k;
        public final int l;
        public final boolean m;
        public final String n;
        public final int o;
        public final java.lang.Class p;
        public final String q;
        public zan r;
        public final FieldConverter s;

        static {
            Field.CREATOR = new zaj();
        }

        public Field(int v, int v1, boolean z, int v2, boolean z1, String s, int v3, String s1, zaa zaa0) {
            this.i = v;
            this.j = v1;
            this.k = z;
            this.l = v2;
            this.m = z1;
            this.n = s;
            this.o = v3;
            if(s1 == null) {
                this.p = null;
                this.q = null;
            }
            else {
                this.p = SafeParcelResponse.class;
                this.q = s1;
            }
            if(zaa0 == null) {
                this.s = null;
                return;
            }
            this.s = zaa0.zab();
        }

        public Field(int v, boolean z, int v1, boolean z1, String s, int v2, java.lang.Class class0, FieldConverter fastJsonResponse$FieldConverter0) {
            this.i = 1;
            this.j = v;
            this.k = z;
            this.l = v1;
            this.m = z1;
            this.n = s;
            this.o = v2;
            this.p = class0;
            this.q = class0 == null ? null : class0.getCanonicalName();
            this.s = fastJsonResponse$FieldConverter0;
        }

        @KeepForSdk
        public static Field forBase64(String s, int v) {
            return new Field(8, false, 8, false, s, v, null, null);
        }

        @KeepForSdk
        public static Field forBoolean(String s, int v) {
            return new Field(6, false, 6, false, s, v, null, null);
        }

        @KeepForSdk
        public static Field forConcreteType(String s, int v, java.lang.Class class0) {
            return new Field(11, false, 11, false, s, v, class0, null);
        }

        @KeepForSdk
        public static Field forConcreteTypeArray(String s, int v, java.lang.Class class0) {
            return new Field(11, true, 11, true, s, v, class0, null);
        }

        @KeepForSdk
        public static Field forDouble(String s, int v) {
            return new Field(4, false, 4, false, s, v, null, null);
        }

        @KeepForSdk
        public static Field forFloat(String s, int v) {
            return new Field(3, false, 3, false, s, v, null, null);
        }

        @KeepForSdk
        public static Field forInteger(String s, int v) {
            return new Field(0, false, 0, false, s, v, null, null);
        }

        @KeepForSdk
        public static Field forLong(String s, int v) {
            return new Field(2, false, 2, false, s, v, null, null);
        }

        @KeepForSdk
        public static Field forString(String s, int v) {
            return new Field(7, false, 7, false, s, v, null, null);
        }

        @KeepForSdk
        public static Field forStringMap(String s, int v) {
            return new Field(10, false, 10, false, s, v, null, null);
        }

        @KeepForSdk
        public static Field forStrings(String s, int v) {
            return new Field(7, true, 7, true, s, v, null, null);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.o;
        }

        @Override
        public final String toString() {
            ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this).add("versionCode", this.i).add("typeIn", this.j).add("typeInArray", Boolean.valueOf(this.k)).add("typeOut", this.l).add("typeOutArray", Boolean.valueOf(this.m)).add("outputFieldName", this.n).add("safeParcelFieldId", this.o).add("concreteTypeName", (this.q == null ? null : this.q));
            java.lang.Class class0 = this.p;
            if(class0 != null) {
                objects$ToStringHelper0.add("concreteType.class", class0.getCanonicalName());
            }
            FieldConverter fastJsonResponse$FieldConverter0 = this.s;
            if(fastJsonResponse$FieldConverter0 != null) {
                objects$ToStringHelper0.add("converterName", fastJsonResponse$FieldConverter0.getClass().getCanonicalName());
            }
            return objects$ToStringHelper0.toString();
        }

        @KeepForSdk
        public static Field withConverter(String s, int v, FieldConverter fastJsonResponse$FieldConverter0, boolean z) {
            fastJsonResponse$FieldConverter0.zaa();
            fastJsonResponse$FieldConverter0.zab();
            return new Field(7, z, 0, false, s, v, null, fastJsonResponse$FieldConverter0);
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeInt(parcel0, 1, this.i);
            SafeParcelWriter.writeInt(parcel0, 2, this.j);
            SafeParcelWriter.writeBoolean(parcel0, 3, this.k);
            SafeParcelWriter.writeInt(parcel0, 4, this.l);
            SafeParcelWriter.writeBoolean(parcel0, 5, this.m);
            SafeParcelWriter.writeString(parcel0, 6, this.n, false);
            SafeParcelWriter.writeInt(parcel0, 7, this.getSafeParcelableFieldId());
            zaa zaa0 = null;
            SafeParcelWriter.writeString(parcel0, 8, (this.q == null ? null : this.q), false);
            FieldConverter fastJsonResponse$FieldConverter0 = this.s;
            if(fastJsonResponse$FieldConverter0 != null) {
                zaa0 = zaa.zaa(fastJsonResponse$FieldConverter0);
            }
            SafeParcelWriter.writeParcelable(parcel0, 9, zaa0, v, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }

        public final Field zab() {
            FieldConverter fastJsonResponse$FieldConverter0 = this.s;
            if(fastJsonResponse$FieldConverter0 == null) {
                return new Field(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, null);
            }
            zaa zaa0 = zaa.zaa(fastJsonResponse$FieldConverter0);
            return new Field(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, zaa0);
        }

        public final FastJsonResponse zad() throws InstantiationException, IllegalAccessException {
            java.lang.Class class0 = this.p;
            Preconditions.checkNotNull(class0);
            if(class0 == SafeParcelResponse.class) {
                Preconditions.checkNotNull(this.q);
                Preconditions.checkNotNull(this.r, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new SafeParcelResponse(this.r, this.q);
            }
            return (FastJsonResponse)class0.newInstance();
        }

        public final Object zae(Object object0) {
            Preconditions.checkNotNull(this.s);
            return Preconditions.checkNotNull(this.s.zac(object0));
        }

        public final Object zaf(Object object0) {
            Preconditions.checkNotNull(this.s);
            return this.s.zad(object0);
        }

        public final Map zah() {
            Preconditions.checkNotNull(this.q);
            Preconditions.checkNotNull(this.r);
            return (Map)Preconditions.checkNotNull(this.r.zab(this.q));
        }

        public final void zai(zan zan0) {
            this.r = zan0;
        }

        public final boolean zaj() {
            return this.s != null;
        }
    }

    @ShowFirstParty
    public interface FieldConverter {
        int zaa();

        int zab();

        Object zac(Object arg1);

        Object zad(Object arg1);
    }

    public final Object a(Field fastJsonResponse$Field0) {
        String s = fastJsonResponse$Field0.n;
        if(fastJsonResponse$Field0.p != null) {
            Preconditions.checkState(this.getValueObject(s) == null, "Concrete field shouldn\'t be value object: %s", new Object[]{s});
            try {
                return this.getClass().getMethod("get" + Character.toUpperCase(s.charAt(0)) + s.substring(1), null).invoke(this, null);
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0);
            }
        }
        return this.getValueObject(s);
    }

    @KeepForSdk
    public void addConcreteTypeArrayInternal(Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public void addConcreteTypeInternal(Field fastJsonResponse$Field0, String s, FastJsonResponse fastJsonResponse0) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public final boolean b(Field fastJsonResponse$Field0) {
        if(fastJsonResponse$Field0.l == 11) {
            throw fastJsonResponse$Field0.m ? new UnsupportedOperationException("Concrete type arrays not supported") : new UnsupportedOperationException("Concrete types not supported");
        }
        return this.isPrimitiveFieldSet(fastJsonResponse$Field0.n);
    }

    public void c(Field fastJsonResponse$Field0, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void d(Field fastJsonResponse$Field0, byte[] arr_b) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void e(Field fastJsonResponse$Field0, int v) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void f(Field fastJsonResponse$Field0, long v) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void g(Field fastJsonResponse$Field0, String s) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public abstract Map getFieldMappings();

    public abstract Object getValueObject(String arg1);

    public void h(Field fastJsonResponse$Field0, Map map0) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void i(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String arg1);

    public final void j(Field fastJsonResponse$Field0, Object object0) {
        Object object1 = fastJsonResponse$Field0.zae(object0);
        int v = fastJsonResponse$Field0.l;
        String s = fastJsonResponse$Field0.n;
        switch(v) {
            case 0: {
                if(object1 != null) {
                    this.e(fastJsonResponse$Field0, ((int)(((Integer)object1))));
                    return;
                }
                FastJsonResponse.l(s);
                return;
            }
            case 1: {
                this.o(fastJsonResponse$Field0, ((BigInteger)object1));
                return;
            }
            case 2: {
                if(object1 != null) {
                    this.f(fastJsonResponse$Field0, ((long)(((Long)object1))));
                    return;
                }
                FastJsonResponse.l(s);
                return;
            }
            case 4: {
                if(object1 != null) {
                    this.r(fastJsonResponse$Field0, ((double)(((Double)object1))));
                    return;
                }
                FastJsonResponse.l(s);
                return;
            }
            case 5: {
                this.m(fastJsonResponse$Field0, ((BigDecimal)object1));
                return;
            }
            case 6: {
                if(object1 != null) {
                    this.c(fastJsonResponse$Field0, ((Boolean)object1).booleanValue());
                    return;
                }
                FastJsonResponse.l(s);
                return;
            }
            case 7: {
                this.g(fastJsonResponse$Field0, ((String)object1));
                return;
            }
            case 8: 
            case 9: {
                if(object1 != null) {
                    this.d(fastJsonResponse$Field0, ((byte[])object1));
                    return;
                }
                FastJsonResponse.l(s);
                return;
            }
            default: {
                throw new IllegalStateException("Unsupported type for conversion: " + v);
            }
        }
    }

    public static final void k(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, Object object0) {
        switch(fastJsonResponse$Field0.j) {
            case 7: {
                stringBuilder0.append("\"");
                stringBuilder0.append(JsonUtils.escapeString(((String)object0)));
                stringBuilder0.append("\"");
                return;
            }
            case 11: {
                Preconditions.checkNotNull(fastJsonResponse$Field0.p);
                stringBuilder0.append(((FastJsonResponse)fastJsonResponse$Field0.p.cast(object0)).toString());
                return;
            }
            default: {
                stringBuilder0.append(object0);
            }
        }
    }

    public static final void l(String s) {
        if(Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + s + ") has a null value, but expected a primitive");
        }
    }

    public void m(Field fastJsonResponse$Field0, BigDecimal bigDecimal0) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public void n(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public void o(Field fastJsonResponse$Field0, BigInteger bigInteger0) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void p(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public void q(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public void r(Field fastJsonResponse$Field0, double f) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void s(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public void t(Field fastJsonResponse$Field0, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    @Override
    @KeepForSdk
    public String toString() {
        Map map0 = this.getFieldMappings();
        StringBuilder stringBuilder0 = new StringBuilder(100);
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Field fastJsonResponse$Field0 = (Field)map0.get(s);
            if(this.b(fastJsonResponse$Field0)) {
                Object object1 = this.a(fastJsonResponse$Field0);
                if(fastJsonResponse$Field0.s != null) {
                    object1 = fastJsonResponse$Field0.zaf(object1);
                }
                if(stringBuilder0.length() == 0) {
                    stringBuilder0.append("{");
                }
                else {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append("\"");
                stringBuilder0.append(s);
                stringBuilder0.append("\":");
                if(object1 == null) {
                    stringBuilder0.append("null");
                }
                else {
                    switch(fastJsonResponse$Field0.l) {
                        case 8: {
                            stringBuilder0.append("\"");
                            stringBuilder0.append(Base64Utils.encode(((byte[])object1)));
                            stringBuilder0.append("\"");
                            break;
                        }
                        case 9: {
                            stringBuilder0.append("\"");
                            stringBuilder0.append(Base64Utils.encodeUrlSafe(((byte[])object1)));
                            stringBuilder0.append("\"");
                            break;
                        }
                        case 10: {
                            MapUtils.writeStringMapToJson(stringBuilder0, ((HashMap)object1));
                            break;
                        }
                        default: {
                            if(fastJsonResponse$Field0.k) {
                                ArrayList arrayList0 = (ArrayList)object1;
                                stringBuilder0.append("[");
                                int v = arrayList0.size();
                                for(int v1 = 0; v1 < v; ++v1) {
                                    if(v1 > 0) {
                                        stringBuilder0.append(",");
                                    }
                                    Object object2 = arrayList0.get(v1);
                                    if(object2 != null) {
                                        FastJsonResponse.k(stringBuilder0, fastJsonResponse$Field0, object2);
                                    }
                                }
                                stringBuilder0.append("]");
                                continue;
                            }
                            else {
                                FastJsonResponse.k(stringBuilder0, fastJsonResponse$Field0, object1);
                                break;
                            }
                            stringBuilder0.append("\"");
                            stringBuilder0.append(Base64Utils.encode(((byte[])object1)));
                            stringBuilder0.append("\"");
                            break;
                        }
                    }
                }
            }
        }
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("{}");
        return stringBuilder0.toString();
    }

    public void u(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public void v(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void w(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public final void zaA(Field fastJsonResponse$Field0, String s) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, s);
            return;
        }
        this.g(fastJsonResponse$Field0, s);
    }

    public final void zaB(Field fastJsonResponse$Field0, Map map0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, map0);
            return;
        }
        this.h(fastJsonResponse$Field0, map0);
    }

    public final void zaC(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.i(fastJsonResponse$Field0, arrayList0);
    }

    public final void zaa(Field fastJsonResponse$Field0, BigDecimal bigDecimal0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, bigDecimal0);
            return;
        }
        this.m(fastJsonResponse$Field0, bigDecimal0);
    }

    public final void zac(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.n(fastJsonResponse$Field0, arrayList0);
    }

    public final void zae(Field fastJsonResponse$Field0, BigInteger bigInteger0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, bigInteger0);
            return;
        }
        this.o(fastJsonResponse$Field0, bigInteger0);
    }

    public final void zag(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.p(fastJsonResponse$Field0, arrayList0);
    }

    public final void zai(Field fastJsonResponse$Field0, boolean z) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, Boolean.valueOf(z));
            return;
        }
        this.c(fastJsonResponse$Field0, z);
    }

    public final void zaj(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.q(fastJsonResponse$Field0, arrayList0);
    }

    public final void zal(Field fastJsonResponse$Field0, byte[] arr_b) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arr_b);
            return;
        }
        this.d(fastJsonResponse$Field0, arr_b);
    }

    public final void zam(Field fastJsonResponse$Field0, double f) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, f);
            return;
        }
        this.r(fastJsonResponse$Field0, f);
    }

    public final void zao(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.s(fastJsonResponse$Field0, arrayList0);
    }

    public final void zaq(Field fastJsonResponse$Field0, float f) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, f);
            return;
        }
        this.t(fastJsonResponse$Field0, f);
    }

    public final void zas(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.u(fastJsonResponse$Field0, arrayList0);
    }

    public final void zau(Field fastJsonResponse$Field0, int v) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, v);
            return;
        }
        this.e(fastJsonResponse$Field0, v);
    }

    public final void zav(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.v(fastJsonResponse$Field0, arrayList0);
    }

    public final void zax(Field fastJsonResponse$Field0, long v) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, v);
            return;
        }
        this.f(fastJsonResponse$Field0, v);
    }

    public final void zay(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        if(fastJsonResponse$Field0.s != null) {
            this.j(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.w(fastJsonResponse$Field0, arrayList0);
    }
}

