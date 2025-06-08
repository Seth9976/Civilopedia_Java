package com.google.android.gms.internal.ads;

import android.util.Log;

public abstract class d1 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final String[] D;
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;

    static {
        d1.a = zzazo.zzg("nam");
        d1.b = zzazo.zzg("trk");
        d1.c = zzazo.zzg("cmt");
        d1.d = zzazo.zzg("day");
        d1.e = zzazo.zzg("ART");
        d1.f = zzazo.zzg("too");
        d1.g = zzazo.zzg("alb");
        d1.h = zzazo.zzg("com");
        d1.i = zzazo.zzg("wrt");
        d1.j = zzazo.zzg("lyr");
        d1.k = zzazo.zzg("gen");
        d1.l = zzazo.zzg("covr");
        d1.m = zzazo.zzg("gnre");
        d1.n = zzazo.zzg("grp");
        d1.o = zzazo.zzg("disk");
        d1.p = zzazo.zzg("trkn");
        d1.q = zzazo.zzg("tmpo");
        d1.r = zzazo.zzg("cpil");
        d1.s = zzazo.zzg("aART");
        d1.t = zzazo.zzg("sonm");
        d1.u = zzazo.zzg("soal");
        d1.v = zzazo.zzg("soar");
        d1.w = zzazo.zzg("soaa");
        d1.x = zzazo.zzg("soco");
        d1.y = zzazo.zzg("rtng");
        d1.z = zzazo.zzg("pgap");
        d1.A = zzazo.zzg("sosn");
        d1.B = zzazo.zzg("tvsh");
        d1.C = zzazo.zzg("----");
        d1.D = new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    }

    public static int a(zzazh zzazh0) {
        zzazh0.zzw(4);
        if(zzazh0.zze() == Y0.F0) {
            zzazh0.zzw(8);
            return zzazh0.zzg();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static zzawk b(int v, String s, zzazh zzazh0, boolean z, boolean z1) {
        int v1 = d1.a(zzazh0);
        if(z1) {
            v1 = Math.min(1, v1);
        }
        if(v1 >= 0) {
            return z ? new zzawm(s, null, Integer.toString(v1)) : new zzawi("und", s, Integer.toString(v1));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + Y0.b(v));
        return null;
    }

    public static zzawm c(int v, String s, zzazh zzazh0) {
        int v1 = zzazh0.zze();
        if(zzazh0.zze() == Y0.F0 && v1 >= 22) {
            zzazh0.zzw(10);
            int v2 = zzazh0.zzj();
            if(v2 > 0) {
                String s1 = v2;
                int v3 = zzazh0.zzj();
                if(v3 > 0) {
                    s1 = s1 + "/" + v3;
                }
                return new zzawm(s, null, s1);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + Y0.b(v));
        return null;
    }

    public static zzawm d(int v, String s, zzazh zzazh0) {
        int v1 = zzazh0.zze();
        if(zzazh0.zze() == Y0.F0) {
            zzazh0.zzw(8);
            return new zzawm(s, null, zzazh0.zzo(v1 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + Y0.b(v));
        return null;
    }
}

