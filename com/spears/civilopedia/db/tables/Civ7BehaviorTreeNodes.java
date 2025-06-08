package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0007HÆ\u0003J;\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\b\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000E¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7BehaviorTreeNodes;", "", "primaryKey", "", "jumpTo", "nodeId", "nodeType", "", "treeName", "(IIILjava/lang/String;Ljava/lang/String;)V", "getJumpTo", "()I", "getNodeId", "getNodeType", "()Ljava/lang/String;", "getPrimaryKey", "getTreeName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7BehaviorTreeNodes {
    private final int jumpTo;
    private final int nodeId;
    private final String nodeType;
    private final int primaryKey;
    private final String treeName;

    public Civ7BehaviorTreeNodes(int v, int v1, int v2, String s, String s1) {
        j.f(s, "nodeType");
        j.f(s1, "treeName");
        super();
        this.primaryKey = v;
        this.jumpTo = v1;
        this.nodeId = v2;
        this.nodeType = s;
        this.treeName = s1;
    }

    public final int component1() {
        return this.primaryKey;
    }

    public final int component2() {
        return this.jumpTo;
    }

    public final int component3() {
        return this.nodeId;
    }

    public final String component4() {
        return this.nodeType;
    }

    public final String component5() {
        return this.treeName;
    }

    public final Civ7BehaviorTreeNodes copy(int v, int v1, int v2, String s, String s1) {
        j.f(s, "nodeType");
        j.f(s1, "treeName");
        return new Civ7BehaviorTreeNodes(v, v1, v2, s, s1);
    }

    public static Civ7BehaviorTreeNodes copy$default(Civ7BehaviorTreeNodes civ7BehaviorTreeNodes0, int v, int v1, int v2, String s, String s1, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = civ7BehaviorTreeNodes0.primaryKey;
        }
        if((v3 & 2) != 0) {
            v1 = civ7BehaviorTreeNodes0.jumpTo;
        }
        if((v3 & 4) != 0) {
            v2 = civ7BehaviorTreeNodes0.nodeId;
        }
        if((v3 & 8) != 0) {
            s = civ7BehaviorTreeNodes0.nodeType;
        }
        if((v3 & 16) != 0) {
            s1 = civ7BehaviorTreeNodes0.treeName;
        }
        return civ7BehaviorTreeNodes0.copy(v, v1, v2, s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7BehaviorTreeNodes)) {
            return false;
        }
        if(this.primaryKey != ((Civ7BehaviorTreeNodes)object0).primaryKey) {
            return false;
        }
        if(this.jumpTo != ((Civ7BehaviorTreeNodes)object0).jumpTo) {
            return false;
        }
        if(this.nodeId != ((Civ7BehaviorTreeNodes)object0).nodeId) {
            return false;
        }
        return j.a(this.nodeType, ((Civ7BehaviorTreeNodes)object0).nodeType) ? j.a(this.treeName, ((Civ7BehaviorTreeNodes)object0).treeName) : false;
    }

    public final int getJumpTo() {
        return this.jumpTo;
    }

    public final int getNodeId() {
        return this.nodeId;
    }

    public final String getNodeType() {
        return this.nodeType;
    }

    public final int getPrimaryKey() {
        return this.primaryKey;
    }

    public final String getTreeName() {
        return this.treeName;
    }

    @Override
    public int hashCode() {
        return this.treeName.hashCode() + f.b(((this.primaryKey * 0x1F + this.jumpTo) * 0x1F + this.nodeId) * 0x1F, 0x1F, this.nodeType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.n("Civ7BehaviorTreeNodes(primaryKey=", this.primaryKey, ", jumpTo=", this.jumpTo, ", nodeId=");
        f.r(stringBuilder0, this.nodeId, ", nodeType=", this.nodeType, ", treeName=");
        return e.h(stringBuilder0, this.treeName, ")");
    }
}

