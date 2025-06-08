package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int[] i;
    public final ArrayList j;
    public final int[] k;
    public final int[] l;
    public final int m;
    public final int n;
    public final String o;
    public final int p;
    public final int q;
    public final CharSequence r;
    public final int s;
    public final CharSequence t;
    public final ArrayList u;
    public final ArrayList v;
    public final boolean w;

    static {
        BackStackState.CREATOR = new b(0);
    }

    public BackStackState(Parcel parcel0) {
        this.i = parcel0.createIntArray();
        this.j = parcel0.createStringArrayList();
        this.k = parcel0.createIntArray();
        this.l = parcel0.createIntArray();
        this.m = parcel0.readInt();
        this.n = parcel0.readInt();
        this.o = parcel0.readString();
        this.p = parcel0.readInt();
        this.q = parcel0.readInt();
        Parcelable.Creator parcelable$Creator0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.r = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.s = parcel0.readInt();
        this.t = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.u = parcel0.createStringArrayList();
        this.v = parcel0.createStringArrayList();
        this.w = parcel0.readInt() != 0;
    }

    public BackStackState(a a0) {
        int v = a0.a.size();
        this.i = new int[v * 5];
        if(!a0.h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.j = new ArrayList(v);
        this.k = new int[v];
        this.l = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            y y0 = (y)a0.a.get(v1);
            this.i[v2] = y0.a;
            this.j.add((y0.b == null ? null : y0.b.m));
            this.i[v2 + 1] = y0.c;
            this.i[v2 + 2] = y0.d;
            int v3 = v2 + 4;
            this.i[v2 + 3] = y0.e;
            v2 += 5;
            this.i[v3] = y0.f;
            this.k[v1] = y0.g.ordinal();
            this.l[v1] = y0.h.ordinal();
        }
        this.m = a0.f;
        this.n = a0.g;
        this.o = a0.i;
        this.p = a0.s;
        this.q = a0.j;
        this.r = a0.k;
        this.s = a0.l;
        this.t = a0.m;
        this.u = a0.n;
        this.v = a0.o;
        this.w = a0.p;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeIntArray(this.i);
        parcel0.writeStringList(this.j);
        parcel0.writeIntArray(this.k);
        parcel0.writeIntArray(this.l);
        parcel0.writeInt(this.m);
        parcel0.writeInt(this.n);
        parcel0.writeString(this.o);
        parcel0.writeInt(this.p);
        parcel0.writeInt(this.q);
        TextUtils.writeToParcel(this.r, parcel0, 0);
        parcel0.writeInt(this.s);
        TextUtils.writeToParcel(this.t, parcel0, 0);
        parcel0.writeStringList(this.u);
        parcel0.writeStringList(this.v);
        parcel0.writeInt(((int)this.w));
    }
}

