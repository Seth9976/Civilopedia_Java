package n2;

import J2.j;
import com.spears.civilopedia.db.tables.Adjacency_YieldChanges;

public final class a {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public boolean e;
    public final boolean f;
    public String g;
    public String h;
    public boolean i;
    public final boolean j;
    public final boolean k;
    public String l;
    public final String m;
    public final boolean n;
    public final String o;
    public String p;
    public String q;
    public final String r;
    public final String s;
    public Integer t;
    public String u;
    public String v;

    public a(Adjacency_YieldChanges adjacency_YieldChanges0) {
        j.f(adjacency_YieldChanges0, "row");
        super();
        this.o = "";
        this.b = adjacency_YieldChanges0.getYieldType();
        this.c = adjacency_YieldChanges0.getYieldChange();
        this.d = adjacency_YieldChanges0.getTilesRequired();
        this.a = adjacency_YieldChanges0.getDescription();
        this.e = adjacency_YieldChanges0.getOtherDistrictAdjacent();
        this.f = adjacency_YieldChanges0.getAdjacentSeaResource();
        this.g = adjacency_YieldChanges0.getAdjacentTerrain();
        this.h = adjacency_YieldChanges0.getAdjacentFeature();
        this.i = adjacency_YieldChanges0.getAdjacentRiver();
        this.j = adjacency_YieldChanges0.getAdjacentWonder();
        this.k = adjacency_YieldChanges0.getAdjacentNaturalWonder();
        this.l = adjacency_YieldChanges0.getAdjacentImprovement();
        this.m = adjacency_YieldChanges0.getAdjacentDistrict();
        this.n = adjacency_YieldChanges0.getAdjacentResource();
        this.o = adjacency_YieldChanges0.getAdjacentResourceClass();
        this.p = adjacency_YieldChanges0.getPrereqCivic();
        this.q = adjacency_YieldChanges0.getPrereqTech();
        this.r = adjacency_YieldChanges0.getObsoleteCivic();
        this.s = adjacency_YieldChanges0.getObsoleteTech();
    }

    public a(String s, int v, int v1, String s1) {
        j.f(s, "yieldType");
        super();
        this.o = "";
        this.b = s;
        this.c = v;
        this.d = v1;
        this.a = s1;
    }

    public final double a(int v) {
        return ((double)this.c) / ((double)this.d) * ((double)v);
    }
}

