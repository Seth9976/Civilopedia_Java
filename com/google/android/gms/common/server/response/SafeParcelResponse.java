package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

@KeepForSdk
@Class(creator = "SafeParcelResponseCreator")
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final Parcel j;
    public final int k;
    public final zan l;
    public final String m;
    public int n;
    public int o;

    static {
        SafeParcelResponse.CREATOR = new zaq();
    }

    public SafeParcelResponse(int v, Parcel parcel0, zan zan0) {
        this.i = v;
        this.j = (Parcel)Preconditions.checkNotNull(parcel0);
        this.k = 2;
        this.l = zan0;
        this.m = zan0 == null ? null : zan0.zaa();
        this.n = 2;
    }

    public SafeParcelResponse(SafeParcelable safeParcelable0, zan zan0, String s) {
        this.i = 1;
        Parcel parcel0 = Parcel.obtain();
        this.j = parcel0;
        safeParcelable0.writeToParcel(parcel0, 0);
        this.k = 1;
        this.l = (zan)Preconditions.checkNotNull(zan0);
        this.m = (String)Preconditions.checkNotNull(s);
        this.n = 2;
    }

    public SafeParcelResponse(zan zan0, String s) {
        this.i = 1;
        this.j = Parcel.obtain();
        this.k = 0;
        this.l = (zan)Preconditions.checkNotNull(zan0);
        this.m = (String)Preconditions.checkNotNull(s);
        this.n = 0;
    }

    public static final void A(StringBuilder stringBuilder0, int v, Object object0) {
        switch(v) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                stringBuilder0.append(object0);
                return;
            }
            case 7: {
                stringBuilder0.append("\"");
                stringBuilder0.append(JsonUtils.escapeString(Preconditions.checkNotNull(object0).toString()));
                stringBuilder0.append("\"");
                return;
            }
            case 8: {
                stringBuilder0.append("\"");
                stringBuilder0.append(Base64Utils.encode(((byte[])object0)));
                stringBuilder0.append("\"");
                return;
            }
            case 9: {
                stringBuilder0.append("\"");
                stringBuilder0.append(Base64Utils.encodeUrlSafe(((byte[])object0)));
                stringBuilder0.append("\"");
                return;
            }
            case 10: {
                MapUtils.writeStringMapToJson(stringBuilder0, ((HashMap)Preconditions.checkNotNull(object0)));
                return;
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
            default: {
                throw new IllegalArgumentException("Unknown type = " + v);
            }
        }
    }

    public static final void B(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, Object object0) {
        int v = fastJsonResponse$Field0.j;
        if(fastJsonResponse$Field0.k) {
            stringBuilder0.append("[");
            int v1 = ((ArrayList)object0).size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(v2 != 0) {
                    stringBuilder0.append(",");
                }
                SafeParcelResponse.A(stringBuilder0, v, ((ArrayList)object0).get(v2));
            }
            stringBuilder0.append("]");
            return;
        }
        SafeParcelResponse.A(stringBuilder0, v, object0);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        ArrayList arrayList1 = new ArrayList();
        ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList1.add(((SafeParcelResponse)(((FastJsonResponse)arrayList0.get(v1)))).zaE());
        }
        SafeParcelWriter.writeParcelList(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arrayList1, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(Field fastJsonResponse$Field0, String s, FastJsonResponse fastJsonResponse0) {
        this.y(fastJsonResponse$Field0);
        Parcel parcel0 = ((SafeParcelResponse)fastJsonResponse0).zaE();
        SafeParcelWriter.writeParcel(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), parcel0, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void c(Field fastJsonResponse$Field0, boolean z) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeBoolean(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), z);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void d(Field fastJsonResponse$Field0, byte[] arr_b) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeByteArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_b, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void e(Field fastJsonResponse$Field0, int v) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeInt(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), v);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void f(Field fastJsonResponse$Field0, long v) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeLong(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), v);
    }

    @KeepForSdk
    public static SafeParcelResponse from(FastJsonResponse fastJsonResponse0) {
        String s = (String)Preconditions.checkNotNull(fastJsonResponse0.getClass().getCanonicalName());
        zan zan0 = new zan(fastJsonResponse0.getClass());
        SafeParcelResponse.x(zan0, fastJsonResponse0);
        zan0.zac();
        zan0.zad();
        return new SafeParcelResponse(((SafeParcelable)fastJsonResponse0), zan0, s);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void g(Field fastJsonResponse$Field0, String s) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeString(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), s, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return this.l == null ? null : this.l.zab(((String)Preconditions.checkNotNull(this.m)));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object getValueObject(String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void h(Field fastJsonResponse$Field0, Map map0) {
        this.y(fastJsonResponse$Field0);
        Bundle bundle0 = new Bundle();
        for(Object object0: ((Map)Preconditions.checkNotNull(map0)).keySet()) {
            bundle0.putString(((String)object0), ((String)map0.get(((String)object0))));
        }
        SafeParcelWriter.writeBundle(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), bundle0, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void i(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        int v = ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        String[] arr_s = new String[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_s[v1] = (String)arrayList0.get(v1);
        }
        SafeParcelWriter.writeStringArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_s, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean isPrimitiveFieldSet(String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void m(Field fastJsonResponse$Field0, BigDecimal bigDecimal0) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeBigDecimal(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), bigDecimal0, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void n(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        int v = ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        BigDecimal[] arr_bigDecimal = new BigDecimal[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_bigDecimal[v1] = (BigDecimal)arrayList0.get(v1);
        }
        SafeParcelWriter.writeBigDecimalArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_bigDecimal, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void o(Field fastJsonResponse$Field0, BigInteger bigInteger0) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeBigInteger(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), bigInteger0, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void p(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        int v = ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        BigInteger[] arr_bigInteger = new BigInteger[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_bigInteger[v1] = (BigInteger)arrayList0.get(v1);
        }
        SafeParcelWriter.writeBigIntegerArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_bigInteger, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void q(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        int v = ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        boolean[] arr_z = new boolean[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_z[v1] = ((Boolean)arrayList0.get(v1)).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_z, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void r(Field fastJsonResponse$Field0, double f) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeDouble(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), f);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void s(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        int v = ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        double[] arr_f = new double[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v1] = (double)(((Double)arrayList0.get(v1)));
        }
        SafeParcelWriter.writeDoubleArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_f, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void t(Field fastJsonResponse$Field0, float f) {
        this.y(fastJsonResponse$Field0);
        SafeParcelWriter.writeFloat(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), f);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        Preconditions.checkNotNull(this.l, "Cannot convert to JSON on client side.");
        Parcel parcel0 = this.zaE();
        parcel0.setDataPosition(0);
        StringBuilder stringBuilder0 = new StringBuilder(100);
        String s = (String)Preconditions.checkNotNull(this.m);
        SafeParcelResponse.z(stringBuilder0, ((Map)Preconditions.checkNotNull(this.l.zab(s))), parcel0);
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void u(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        int v = ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        float[] arr_f = new float[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v1] = (float)(((Float)arrayList0.get(v1)));
        }
        SafeParcelWriter.writeFloatArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_f, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void v(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        int v = ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = (int)(((Integer)arrayList0.get(v1)));
        }
        SafeParcelWriter.writeIntArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_v, true);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void w(Field fastJsonResponse$Field0, ArrayList arrayList0) {
        this.y(fastJsonResponse$Field0);
        int v = ((ArrayList)Preconditions.checkNotNull(arrayList0)).size();
        long[] arr_v = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = (long)(((Long)arrayList0.get(v1)));
        }
        SafeParcelWriter.writeLongArray(this.j, fastJsonResponse$Field0.getSafeParcelableFieldId(), arr_v, true);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeParcel(parcel0, 2, this.zaE(), false);
        SafeParcelWriter.writeParcelable(parcel0, 3, (this.k == 0 ? null : this.l), v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static void x(zan zan0, FastJsonResponse fastJsonResponse0) {
        java.lang.Class class0 = fastJsonResponse0.getClass();
        if(!zan0.zaf(class0)) {
            Map map0 = fastJsonResponse0.getFieldMappings();
            zan0.zae(class0, map0);
            for(Object object0: map0.keySet()) {
                java.lang.Class class1 = ((Field)map0.get(((String)object0))).p;
                if(class1 != null) {
                    try {
                        SafeParcelResponse.x(zan0, ((FastJsonResponse)class1.newInstance()));
                    }
                    catch(InstantiationException instantiationException0) {
                        throw new IllegalStateException("Could not instantiate an object of type " + ((java.lang.Class)Preconditions.checkNotNull(class1)).getCanonicalName(), instantiationException0);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        throw new IllegalStateException("Could not access object of type " + ((java.lang.Class)Preconditions.checkNotNull(class1)).getCanonicalName(), illegalAccessException0);
                    }
                }
            }
        }
    }

    public final void y(Field fastJsonResponse$Field0) {
        if(fastJsonResponse$Field0.o == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel0 = this.j;
        if(parcel0 != null) {
            switch(this.n) {
                case 0: {
                    this.o = SafeParcelWriter.beginObjectHeader(parcel0);
                    this.n = 1;
                    return;
                }
                case 1: {
                    return;
                }
                default: {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            }
        }
        throw new IllegalStateException("Internal Parcel object is null.");
    }

    public static void z(StringBuilder stringBuilder0, Map map0, Parcel parcel0) {
        SparseArray sparseArray0 = new SparseArray();
        for(Object object0: map0.entrySet()) {
            sparseArray0.put(((Field)((Map.Entry)object0).getValue()).getSafeParcelableFieldId(), ((Map.Entry)object0));
        }
        stringBuilder0.append('{');
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            Map.Entry map$Entry0 = (Map.Entry)sparseArray0.get(((char)v1));
            if(map$Entry0 != null) {
                if(z) {
                    stringBuilder0.append(",");
                }
                String s = (String)map$Entry0.getKey();
                Field fastJsonResponse$Field0 = (Field)map$Entry0.getValue();
                stringBuilder0.append("\"");
                stringBuilder0.append(s);
                stringBuilder0.append("\":");
                int v2 = fastJsonResponse$Field0.l;
                if(fastJsonResponse$Field0.zaj()) {
                    FieldConverter fastJsonResponse$FieldConverter0 = fastJsonResponse$Field0.s;
                    switch(v2) {
                        case 0: {
                            Integer integer0 = SafeParcelReader.readInt(parcel0, v1);
                            if(fastJsonResponse$FieldConverter0 != null) {
                                integer0 = fastJsonResponse$Field0.zaf(integer0);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, integer0);
                            break;
                        }
                        case 1: {
                            BigInteger bigInteger0 = SafeParcelReader.createBigInteger(parcel0, v1);
                            if(fastJsonResponse$FieldConverter0 != null) {
                                bigInteger0 = fastJsonResponse$Field0.zaf(bigInteger0);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, bigInteger0);
                            break;
                        }
                        case 2: {
                            Long long0 = SafeParcelReader.readLong(parcel0, v1);
                            if(fastJsonResponse$FieldConverter0 != null) {
                                long0 = fastJsonResponse$Field0.zaf(long0);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, long0);
                            break;
                        }
                        case 3: {
                            Float float0 = SafeParcelReader.readFloat(parcel0, v1);
                            if(fastJsonResponse$FieldConverter0 != null) {
                                float0 = fastJsonResponse$Field0.zaf(float0);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, float0);
                            break;
                        }
                        case 4: {
                            Double double0 = SafeParcelReader.readDouble(parcel0, v1);
                            if(fastJsonResponse$FieldConverter0 != null) {
                                double0 = fastJsonResponse$Field0.zaf(double0);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, double0);
                            break;
                        }
                        case 5: {
                            BigDecimal bigDecimal0 = SafeParcelReader.createBigDecimal(parcel0, v1);
                            if(fastJsonResponse$FieldConverter0 != null) {
                                bigDecimal0 = fastJsonResponse$Field0.zaf(bigDecimal0);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, bigDecimal0);
                            break;
                        }
                        case 6: {
                            Boolean boolean0 = Boolean.valueOf(SafeParcelReader.readBoolean(parcel0, v1));
                            if(fastJsonResponse$FieldConverter0 != null) {
                                boolean0 = fastJsonResponse$Field0.zaf(boolean0);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, boolean0);
                            break;
                        }
                        case 7: {
                            String s1 = SafeParcelReader.createString(parcel0, v1);
                            if(fastJsonResponse$FieldConverter0 != null) {
                                s1 = fastJsonResponse$Field0.zaf(s1);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, s1);
                            break;
                        }
                        case 8: 
                        case 9: {
                            byte[] arr_b = SafeParcelReader.createByteArray(parcel0, v1);
                            if(fastJsonResponse$FieldConverter0 != null) {
                                arr_b = fastJsonResponse$Field0.zaf(arr_b);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, arr_b);
                            break;
                        }
                        case 10: {
                            Bundle bundle0 = SafeParcelReader.createBundle(parcel0, v1);
                            HashMap hashMap0 = new HashMap();
                            for(Object object1: bundle0.keySet()) {
                                hashMap0.put(((String)object1), ((String)Preconditions.checkNotNull(bundle0.getString(((String)object1)))));
                            }
                            if(fastJsonResponse$FieldConverter0 != null) {
                                hashMap0 = fastJsonResponse$Field0.zaf(hashMap0);
                            }
                            SafeParcelResponse.B(stringBuilder0, fastJsonResponse$Field0, hashMap0);
                            break;
                        }
                        case 11: {
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown field out type = " + v2);
                        }
                    }
                }
                else if(fastJsonResponse$Field0.m) {
                    stringBuilder0.append("[");
                alab1:
                    switch(v2) {
                        case 0: {
                            ArrayUtils.writeArray(stringBuilder0, SafeParcelReader.createIntArray(parcel0, v1));
                            break;
                        }
                        case 1: {
                            ArrayUtils.writeArray(stringBuilder0, SafeParcelReader.createBigIntegerArray(parcel0, v1));
                            break;
                        }
                        case 2: {
                            ArrayUtils.writeArray(stringBuilder0, SafeParcelReader.createLongArray(parcel0, v1));
                            break;
                        }
                        case 3: {
                            ArrayUtils.writeArray(stringBuilder0, SafeParcelReader.createFloatArray(parcel0, v1));
                            break;
                        }
                        case 4: {
                            ArrayUtils.writeArray(stringBuilder0, SafeParcelReader.createDoubleArray(parcel0, v1));
                            break;
                        }
                        case 5: {
                            ArrayUtils.writeArray(stringBuilder0, SafeParcelReader.createBigDecimalArray(parcel0, v1));
                            break;
                        }
                        case 6: {
                            ArrayUtils.writeArray(stringBuilder0, SafeParcelReader.createBooleanArray(parcel0, v1));
                            break;
                        }
                        case 7: {
                            ArrayUtils.writeStringArray(stringBuilder0, SafeParcelReader.createStringArray(parcel0, v1));
                            break;
                        }
                        case 8: 
                        case 9: 
                        case 10: {
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        }
                        case 11: {
                            Parcel[] arr_parcel = SafeParcelReader.createParcelArray(parcel0, v1);
                            for(int v3 = 0; true; ++v3) {
                                if(v3 >= arr_parcel.length) {
                                    break alab1;
                                }
                                if(v3 > 0) {
                                    stringBuilder0.append(",");
                                }
                                arr_parcel[v3].setDataPosition(0);
                                SafeParcelResponse.z(stringBuilder0, fastJsonResponse$Field0.zah(), arr_parcel[v3]);
                            }
                        }
                        default: {
                            throw new IllegalStateException("Unknown field type out.");
                        }
                    }
                    stringBuilder0.append("]");
                }
                else {
                    switch(v2) {
                        case 0: {
                            stringBuilder0.append(SafeParcelReader.readInt(parcel0, v1));
                            break;
                        }
                        case 1: {
                            stringBuilder0.append(SafeParcelReader.createBigInteger(parcel0, v1));
                            break;
                        }
                        case 2: {
                            stringBuilder0.append(SafeParcelReader.readLong(parcel0, v1));
                            break;
                        }
                        case 3: {
                            stringBuilder0.append(SafeParcelReader.readFloat(parcel0, v1));
                            break;
                        }
                        case 4: {
                            stringBuilder0.append(SafeParcelReader.readDouble(parcel0, v1));
                            break;
                        }
                        case 5: {
                            stringBuilder0.append(SafeParcelReader.createBigDecimal(parcel0, v1));
                            break;
                        }
                        case 6: {
                            stringBuilder0.append(SafeParcelReader.readBoolean(parcel0, v1));
                            break;
                        }
                        case 7: {
                            String s2 = SafeParcelReader.createString(parcel0, v1);
                            stringBuilder0.append("\"");
                            stringBuilder0.append(JsonUtils.escapeString(s2));
                            stringBuilder0.append("\"");
                            break;
                        }
                        case 8: {
                            byte[] arr_b1 = SafeParcelReader.createByteArray(parcel0, v1);
                            stringBuilder0.append("\"");
                            stringBuilder0.append(Base64Utils.encode(arr_b1));
                            stringBuilder0.append("\"");
                            break;
                        }
                        case 9: {
                            byte[] arr_b2 = SafeParcelReader.createByteArray(parcel0, v1);
                            stringBuilder0.append("\"");
                            stringBuilder0.append(Base64Utils.encodeUrlSafe(arr_b2));
                            stringBuilder0.append("\"");
                            break;
                        }
                        case 10: {
                            Bundle bundle1 = SafeParcelReader.createBundle(parcel0, v1);
                            Set set0 = bundle1.keySet();
                            stringBuilder0.append("{");
                            boolean z1 = true;
                            for(Object object2: set0) {
                                if(!z1) {
                                    stringBuilder0.append(",");
                                }
                                stringBuilder0.append("\"");
                                stringBuilder0.append(((String)object2));
                                stringBuilder0.append("\":\"");
                                stringBuilder0.append(JsonUtils.escapeString(bundle1.getString(((String)object2))));
                                stringBuilder0.append("\"");
                                z1 = false;
                            }
                            stringBuilder0.append("}");
                            break;
                        }
                        case 11: {
                            Parcel parcel1 = SafeParcelReader.createParcel(parcel0, v1);
                            parcel1.setDataPosition(0);
                            SafeParcelResponse.z(stringBuilder0, fastJsonResponse$Field0.zah(), parcel1);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z = true;
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new ParseException("Overread allowed size end=" + v, parcel0);
        }
        stringBuilder0.append('}');
    }

    public final Parcel zaE() {
        Parcel parcel0 = this.j;
        switch(this.n) {
            case 0: {
                int v = SafeParcelWriter.beginObjectHeader(parcel0);
                this.o = v;
                SafeParcelWriter.finishObjectHeader(parcel0, v);
                this.n = 2;
                return parcel0;
            }
            case 1: {
                SafeParcelWriter.finishObjectHeader(parcel0, this.o);
                this.n = 2;
                return parcel0;
            }
            default: {
                return parcel0;
            }
        }
    }
}

