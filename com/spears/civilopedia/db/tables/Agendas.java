package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0012\u0010\f\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\nJ:\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001A\u001A\u0004\b\u001B\u0010\nR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001A\u001A\u0004\b\u001C\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001A\u001A\u0004\b\u001D\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001A\u001A\u0004\b\u001E\u0010\n¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Agendas;", "Lo2/m;", "", "agendaType", "operationList", "name", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Agendas;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgendaType", "getOperationList", "getName", "getDescription", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Agendas implements m {
    private final String agendaType;
    private final String description;
    private final String name;
    private final String operationList;

    public Agendas(String s, String s1, String s2, String s3) {
        j.f(s, "agendaType");
        j.f(s2, "name");
        j.f(s3, "description");
        super();
        this.agendaType = s;
        this.operationList = s1;
        this.name = s2;
        this.description = s3;
    }

    public final String component1() {
        return this.agendaType;
    }

    public final String component2() {
        return this.operationList;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final Agendas copy(String s, String s1, String s2, String s3) {
        j.f(s, "agendaType");
        j.f(s2, "name");
        j.f(s3, "description");
        return new Agendas(s, s1, s2, s3);
    }

    public static Agendas copy$default(Agendas agendas0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = agendas0.agendaType;
        }
        if((v & 2) != 0) {
            s1 = agendas0.operationList;
        }
        if((v & 4) != 0) {
            s2 = agendas0.name;
        }
        if((v & 8) != 0) {
            s3 = agendas0.description;
        }
        return agendas0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Agendas)) {
            return false;
        }
        if(!j.a(this.agendaType, ((Agendas)object0).agendaType)) {
            return false;
        }
        if(!j.a(this.operationList, ((Agendas)object0).operationList)) {
            return false;
        }
        return j.a(this.name, ((Agendas)object0).name) ? j.a(this.description, ((Agendas)object0).description) : false;
    }

    public final String getAgendaType() {
        return this.agendaType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOperationList() {
        return this.operationList;
    }

    @Override
    public int hashCode() {
        int v = this.agendaType.hashCode();
        return this.operationList == null ? this.description.hashCode() + f.b(v * 961, 0x1F, this.name) : this.description.hashCode() + f.b((v * 0x1F + this.operationList.hashCode()) * 0x1F, 0x1F, this.name);
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.agendaType;
    }

    @Override
    public String toString() {
        return e.i(e.j("Agendas(agendaType=", this.agendaType, ", operationList=", this.operationList, ", name="), this.name, ", description=", this.description, ")");
    }
}

