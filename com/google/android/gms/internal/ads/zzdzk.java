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

public final class zzdzk implements SensorEventListener {
    public final Context a;
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public zzdzj f;
    public boolean g;

    public zzdzk(Context context0) {
        this.a = context0;
    }

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhz)).booleanValue()) {
            float[] arr_f = sensorEvent0.values;
            float f = arr_f[0] / 9.80665f;
            float f1 = arr_f[1] / 9.80665f;
            float f2 = arr_f[2] / 9.80665f;
            if(((float)Math.sqrt(f2 * f2 + (f1 * f1 + f * f))) < ((float)(((Float)zzay.zzc().zzb(zzbhz.zzhA))))) {
                return;
            }
            long v = zzt.zzA().currentTimeMillis();
            if(this.d + ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhB)))))) > v) {
                return;
            }
            if(this.d + ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhC)))))) < v) {
                this.e = 0;
            }
            zze.zza("Shake detected.");
            this.d = v;
            int v1 = this.e + 1;
            this.e = v1;
            zzdzj zzdzj0 = this.f;
            if(zzdzj0 != null && v1 == ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhD))))) {
                ((zzdzb)zzdzj0).zzg(new q(1), zzdza.zzc);
            }
        }
    }

    public final void zza() {
        synchronized(this) {
            if(this.g) {
                SensorManager sensorManager0 = this.b;
                if(sensorManager0 != null) {
                    sensorManager0.unregisterListener(this, this.c);
                    zze.zza("Stopped listening for shake gestures.");
                }
                this.g = false;
            }
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhz)).booleanValue()) {
                return;
            }
            if(this.b == null) {
                SensorManager sensorManager0 = (SensorManager)this.a.getSystemService("sensor");
                this.b = sensorManager0;
                if(sensorManager0 == null) {
                    zzcfi.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                    return;
                }
                this.c = sensorManager0.getDefaultSensor(1);
            }
            if(!this.g) {
                SensorManager sensorManager1 = this.b;
                if(sensorManager1 != null) {
                    Sensor sensor0 = this.c;
                    if(sensor0 != null) {
                        sensorManager1.registerListener(this, sensor0, 2);
                        this.d = zzt.zzA().currentTimeMillis() - ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhB))))));
                        this.g = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            }
        }
    }

    public final void zzc(zzdzj zzdzj0) {
        this.f = zzdzj0;
    }
}

