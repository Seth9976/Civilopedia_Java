package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FieldConverter {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final HashMap j;
    public final SparseArray k;

    static {
        StringToIntConverter.CREATOR = new zad();
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.i = 1;
        this.j = new HashMap();
        this.k = new SparseArray();
    }

    public StringToIntConverter(int v, ArrayList arrayList0) {
        this.i = v;
        this.j = new HashMap();
        this.k = new SparseArray();
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            zac zac0 = (zac)arrayList0.get(v2);
            this.add(zac0.j, zac0.k);
        }
    }

    @KeepForSdk
    @CanIgnoreReturnValue
    public StringToIntConverter add(String s, int v) {
        this.j.put(s, v);
        this.k.put(v, s);
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = this.j;
        for(Object object0: hashMap0.keySet()) {
            arrayList0.add(new zac(((String)object0), ((int)(((Integer)hashMap0.get(((String)object0)))))));
        }
        SafeParcelWriter.writeTypedList(parcel0, 2, arrayList0, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter
    public final int zab() {
        return 0;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter
    public final Object zac(Object object0) {
        Integer integer0 = (Integer)this.j.get(((String)object0));
        return integer0 == null ? ((Integer)this.j.get("gms_unknown")) : integer0;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter
    public final Object zad(Object object0) {
        String s = (String)this.k.get(((int)(((Integer)object0))));
        return s != null || !this.j.containsKey("gms_unknown") ? s : "gms_unknown";
    }
}

