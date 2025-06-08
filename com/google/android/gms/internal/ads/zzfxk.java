package com.google.android.gms.internal.ads;

import A.f;
import i3.e;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzfxk {
    public static final Logger a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;
    public static final ConcurrentHashMap e;
    public static final ConcurrentHashMap f;
    public static final ConcurrentHashMap g;

    static {
        zzfxk.a = Logger.getLogger(zzfxk.class.getName());
        zzfxk.b = new ConcurrentHashMap();
        zzfxk.c = new ConcurrentHashMap();
        zzfxk.d = new ConcurrentHashMap();
        zzfxk.e = new ConcurrentHashMap();
        zzfxk.f = new ConcurrentHashMap();
        zzfxk.g = new ConcurrentHashMap();
    }

    public static Map a() {
        synchronized(zzfxk.class) {
            return Collections.unmodifiableMap(zzfxk.g);
        }
    }

    public static zzfwo b(String s, Class class0) {
        D8 d80 = zzfxk.c(s);
        if(d80.zze().contains(class0)) {
            return d80.a(class0);
        }
        String s1 = class0.getName();
        String s2 = String.valueOf(d80.zzc());
        Set set0 = d80.zze();
        StringBuilder stringBuilder0 = new StringBuilder();
        boolean z = true;
        for(Object object0: set0) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((Class)object0).getCanonicalName());
            z = false;
        }
        StringBuilder stringBuilder1 = e.j("Primitive type ", s1, " not supported by key manager of type ", s2, ", supported primitives: ");
        stringBuilder1.append(stringBuilder0.toString());
        throw new GeneralSecurityException(stringBuilder1.toString());
    }

    public static D8 c(String s) {
        synchronized(zzfxk.class) {
            ConcurrentHashMap concurrentHashMap0 = zzfxk.b;
            if(concurrentHashMap0.containsKey(s)) {
                return (D8)concurrentHashMap0.get(s);
            }
        }
        throw new GeneralSecurityException("No key manager found for key type " + s);
    }

    public static void d(String s, Class class0, Map map0, boolean z) {
        synchronized(zzfxk.class) {
            ConcurrentHashMap concurrentHashMap0 = zzfxk.b;
            D8 d80 = (D8)concurrentHashMap0.get(s);
            if(d80 != null && !d80.zzc().equals(class0)) {
                zzfxk.a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", "Attempted overwrite of a registered key manager for key type " + s);
                throw new GeneralSecurityException("typeUrl (" + s + ") is already registered with " + d80.zzc().getName() + ", cannot be re-registered with " + class0.getName());
            }
            if(z) {
                if(zzfxk.d.containsKey(s) && !((Boolean)zzfxk.d.get(s)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + s);
                }
                if(concurrentHashMap0.containsKey(s)) {
                    for(Object object0: map0.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        Object object1 = map$Entry0.getKey();
                        if(!zzfxk.g.containsKey(object1)) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String)map$Entry0.getKey()) + " from an existing key manager of type " + s);
                        }
                    }
                }
                else {
                    for(Object object2: map0.entrySet()) {
                        Map.Entry map$Entry1 = (Map.Entry)object2;
                        Object object3 = map$Entry1.getKey();
                        if(zzfxk.g.containsKey(object3)) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String)map$Entry1.getKey()));
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void e(String s, Map map0) {
        for(Object object0: map0.entrySet()) {
            String s1 = (String)((Map.Entry)object0).getKey();
            zzfwr zzfwr0 = zzfwr.zze(s, ((zzgma)((zzgaq)((Map.Entry)object0).getValue()).zza).zzaw(), ((zzgaq)((Map.Entry)object0).getValue()).zzb);
            zzfxk.g.put(s1, zzfwr0);
        }
    }

    @Deprecated
    public static zzfwi zza(String s) throws GeneralSecurityException {
        if(s == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        Locale locale0 = Locale.US;
        zzfwi zzfwi0 = (zzfwi)zzfxk.e.get(s.toLowerCase(locale0));
        if(zzfwi0 == null) {
            String s1 = s.toLowerCase(locale0).startsWith("tinkaead") ? e.f("no catalogue found for ", s, ". ") + "Maybe call AeadConfig.register()." : e.f("no catalogue found for ", s, ". ");
            if(s.toLowerCase(locale0).startsWith("tinkdeterministicaead")) {
                s1 = s1 + "Maybe call DeterministicAeadConfig.register().";
            }
            else if(s.toLowerCase(locale0).startsWith("tinkstreamingaead")) {
                s1 = s1 + "Maybe call StreamingAeadConfig.register().";
            }
            else if(s.toLowerCase(locale0).startsWith("tinkhybriddecrypt") || s.toLowerCase(locale0).startsWith("tinkhybridencrypt")) {
                s1 = s1 + "Maybe call HybridConfig.register().";
            }
            else if(s.toLowerCase(locale0).startsWith("tinkmac")) {
                s1 = s1 + "Maybe call MacConfig.register().";
            }
            else if(s.toLowerCase(locale0).startsWith("tinkpublickeysign") || s.toLowerCase(locale0).startsWith("tinkpublickeyverify")) {
                s1 = s1 + "Maybe call SignatureConfig.register().";
            }
            else if(s.toLowerCase(locale0).startsWith("tink")) {
                s1 = s1 + "Maybe call TinkConfig.register().";
            }
            throw new GeneralSecurityException(s1);
        }
        return zzfwi0;
    }

    public static zzfwo zzb(String s) throws GeneralSecurityException {
        return zzfxk.c(s).zzb();
    }

    public static zzgfj zzc(zzgfo zzgfo0) throws GeneralSecurityException {
        synchronized(zzfxk.class) {
            zzfwo zzfwo0 = zzfxk.zzb("");
            if(((Boolean)zzfxk.d.get("")).booleanValue()) {
                return zzfwo0.zza(zzgfo0.zze());
            }
        }
        throw new GeneralSecurityException("newKey-operation not permitted for key type ");
    }

    public static zzgma zzd(zzgfo zzgfo0) throws GeneralSecurityException {
        synchronized(zzfxk.class) {
            zzfwo zzfwo0 = zzfxk.zzb("");
            if(((Boolean)zzfxk.d.get("")).booleanValue()) {
                return zzfwo0.zzb(zzgfo0.zze());
            }
        }
        throw new GeneralSecurityException("newKey-operation not permitted for key type ");
    }

    public static Class zze(Class class0) {
        zzfxd zzfxd0 = (zzfxd)zzfxk.f.get(class0);
        return zzfxd0 == null ? null : zzfxd0.zza();
    }

    public static Object zzf(zzgfj zzgfj0, Class class0) throws GeneralSecurityException {
        return zzfxk.b(zzgfj0.zzf(), class0).zzd(zzgfj0.zze());
    }

    public static Object zzg(String s, zzgma zzgma0, Class class0) throws GeneralSecurityException {
        return zzfxk.b(s, class0).zze(zzgma0);
    }

    public static Object zzh(String s, byte[] arr_b, Class class0) throws GeneralSecurityException {
        zzgji zzgji0 = zzgji.zzv(arr_b);
        return zzfxk.b(s, class0).zzd(zzgji0);
    }

    public static Object zzi(zzfxc zzfxc0, Class class0) throws GeneralSecurityException {
        zzfxd zzfxd0 = (zzfxd)zzfxk.f.get(class0);
        if(zzfxd0 == null) {
            throw new GeneralSecurityException("No wrapper found for " + zzfxc0.zzd().getName());
        }
        if(!zzfxd0.zza().equals(zzfxc0.zzd())) {
            throw new GeneralSecurityException(f.j("Wrong input primitive class, expected ", zzfxd0.zza().toString(), ", got ", zzfxc0.zzd().toString()));
        }
        return zzfxd0.zzc(zzfxc0);
    }

    public static void zzk(zzgau zzgau0, zzgas zzgas0, boolean z) throws GeneralSecurityException {
        synchronized(zzfxk.class) {
            String s = zzgau0.zzc();
            String s1 = zzgas0.zzc();
            zzfxk.d(s, zzgau0.getClass(), zzgau0.zza().zzc(), true);
            zzfxk.d(s1, zzgas0.getClass(), Collections.emptyMap(), false);
            if(!s.equals(s1)) {
                int v1 = zzgas0.zze();
                if(!zzfze.zza(1)) {
                    throw new GeneralSecurityException("failed to register key manager " + zzgau0.getClass() + " as it is not FIPS compatible.");
                }
                if(!zzfze.zza(v1)) {
                    throw new GeneralSecurityException("failed to register key manager " + zzgas0.getClass() + " as it is not FIPS compatible.");
                }
                ConcurrentHashMap concurrentHashMap0 = zzfxk.b;
                if(concurrentHashMap0.containsKey(s)) {
                    Class class1 = ((D8)concurrentHashMap0.get(s)).zzd();
                    if(class1 != null && !class1.getName().equals(zzgas0.getClass().getName())) {
                        zzfxk.a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + s + " with inconsistent public key type " + s1);
                        throw new GeneralSecurityException("public key manager corresponding to " + zzgau0.getClass().getName() + " is already registered with " + class1.getName() + ", cannot be re-registered with " + zzgas0.getClass().getName());
                    }
                }
                if(!concurrentHashMap0.containsKey(s) || ((D8)concurrentHashMap0.get(s)).zzd() == null) {
                    concurrentHashMap0.put(s, new C8(zzgau0, zzgas0));
                    S s2 = new S(21);
                    zzfxk.c.put(s, s2);
                    zzfxk.e(zzgau0.zzc(), zzgau0.zza().zzc());
                }
                ConcurrentHashMap concurrentHashMap1 = zzfxk.d;
                concurrentHashMap1.put(s, Boolean.TRUE);
                if(!concurrentHashMap0.containsKey(s1)) {
                    concurrentHashMap0.put(s1, new B8(zzgas0, 1));
                }
                concurrentHashMap1.put(s1, Boolean.FALSE);
                return;
            }
        }
        throw new GeneralSecurityException("Private and public key type must be different.");
    }

    public static void zzl(zzfwo zzfwo0, boolean z) throws GeneralSecurityException {
        synchronized(zzfxk.class) {
            if(zzfwo0 != null) {
                if(!zzfze.zza(1)) {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                String s = zzfwo0.zzf();
                zzfxk.d(s, zzfwo0.getClass(), Collections.emptyMap(), z);
                B8 b80 = new B8(zzfwo0, 0);
                zzfxk.b.putIfAbsent(s, b80);
                zzfxk.d.put(s, Boolean.valueOf(z));
                return;
            }
        }
        throw new IllegalArgumentException("key manager must be non-null.");
    }

    public static void zzm(zzgas zzgas0, boolean z) throws GeneralSecurityException {
        synchronized(zzfxk.class) {
            String s = zzgas0.zzc();
            zzfxk.d(s, zzgas0.getClass(), zzgas0.zza().zzc(), true);
            if(zzfze.zza(zzgas0.zze())) {
                ConcurrentHashMap concurrentHashMap0 = zzfxk.b;
                if(!concurrentHashMap0.containsKey(s)) {
                    concurrentHashMap0.put(s, new B8(zzgas0, 1));
                    S s1 = new S(21);
                    zzfxk.c.put(s, s1);
                    zzfxk.e(s, zzgas0.zza().zzc());
                }
                zzfxk.d.put(s, Boolean.TRUE);
                return;
            }
        }
        throw new GeneralSecurityException("failed to register key manager " + zzgas0.getClass() + " as it is not FIPS compatible.");
    }

    public static void zzn(zzfxd zzfxd0) throws GeneralSecurityException {
        synchronized(zzfxk.class) {
            if(zzfxd0 != null) {
                Class class1 = zzfxd0.zzb();
                ConcurrentHashMap concurrentHashMap0 = zzfxk.f;
                if(concurrentHashMap0.containsKey(class1)) {
                    zzfxd zzfxd1 = (zzfxd)concurrentHashMap0.get(class1);
                    if(!zzfxd0.getClass().getName().equals(zzfxd1.getClass().getName())) {
                        zzfxk.a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type " + class1.toString());
                        throw new GeneralSecurityException("PrimitiveWrapper for primitive (" + class1.getName() + ") is already registered to be " + zzfxd1.getClass().getName() + ", cannot be re-registered with " + zzfxd0.getClass().getName());
                    }
                }
                concurrentHashMap0.put(class1, zzfxd0);
                return;
            }
        }
        throw new IllegalArgumentException("wrapper must be non-null");
    }
}

