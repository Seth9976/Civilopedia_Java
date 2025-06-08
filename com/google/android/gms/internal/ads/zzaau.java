package com.google.android.gms.internal.ads;

import N.b;
import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class zzaau implements zzyr {
    public final zzdy a;
    public zzyu b;
    public int c;
    public int d;
    public int e;
    public long f;
    public zzacr g;
    public zzys h;
    public f i;
    public zzaeo j;

    public zzaau() {
        this.a = new zzdy(6);
        this.f = -1L;
    }

    public final int a(zzys zzys0) {
        this.a.zzC(2);
        ((zzyl)zzys0).zzm(this.a.zzH(), 0, 2, false);
        return this.a.zzo();
    }

    public final void b() {
        this.c(new zzbk[0]);
        zzyu zzyu0 = this.b;
        zzyu0.getClass();
        zzyu0.zzB();
        this.b.zzL(new zzzt(0x8000000000000001L, 0L));
        this.c = 6;
    }

    public final void c(zzbk[] arr_zzbk) {
        zzyu zzyu0 = this.b;
        zzyu0.getClass();
        zzzy zzzy0 = zzyu0.zzv(0x400, 4);
        zzab zzab0 = new zzab();
        zzab0.zzz("image/jpeg");
        zzab0.zzM(new zzbl(arr_zzbk));
        zzzy0.zzk(zzab0.zzY());
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        long v14;
        b b0;
        int v = this.c;
        zzdy zzdy0 = this.a;
        switch(v) {
            case 0: {
                zzdy0.zzC(2);
                ((zzyl)zzys0).zzn(zzdy0.zzH(), 0, 2, false);
                int v1 = zzdy0.zzo();
                this.d = v1;
                if(v1 == 0xFFDA) {
                    if(this.f != -1L) {
                        this.c = 4;
                        return 0;
                    }
                    this.b();
                    return 0;
                }
                if((v1 < 0xFFD0 || v1 > 0xFFD9) && v1 != 0xFF01) {
                    this.c = 1;
                }
                return 0;
            }
            case 1: {
                zzdy0.zzC(2);
                ((zzyl)zzys0).zzn(zzdy0.zzH(), 0, 2, false);
                this.e = zzdy0.zzo() - 2;
                this.c = 2;
                return 0;
            }
            case 2: {
                if(this.d == 0xFFE1) {
                    zzdy zzdy1 = new zzdy(this.e);
                    ((zzyl)zzys0).zzn(zzdy1.zzH(), 0, this.e, false);
                    if(this.g == null && "http://ns.adobe.com/xap/1.0/".equals(zzdy1.zzv('\u0000'))) {
                        String s = zzdy1.zzv('\u0000');
                        if(s != null) {
                            long v2 = zzys0.zzd();
                            zzacr zzacr0 = null;
                            if(v2 != -1L) {
                                try {
                                    XmlPullParser xmlPullParser0 = XmlPullParserFactory.newInstance().newPullParser();
                                    xmlPullParser0.setInput(new StringReader(s));
                                    xmlPullParser0.next();
                                    if(!zzeh.zzc(xmlPullParser0, "x:xmpmeta")) {
                                        throw zzbp.zza("Couldn\'t find xmp metadata", null);
                                    }
                                    zzfrj zzfrj0 = zzfrj.zzo();
                                    long v3 = 0x8000000000000001L;
                                alab1:
                                    while(true) {
                                        xmlPullParser0.next();
                                        if(!zzeh.zzc(xmlPullParser0, "rdf:Description")) {
                                            if(zzeh.zzc(xmlPullParser0, "Container:Directory")) {
                                                zzfrj0 = h.q(xmlPullParser0, "Container", "Item");
                                            }
                                            else if(zzeh.zzc(xmlPullParser0, "GContainer:Directory")) {
                                                zzfrj0 = h.q(xmlPullParser0, "GContainer", "GContainerItem");
                                            }
                                            goto label_78;
                                        }
                                        String[] arr_s = h.a;
                                        int v4 = 0;
                                        while(true) {
                                            if(v4 >= 4) {
                                                goto label_88;
                                            }
                                            String s1 = zzeh.zza(xmlPullParser0, arr_s[v4]);
                                            if(s1 == null) {
                                                ++v4;
                                                continue;
                                            }
                                            if(Integer.parseInt(s1) == 1) {
                                                v3 = 0x8000000000000001L;
                                                String[] arr_s1 = h.b;
                                                for(int v5 = 0; v5 < 4; ++v5) {
                                                    String s2 = zzeh.zza(xmlPullParser0, arr_s1[v5]);
                                                    if(s2 != null) {
                                                        long v6 = Long.parseLong(s2);
                                                        if(v6 == -1L) {
                                                            break;
                                                        }
                                                        v3 = v6;
                                                        break;
                                                    }
                                                }
                                                String[] arr_s2 = h.c;
                                                int v7 = 0;
                                                while(v7 < 2) {
                                                    String s3 = zzeh.zza(xmlPullParser0, arr_s2[v7]);
                                                    if(s3 == null) {
                                                        ++v7;
                                                        continue;
                                                    }
                                                    long v8 = Long.parseLong(s3);
                                                    zzfrj0 = zzfrj.zzq(new zzaav("image/jpeg", "Primary", 0L, 0L), new zzaav("video/mp4", "MotionPhoto", v8, 0L));
                                                    goto label_78;
                                                }
                                                zzfrj0 = zzfrj.zzo();
                                            label_78:
                                                if(!zzeh.zzb(xmlPullParser0, "x:xmpmeta")) {
                                                    break;
                                                }
                                                break alab1;
                                            }
                                            else {
                                                b0 = null;
                                            }
                                            goto label_89;
                                        }
                                    }
                                    b0 = zzfrj0.isEmpty() ? null : new b(zzfrj0, v3, 1);
                                    goto label_89;
                                }
                                catch(XmlPullParserException | zzbp | NumberFormatException unused_ex) {
                                    Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                    goto label_88;
                                }
                                b0 = null;
                                goto label_89;
                            label_88:
                                b0 = null;
                            label_89:
                                if(b0 != null) {
                                    zzfrj zzfrj1 = (zzfrj)b0.k;
                                    if(zzfrj1.size() >= 2) {
                                        int v9 = zzfrj1.size() - 1;
                                        long v10 = -1L;
                                        long v11 = -1L;
                                        long v12 = -1L;
                                        long v13 = -1L;
                                        boolean z = false;
                                        while(v9 >= 0) {
                                            zzaav zzaav0 = (zzaav)zzfrj1.get(v9);
                                            z |= "video/mp4".equals(zzaav0.zza);
                                            if(v9 == 0) {
                                                v2 -= zzaav0.zzd;
                                                v14 = 0L;
                                            }
                                            else {
                                                v14 = v2 - zzaav0.zzc;
                                            }
                                            long v15 = v2;
                                            v2 = v14;
                                            if(z && v2 != v15) {
                                                v13 = v15 - v2;
                                                v12 = v2;
                                                z = false;
                                            }
                                            if(v9 == 0) {
                                                v11 = v15;
                                            }
                                            if(v9 == 0) {
                                                v10 = v2;
                                            }
                                            --v9;
                                        }
                                        if(v12 != -1L && v13 != -1L && v10 != -1L && v11 != -1L) {
                                            zzacr0 = new zzacr(v10, v11, b0.j, v12, v13);
                                        }
                                    }
                                }
                            }
                            this.g = zzacr0;
                            if(zzacr0 != null) {
                                this.f = zzacr0.zzd;
                            }
                        }
                    }
                }
                else {
                    ((zzyl)zzys0).zzo(this.e, false);
                }
                this.c = 0;
                return 0;
            }
            case 4: {
                long v16 = zzys0.zzf();
                long v17 = this.f;
                if(v16 == v17) {
                    if(!zzys0.zzm(zzdy0.zzH(), 0, 1, true)) {
                        this.b();
                        return 0;
                    }
                    zzys0.zzj();
                    if(this.j == null) {
                        this.j = new zzaeo(0);
                    }
                    f f0 = new f(zzys0, this.f);
                    this.i = f0;
                    if(this.j.zzd(f0)) {
                        zzaeo zzaeo0 = this.j;
                        long v18 = this.f;
                        zzyu zzyu0 = this.b;
                        zzyu0.getClass();
                        zzaeo0.zzb(new zzaaz(v18, zzyu0));
                        zzacr zzacr1 = this.g;
                        zzacr1.getClass();
                        this.c(new zzbk[]{zzacr1});
                        this.c = 5;
                        return 0;
                    }
                    this.b();
                    return 0;
                }
                zzzr0.zza = v17;
                return 1;
            }
            case 5: {
                if(this.i == null || zzys0 != this.h) {
                    this.h = zzys0;
                    this.i = new f(zzys0, this.f);
                }
                zzaeo zzaeo1 = this.j;
                zzaeo1.getClass();
                int v19 = zzaeo1.zza(this.i, zzzr0);
                if(v19 == 1) {
                    zzzr0.zza += this.f;
                }
                return v19;
            }
            default: {
                if(v != 6) {
                    throw new IllegalStateException();
                }
                return -1;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.b = zzyu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        if(v == 0L) {
            this.c = 0;
            this.j = null;
            return;
        }
        if(this.c == 5) {
            zzaeo zzaeo0 = this.j;
            zzaeo0.getClass();
            zzaeo0.zzc(v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        if(this.a(zzys0) != 0xFFD8) {
            return false;
        }
        int v = this.a(zzys0);
        this.d = v;
        zzdy zzdy0 = this.a;
        if(v == 0xFFE0) {
            zzdy0.zzC(2);
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 2, false);
            ((zzyl)zzys0).zzl(zzdy0.zzo() - 2, false);
            v = this.a(zzys0);
            this.d = v;
        }
        if(v == 0xFFE1) {
            ((zzyl)zzys0).zzl(2, false);
            zzdy0.zzC(6);
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 6, false);
            return zzdy0.zzs() == 1165519206L && zzdy0.zzo() == 0;
        }
        return false;
    }
}

