package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001B"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomacyStatementFrames;", "", "frame", "", "initiator", "type", "selections", "text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFrame", "()Ljava/lang/String;", "getInitiator", "getSelections", "getText", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomacyStatementFrames {
    private final String frame;
    private final String initiator;
    private final String selections;
    private final String text;
    private final String type;

    public Civ7DiplomacyStatementFrames(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "frame");
        j.f(s1, "initiator");
        j.f(s2, "type");
        super();
        this.frame = s;
        this.initiator = s1;
        this.type = s2;
        this.selections = s3;
        this.text = s4;
    }

    public final String component1() {
        return this.frame;
    }

    public final String component2() {
        return this.initiator;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.selections;
    }

    public final String component5() {
        return this.text;
    }

    public final Civ7DiplomacyStatementFrames copy(String s, String s1, String s2, String s3, String s4) {
        j.f(s, "frame");
        j.f(s1, "initiator");
        j.f(s2, "type");
        return new Civ7DiplomacyStatementFrames(s, s1, s2, s3, s4);
    }

    public static Civ7DiplomacyStatementFrames copy$default(Civ7DiplomacyStatementFrames civ7DiplomacyStatementFrames0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7DiplomacyStatementFrames0.frame;
        }
        if((v & 2) != 0) {
            s1 = civ7DiplomacyStatementFrames0.initiator;
        }
        if((v & 4) != 0) {
            s2 = civ7DiplomacyStatementFrames0.type;
        }
        if((v & 8) != 0) {
            s3 = civ7DiplomacyStatementFrames0.selections;
        }
        if((v & 16) != 0) {
            s4 = civ7DiplomacyStatementFrames0.text;
        }
        return civ7DiplomacyStatementFrames0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomacyStatementFrames)) {
            return false;
        }
        if(!j.a(this.frame, ((Civ7DiplomacyStatementFrames)object0).frame)) {
            return false;
        }
        if(!j.a(this.initiator, ((Civ7DiplomacyStatementFrames)object0).initiator)) {
            return false;
        }
        if(!j.a(this.type, ((Civ7DiplomacyStatementFrames)object0).type)) {
            return false;
        }
        return j.a(this.selections, ((Civ7DiplomacyStatementFrames)object0).selections) ? j.a(this.text, ((Civ7DiplomacyStatementFrames)object0).text) : false;
    }

    public final String getFrame() {
        return this.frame;
    }

    public final String getInitiator() {
        return this.initiator;
    }

    public final String getSelections() {
        return this.selections;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.frame.hashCode() * 0x1F, 0x1F, this.initiator), 0x1F, this.type);
        int v1 = 0;
        int v2 = this.selections == null ? 0 : this.selections.hashCode();
        String s = this.text;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7DiplomacyStatementFrames(frame=", this.frame, ", initiator=", this.initiator, ", type=");
        f.t(stringBuilder0, this.type, ", selections=", this.selections, ", text=");
        return e.h(stringBuilder0, this.text, ")");
    }
}

