package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ.\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000EJ\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001B\u001A\u0004\b\u001C\u0010\u000E¨\u0006\u001D"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Tags;", "Lo2/m;", "", "tag", "category", "", "hash", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/spears/civilopedia/db/tables/Civ7Tags;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTag", "getCategory", "I", "getHash", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Tags implements m {
    private final String category;
    private final int hash;
    private final String tag;

    public Civ7Tags(String s, String s1, int v) {
        j.f(s, "tag");
        j.f(s1, "category");
        super();
        this.tag = s;
        this.category = s1;
        this.hash = v;
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.category;
    }

    public final int component3() {
        return this.hash;
    }

    public final Civ7Tags copy(String s, String s1, int v) {
        j.f(s, "tag");
        j.f(s1, "category");
        return new Civ7Tags(s, s1, v);
    }

    public static Civ7Tags copy$default(Civ7Tags civ7Tags0, String s, String s1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7Tags0.tag;
        }
        if((v1 & 2) != 0) {
            s1 = civ7Tags0.category;
        }
        if((v1 & 4) != 0) {
            v = civ7Tags0.hash;
        }
        return civ7Tags0.copy(s, s1, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Tags)) {
            return false;
        }
        if(!j.a(this.tag, ((Civ7Tags)object0).tag)) {
            return false;
        }
        return j.a(this.category, ((Civ7Tags)object0).category) ? this.hash == ((Civ7Tags)object0).hash : false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final int getHash() {
        return this.hash;
    }

    public final String getTag() {
        return this.tag;
    }

    @Override
    public int hashCode() {
        return f.b(this.tag.hashCode() * 0x1F, 0x1F, this.category) + this.hash;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.tag;
    }

    @Override
    public String toString() {
        return e.g(e.j("Civ7Tags(tag=", this.tag, ", category=", this.category, ", hash="), this.hash, ")");
    }
}

