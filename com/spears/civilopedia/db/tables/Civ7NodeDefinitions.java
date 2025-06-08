package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000BJ\u0010\u0010\u000E\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000FJ8\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000FJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001A\u001A\u0004\b\u001C\u0010\u000BR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001D\u001A\u0004\b\u001E\u0010\u000FR\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001D\u001A\u0004\b\u001F\u0010\u000F¨\u0006 "}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NodeDefinitions;", "Lo2/m;", "", "nodeType", "description", "", "nodeId", "shapeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;II)Lcom/spears/civilopedia/db/tables/Civ7NodeDefinitions;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNodeType", "getDescription", "I", "getNodeId", "getShapeId", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NodeDefinitions implements m {
    private final String description;
    private final int nodeId;
    private final String nodeType;
    private final int shapeId;

    public Civ7NodeDefinitions(String s, String s1, int v, int v1) {
        j.f(s, "nodeType");
        j.f(s1, "description");
        super();
        this.nodeType = s;
        this.description = s1;
        this.nodeId = v;
        this.shapeId = v1;
    }

    public final String component1() {
        return this.nodeType;
    }

    public final String component2() {
        return this.description;
    }

    public final int component3() {
        return this.nodeId;
    }

    public final int component4() {
        return this.shapeId;
    }

    public final Civ7NodeDefinitions copy(String s, String s1, int v, int v1) {
        j.f(s, "nodeType");
        j.f(s1, "description");
        return new Civ7NodeDefinitions(s, s1, v, v1);
    }

    public static Civ7NodeDefinitions copy$default(Civ7NodeDefinitions civ7NodeDefinitions0, String s, String s1, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ7NodeDefinitions0.nodeType;
        }
        if((v2 & 2) != 0) {
            s1 = civ7NodeDefinitions0.description;
        }
        if((v2 & 4) != 0) {
            v = civ7NodeDefinitions0.nodeId;
        }
        if((v2 & 8) != 0) {
            v1 = civ7NodeDefinitions0.shapeId;
        }
        return civ7NodeDefinitions0.copy(s, s1, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NodeDefinitions)) {
            return false;
        }
        if(!j.a(this.nodeType, ((Civ7NodeDefinitions)object0).nodeType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7NodeDefinitions)object0).description)) {
            return false;
        }
        return this.nodeId == ((Civ7NodeDefinitions)object0).nodeId ? this.shapeId == ((Civ7NodeDefinitions)object0).shapeId : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getNodeId() {
        return this.nodeId;
    }

    public final String getNodeType() {
        return this.nodeType;
    }

    public final int getShapeId() {
        return this.shapeId;
    }

    @Override
    public int hashCode() {
        return (f.b(this.nodeType.hashCode() * 0x1F, 0x1F, this.description) + this.nodeId) * 0x1F + this.shapeId;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.nodeType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7NodeDefinitions(nodeType=", this.nodeType, ", description=", this.description, ", nodeId=");
        stringBuilder0.append(this.nodeId);
        stringBuilder0.append(", shapeId=");
        stringBuilder0.append(this.shapeId);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

