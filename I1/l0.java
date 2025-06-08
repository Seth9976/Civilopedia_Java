package i1;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzes;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzlh;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class l0 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final int g;
    public final b h;
    public final zzke i;

    public l0(b b0, String s, int v, zzke zzke0, int v1) {
        this.g = v1;
        this.h = b0;
        super();
        this.a = s;
        this.b = v;
        this.i = zzke0;
    }

    public boolean a(Long long0, Long long1, zzfs zzfs0, long v, g g0, boolean z) {
        Boolean boolean1;
        zzoe.zzc();
        b b0 = this.h;
        String s = this.a;
        boolean z1 = b0.a.zzf().zzs(s, zzeh.zzW);
        zzej zzej0 = (zzej)this.i;
        long v1 = zzej0.zzn() ? g0.e : v;
        zzge zzge0 = b0.a;
        boolean z2 = Log.isLoggable(zzge0.zzay().zzq(), 2);
        int v2 = this.b;
        if(z2) {
            zzge0.zzay().zzj().zzd("Evaluating filter. audience, filter, event", v2, (zzej0.zzp() ? zzej0.zzb() : null), zzge0.zzj().d(""));
            zzes zzes0 = zzge0.zzay().zzj();
            zzlh zzlh0 = b0.b.zzu();
            zzlh0.getClass();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("\nevent_filter {\n");
            if(zzej0.zzp()) {
                zzlh.j(stringBuilder0, 0, "filter_id", zzej0.zzb());
            }
            zzlh.j(stringBuilder0, 0, "event_name", zzlh0.a.zzj().d(""));
            String s1 = zzlh.h(zzej0.zzk(), zzej0.zzm(), zzej0.zzn());
            if(!s1.isEmpty()) {
                zzlh.j(stringBuilder0, 0, "filter_type", s1);
            }
            if(zzej0.zzo()) {
                zzlh.k(stringBuilder0, 1, "event_count_filter", zzej0.zzf());
            }
            if(zzej0.zza() > 0) {
                stringBuilder0.append("  filters {\n");
                for(Object object0: zzej0.zzh()) {
                    zzlh0.f(stringBuilder0, 2, ((zzel)object0));
                }
            }
            zzlh.g(1, stringBuilder0);
            stringBuilder0.append("}\n}\n");
            zzes0.zzb("Filter definition", stringBuilder0.toString());
        }
        if(zzej0.zzp() && zzej0.zzb() <= 0x100) {
            boolean z3 = zzej0.zzk() || zzej0.zzm() || zzej0.zzn();
            if(z && !z3) {
                zzge0.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", v2, (zzej0.zzp() ? zzej0.zzb() : null));
                return true;
            }
            if(zzej0.zzo()) {
                Boolean boolean0 = l0.e(v1, zzej0.zzf());
                if(boolean0 == null) {
                    boolean1 = null;
                }
                else {
                    if(!boolean0.booleanValue()) {
                        boolean1 = Boolean.FALSE;
                        goto label_77;
                    }
                    goto label_45;
                }
            }
            else {
            label_45:
                HashSet hashSet0 = new HashSet();
                Iterator iterator1 = zzej0.zzh().iterator();
                if(iterator1.hasNext()) {
                    iterator1.next();
                    zzge0.zzay().zzk().zzb("null or empty param name in filter. event", zzge0.zzj().d(""));
                }
                else {
                    p.b b1 = new p.b();  // 初始化器: Lp/k;-><init>()V
                    Iterator iterator2 = zzfs0.zzi().iterator();
                    while(true) {
                        if(!iterator2.hasNext()) {
                            goto label_69;
                        }
                        Object object1 = iterator2.next();
                        zzfw zzfw0 = (zzfw)object1;
                        if(!hashSet0.contains("")) {
                        }
                        else if(zzfw0.zzw()) {
                            b1.put("", (zzfw0.zzw() ? zzfw0.zzd() : null));
                        }
                        else if(zzfw0.zzu()) {
                            b1.put("", (zzfw0.zzu() ? zzfw0.zza() : null));
                        }
                        else {
                            if(!zzfw0.zzy()) {
                                zzge0.zzay().zzk().zzc("Unknown value for param. event, param", zzge0.zzj().d(""), zzge0.zzj().e(""));
                                break;
                            }
                            b1.put("", "");
                        }
                    }
                }
                boolean1 = null;
                goto label_77;
            label_69:
                Iterator iterator3 = zzej0.zzh().iterator();
                if(iterator3.hasNext()) {
                    Object object2 = iterator3.next();
                    boolean z4 = !((zzel)object2).zzh() || !((zzel)object2).zzg();
                    zzge0.zzay().zzk().zzb("Event has empty param name. event", zzge0.zzj().d(""));
                    boolean1 = null;
                }
                else {
                    boolean1 = Boolean.TRUE;
                }
            }
        label_77:
            zzes zzes1 = zzge0.zzay().zzj();
            String s2 = boolean1 == null ? "null" : boolean1;
            zzes1.zzb("Event filter result", s2);
            if(boolean1 == null) {
                return false;
            }
            this.c = Boolean.TRUE;
            if(!boolean1.booleanValue()) {
                return true;
            }
            this.d = Boolean.TRUE;
            if(z3 && zzfs0.zzu()) {
                Long long2 = zzfs0.zzd();
                if(zzej0.zzm()) {
                    if(z1 && zzej0.zzo()) {
                        long2 = long0;
                    }
                    this.f = long2;
                    return true;
                }
                if(z1 && zzej0.zzo()) {
                    long2 = long1;
                }
                this.e = long2;
            }
            return true;
        }
        zzge0.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzeu.d(s), String.valueOf((zzej0.zzp() ? zzej0.zzb() : null)));
        return false;
    }

    public boolean b(Long long0, Long long1, zzgl zzgl0, boolean z) {
        zzoe.zzc();
        boolean z1 = this.h.a.zzf().zzs(this.a, zzeh.zzU);
        com.google.android.gms.internal.measurement.zzes zzes0 = (com.google.android.gms.internal.measurement.zzes)this.i;
        boolean z2 = zzes0.zzi();
        boolean z3 = zzes0.zzg() || zzes0.zzh() || z2;
        Integer integer0 = null;
        zzge zzge0 = this.h.a;
        if(z && !z3) {
            zzes zzes1 = zzge0.zzay().zzj();
            Integer integer1 = this.b;
            if(zzes0.zzj()) {
                integer0 = zzes0.zza();
            }
            zzes1.zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", integer1, integer0);
            return true;
        }
        zzel zzel0 = zzes0.zzb();
        boolean z4 = zzel0.zzg();
        if(!zzgl0.zzr()) {
            if(!zzgl0.zzq()) {
                if(!zzgl0.zzt()) {
                    zzge0.zzay().zzk().zzb("User property has no value, property", zzge0.zzj().f(""));
                }
                else if(zzel0.zzk()) {
                    integer0 = l0.f(l0.d("", zzel0.zzd(), zzge0.zzay()), z4);
                }
                else if(!zzel0.zzi()) {
                    zzge0.zzay().zzk().zzb("No string or number filter defined. property", zzge0.zzj().f(""));
                }
                else {
                    zzge0.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", zzge0.zzj().f(""), "");
                }
            }
            else if(!zzel0.zzi()) {
                zzge0.zzay().zzk().zzb("No number filter for double property. property", zzge0.zzj().f(""));
            }
            else {
                double f = zzgl0.zza();
                zzeq zzeq0 = zzel0.zzc();
                try {
                    integer0 = l0.c(new BigDecimal(f), zzeq0, Math.ulp(f));
                }
                catch(NumberFormatException unused_ex) {
                }
                integer0 = l0.f(((Boolean)integer0), z4);
            }
        }
        else if(!zzel0.zzi()) {
            zzge0.zzay().zzk().zzb("No number filter for long property. property", zzge0.zzj().f(""));
        }
        else {
            integer0 = l0.f(l0.e(zzgl0.zzb(), zzel0.zzc()), z4);
        }
        zzes zzes2 = zzge0.zzay().zzj();
        String s = integer0 == null ? "null" : integer0;
        zzes2.zzb("Property filter result", s);
        if(integer0 == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if(z2 && !((Boolean)integer0).booleanValue()) {
            return true;
        }
        if(!z || zzes0.zzg()) {
            this.d = integer0;
        }
        if(((Boolean)integer0).booleanValue() && z3 && zzgl0.zzs()) {
            long v = long0 == null ? zzgl0.zzc() : ((long)long0);
            if(z1 && zzes0.zzg() && !zzes0.zzh() && long1 != null) {
                v = (long)long1;
            }
            if(zzes0.zzh()) {
                this.f = v;
                return true;
            }
            this.e = v;
        }
        return true;
    }

    // 去混淆评级： 低(31)
    public static Boolean c(BigDecimal bigDecimal0, zzeq zzeq0, double f) {
        Preconditions.checkNotNull(zzeq0);
        if(zzeq0.zzg()) {
            switch(zzeq0.zzm()) {
                case 1: {
                    break;
                }
                case 5: {
                    if(!zzeq0.zzk() || !zzeq0.zzj()) {
                        return null;
                    }
                    return zzeq0.zzm() == 5 ? null : null;
                }
                default: {
                    if(!zzeq0.zzh()) {
                        return null;
                    }
                    return zzeq0.zzm() == 5 ? null : null;
                }
            }
        }
        return null;
    }

    public static Boolean d(String s, zzex zzex0, zzeu zzeu0) {
        List list0;
        Preconditions.checkNotNull(zzex0);
        if(s == null) {
            return null;
        }
        if(zzex0.zzi() && zzex0.zzj() != 1) {
            if(zzex0.zzj() == 7) {
                if(zzex0.zza() == 0) {
                    return null;
                }
            }
            else if(!zzex0.zzh()) {
                return null;
            }
            int v = zzex0.zzj();
            boolean z = zzex0.zzf();
            if(zzex0.zza() == 0) {
                list0 = null;
            }
            else {
                list0 = zzex0.zze();
                if(!z) {
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    for(Object object0: list0) {
                        arrayList0.add(((String)object0).toUpperCase(Locale.ENGLISH));
                    }
                    list0 = Collections.unmodifiableList(arrayList0);
                }
            }
            String s1 = v == 2 ? "" : null;
            if(v != 7 || list0 != null && !list0.isEmpty()) {
                if(!z && v != 2) {
                    s = s.toUpperCase(Locale.ENGLISH);
                }
                switch(v - 1) {
                    case 1: {
                        if(s1 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(s1, (z ? 0 : 66)).matcher(s).matches());
                            }
                            catch(PatternSyntaxException unused_ex) {
                                if(zzeu0 != null) {
                                    zzeu0.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", s1);
                                }
                            }
                        }
                        break;
                    }
                    case 2: {
                        return Boolean.valueOf(s.startsWith(""));
                    }
                    case 3: {
                        return Boolean.valueOf(s.endsWith(""));
                    }
                    case 4: {
                        return Boolean.valueOf(s.contains(""));
                    }
                    case 5: {
                        return Boolean.valueOf(s.equals(""));
                    }
                    case 6: {
                        return list0 == null ? null : Boolean.valueOf(list0.contains(s));
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static Boolean e(long v, zzeq zzeq0) {
        try {
            return l0.c(new BigDecimal(v), zzeq0, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public static Boolean f(Boolean boolean0, boolean z) {
        if(boolean0 == null) {
            return null;
        }
        return boolean0.booleanValue() == z ? false : true;
    }
}

