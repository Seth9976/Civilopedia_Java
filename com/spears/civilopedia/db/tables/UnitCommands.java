package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001A\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001A\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0016J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0016J\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0016J\u0010\u0010\u001D\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\u0012\u0010 \u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u0016J\u0012\u0010\"\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u0016J\u0012\u0010#\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0012\u0010&\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\u0016J\u00AC\u0001\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00102\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010\u0016J\u0010\u0010*\u001A\u00020\u0010H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010%J\u001A\u0010-\u001A\u00020\t2\b\u0010,\u001A\u0004\u0018\u00010+H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010/\u001A\u0004\b0\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010/\u001A\u0004\b1\u0010\u0016R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010/\u001A\u0004\b2\u0010\u0016R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010/\u001A\u0004\b3\u0010\u0016R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010/\u001A\u0004\b4\u0010\u0016R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010/\u001A\u0004\b5\u0010\u0016R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\n\u00106\u001A\u0004\b7\u0010\u001ER\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u000B\u00106\u001A\u0004\b8\u0010\u001ER\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\f\u0010/\u001A\u0004\b9\u0010\u0016R\u0019\u0010\r\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\r\u0010/\u001A\u0004\b:\u0010\u0016R\u0019\u0010\u000E\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010/\u001A\u0004\b;\u0010\u0016R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010/\u001A\u0004\b<\u0010\u0016R\u0017\u0010\u0011\u001A\u00020\u00108\u0006\u00A2\u0006\f\n\u0004\b\u0011\u0010=\u001A\u0004\b>\u0010%R\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010/\u001A\u0004\b?\u0010\u0016\u00A8\u0006@"}, d2 = {"Lcom/spears/civilopedia/db/tables/UnitCommands;", "Lo2/m;", "", "commandType", "description", "help", "disabledHelp", "icon", "sound", "", "visibleInUI", "holdCycling", "categoryInUI", "interfaceMode", "prereqTech", "prereqCivic", "", "maxEra", "hotkeyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "component10", "component11", "component12", "component13", "()I", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/spears/civilopedia/db/tables/UnitCommands;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCommandType", "getDescription", "getHelp", "getDisabledHelp", "getIcon", "getSound", "Z", "getVisibleInUI", "getHoldCycling", "getCategoryInUI", "getInterfaceMode", "getPrereqTech", "getPrereqCivic", "I", "getMaxEra", "getHotkeyId", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UnitCommands implements m {
    private final String categoryInUI;
    private final String commandType;
    private final String description;
    private final String disabledHelp;
    private final String help;
    private final boolean holdCycling;
    private final String hotkeyId;
    private final String icon;
    private final String interfaceMode;
    private final int maxEra;
    private final String prereqCivic;
    private final String prereqTech;
    private final String sound;
    private final boolean visibleInUI;

    public UnitCommands(String s, String s1, String s2, String s3, String s4, String s5, boolean z, boolean z1, String s6, String s7, String s8, String s9, int v, String s10) {
        j.f(s, "commandType");
        j.f(s1, "description");
        j.f(s4, "icon");
        super();
        this.commandType = s;
        this.description = s1;
        this.help = s2;
        this.disabledHelp = s3;
        this.icon = s4;
        this.sound = s5;
        this.visibleInUI = z;
        this.holdCycling = z1;
        this.categoryInUI = s6;
        this.interfaceMode = s7;
        this.prereqTech = s8;
        this.prereqCivic = s9;
        this.maxEra = v;
        this.hotkeyId = s10;
    }

    public final String component1() {
        return this.commandType;
    }

    public final String component10() {
        return this.interfaceMode;
    }

    public final String component11() {
        return this.prereqTech;
    }

    public final String component12() {
        return this.prereqCivic;
    }

    public final int component13() {
        return this.maxEra;
    }

    public final String component14() {
        return this.hotkeyId;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.help;
    }

    public final String component4() {
        return this.disabledHelp;
    }

    public final String component5() {
        return this.icon;
    }

    public final String component6() {
        return this.sound;
    }

    public final boolean component7() {
        return this.visibleInUI;
    }

    public final boolean component8() {
        return this.holdCycling;
    }

    public final String component9() {
        return this.categoryInUI;
    }

    public final UnitCommands copy(String s, String s1, String s2, String s3, String s4, String s5, boolean z, boolean z1, String s6, String s7, String s8, String s9, int v, String s10) {
        j.f(s, "commandType");
        j.f(s1, "description");
        j.f(s4, "icon");
        return new UnitCommands(s, s1, s2, s3, s4, s5, z, z1, s6, s7, s8, s9, v, s10);
    }

    public static UnitCommands copy$default(UnitCommands unitCommands0, String s, String s1, String s2, String s3, String s4, String s5, boolean z, boolean z1, String s6, String s7, String s8, String s9, int v, String s10, int v1, Object object0) {
        String s11 = (v1 & 1) == 0 ? s : unitCommands0.commandType;
        String s12 = (v1 & 2) == 0 ? s1 : unitCommands0.description;
        String s13 = (v1 & 4) == 0 ? s2 : unitCommands0.help;
        String s14 = (v1 & 8) == 0 ? s3 : unitCommands0.disabledHelp;
        String s15 = (v1 & 16) == 0 ? s4 : unitCommands0.icon;
        String s16 = (v1 & 0x20) == 0 ? s5 : unitCommands0.sound;
        boolean z2 = (v1 & 0x40) == 0 ? z : unitCommands0.visibleInUI;
        boolean z3 = (v1 & 0x80) == 0 ? z1 : unitCommands0.holdCycling;
        String s17 = (v1 & 0x100) == 0 ? s6 : unitCommands0.categoryInUI;
        String s18 = (v1 & 0x200) == 0 ? s7 : unitCommands0.interfaceMode;
        String s19 = (v1 & 0x400) == 0 ? s8 : unitCommands0.prereqTech;
        String s20 = (v1 & 0x800) == 0 ? s9 : unitCommands0.prereqCivic;
        int v2 = (v1 & 0x1000) == 0 ? v : unitCommands0.maxEra;
        return (v1 & 0x2000) == 0 ? unitCommands0.copy(s11, s12, s13, s14, s15, s16, z2, z3, s17, s18, s19, s20, v2, s10) : unitCommands0.copy(s11, s12, s13, s14, s15, s16, z2, z3, s17, s18, s19, s20, v2, unitCommands0.hotkeyId);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UnitCommands)) {
            return false;
        }
        if(!j.a(this.commandType, ((UnitCommands)object0).commandType)) {
            return false;
        }
        if(!j.a(this.description, ((UnitCommands)object0).description)) {
            return false;
        }
        if(!j.a(this.help, ((UnitCommands)object0).help)) {
            return false;
        }
        if(!j.a(this.disabledHelp, ((UnitCommands)object0).disabledHelp)) {
            return false;
        }
        if(!j.a(this.icon, ((UnitCommands)object0).icon)) {
            return false;
        }
        if(!j.a(this.sound, ((UnitCommands)object0).sound)) {
            return false;
        }
        if(this.visibleInUI != ((UnitCommands)object0).visibleInUI) {
            return false;
        }
        if(this.holdCycling != ((UnitCommands)object0).holdCycling) {
            return false;
        }
        if(!j.a(this.categoryInUI, ((UnitCommands)object0).categoryInUI)) {
            return false;
        }
        if(!j.a(this.interfaceMode, ((UnitCommands)object0).interfaceMode)) {
            return false;
        }
        if(!j.a(this.prereqTech, ((UnitCommands)object0).prereqTech)) {
            return false;
        }
        if(!j.a(this.prereqCivic, ((UnitCommands)object0).prereqCivic)) {
            return false;
        }
        return this.maxEra == ((UnitCommands)object0).maxEra ? j.a(this.hotkeyId, ((UnitCommands)object0).hotkeyId) : false;
    }

    public final String getCategoryInUI() {
        return this.categoryInUI;
    }

    public final String getCommandType() {
        return this.commandType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisabledHelp() {
        return this.disabledHelp;
    }

    public final String getHelp() {
        return this.help;
    }

    public final boolean getHoldCycling() {
        return this.holdCycling;
    }

    public final String getHotkeyId() {
        return this.hotkeyId;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getInterfaceMode() {
        return this.interfaceMode;
    }

    public final int getMaxEra() {
        return this.maxEra;
    }

    public final String getPrereqCivic() {
        return this.prereqCivic;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final String getSound() {
        return this.sound;
    }

    public final boolean getVisibleInUI() {
        return this.visibleInUI;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(((f.b(this.commandType.hashCode() * 0x1F, 0x1F, this.description) + (this.help == null ? 0 : this.help.hashCode())) * 0x1F + (this.disabledHelp == null ? 0 : this.disabledHelp.hashCode())) * 0x1F, 0x1F, this.icon);
        int v2 = this.sound == null ? 0 : this.sound.hashCode();
        int v3 = 0x4D5;
        int v4 = this.visibleInUI ? 0x4CF : 0x4D5;
        if(this.holdCycling) {
            v3 = 0x4CF;
        }
        int v5 = ((((((((v1 + v2) * 0x1F + v4) * 0x1F + v3) * 0x1F + (this.categoryInUI == null ? 0 : this.categoryInUI.hashCode())) * 0x1F + (this.interfaceMode == null ? 0 : this.interfaceMode.hashCode())) * 0x1F + (this.prereqTech == null ? 0 : this.prereqTech.hashCode())) * 0x1F + (this.prereqCivic == null ? 0 : this.prereqCivic.hashCode())) * 0x1F + this.maxEra) * 0x1F;
        String s = this.hotkeyId;
        if(s != null) {
            v = s.hashCode();
        }
        return v5 + v;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.commandType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("UnitCommands(commandType=", this.commandType, ", description=", this.description, ", help=");
        f.t(stringBuilder0, this.help, ", disabledHelp=", this.disabledHelp, ", icon=");
        f.t(stringBuilder0, this.icon, ", sound=", this.sound, ", visibleInUI=");
        u9.A(stringBuilder0, this.visibleInUI, ", holdCycling=", this.holdCycling, ", categoryInUI=");
        f.t(stringBuilder0, this.categoryInUI, ", interfaceMode=", this.interfaceMode, ", prereqTech=");
        f.t(stringBuilder0, this.prereqTech, ", prereqCivic=", this.prereqCivic, ", maxEra=");
        return u9.e(stringBuilder0, this.maxEra, ", hotkeyId=", this.hotkeyId, ")");
    }
}

