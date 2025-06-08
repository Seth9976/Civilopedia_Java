package androidx.activity.result;

import P0.d;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final Intent j;

    static {
        ActivityResult.CREATOR = new d(11);
    }

    public ActivityResult(int v, Intent intent0) {
        this.i = v;
        this.j = intent0;
    }

    public ActivityResult(Parcel parcel0) {
        this.i = parcel0.readInt();
        this.j = parcel0.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel0));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("ActivityResult{resultCode=");
        int v = this.i;
        switch(v) {
            case -1: {
                s = "RESULT_OK";
                break;
            }
            case 0: {
                s = "RESULT_CANCELED";
                break;
            }
            default: {
                s = String.valueOf(v);
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", data=");
        stringBuilder0.append(this.j);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.i);
        Intent intent0 = this.j;
        parcel0.writeInt((intent0 == null ? 0 : 1));
        if(intent0 != null) {
            intent0.writeToParcel(parcel0, v);
        }
    }
}

