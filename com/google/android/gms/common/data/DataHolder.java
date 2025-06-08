package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.sqlite.CursorWrapper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.TWR;

@KeepForSdk
@KeepName
@Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static class Builder {
        public final String[] a;
        public final ArrayList b;

        public Builder(String[] arr_s) {
            this.a = (String[])Preconditions.checkNotNull(arr_s);
            this.b = new ArrayList();
            new HashMap();
        }

        @KeepForSdk
        public DataHolder build(int v) {
            return new DataHolder(this, v);
        }

        @KeepForSdk
        public DataHolder build(int v, Bundle bundle0) {
            CursorWindow[] arr_cursorWindow = DataHolder.i(this);
            return new DataHolder(this.a, arr_cursorWindow, v, bundle0);
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder withRow(ContentValues contentValues0) {
            Asserts.checkNotNull(contentValues0);
            HashMap hashMap0 = new HashMap(contentValues0.size());
            for(Object object0: contentValues0.valueSet()) {
                hashMap0.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
            }
            return this.zaa(hashMap0);
        }

        @CanIgnoreReturnValue
        public Builder zaa(HashMap hashMap0) {
            Asserts.checkNotNull(hashMap0);
            this.b.add(hashMap0);
            return this;
        }
    }

    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final String[] j;
    public Bundle k;
    public final CursorWindow[] l;
    public final int m;
    public final Bundle n;
    public int[] o;
    public int p;
    public boolean q;
    public final boolean r;
    public static final a s;

    static {
        DataHolder.CREATOR = new zaf();
        DataHolder.s = new a(new String[0]);  // 初始化器: Lcom/google/android/gms/common/data/DataHolder$Builder;-><init>([Ljava/lang/String;)V
    }

    public DataHolder(int v, String[] arr_s, CursorWindow[] arr_cursorWindow, int v1, Bundle bundle0) {
        this.q = false;
        this.r = true;
        this.i = v;
        this.j = arr_s;
        this.l = arr_cursorWindow;
        this.m = v1;
        this.n = bundle0;
    }

    public DataHolder(Cursor cursor0, int v, Bundle bundle0) {
        int v2;
        CursorWrapper cursorWrapper0 = new CursorWrapper(cursor0);
        String[] arr_s = cursorWrapper0.getColumnNames();
        ArrayList arrayList0 = new ArrayList();
        try {
            int v1 = cursorWrapper0.getCount();
            CursorWindow cursorWindow0 = cursorWrapper0.getWindow();
            if(cursorWindow0 == null || cursorWindow0.getStartPosition() != 0) {
                v2 = 0;
            }
            else {
                cursorWindow0.acquireReference();
                cursorWrapper0.setWindow(null);
                arrayList0.add(cursorWindow0);
                v2 = cursorWindow0.getNumRows();
            }
            while(v2 < v1 && cursorWrapper0.moveToPosition(v2)) {
                CursorWindow cursorWindow1 = cursorWrapper0.getWindow();
                if(cursorWindow1 == null) {
                    cursorWindow1 = new CursorWindow(false);
                    cursorWindow1.setStartPosition(v2);
                    cursorWrapper0.fillWindow(v2, cursorWindow1);
                }
                else {
                    cursorWindow1.acquireReference();
                    cursorWrapper0.setWindow(null);
                }
                if(cursorWindow1.getNumRows() == 0) {
                    break;
                }
                arrayList0.add(cursorWindow1);
                v2 = cursorWindow1.getStartPosition() + cursorWindow1.getNumRows();
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursorWrapper0, throwable0);
            throw throwable0;
        }
        cursorWrapper0.close();
        this(arr_s, ((CursorWindow[])arrayList0.toArray(new CursorWindow[arrayList0.size()])), v, bundle0);
    }

    public DataHolder(Builder dataHolder$Builder0, int v) {
        CursorWindow[] arr_cursorWindow = DataHolder.i(dataHolder$Builder0);
        this(dataHolder$Builder0.a, arr_cursorWindow, v, null);
    }

    @KeepForSdk
    public DataHolder(String[] arr_s, CursorWindow[] arr_cursorWindow, int v, Bundle bundle0) {
        this.q = false;
        this.r = true;
        this.i = 1;
        this.j = (String[])Preconditions.checkNotNull(arr_s);
        this.l = (CursorWindow[])Preconditions.checkNotNull(arr_cursorWindow);
        this.m = v;
        this.n = bundle0;
        this.zad();
    }

    public final void a(int v, String s) {
        if(this.k == null || !this.k.containsKey(s)) {
            throw new IllegalArgumentException("No such column: " + s);
        }
        if(this.isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if(v < 0 || v >= this.p) {
            throw new CursorIndexOutOfBoundsException(v, this.p);
        }
    }

    @KeepForSdk
    public static Builder builder(String[] arr_s) {
        return new Builder(arr_s);
    }

    @Override
    @KeepForSdk
    public void close() {
        synchronized(this) {
            if(!this.q) {
                this.q = true;
                for(int v1 = 0; true; ++v1) {
                    CursorWindow[] arr_cursorWindow = this.l;
                    if(v1 >= arr_cursorWindow.length) {
                        break;
                    }
                    arr_cursorWindow[v1].close();
                }
            }
        }
    }

    @KeepForSdk
    public static DataHolder empty(int v) {
        return new DataHolder(DataHolder.s, v);
    }

    @Override
    public final void finalize() {
        try {
            if(this.r && this.l.length > 0 && !this.isClosed()) {
                this.close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + this.toString() + ")");
            }
        }
        finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(String s, int v, int v1) {
        this.a(v, s);
        return this.l[v1].getLong(v, this.k.getInt(s)) == 1L;
    }

    @KeepForSdk
    public byte[] getByteArray(String s, int v, int v1) {
        this.a(v, s);
        return this.l[v1].getBlob(v, this.k.getInt(s));
    }

    @KeepForSdk
    public int getCount() {
        return this.p;
    }

    @KeepForSdk
    public int getInteger(String s, int v, int v1) {
        this.a(v, s);
        return this.l[v1].getInt(v, this.k.getInt(s));
    }

    @KeepForSdk
    public long getLong(String s, int v, int v1) {
        this.a(v, s);
        return this.l[v1].getLong(v, this.k.getInt(s));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.n;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.m;
    }

    @KeepForSdk
    public String getString(String s, int v, int v1) {
        this.a(v, s);
        return this.l[v1].getString(v, this.k.getInt(s));
    }

    @KeepForSdk
    public int getWindowIndex(int v) {
        int v2;
        int v1 = 0;
        Preconditions.checkState(v >= 0 && v < this.p);
        while(true) {
            int[] arr_v = this.o;
            v2 = arr_v.length;
            if(v1 >= v2) {
                break;
            }
            if(v < arr_v[v1]) {
                --v1;
                return v1 == v2 ? v1 - 1 : v1;
            }
            ++v1;
        }
        return v1 == v2 ? v1 - 1 : v1;
    }

    @KeepForSdk
    public boolean hasColumn(String s) {
        return this.k.containsKey(s);
    }

    @KeepForSdk
    public boolean hasNull(String s, int v, int v1) {
        this.a(v, s);
        return this.l[v1].isNull(v, this.k.getInt(s));
    }

    public static CursorWindow[] i(Builder dataHolder$Builder0) {
        if(dataHolder$Builder0.a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList0 = dataHolder$Builder0.b;
        int v1 = arrayList0.size();
        CursorWindow cursorWindow0 = new CursorWindow(false);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(cursorWindow0);
        String[] arr_s = dataHolder$Builder0.a;
        cursorWindow0.setNumColumns(arr_s.length);
        int v2 = 0;
        boolean z = false;
        while(v2 < v1) {
            try {
                if(!cursorWindow0.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + v2 + ")");
                    cursorWindow0 = new CursorWindow(false);
                    cursorWindow0.setStartPosition(v2);
                    cursorWindow0.setNumColumns(arr_s.length);
                    arrayList1.add(cursorWindow0);
                    if(!cursorWindow0.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList1.remove(cursorWindow0);
                        return (CursorWindow[])arrayList1.toArray(new CursorWindow[arrayList1.size()]);
                    }
                }
                Map map0 = (Map)arrayList0.get(v2);
                int v3 = 0;
                boolean z1 = true;
                while(v3 < arr_s.length) {
                    if(!z1) {
                        goto label_57;
                    }
                    String s = arr_s[v3];
                    Object object0 = map0.get(s);
                    if(object0 == null) {
                        z1 = cursorWindow0.putNull(v2, v3);
                    }
                    else if(object0 instanceof String) {
                        z1 = cursorWindow0.putString(((String)object0), v2, v3);
                    }
                    else if(object0 instanceof Long) {
                        z1 = cursorWindow0.putLong(((long)(((Long)object0))), v2, v3);
                    }
                    else if(object0 instanceof Integer) {
                        z1 = cursorWindow0.putLong(((long)(((int)(((Integer)object0))))), v2, v3);
                    }
                    else if(object0 instanceof Boolean) {
                        z1 = cursorWindow0.putLong((((Boolean)object0).booleanValue() ? 1L : 0L), v2, v3);
                    }
                    else if(object0 instanceof byte[]) {
                        z1 = cursorWindow0.putBlob(((byte[])object0), v2, v3);
                    }
                    else if(object0 instanceof Double) {
                        z1 = cursorWindow0.putDouble(((double)(((Double)object0))), v2, v3);
                    }
                    else {
                        if(!(object0 instanceof Float)) {
                            throw new IllegalArgumentException("Unsupported object for column " + s + ": " + object0.toString());
                        }
                        z1 = cursorWindow0.putDouble(((double)(((float)(((Float)object0))))), v2, v3);
                    }
                    ++v3;
                }
                if(z1) {
                    z = false;
                }
                else {
                label_57:
                    if(z) {
                        throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    Log.d("DataHolder", "Couldn\'t populate window data for row " + v2 + " - allocating new window.");
                    cursorWindow0.freeLastRow();
                    cursorWindow0 = new CursorWindow(false);
                    cursorWindow0.setStartPosition(v2);
                    cursorWindow0.setNumColumns(arr_s.length);
                    arrayList1.add(cursorWindow0);
                    --v2;
                    z = true;
                }
                ++v2;
                continue;
            label_72:
                int v4 = arrayList1.size();
            }
            catch(RuntimeException runtimeException0) {
                goto label_72;
            }
            for(int v = 0; v < v4; ++v) {
                ((CursorWindow)arrayList1.get(v)).close();
            }
            throw runtimeException0;
        }
        return (CursorWindow[])arrayList1.toArray(new CursorWindow[arrayList1.size()]);
    }

    @KeepForSdk
    public boolean isClosed() {
        synchronized(this) {
        }
        return this.q;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeStringArray(parcel0, 1, this.j, false);
        SafeParcelWriter.writeTypedArray(parcel0, 2, this.l, v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.getStatusCode());
        SafeParcelWriter.writeBundle(parcel0, 4, this.getMetadata(), false);
        SafeParcelWriter.writeInt(parcel0, 1000, this.i);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
        if((v & 1) != 0) {
            this.close();
        }
    }

    public final double zaa(String s, int v, int v1) {
        this.a(v, s);
        return this.l[v1].getDouble(v, this.k.getInt(s));
    }

    public final float zab(String s, int v, int v1) {
        this.a(v, s);
        return this.l[v1].getFloat(v, this.k.getInt(s));
    }

    public final void zac(String s, int v, int v1, CharArrayBuffer charArrayBuffer0) {
        this.a(v, s);
        this.l[v1].copyStringToBuffer(v, this.k.getInt(s), charArrayBuffer0);
    }

    public final void zad() {
        this.k = new Bundle();
        for(int v1 = 0; true; ++v1) {
            String[] arr_s = this.j;
            if(v1 >= arr_s.length) {
                break;
            }
            this.k.putInt(arr_s[v1], v1);
        }
        CursorWindow[] arr_cursorWindow = this.l;
        this.o = new int[arr_cursorWindow.length];
        int v2 = 0;
        for(int v = 0; v < arr_cursorWindow.length; ++v) {
            this.o[v] = v2;
            int v3 = arr_cursorWindow[v].getStartPosition();
            v2 += arr_cursorWindow[v].getNumRows() - (v2 - v3);
        }
        this.p = v2;
    }
}

