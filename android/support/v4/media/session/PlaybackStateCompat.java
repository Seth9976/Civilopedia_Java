package android.support.v4.media.session;

import P0.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public final class PlaybackStateCompat implements Parcelable {
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public final String i;
        public final CharSequence j;
        public final int k;
        public final Bundle l;

        static {
            CustomAction.CREATOR = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public CustomAction(Parcel parcel0) {
            this.i = parcel0.readString();
            this.j = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
            this.k = parcel0.readInt();
            this.l = parcel0.readBundle(a.class.getClassLoader());
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override
        public final String toString() {
            return "Action:mName=\'" + this.j + ", mIcon=" + this.k + ", mExtras=" + this.l;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.i);
            TextUtils.writeToParcel(this.j, parcel0, v);
            parcel0.writeInt(this.k);
            parcel0.writeBundle(this.l);
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final long j;
    public final long k;
    public final float l;
    public final long m;
    public final int n;
    public final CharSequence o;
    public final long p;
    public final ArrayList q;
    public final long r;
    public final Bundle s;

    static {
        PlaybackStateCompat.CREATOR = new d(10);
    }

    public PlaybackStateCompat(Parcel parcel0) {
        this.i = parcel0.readInt();
        this.j = parcel0.readLong();
        this.l = parcel0.readFloat();
        this.p = parcel0.readLong();
        this.k = parcel0.readLong();
        this.m = parcel0.readLong();
        this.o = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
        this.q = parcel0.createTypedArrayList(CustomAction.CREATOR);
        this.r = parcel0.readLong();
        this.s = parcel0.readBundle(a.class.getClassLoader());
        this.n = parcel0.readInt();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "PlaybackState {state=" + this.i + ", position=" + this.j + ", buffered position=" + this.k + ", speed=" + this.l + ", updated=" + this.p + ", actions=" + this.m + ", error code=" + this.n + ", error message=" + this.o + ", custom actions=" + this.q + ", active item id=" + this.r + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.i);
        parcel0.writeLong(this.j);
        parcel0.writeFloat(this.l);
        parcel0.writeLong(this.p);
        parcel0.writeLong(this.k);
        parcel0.writeLong(this.m);
        TextUtils.writeToParcel(this.o, parcel0, v);
        parcel0.writeTypedList(this.q);
        parcel0.writeLong(this.r);
        parcel0.writeBundle(this.s);
        parcel0.writeInt(this.n);
    }
}

