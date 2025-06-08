package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AllowedOperations;", "", "listType", "", "operationDef", "removeRef", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getListType", "()Ljava/lang/String;", "getOperationDef", "getRemoveRef", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AllowedOperations {
    private final String listType;
    private final String operationDef;
    private final boolean removeRef;

    public Civ7AllowedOperations(String s, String s1, boolean z) {
        j.f(s, "listType");
        j.f(s1, "operationDef");
        super();
        this.listType = s;
        this.operationDef = s1;
        this.removeRef = z;
    }

    public final String component1() {
        return this.listType;
    }

    public final String component2() {
        return this.operationDef;
    }

    public final boolean component3() {
        return this.removeRef;
    }

    public final Civ7AllowedOperations copy(String s, String s1, boolean z) {
        j.f(s, "listType");
        j.f(s1, "operationDef");
        return new Civ7AllowedOperations(s, s1, z);
    }

    public static Civ7AllowedOperations copy$default(Civ7AllowedOperations civ7AllowedOperations0, String s, String s1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AllowedOperations0.listType;
        }
        if((v & 2) != 0) {
            s1 = civ7AllowedOperations0.operationDef;
        }
        if((v & 4) != 0) {
            z = civ7AllowedOperations0.removeRef;
        }
        return civ7AllowedOperations0.copy(s, s1, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AllowedOperations)) {
            return false;
        }
        if(!j.a(this.listType, ((Civ7AllowedOperations)object0).listType)) {
            return false;
        }
        return j.a(this.operationDef, ((Civ7AllowedOperations)object0).operationDef) ? this.removeRef == ((Civ7AllowedOperations)object0).removeRef : false;
    }

    public final String getListType() {
        return this.listType;
    }

    public final String getOperationDef() {
        return this.operationDef;
    }

    public final boolean getRemoveRef() {
        return this.removeRef;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.listType.hashCode() * 0x1F, 0x1F, this.operationDef);
        return this.removeRef ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public String toString() {
        return u9.g(e.j("Civ7AllowedOperations(listType=", this.listType, ", operationDef=", this.operationDef, ", removeRef="), this.removeRef, ")");
    }
}

