package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Ideologies;", "", "ideologyType", "", "firstTreeNode", "name", "progressionTreeType", "rivalIdeology", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstTreeNode", "()Ljava/lang/String;", "getIdeologyType", "getName", "getProgressionTreeType", "getRivalIdeology", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Ideologies {
    private final String firstTreeNode;
    private final String ideologyType;
    private final String name;
    private final String progressionTreeType;
    private final String rivalIdeology;

    public Civ7Ideologies(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "ideologyType");
        j.f(s1, "firstTreeNode");
        j.f(s2, "name");
        j.f(s3, "progressionTreeType");
        super();
        this.ideologyType = s;
        this.firstTreeNode = s1;
        this.name = s2;
        this.progressionTreeType = s3;
        this.rivalIdeology = s4;
    }

    public final String component1() {
        return this.ideologyType;
    }

    public final String component2() {
        return this.firstTreeNode;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.progressionTreeType;
    }

    public final String component5() {
        return this.rivalIdeology;
    }

    public final Civ7Ideologies copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "ideologyType");
        j.f(s1, "firstTreeNode");
        j.f(s2, "name");
        j.f(s3, "progressionTreeType");
        return new Civ7Ideologies(s, s1, s2, s3, s4);
    }

    public static Civ7Ideologies copy$default(Civ7Ideologies civ7Ideologies0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7Ideologies0.ideologyType;
        }
        if((v & 2) != 0) {
            s1 = civ7Ideologies0.firstTreeNode;
        }
        if((v & 4) != 0) {
            s2 = civ7Ideologies0.name;
        }
        if((v & 8) != 0) {
            s3 = civ7Ideologies0.progressionTreeType;
        }
        if((v & 16) != 0) {
            s4 = civ7Ideologies0.rivalIdeology;
        }
        return civ7Ideologies0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Ideologies)) {
            return false;
        }
        if(!j.a(this.ideologyType, ((Civ7Ideologies)object0).ideologyType)) {
            return false;
        }
        if(!j.a(this.firstTreeNode, ((Civ7Ideologies)object0).firstTreeNode)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7Ideologies)object0).name)) {
            return false;
        }
        return j.a(this.progressionTreeType, ((Civ7Ideologies)object0).progressionTreeType) ? j.a(this.rivalIdeology, ((Civ7Ideologies)object0).rivalIdeology) : false;
    }

    public final String getFirstTreeNode() {
        return this.firstTreeNode;
    }

    public final String getIdeologyType() {
        return this.ideologyType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProgressionTreeType() {
        return this.progressionTreeType;
    }

    public final String getRivalIdeology() {
        return this.rivalIdeology;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(f.b(this.ideologyType.hashCode() * 0x1F, 0x1F, this.firstTreeNode), 0x1F, this.name), 0x1F, this.progressionTreeType);
        return this.rivalIdeology == null ? v : v + this.rivalIdeology.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7Ideologies(ideologyType=", this.ideologyType, ", firstTreeNode=", this.firstTreeNode, ", name=");
        f.t(stringBuilder0, this.name, ", progressionTreeType=", this.progressionTreeType, ", rivalIdeology=");
        return e.h(stringBuilder0, this.rivalIdeology, ")");
    }
}

