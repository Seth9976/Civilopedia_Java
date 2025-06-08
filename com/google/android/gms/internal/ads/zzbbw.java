package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbbw {
    public static long a(int v, long v1) {
        if(v == 1) {
            return v1;
        }
        return (v & 1) == 0 ? zzbbw.a(v >> 1, v1 * v1 % 0x4000FFFFL) % 0x4000FFFFL : zzbbw.a(v >> 1, v1 * v1 % 0x4000FFFFL) % 0x4000FFFFL * v1 % 0x4000FFFFL;
    }

    public static String b(String[] arr_s, int v, int v1) {
        int v2 = v1 + v;
        if(arr_s.length < v2) {
            zzcfi.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        while(v < v2 - 1) {
            stringBuilder0.append(arr_s[v]);
            stringBuilder0.append(' ');
            ++v;
        }
        stringBuilder0.append(arr_s[v2 - 1]);
        return stringBuilder0.toString();
    }

    public static void c(int v, long v1, String s, int v2, PriorityQueue priorityQueue0) {
        zzbbv zzbbv0 = new zzbbv(v2, v1, s);
        if(priorityQueue0.size() == v && (((zzbbv)priorityQueue0.peek()).c > v2 || ((zzbbv)priorityQueue0.peek()).a > v1)) {
            return;
        }
        if(priorityQueue0.contains(zzbbv0)) {
            return;
        }
        priorityQueue0.add(zzbbv0);
        if(priorityQueue0.size() > v) {
            priorityQueue0.poll();
        }
    }

    public static long d(int v, String[] arr_s) {
        long v1 = (((long)zzbbs.zza(arr_s[0])) + 0x7FFFFFFFL) % 0x4000FFFFL;
        for(int v2 = 1; v2 < v; ++v2) {
            v1 = ((((long)zzbbs.zza(arr_s[v2])) + 0x7FFFFFFFL) % 0x4000FFFFL + v1 * 0x1001FFFL % 0x4000FFFFL) % 0x4000FFFFL;
        }
        return v1;
    }

    public static void zzc(String[] arr_s, int v, int v1, PriorityQueue priorityQueue0) {
        if(arr_s.length < 6) {
            zzbbw.c(v, zzbbw.d(arr_s.length, arr_s), zzbbw.b(arr_s, 0, arr_s.length), arr_s.length, priorityQueue0);
            return;
        }
        long v2 = zzbbw.d(6, arr_s);
        zzbbw.c(v, v2, zzbbw.b(arr_s, 0, 6), 6, priorityQueue0);
        long v3 = zzbbw.a(5, 0x1001FFFL);
        for(int v4 = 1; v4 < arr_s.length - 5; ++v4) {
            long v5 = (v2 + 0x4000FFFFL - (((long)zzbbs.zza(arr_s[v4 - 1])) + 0x7FFFFFFFL) % 0x4000FFFFL * v3 % 0x4000FFFFL) % 0x4000FFFFL * 0x1001FFFL % 0x4000FFFFL;
            v2 = ((((long)zzbbs.zza(arr_s[v4 + 5])) + 0x7FFFFFFFL) % 0x4000FFFFL + v5) % 0x4000FFFFL;
            zzbbw.c(v, v2, zzbbw.b(arr_s, v4, 6), arr_s.length, priorityQueue0);
        }
    }
}

