package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String i;
    public final String j;
    public final boolean k;
    public final int l;
    public final int m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final Bundle r;
    public final boolean s;
    public final int t;
    public Bundle u;
    public h v;

    static {
        FragmentState.CREATOR = new b(2);
    }

    public FragmentState(Parcel parcel0) {
        this.i = parcel0.readString();
        this.j = parcel0.readString();
        boolean z = false;
        this.k = parcel0.readInt() != 0;
        this.l = parcel0.readInt();
        this.m = parcel0.readInt();
        this.n = parcel0.readString();
        this.o = parcel0.readInt() != 0;
        this.p = parcel0.readInt() != 0;
        this.q = parcel0.readInt() != 0;
        this.r = parcel0.readBundle();
        if(parcel0.readInt() != 0) {
            z = true;
        }
        this.s = z;
        this.u = parcel0.readBundle();
        this.t = parcel0.readInt();
    }

    public FragmentState(h h0) {
        this.i = h0.getClass().getName();
        this.j = h0.m;
        this.k = h0.u;
        this.l = h0.D;
        this.m = h0.E;
        this.n = h0.F;
        this.o = h0.I;
        this.p = h0.t;
        this.q = h0.H;
        this.r = h0.n;
        this.s = h0.G;
        this.t = h0.Z.ordinal();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentState{");
        stringBuilder0.append(this.i);
        stringBuilder0.append(" (");
        stringBuilder0.append(this.j);
        stringBuilder0.append(")}:");
        if(this.k) {
            stringBuilder0.append(" fromLayout");
        }
        int v = this.m;
        if(v != 0) {
            stringBuilder0.append(" id=0x");
            stringBuilder0.append(Integer.toHexString(v));
        }
        String s = this.n;
        if(s != null && !s.isEmpty()) {
            stringBuilder0.append(" tag=");
            stringBuilder0.append(s);
        }
        if(this.o) {
            stringBuilder0.append(" retainInstance");
        }
        if(this.p) {
            stringBuilder0.append(" removing");
        }
        if(this.q) {
            stringBuilder0.append(" detached");
        }
        if(this.s) {
            stringBuilder0.append(" hidden");
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.i);
        parcel0.writeString(this.j);
        parcel0.writeInt(((int)this.k));
        parcel0.writeInt(this.l);
        parcel0.writeInt(this.m);
        parcel0.writeString(this.n);
        parcel0.writeInt(((int)this.o));
        parcel0.writeInt(((int)this.p));
        parcel0.writeInt(((int)this.q));
        parcel0.writeBundle(this.r);
        parcel0.writeInt(((int)this.s));
        parcel0.writeBundle(this.u);
        parcel0.writeInt(this.t);
    }
}

