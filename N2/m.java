package n2;

import J2.j;
import android.graphics.Color;
import com.spears.civilopedia.db.tables.CivilizationLeaders;
import com.spears.civilopedia.db.tables.CivilizationTraits;
import com.spears.civilopedia.db.tables.Civilizations;
import com.spears.civilopedia.db.tables.DistrictReplaces;
import com.spears.civilopedia.db.tables.Districts;
import com.spears.civilopedia.db.tables.LeaderTraits;
import com.spears.civilopedia.db.tables.Modifiers;
import f2.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o2.f;
import o2.q;
import o2.s;
import w2.e;
import w2.h;
import x2.i;
import x2.k;
import x2.r;
import x2.w;

public final class m {
    public final l a;
    public final String b;
    public final h c;
    public final h d;
    public static final Object e;

    static {
        m.e = w.s(new e[]{new e("CIVILIZATION_AKKAD", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_AMSTERDAM", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("CIVILIZATION_ANTANANARIVO", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0, 0xFF))), new e("CIVILIZATION_ANTIOCH", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("CIVILIZATION_ARMAGH", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("CIVILIZATION_AUCKLAND", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_AYUTTHAYA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0, 0xFF))), new e("CIVILIZATION_BABYLON", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_BARBARIAN", new s(Color.argb(0xFF, 202, 20, 21), Color.argb(0xFF, 24, 24, 24))), new e("CIVILIZATION_BOLOGNA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_BRUSSELS", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_BUENOS_AIRES", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_CAGUANA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0, 0xFF))), new e("CIVILIZATION_CAHOKIA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("CIVILIZATION_CARDIFF", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_CARTHAGE", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_CHINGUETTI", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("CIVILIZATION_FEZ", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_GENEVA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_GRANADA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_HATTUSA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_HONG_KONG", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_HUNZA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("CIVILIZATION_JAKARTA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("CIVILIZATION_JERUSALEM", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("CIVILIZATION_JOHANNESBURG", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_KABUL", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_KANDY", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("CIVILIZATION_KUMASI", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0, 0xFF))), new e("CIVILIZATION_LAHORE", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_LA_VENTA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("CIVILIZATION_LISBON", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("CIVILIZATION_MEXICO_CITY", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_MOHENJO_DARO", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0, 0xFF))), new e("CIVILIZATION_MUSCAT", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("CIVILIZATION_NALANDA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_NAN_MADOL", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0, 0xFF))), new e("CIVILIZATION_NAZCA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("CIVILIZATION_NGAZARGAMU", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_PALENQUE", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_PRESLAV", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_RAPA_NUI", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0, 0xFF))), new e("CIVILIZATION_SAMARKAND", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("CIVILIZATION_SEOUL", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_SINGAPORE", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_STOCKHOLM", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_TARUGA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("CIVILIZATION_TORONTO", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("CIVILIZATION_VALLETTA", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_VATICAN_CITY", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("CIVILIZATION_VILNIUS", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xFF, 0, 0xFF))), new e("CIVILIZATION_WOLIN", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 202, 20, 21))), new e("CIVILIZATION_YEREVAN", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("CIVILIZATION_ZANZIBAR", new s(Color.argb(0xFF, 24, 24, 24), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_ABRAHAM_LINCOLN", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 1, 42, 108))), new e("LEADER_ALEXANDER", new s(Color.argb(0xFF, 0xAE, 0xAE, 0xAE), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_AMANITORE", new s(Color.argb(0xFF, 0xEA, 0xE1, 0x9D), Color.argb(0xFF, 120, 61, 2))), new e("LEADER_AMBIORIX", new s(Color.argb(0xFF, 21, 108, 0x30), Color.argb(0xFF, 0x7D, 0xEC, 0xE3))), new e("LEADER_BARBAROSSA", new s(Color.argb(0xFF, 0xAE, 0xAE, 0xAE), Color.argb(0xFF, 24, 24, 24))), new e("LEADER_BASIL", new s(Color.argb(0xFF, 55, 0, 101), Color.argb(0xFF, 0xEA, 0xE1, 0x9D))), new e("LEADER_CATHERINE_DE_MEDICI", new s(Color.argb(0xFF, 0, 0x4F, 206), Color.argb(0xFF, 0xEA, 0xE1, 0x9D))), new e("LEADER_CATHERINE_DE_MEDICI_ALT", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 0x86, 0x72, 2))), new e("LEADER_CHANDRAGUPTA", new s(Color.argb(0xFF, 0, 0xC0, 0x9B), Color.argb(0xFF, 55, 0, 101))), new e("LEADER_CLEOPATRA", new s(Color.argb(0xFF, 1, 0x4F, 81), Color.argb(0xFF, 0xEA, 0xE1, 0x9D))), new e("LEADER_CLEOPATRA_ALT", new s(Color.argb(0xFF, 0xEA, 0xE1, 0x9D), Color.argb(0xFF, 1, 0x4F, 81))), new e("LEADER_CYRUS", new s(Color.argb(0xFF, 0xB7, 0x80, 230), Color.argb(0xFF, 120, 0, 1))), new e("LEADER_DIDO", new s(Color.argb(0xFF, 109, 0, 205), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("LEADER_ELEANOR_ENGLAND", new s(Color.argb(0xFF, 0xE5, 0x75, 0x74), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_ELEANOR_FRANCE", new s(Color.argb(0xFF, 0xE5, 0x75, 0x74), Color.argb(0xFF, 0xEA, 0xE1, 0x9D))), new e("LEADER_ELIZABETH", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 202, 20, 21))), new e("LEADER_GANDHI", new s(Color.argb(0xFF, 55, 0, 101), Color.argb(0xFF, 0, 0xC0, 0x9B))), new e("LEADER_GENGHIS_KHAN", new s(Color.argb(0xFF, 120, 0, 1), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("LEADER_GILGAMESH", new s(Color.argb(0xFF, 1, 42, 108), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("LEADER_GITARJA", new s(Color.argb(0xFF, 120, 0, 1), Color.argb(0xFF, 0, 0xC0, 0x9B))), new e("LEADER_GORGO", new s(Color.argb(0xFF, 120, 0, 1), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("LEADER_HAMMURABI", new s(Color.argb(0xFF, 0x74, 0xA3, 0xF3), Color.argb(0xFF, 1, 42, 108))), new e("LEADER_HARALD_ALT", new s(Color.argb(0xFF, 202, 20, 21), Color.argb(0xFF, 1, 42, 108))), new e("LEADER_HARDRADA", new s(Color.argb(0xFF, 1, 42, 108), Color.argb(0xFF, 202, 20, 21))), new e("LEADER_HOJO", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 120, 0, 1))), new e("LEADER_JADWIGA", new s(Color.argb(0xFF, 120, 0, 1), Color.argb(0xFF, 0xE5, 0x75, 0x74))), new e("LEADER_JAYAVARMAN", new s(Color.argb(0xFF, 0x75, 0, 0x73), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("LEADER_JOAO_III", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 1, 42, 108))), new e("LEADER_JOHN_CURTIN", new s(Color.argb(0xFF, 21, 108, 0x30), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_JULIUS_CAESAR", new s(Color.argb(0xFF, 120, 0, 1), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_KRISTINA", new s(Color.argb(0xFF, 0x74, 0xA3, 0xF3), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_KUBLAI_KHAN_CHINA", new s(Color.argb(0xFF, 0xEA, 0xE1, 0x9D), Color.argb(0xFF, 120, 0, 1))), new e("LEADER_KUBLAI_KHAN_MONGOLIA", new s(Color.argb(0xFF, 0xFF, 0x81, 18), Color.argb(0xFF, 120, 0, 1))), new e("LEADER_KUPE", new s(Color.argb(0xFF, 202, 20, 21), Color.argb(0xFF, 0x7D, 0xEC, 0xE3))), new e("LEADER_LADY_SIX_SKY", new s(Color.argb(0xFF, 0x74, 0xA3, 0xF3), Color.argb(0xFF, 1, 0x4F, 81))), new e("LEADER_LADY_TRIEU", new s(Color.argb(0xFF, 0xF7, 0xD8, 1), Color.argb(0xFF, 0x75, 0, 0x73))), new e("LEADER_LAURIER", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 202, 20, 21))), new e("LEADER_LAUTARO", new s(Color.argb(0xFF, 0, 0x4F, 206), Color.argb(0xFF, 0x7D, 0xEC, 0xE3))), new e("LEADER_LUDWIG", new s(Color.argb(0xFF, 0x74, 0xA3, 0xF3), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_MANSA_MUSA", new s(Color.argb(0xFF, 120, 0, 1), Color.argb(0xFF, 0xEA, 0xE1, 0x9D))), new e("LEADER_MATTHIAS_CORVINUS", new s(Color.argb(0xFF, 21, 108, 0x30), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("LEADER_MENELIK", new s(Color.argb(0xFF, 0xF7, 0xD8, 1), Color.argb(0xFF, 21, 108, 0x30))), new e("LEADER_MONTEZUMA", new s(Color.argb(0xFF, 0x7D, 0xEC, 0xE3), Color.argb(0xFF, 120, 0, 1))), new e("LEADER_MVEMBA", new s(Color.argb(0xFF, 0xF7, 0xD8, 1), Color.argb(0xFF, 202, 20, 21))), new e("LEADER_NADER_SHAH", new s(Color.argb(0xFF, 120, 0, 1), Color.argb(0xFF, 0xB7, 0x80, 230))), new e("LEADER_NZINGA_MBANDE", new s(Color.argb(0xFF, 0x79, 0xE0, 0x77), Color.argb(0xFF, 120, 61, 2))), new e("LEADER_PACHACUTI", new s(Color.argb(0xFF, 120, 61, 2), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_PEDRO", new s(Color.argb(0xFF, 97, 0xBF, 34), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_PERICLES", new s(Color.argb(0xFF, 0x74, 0xA3, 0xF3), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_PETER_GREAT", new s(Color.argb(0xFF, 0xF7, 0xD8, 1), Color.argb(0xFF, 24, 24, 24))), new e("LEADER_PHILIP_II", new s(Color.argb(0xFF, 202, 20, 21), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_POUNDMAKER", new s(Color.argb(0xFF, 1, 42, 108), Color.argb(0xFF, 97, 0xBF, 34))), new e("LEADER_QIN", new s(Color.argb(0xFF, 21, 108, 0x30), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_QIN_ALT", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 21, 108, 0x30))), new e("LEADER_RAMSES", new s(Color.argb(0xFF, 0xEA, 0xE1, 0x9D), Color.argb(0xFF, 109, 0, 205))), new e("LEADER_ROBERT_THE_BRUCE", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 0, 0x4F, 206))), new e("LEADER_SALADIN", new s(Color.argb(0xFF, 0xF7, 0xD8, 1), Color.argb(0xFF, 21, 108, 0x30))), new e("LEADER_SALADIN_ALT", new s(Color.argb(0xFF, 21, 108, 0x30), Color.argb(0xFF, 0x79, 0xE0, 0x77))), new e("LEADER_SEJONG", new s(Color.argb(0xFF, 0x74, 0xA3, 0xF3), Color.argb(0xFF, 202, 20, 21))), new e("LEADER_SEONDEOK", new s(Color.argb(0xFF, 202, 20, 21), Color.argb(0xFF, 0x74, 0xA3, 0xF3))), new e("LEADER_SHAKA", new s(Color.argb(0xFF, 120, 61, 2), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_SIMON_BOLIVAR", new s(Color.argb(0xFF, 1, 42, 108), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_SULEIMAN", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 21, 108, 0x30))), new e("LEADER_SULEIMAN_ALT", new s(Color.argb(0xFF, 21, 108, 0x30), Color.argb(0xFF, 0xE5, 0x75, 0x74))), new e("LEADER_SUNDIATA_KEITA", new s(Color.argb(0xFF, 0xEA, 0xE1, 0x9D), Color.argb(0xFF, 120, 0, 1))), new e("LEADER_TAMAR", new s(Color.argb(0xFF, 0xF9, 0xF9, 0xF9), Color.argb(0xFF, 0xFF, 0x81, 18))), new e("LEADER_THEODORA", new s(Color.argb(0xFF, 109, 0, 205), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_TOKUGAWA", new s(Color.argb(0xFF, 120, 0, 1), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_TOMYRIS", new s(Color.argb(0xFF, 0xFF, 0xB2, 60), Color.argb(0xFF, 120, 0, 1))), new e("LEADER_TRAJAN", new s(Color.argb(0xFF, 109, 0, 205), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_T_ROOSEVELT", new s(Color.argb(0xFF, 1, 42, 108), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_T_ROOSEVELT_ROUGHRIDER", new s(Color.argb(0xFF, 202, 20, 21), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_VICTORIA", new s(Color.argb(0xFF, 202, 20, 21), Color.argb(0xFF, 0xF9, 0xF9, 0xF9))), new e("LEADER_VICTORIA_ALT", new s(Color.argb(0xFF, 1, 42, 108), Color.argb(0xFF, 202, 20, 21))), new e("LEADER_WILHELMINA", new s(Color.argb(0xFF, 0xFF, 0x81, 18), Color.argb(0xFF, 0, 0x4F, 206))), new e("LEADER_WU_ZETIAN", new s(Color.argb(0xFF, 202, 20, 21), Color.argb(0xFF, 0xF7, 0xD8, 1))), new e("LEADER_YONGLE", new s(Color.argb(0xFF, 0xF7, 0xD8, 1), Color.argb(0xFF, 1, 42, 108)))});
    }

    public m(l l0, String s) {
        j.f(l0, "environment");
        j.f(s, "leaderType");
        super();
        this.a = l0;
        this.b = s;
        this.c = new h(new n2.l(this, 0));
        this.d = new h(new n2.l(this, 1));
    }

    public final ArrayList a(List list0) {
        boolean z1;
        l l0;
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            l0 = this.a;
            z1 = false;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            Districts districts0 = (Districts)l0.b.b().b0.h(((q)object0).b);
            if(districts0 != null) {
                z1 = districts0.getTraitType() == null ? districts0.getRequiresPlacement() : this.d(districts0.getTraitType());
            }
            if(z1) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            DistrictReplaces districtReplaces0 = (DistrictReplaces)l0.b.b().U.h(((q)object1).b);
            String s = districtReplaces0 == null ? null : districtReplaces0.getReplacesDistrictType();
            if(s != null) {
                arrayList1.add(s);
            }
        }
        ArrayList arrayList2 = i.p0(arrayList1);
        Iterable iterable0 = (List)this.c.getValue();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object2: iterable0) {
                if(j.a(((Modifiers)object2).getModifierType(), "MODIFIER_PLAYER_GAINS_FOUNDER_BELIEF_MAJORITY_RELIGION")) {
                    z1 = true;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(z1) {
            arrayList2.add("DISTRICT_HOLY_SITE");
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: arrayList0) {
            if(!arrayList2.contains(((q)object3).b)) {
                arrayList3.add(object3);
            }
        }
        return arrayList3;
    }

    public final String b() {
        for(Object object0: ((Iterable)this.a.b.b().D)) {
            if(j.a(((CivilizationLeaders)object0).getLeaderType(), this.b)) {
                return ((CivilizationLeaders)object0) == null ? null : ((CivilizationLeaders)object0).getCivilizationType();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final List c() {
        l l0 = this.a;
        List list0 = (List)l0.b.d().c.get("LEADERS");
        if(list0 != null) {
            List list1 = new ArrayList();
            for(Object object0: list0) {
                if(!j.a(((q)object0).b, "INTRO")) {
                    ((ArrayList)list1).add(object0);
                }
            }
            return list1;
        }
        List list2 = (List)l0.b.d().c.get("CIVILIZATIONS");
        if(list2 != null) {
            List list3 = new ArrayList();
            for(Object object1: list2) {
                if(j.a(((q)object1).c, "LEADERS") && !j.a(((q)object1).b, "LEADERS_INTRO")) {
                    ((ArrayList)list3).add(object1);
                }
            }
            return list3;
        }
        return r.i;
    }

    public final boolean d(String s) {
        if(j.a(s, "TRAIT_CIVILIZATION_NO_PLAYER")) {
            return true;
        }
        l l0 = this.a;
        f f0 = l0.b.b();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f0.N0)) {
            if(j.a(((LeaderTraits)object0).getTraitType(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((LeaderTraits)object1).getLeaderType());
        }
        f2.m m0 = l0.b;
        f f1 = m0.b();
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: ((Iterable)f1.D)) {
            if(arrayList1.contains(((CivilizationLeaders)object2).getLeaderType())) {
                arrayList2.add(object2);
            }
        }
        if(!arrayList2.isEmpty()) {
            for(Object object3: arrayList2) {
                Civilizations civilizations0 = (Civilizations)m0.b().F.h(((CivilizationLeaders)object3).getCivilizationType());
                if(j.a((civilizations0 == null ? null : civilizations0.getStartingCivilizationLevelType()), "CIVILIZATION_LEVEL_CITY_STATE")) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        if(arrayList1.contains(this.b)) {
            return true;
        }
        String s1 = this.b();
        if(s1 != null) {
            f f2 = m0.b();
            ArrayList arrayList3 = new ArrayList();
            for(Object object4: ((Iterable)f2.E)) {
                if(j.a(((CivilizationTraits)object4).getTraitType(), s)) {
                    arrayList3.add(object4);
                }
            }
            ArrayList arrayList4 = new ArrayList(k.E(arrayList3));
            for(Object object5: arrayList3) {
                arrayList4.add(((CivilizationTraits)object5).getCivilizationType());
            }
            return arrayList4.contains(s1);
        }
        return false;
    }
}

