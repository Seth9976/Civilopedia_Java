package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class x0 implements Runnable {
    public final int i;

    public x0(int v) {
        this.i = v;
        super();
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch0;
        switch(this.i) {
            case 0: {
                try {
                    y0.b = MessageDigest.getInstance("MD5");
                    countDownLatch0 = y0.e;
                }
                catch(NoSuchAlgorithmException unused_ex) {
                    countDownLatch0 = y0.e;
                }
                catch(Throwable throwable0) {
                    y0.e.countDown();
                    throw throwable0;
                }
                countDownLatch0.countDown();
                return;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                break;
            }
            case 7: {
                Looper.myLooper().quit();
                break;
            }
            case 8: {
                zzfkf zzfkf0 = zzfkf.zzd();
                zzfkf0.getClass();
                zzfkf0.e = System.nanoTime();
                zzfjy zzfjy0 = zzfkf0.c;
                zzfjy0.zzi();
                long v = System.nanoTime();
                zzfjm zzfjm0 = zzfkf0.b;
                zzfjl zzfjl0 = zzfjm0.zza();
                zzfjz zzfjz0 = zzfkf0.d;
                if(zzfjy0.zze().size() > 0) {
                    for(Object object0: zzfjy0.zze()) {
                        String s = (String)object0;
                        JSONObject jSONObject0 = zzfjt.zza(0, 0, 0, 0);
                        View view0 = zzfjy0.zza(s);
                        zzfjl zzfjl1 = zzfjm0.zzb();
                        String s1 = zzfjy0.zzc(s);
                        if(s1 != null) {
                            JSONObject jSONObject1 = zzfjl1.zza(view0);
                            zzfjt.zzb(jSONObject1, s);
                            zzfjt.zze(jSONObject1, s1);
                            zzfjt.zzc(jSONObject0, jSONObject1);
                        }
                        zzfjt.zzh(jSONObject0);
                        HashSet hashSet0 = new HashSet();
                        hashSet0.add(s);
                        zzfjz0.zzc(jSONObject0, hashSet0, v);
                    }
                }
                if(zzfjy0.zzf().size() > 0) {
                    JSONObject jSONObject2 = zzfjt.zza(0, 0, 0, 0);
                    zzfjl0.zzb(null, jSONObject2, zzfkf0, true);
                    zzfjt.zzh(jSONObject2);
                    zzfjz0.zzd(jSONObject2, zzfjy0.zzf(), v);
                }
                else {
                    zzfjz0.zzb();
                }
                zzfjy0.zzg();
                long v1 = System.nanoTime() - zzfkf0.e;
                ArrayList arrayList0 = zzfkf0.a;
                if(arrayList0.size() > 0) {
                    for(Object object1: arrayList0) {
                        zzfke zzfke0 = (zzfke)object1;
                        TimeUnit.NANOSECONDS.toMillis(v1);
                        zzfke0.zzb();
                        if(zzfke0 instanceof zzfkd) {
                            ((zzfkd)zzfke0).zza();
                        }
                    }
                }
                return;
            }
            case 9: {
                Handler handler0 = zzfkf.h;
                if(handler0 != null) {
                    handler0.post(zzfkf.i);
                    zzfkf.h.postDelayed(zzfkf.j, 200L);
                }
            }
        }
    }
}

