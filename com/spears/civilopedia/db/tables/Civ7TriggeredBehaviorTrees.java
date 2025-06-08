package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J=\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7TriggeredBehaviorTrees;", "", "triggerType", "", "aIEvent", "operationName", "priority", "", "treeName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAIEvent", "()Ljava/lang/String;", "getOperationName", "getPriority", "()I", "getTreeName", "getTriggerType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7TriggeredBehaviorTrees {
    private final String aIEvent;
    private final String operationName;
    private final int priority;
    private final String treeName;
    private final String triggerType;

    public Civ7TriggeredBehaviorTrees(String s, String s1, String s2, int v, String s3) {
        j.f(s, "triggerType");
        j.f(s1, "aIEvent");
        j.f(s3, "treeName");
        super();
        this.triggerType = s;
        this.aIEvent = s1;
        this.operationName = s2;
        this.priority = v;
        this.treeName = s3;
    }

    public final String component1() {
        return this.triggerType;
    }

    public final String component2() {
        return this.aIEvent;
    }

    public final String component3() {
        return this.operationName;
    }

    public final int component4() {
        return this.priority;
    }

    public final String component5() {
        return this.treeName;
    }

    public final Civ7TriggeredBehaviorTrees copy(String s, String s1, String s2, int v, String s3) {
        j.f(s, "triggerType");
        j.f(s1, "aIEvent");
        j.f(s3, "treeName");
        return new Civ7TriggeredBehaviorTrees(s, s1, s2, v, s3);
    }

    public static Civ7TriggeredBehaviorTrees copy$default(Civ7TriggeredBehaviorTrees civ7TriggeredBehaviorTrees0, String s, String s1, String s2, int v, String s3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7TriggeredBehaviorTrees0.triggerType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7TriggeredBehaviorTrees0.aIEvent;
        }
        if((v1 & 4) != 0) {
            s2 = civ7TriggeredBehaviorTrees0.operationName;
        }
        if((v1 & 8) != 0) {
            v = civ7TriggeredBehaviorTrees0.priority;
        }
        if((v1 & 16) != 0) {
            s3 = civ7TriggeredBehaviorTrees0.treeName;
        }
        return civ7TriggeredBehaviorTrees0.copy(s, s1, s2, v, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7TriggeredBehaviorTrees)) {
            return false;
        }
        if(!j.a(this.triggerType, ((Civ7TriggeredBehaviorTrees)object0).triggerType)) {
            return false;
        }
        if(!j.a(this.aIEvent, ((Civ7TriggeredBehaviorTrees)object0).aIEvent)) {
            return false;
        }
        if(!j.a(this.operationName, ((Civ7TriggeredBehaviorTrees)object0).operationName)) {
            return false;
        }
        return this.priority == ((Civ7TriggeredBehaviorTrees)object0).priority ? j.a(this.treeName, ((Civ7TriggeredBehaviorTrees)object0).treeName) : false;
    }

    public final String getAIEvent() {
        return this.aIEvent;
    }

    public final String getOperationName() {
        return this.operationName;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getTreeName() {
        return this.treeName;
    }

    public final String getTriggerType() {
        return this.triggerType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.triggerType.hashCode() * 0x1F, 0x1F, this.aIEvent);
        return this.operationName == null ? this.treeName.hashCode() + (v * 0x1F + this.priority) * 0x1F : this.treeName.hashCode() + ((v + this.operationName.hashCode()) * 0x1F + this.priority) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7TriggeredBehaviorTrees(triggerType=", this.triggerType, ", aIEvent=", this.aIEvent, ", operationName=");
        f.s(stringBuilder0, this.operationName, ", priority=", this.priority, ", treeName=");
        return e.h(stringBuilder0, this.treeName, ")");
    }
}

