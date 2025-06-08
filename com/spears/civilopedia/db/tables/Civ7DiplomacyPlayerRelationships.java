package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000BJ8\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000EJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001C\u001A\u0004\b\u001D\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001C\u001A\u0004\b\u001E\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001A\u001A\u0004\b\u001F\u0010\u000B¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomacyPlayerRelationships;", "Lo2/m;", "", "diplomacyPlayerRelationshipType", "", "maxRelationship", "minRelationship", "name", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;IILjava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ7DiplomacyPlayerRelationships;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDiplomacyPlayerRelationshipType", "I", "getMaxRelationship", "getMinRelationship", "getName", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomacyPlayerRelationships implements m {
    private final String diplomacyPlayerRelationshipType;
    private final int maxRelationship;
    private final int minRelationship;
    private final String name;

    public Civ7DiplomacyPlayerRelationships(String s, int v, int v1, String s1) {
        j.f(s, "diplomacyPlayerRelationshipType");
        j.f(s1, "name");
        super();
        this.diplomacyPlayerRelationshipType = s;
        this.maxRelationship = v;
        this.minRelationship = v1;
        this.name = s1;
    }

    public final String component1() {
        return this.diplomacyPlayerRelationshipType;
    }

    public final int component2() {
        return this.maxRelationship;
    }

    public final int component3() {
        return this.minRelationship;
    }

    public final String component4() {
        return this.name;
    }

    public final Civ7DiplomacyPlayerRelationships copy(String s, int v, int v1, String s1) {
        j.f(s, "diplomacyPlayerRelationshipType");
        j.f(s1, "name");
        return new Civ7DiplomacyPlayerRelationships(s, v, v1, s1);
    }

    public static Civ7DiplomacyPlayerRelationships copy$default(Civ7DiplomacyPlayerRelationships civ7DiplomacyPlayerRelationships0, String s, int v, int v1, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7DiplomacyPlayerRelationships0.diplomacyPlayerRelationshipType;
        }
        if((v2 & 2) != 0) {
            v = civ7DiplomacyPlayerRelationships0.maxRelationship;
        }
        if((v2 & 4) != 0) {
            v1 = civ7DiplomacyPlayerRelationships0.minRelationship;
        }
        if((v2 & 8) != 0) {
            s1 = civ7DiplomacyPlayerRelationships0.name;
        }
        return civ7DiplomacyPlayerRelationships0.copy(s, v, v1, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomacyPlayerRelationships)) {
            return false;
        }
        if(!j.a(this.diplomacyPlayerRelationshipType, ((Civ7DiplomacyPlayerRelationships)object0).diplomacyPlayerRelationshipType)) {
            return false;
        }
        if(this.maxRelationship != ((Civ7DiplomacyPlayerRelationships)object0).maxRelationship) {
            return false;
        }
        return this.minRelationship == ((Civ7DiplomacyPlayerRelationships)object0).minRelationship ? j.a(this.name, ((Civ7DiplomacyPlayerRelationships)object0).name) : false;
    }

    public final String getDiplomacyPlayerRelationshipType() {
        return this.diplomacyPlayerRelationshipType;
    }

    public final int getMaxRelationship() {
        return this.maxRelationship;
    }

    public final int getMinRelationship() {
        return this.minRelationship;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + ((this.diplomacyPlayerRelationshipType.hashCode() * 0x1F + this.maxRelationship) * 0x1F + this.minRelationship) * 0x1F;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.diplomacyPlayerRelationshipType;
    }

    @Override
    public String toString() {
        return u9.e(f.m(this.maxRelationship, "Civ7DiplomacyPlayerRelationships(diplomacyPlayerRelationshipType=", this.diplomacyPlayerRelationshipType, ", maxRelationship=", ", minRelationship="), this.minRelationship, ", name=", this.name, ")");
    }
}

