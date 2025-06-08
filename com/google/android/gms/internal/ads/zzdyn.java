package com.google.android.gms.internal.ads;

import D0.q;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzdyn implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public float c;
    public Float d;
    public long e;
    public int f;
    public boolean g;
    public boolean h;
    public zzdym i;
    public boolean j;

    public zzdyn(Context context0) {
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = zzt.zzA().currentTimeMillis();
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = false;
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        this.a = sensorManager0;
        if(sensorManager0 != null) {
            this.b = sensorManager0.getDefaultSensor(4);
            return;
        }
        this.b = null;
    }

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhE)).booleanValue()) {
            return;
        }
        long v = zzt.zzA().currentTimeMillis();
        if(this.e + ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhG)))))) < v) {
            this.f = 0;
            this.e = v;
            this.g = false;
            this.h = false;
            this.c = (float)this.d;
        }
        float f = sensorEvent0.values[1] * 4.0f + ((float)this.d);
        this.d = f;
        float f1 = this.c;
        zzbhr zzbhr0 = zzbhz.zzhF;
        if(f > ((float)(((Float)zzay.zzc().zzb(zzbhr0)))) + f1) {
            this.c = (float)this.d;
            this.h = true;
        }
        else if(((float)this.d) < this.c - ((float)(((Float)zzay.zzc().zzb(zzbhr0))))) {
            this.c = (float)this.d;
            this.g = true;
        }
        if(this.d.isInfinite()) {
            this.d = 0.0f;
            this.c = 0.0f;
        }
        if(this.g && this.h) {
            zze.zza("Flick detected.");
            this.e = v;
            int v1 = this.f + 1;
            this.f = v1;
            this.g = false;
            this.h = false;
            zzdym zzdym0 = this.i;
            if(zzdym0 != null && v1 == ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhH))))) {
                ((zzdzb)zzdym0).zzg(new q(2), zzdza.zzc);
            }
        }
    }

    public final void zza() {
        synchronized(this) {
            if(this.j) {
                SensorManager sensorManager0 = this.a;
                if(sensorManager0 != null) {
                    Sensor sensor0 = this.b;
                    if(sensor0 != null) {
                        sensorManager0.unregisterListener(this, sensor0);
                        this.j = false;
                        zze.zza("Stopped listening for flick gestures.");
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhE)).booleanValue()) {
                return;
            }
            if(!this.j) {
                SensorManager sensorManager0 = this.a;
                if(sensorManager0 != null) {
                    Sensor sensor0 = this.b;
                    if(sensor0 != null) {
                        sensorManager0.registerListener(this, sensor0, 2);
                        this.j = true;
                        zze.zza("Listening for flick gestures.");
                    }
                }
            }
        }
        if(this.a != null && this.b != null) {
            return;
        }
        zzcfi.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
    }

    public final void zzc(zzdym zzdym0) {
        this.i = zzdym0;
    }
}

