package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7BoostHandlers;", "", "handlerId", "", "behaviorTree", "operationName", "script", "uniquenessTag", "winnowFunction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBehaviorTree", "()Ljava/lang/String;", "getHandlerId", "getOperationName", "getScript", "getUniquenessTag", "getWinnowFunction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7BoostHandlers {
    private final String behaviorTree;
    private final String handlerId;
    private final String operationName;
    private final String script;
    private final String uniquenessTag;
    private final String winnowFunction;

    public Civ7BoostHandlers(String s, String s1, String s2, String s3, String s4, String s5) {
        this.handlerId = s;
        this.behaviorTree = s1;
        this.operationName = s2;
        this.script = s3;
        this.uniquenessTag = s4;
        this.winnowFunction = s5;
    }

    public final String component1() {
        return this.handlerId;
    }

    public final String component2() {
        return this.behaviorTree;
    }

    public final String component3() {
        return this.operationName;
    }

    public final String component4() {
        return this.script;
    }

    public final String component5() {
        return this.uniquenessTag;
    }

    public final String component6() {
        return this.winnowFunction;
    }

    public final Civ7BoostHandlers copy(String s, String s1, String s2, String s3, String s4, String s5) {
        return new Civ7BoostHandlers(s, s1, s2, s3, s4, s5);
    }

    public static Civ7BoostHandlers copy$default(Civ7BoostHandlers civ7BoostHandlers0, String s, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7BoostHandlers0.handlerId;
        }
        if((v & 2) != 0) {
            s1 = civ7BoostHandlers0.behaviorTree;
        }
        if((v & 4) != 0) {
            s2 = civ7BoostHandlers0.operationName;
        }
        if((v & 8) != 0) {
            s3 = civ7BoostHandlers0.script;
        }
        if((v & 16) != 0) {
            s4 = civ7BoostHandlers0.uniquenessTag;
        }
        if((v & 0x20) != 0) {
            s5 = civ7BoostHandlers0.winnowFunction;
        }
        return civ7BoostHandlers0.copy(s, s1, s2, s3, s4, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7BoostHandlers)) {
            return false;
        }
        if(!j.a(this.handlerId, ((Civ7BoostHandlers)object0).handlerId)) {
            return false;
        }
        if(!j.a(this.behaviorTree, ((Civ7BoostHandlers)object0).behaviorTree)) {
            return false;
        }
        if(!j.a(this.operationName, ((Civ7BoostHandlers)object0).operationName)) {
            return false;
        }
        if(!j.a(this.script, ((Civ7BoostHandlers)object0).script)) {
            return false;
        }
        return j.a(this.uniquenessTag, ((Civ7BoostHandlers)object0).uniquenessTag) ? j.a(this.winnowFunction, ((Civ7BoostHandlers)object0).winnowFunction) : false;
    }

    public final String getBehaviorTree() {
        return this.behaviorTree;
    }

    public final String getHandlerId() {
        return this.handlerId;
    }

    public final String getOperationName() {
        return this.operationName;
    }

    public final String getScript() {
        return this.script;
    }

    public final String getUniquenessTag() {
        return this.uniquenessTag;
    }

    public final String getWinnowFunction() {
        return this.winnowFunction;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.handlerId == null ? 0 : this.handlerId.hashCode();
        int v2 = this.behaviorTree == null ? 0 : this.behaviorTree.hashCode();
        int v3 = this.operationName == null ? 0 : this.operationName.hashCode();
        int v4 = this.script == null ? 0 : this.script.hashCode();
        int v5 = this.uniquenessTag == null ? 0 : this.uniquenessTag.hashCode();
        String s = this.winnowFunction;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7BoostHandlers(handlerId=", this.handlerId, ", behaviorTree=", this.behaviorTree, ", operationName=");
        f.t(stringBuilder0, this.operationName, ", script=", this.script, ", uniquenessTag=");
        return e.i(stringBuilder0, this.uniquenessTag, ", winnowFunction=", this.winnowFunction, ")");
    }
}

