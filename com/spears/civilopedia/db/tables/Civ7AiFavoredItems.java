package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001D\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\t\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0005H\u00C6\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\tH\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010\u001F\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010 \u001A\u0004\u0018\u00010\u0005H\u00C6\u0003Jc\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0005H\u00C6\u0001J\u0013\u0010\"\u001A\u00020\u00032\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010$\u001A\u00020\tH\u00D6\u0001J\t\u0010%\u001A\u00020\u0005H\u00D6\u0001R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0011R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0011R\u0013\u0010\f\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018\u00A8\u0006&"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AiFavoredItems;", "", "favored", "", "item", "", "listType", "stringVal", "value", "", "maxDifficulty", "minDifficulty", "tooltipString", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFavored", "()Z", "getItem", "()Ljava/lang/String;", "getListType", "getMaxDifficulty", "getMinDifficulty", "getStringVal", "getTooltipString", "getValue", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AiFavoredItems {
    private final boolean favored;
    private final String item;
    private final String listType;
    private final String maxDifficulty;
    private final String minDifficulty;
    private final String stringVal;
    private final String tooltipString;
    private final int value;

    public Civ7AiFavoredItems(boolean z, String s, String s1, String s2, int v, String s3, String s4, String s5) {
        j.f(s, "item");
        super();
        this.favored = z;
        this.item = s;
        this.listType = s1;
        this.stringVal = s2;
        this.value = v;
        this.maxDifficulty = s3;
        this.minDifficulty = s4;
        this.tooltipString = s5;
    }

    public final boolean component1() {
        return this.favored;
    }

    public final String component2() {
        return this.item;
    }

    public final String component3() {
        return this.listType;
    }

    public final String component4() {
        return this.stringVal;
    }

    public final int component5() {
        return this.value;
    }

    public final String component6() {
        return this.maxDifficulty;
    }

    public final String component7() {
        return this.minDifficulty;
    }

    public final String component8() {
        return this.tooltipString;
    }

    public final Civ7AiFavoredItems copy(boolean z, String s, String s1, String s2, int v, String s3, String s4, String s5) {
        j.f(s, "item");
        return new Civ7AiFavoredItems(z, s, s1, s2, v, s3, s4, s5);
    }

    public static Civ7AiFavoredItems copy$default(Civ7AiFavoredItems civ7AiFavoredItems0, boolean z, String s, String s1, String s2, int v, String s3, String s4, String s5, int v1, Object object0) {
        boolean z1 = (v1 & 1) == 0 ? z : civ7AiFavoredItems0.favored;
        String s6 = (v1 & 2) == 0 ? s : civ7AiFavoredItems0.item;
        String s7 = (v1 & 4) == 0 ? s1 : civ7AiFavoredItems0.listType;
        String s8 = (v1 & 8) == 0 ? s2 : civ7AiFavoredItems0.stringVal;
        int v2 = (v1 & 16) == 0 ? v : civ7AiFavoredItems0.value;
        String s9 = (v1 & 0x20) == 0 ? s3 : civ7AiFavoredItems0.maxDifficulty;
        String s10 = (v1 & 0x40) == 0 ? s4 : civ7AiFavoredItems0.minDifficulty;
        return (v1 & 0x80) == 0 ? civ7AiFavoredItems0.copy(z1, s6, s7, s8, v2, s9, s10, s5) : civ7AiFavoredItems0.copy(z1, s6, s7, s8, v2, s9, s10, civ7AiFavoredItems0.tooltipString);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AiFavoredItems)) {
            return false;
        }
        if(this.favored != ((Civ7AiFavoredItems)object0).favored) {
            return false;
        }
        if(!j.a(this.item, ((Civ7AiFavoredItems)object0).item)) {
            return false;
        }
        if(!j.a(this.listType, ((Civ7AiFavoredItems)object0).listType)) {
            return false;
        }
        if(!j.a(this.stringVal, ((Civ7AiFavoredItems)object0).stringVal)) {
            return false;
        }
        if(this.value != ((Civ7AiFavoredItems)object0).value) {
            return false;
        }
        if(!j.a(this.maxDifficulty, ((Civ7AiFavoredItems)object0).maxDifficulty)) {
            return false;
        }
        return j.a(this.minDifficulty, ((Civ7AiFavoredItems)object0).minDifficulty) ? j.a(this.tooltipString, ((Civ7AiFavoredItems)object0).tooltipString) : false;
    }

    public final boolean getFavored() {
        return this.favored;
    }

    public final String getItem() {
        return this.item;
    }

    public final String getListType() {
        return this.listType;
    }

    public final String getMaxDifficulty() {
        return this.maxDifficulty;
    }

    public final String getMinDifficulty() {
        return this.minDifficulty;
    }

    public final String getStringVal() {
        return this.stringVal;
    }

    public final String getTooltipString() {
        return this.tooltipString;
    }

    public final int getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (((f.b((this.favored ? 0x4CF : 0x4D5) * 0x1F, 0x1F, this.item) + (this.listType == null ? 0 : this.listType.hashCode())) * 0x1F + (this.stringVal == null ? 0 : this.stringVal.hashCode())) * 0x1F + this.value) * 0x1F;
        int v2 = this.maxDifficulty == null ? 0 : this.maxDifficulty.hashCode();
        int v3 = this.minDifficulty == null ? 0 : this.minDifficulty.hashCode();
        String s = this.tooltipString;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7AiFavoredItems(favored=");
        stringBuilder0.append(this.favored);
        stringBuilder0.append(", item=");
        stringBuilder0.append(this.item);
        stringBuilder0.append(", listType=");
        f.t(stringBuilder0, this.listType, ", stringVal=", this.stringVal, ", value=");
        f.r(stringBuilder0, this.value, ", maxDifficulty=", this.maxDifficulty, ", minDifficulty=");
        return e.i(stringBuilder0, this.minDifficulty, ", tooltipString=", this.tooltipString, ")");
    }
}

