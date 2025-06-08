package U2;

import D3.b;
import J2.j;
import J3.a;
import L3.e;
import L3.i;
import L3.m;
import M3.N;
import M3.X;
import M3.Z;
import M3.w;
import T1.c;
import X2.F;
import X2.H;
import X2.M;
import X2.u;
import a3.A;
import a3.C;
import a3.J;
import a3.K;
import f0.g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v3.f;
import x2.k;
import y3.d;
import z1.a0;

public abstract class h {
    public A a;
    public final i b;
    public final e c;
    public final m d;
    public static final f e;

    static {
        h.e = f.g("<built-ins module>");
    }

    public h(m m0) {
        this.d = m0;
        m0.a(new b(this, 7));
        this.b = new i(m0, new c(this, 13));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.c = m0.b(new U2.f(this, 0));
    }

    public static boolean A(w w0, v3.e e0) {
        if(w0 != null) {
            if(e0 != null) {
                return h.G(w0.H0(), e0);
            }
            h.a(99);
            throw null;
        }
        h.a(98);
        throw null;
    }

    public static boolean B(w w0, v3.e e0) {
        if(e0 != null) {
            return h.A(w0, e0) && !w0.I0();
        }
        h.a(0x88);
        throw null;
    }

    public static boolean C(u u0) {
        if(u0.a().l().e(U2.m.m)) {
            return true;
        }
        if(u0 instanceof M) {
            boolean z = ((M)u0).G();
            J j0 = ((M)u0).d();
            K k0 = ((M)u0).e();
            return j0 != null && h.C(j0) && (!z || k0 != null && h.C(k0));
        }
        return false;
    }

    public static boolean D(w w0, v3.e e0) {
        if(w0 != null) {
            if(e0 != null) {
                return !w0.I0() && h.A(w0, e0);
            }
            h.a(107);
            throw null;
        }
        h.a(106);
        throw null;
    }

    public static boolean E(w w0) {
        if(w0 != null) {
            return h.A(w0, U2.m.b) && !X.e(w0);
        }
        h.a(0x89);
        throw null;
    }

    public static boolean F(w w0) {
        if(w0 != null) {
            if(!w0.I0()) {
                X2.h h0 = w0.H0().q();
                if(h0 instanceof X2.e) {
                    if(((X2.e)h0) != null) {
                        return h.t(((X2.e)h0)) != null;
                    }
                    h.a(97);
                    throw null;
                }
            }
            return false;
        }
        h.a(0x5F);
        throw null;
    }

    public static boolean G(M3.K k0, v3.e e0) {
        if(k0 != null) {
            if(e0 != null) {
                X2.h h0 = k0.q();
                return h0 instanceof X2.e && h.b(((X2.e)h0), e0);
            }
            h.a(103);
            throw null;
        }
        h.a(102);
        throw null;
    }

    public static boolean H(X2.h h0) {
        if(h0 != null) {
            while(h0 != null) {
                if(h0 instanceof F) {
                    return ((C)(((F)h0))).m.h(n.k);
                }
                h0 = h0.p();
            }
            return false;
        }
        h.a(10);
        throw null;
    }

    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 67: 
            case 69: 
            case 70: 
            case 71: 
            case 75: 
            case 82: 
            case 85: 
            case 87: 
            case 88: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 67: 
            case 69: 
            case 70: 
            case 71: 
            case 75: 
            case 82: 
            case 85: 
            case 87: 
            case 88: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: {
                arr_object[0] = "computation";
                break;
            }
            case 14: {
                arr_object[0] = "simpleName";
                break;
            }
            case 0x2F: {
                arr_object[0] = "classSimpleName";
                break;
            }
            case 68: {
                arr_object[0] = "arrayType";
                break;
            }
            case 72: {
                arr_object[0] = "notNullArrayType";
                break;
            }
            case 1: 
            case 73: {
                arr_object[0] = "module";
                break;
            }
            case 74: {
                arr_object[0] = "primitiveType";
                break;
            }
            case 76: {
                arr_object[0] = "kotlinType";
                break;
            }
            case 81: {
                arr_object[0] = "annotations";
                break;
            }
            case 0x4F: 
            case 83: {
                arr_object[0] = "projectionType";
                break;
            }
            case 80: 
            case 84: 
            case 86: {
                arr_object[0] = "argument";
                break;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 67: 
            case 69: 
            case 70: 
            case 71: 
            case 75: 
            case 82: 
            case 85: 
            case 87: 
            case 88: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            }
            case 102: {
                arr_object[0] = "typeConstructor";
                break;
            }
            case 0x71: {
                arr_object[0] = "classDescriptor";
                break;
            }
            case 12: 
            case 99: 
            case 101: 
            case 103: 
            case 105: 
            case 107: 
            case 0x88: {
                arr_object[0] = "fqName";
                break;
            }
            case 9: 
            case 10: 
            case 77: 
            case 78: 
            case 90: 
            case 97: 
            case 104: 
            case 108: 
            case 109: 
            case 0x90: 
            case 0x93: 
            case 0x94: 
            case 150: 
            case 0x9E: 
            case 0x9F: 
            case 0xA0: 
            case 0xA1: {
                arr_object[0] = "descriptor";
                break;
            }
            case 0xA2: {
                arr_object[0] = "declarationDescriptor";
                break;
            }
            case 16: 
            case 17: 
            case 54: 
            case 89: 
            case 91: 
            case 92: 
            case 93: 
            case 94: 
            case 0x5F: 
            case 0x60: 
            case 98: 
            case 100: 
            case 106: 
            case 110: 
            case 0x6F: 
            case 0x70: 
            case 0x72: 
            case 0x73: 
            case 0x74: 
            case 0x75: 
            case 0x76: 
            case 0x77: 
            case 120: 
            case 0x79: 
            case 0x7A: 
            case 0x7B: 
            case 0x7C: 
            case 0x7D: 
            case 0x7E: 
            case 0x7F: 
            case 0x80: 
            case 0x81: 
            case 130: 
            case 0x83: 
            case 0x84: 
            case 0x85: 
            case 0x86: 
            case 0x87: 
            case 0x89: 
            case 0x8A: 
            case 0x8B: 
            case 140: 
            case 0x8D: 
            case 0x8E: 
            case 0x8F: 
            case 0x91: 
            case 0x92: 
            case 0x95: 
            case 0x97: 
            case 0x98: 
            case 0x99: 
            case 0x9A: 
            case 0x9B: 
            case 0x9C: 
            case 0x9D: 
            case 0xA3: {
                arr_object[0] = "type";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "getAdditionalClassPartsProvider";
                break;
            }
            case 4: {
                arr_object[1] = "getPlatformDependentDeclarationFilter";
                break;
            }
            case 5: {
                arr_object[1] = "getClassDescriptorFactories";
                break;
            }
            case 6: {
                arr_object[1] = "getStorageManager";
                break;
            }
            case 7: {
                arr_object[1] = "getBuiltInsModule";
                break;
            }
            case 8: {
                arr_object[1] = "getBuiltInPackagesImportedByDefault";
                break;
            }
            case 11: {
                arr_object[1] = "getBuiltInsPackageScope";
                break;
            }
            case 13: {
                arr_object[1] = "getBuiltInClassByFqName";
                break;
            }
            case 15: {
                arr_object[1] = "getBuiltInClassByName";
                break;
            }
            case 18: {
                arr_object[1] = "getSuspendFunction";
                break;
            }
            case 19: {
                arr_object[1] = "getKFunction";
                break;
            }
            case 20: {
                arr_object[1] = "getKSuspendFunction";
                break;
            }
            case 21: {
                arr_object[1] = "getKClass";
                break;
            }
            case 22: {
                arr_object[1] = "getKType";
                break;
            }
            case 23: {
                arr_object[1] = "getKCallable";
                break;
            }
            case 24: {
                arr_object[1] = "getKProperty";
                break;
            }
            case 25: {
                arr_object[1] = "getKProperty0";
                break;
            }
            case 26: {
                arr_object[1] = "getKProperty1";
                break;
            }
            case 27: {
                arr_object[1] = "getKProperty2";
                break;
            }
            case 28: {
                arr_object[1] = "getKMutableProperty0";
                break;
            }
            case 29: {
                arr_object[1] = "getKMutableProperty1";
                break;
            }
            case 30: {
                arr_object[1] = "getKMutableProperty2";
                break;
            }
            case 0x1F: {
                arr_object[1] = "getIterator";
                break;
            }
            case 0x20: {
                arr_object[1] = "getIterable";
                break;
            }
            case 33: {
                arr_object[1] = "getMutableIterable";
                break;
            }
            case 34: {
                arr_object[1] = "getMutableIterator";
                break;
            }
            case 35: {
                arr_object[1] = "getCollection";
                break;
            }
            case 36: {
                arr_object[1] = "getMutableCollection";
                break;
            }
            case 37: {
                arr_object[1] = "getList";
                break;
            }
            case 38: {
                arr_object[1] = "getMutableList";
                break;
            }
            case 39: {
                arr_object[1] = "getSet";
                break;
            }
            case 40: {
                arr_object[1] = "getMutableSet";
                break;
            }
            case 41: {
                arr_object[1] = "getMap";
                break;
            }
            case 42: {
                arr_object[1] = "getMutableMap";
                break;
            }
            case 43: {
                arr_object[1] = "getMapEntry";
                break;
            }
            case 44: {
                arr_object[1] = "getMutableMapEntry";
                break;
            }
            case 45: {
                arr_object[1] = "getListIterator";
                break;
            }
            case 46: {
                arr_object[1] = "getMutableListIterator";
                break;
            }
            case 0x30: {
                arr_object[1] = "getBuiltInTypeByClassName";
                break;
            }
            case 49: {
                arr_object[1] = "getNothingType";
                break;
            }
            case 50: {
                arr_object[1] = "getNullableNothingType";
                break;
            }
            case 51: {
                arr_object[1] = "getAnyType";
                break;
            }
            case 52: {
                arr_object[1] = "getNullableAnyType";
                break;
            }
            case 53: {
                arr_object[1] = "getDefaultBound";
                break;
            }
            case 55: {
                arr_object[1] = "getPrimitiveKotlinType";
                break;
            }
            case 56: {
                arr_object[1] = "getNumberType";
                break;
            }
            case 57: {
                arr_object[1] = "getByteType";
                break;
            }
            case 58: {
                arr_object[1] = "getShortType";
                break;
            }
            case 59: {
                arr_object[1] = "getIntType";
                break;
            }
            case 60: {
                arr_object[1] = "getLongType";
                break;
            }
            case 61: {
                arr_object[1] = "getFloatType";
                break;
            }
            case 62: {
                arr_object[1] = "getDoubleType";
                break;
            }
            case 0x3F: {
                arr_object[1] = "getCharType";
                break;
            }
            case 0x40: {
                arr_object[1] = "getBooleanType";
                break;
            }
            case 65: {
                arr_object[1] = "getUnitType";
                break;
            }
            case 66: {
                arr_object[1] = "getStringType";
                break;
            }
            case 67: {
                arr_object[1] = "getIterableType";
                break;
            }
            case 69: 
            case 70: 
            case 71: {
                arr_object[1] = "getArrayElementType";
                break;
            }
            case 75: {
                arr_object[1] = "getPrimitiveArrayKotlinType";
                break;
            }
            case 82: 
            case 85: {
                arr_object[1] = "getArrayType";
                break;
            }
            case 87: {
                arr_object[1] = "getEnumType";
                break;
            }
            case 88: {
                arr_object[1] = "getAnnotationType";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
            }
        }
        switch(v) {
            case 1: {
                arr_object[2] = "setBuiltInsModule";
                break;
            }
            case 2: {
                arr_object[2] = "setPostponedBuiltinsModuleComputation";
                break;
            }
            case 9: {
                arr_object[2] = "isBuiltIn";
                break;
            }
            case 10: {
                arr_object[2] = "isUnderKotlinPackage";
                break;
            }
            case 12: {
                arr_object[2] = "getBuiltInClassByFqName";
                break;
            }
            case 14: {
                arr_object[2] = "getBuiltInClassByName";
                break;
            }
            case 16: {
                arr_object[2] = "getPrimitiveClassDescriptor";
                break;
            }
            case 17: {
                arr_object[2] = "getPrimitiveArrayClassDescriptor";
                break;
            }
            case 0x2F: {
                arr_object[2] = "getBuiltInTypeByClassName";
                break;
            }
            case 54: {
                arr_object[2] = "getPrimitiveKotlinType";
                break;
            }
            case 68: {
                arr_object[2] = "getArrayElementType";
                break;
            }
            case 72: 
            case 73: {
                arr_object[2] = "getElementTypeForUnsignedArray";
                break;
            }
            case 74: {
                arr_object[2] = "getPrimitiveArrayKotlinType";
                break;
            }
            case 76: {
                arr_object[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            }
            case 78: {
                arr_object[2] = "getPrimitiveArrayType";
                break;
            }
            case 0x4F: 
            case 80: 
            case 81: 
            case 83: 
            case 84: {
                arr_object[2] = "getArrayType";
                break;
            }
            case 86: {
                arr_object[2] = "getEnumType";
                break;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 67: 
            case 69: 
            case 70: 
            case 71: 
            case 75: 
            case 82: 
            case 85: 
            case 87: 
            case 88: {
                break;
            }
            case 89: {
                arr_object[2] = "isArray";
                break;
            }
            case 90: 
            case 91: {
                arr_object[2] = "isArrayOrPrimitiveArray";
                break;
            }
            case 92: {
                arr_object[2] = "isPrimitiveArray";
                break;
            }
            case 93: {
                arr_object[2] = "getPrimitiveArrayElementType";
                break;
            }
            case 77: 
            case 94: {
                arr_object[2] = "getPrimitiveType";
                break;
            }
            case 0x5F: {
                arr_object[2] = "isPrimitiveType";
                break;
            }
            case 0x60: {
                arr_object[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            }
            case 97: {
                arr_object[2] = "isPrimitiveClass";
                break;
            }
            case 98: 
            case 99: 
            case 100: 
            case 101: {
                arr_object[2] = "isConstructedFromGivenClass";
                break;
            }
            case 102: 
            case 103: {
                arr_object[2] = "isTypeConstructorForGivenClass";
                break;
            }
            case 104: 
            case 105: {
                arr_object[2] = "classFqNameEquals";
                break;
            }
            case 106: 
            case 107: {
                arr_object[2] = "isNotNullConstructedFromGivenClass";
                break;
            }
            case 108: {
                arr_object[2] = "isSpecialClassWithNoSupertypes";
                break;
            }
            case 109: 
            case 110: {
                arr_object[2] = "isAny";
                break;
            }
            case 0x70: {
                arr_object[2] = "isBooleanOrNullableBoolean";
                break;
            }
            case 0x6F: 
            case 0x71: {
                arr_object[2] = "isBoolean";
                break;
            }
            case 0x72: {
                arr_object[2] = "isNumber";
                break;
            }
            case 0x73: {
                arr_object[2] = "isChar";
                break;
            }
            case 0x74: {
                arr_object[2] = "isCharOrNullableChar";
                break;
            }
            case 0x75: {
                arr_object[2] = "isInt";
                break;
            }
            case 0x76: {
                arr_object[2] = "isByte";
                break;
            }
            case 0x77: {
                arr_object[2] = "isLong";
                break;
            }
            case 120: {
                arr_object[2] = "isLongOrNullableLong";
                break;
            }
            case 0x79: {
                arr_object[2] = "isShort";
                break;
            }
            case 0x7A: {
                arr_object[2] = "isFloat";
                break;
            }
            case 0x7B: {
                arr_object[2] = "isFloatOrNullableFloat";
                break;
            }
            case 0x7C: {
                arr_object[2] = "isDouble";
                break;
            }
            case 0x7D: {
                arr_object[2] = "isUByte";
                break;
            }
            case 0x7E: {
                arr_object[2] = "isUShort";
                break;
            }
            case 0x7F: {
                arr_object[2] = "isUInt";
                break;
            }
            case 0x80: {
                arr_object[2] = "isULong";
                break;
            }
            case 0x81: {
                arr_object[2] = "isUByteArray";
                break;
            }
            case 130: {
                arr_object[2] = "isUShortArray";
                break;
            }
            case 0x83: {
                arr_object[2] = "isUIntArray";
                break;
            }
            case 0x84: {
                arr_object[2] = "isULongArray";
                break;
            }
            case 0x85: {
                arr_object[2] = "isUnsignedArrayType";
                break;
            }
            case 0x86: {
                arr_object[2] = "isDoubleOrNullableDouble";
                break;
            }
            case 0x87: 
            case 0x88: {
                arr_object[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            }
            case 0x89: {
                arr_object[2] = "isNothing";
                break;
            }
            case 0x8A: {
                arr_object[2] = "isNullableNothing";
                break;
            }
            case 0x8B: {
                arr_object[2] = "isNothingOrNullableNothing";
                break;
            }
            case 140: {
                arr_object[2] = "isAnyOrNullableAny";
                break;
            }
            case 0x8D: {
                arr_object[2] = "isNullableAny";
                break;
            }
            case 0x8E: {
                arr_object[2] = "isDefaultBound";
                break;
            }
            case 0x8F: {
                arr_object[2] = "isUnit";
                break;
            }
            case 0x90: {
                arr_object[2] = "mayReturnNonUnitValue";
                break;
            }
            case 0x91: {
                arr_object[2] = "isUnitOrNullableUnit";
                break;
            }
            case 0x92: {
                arr_object[2] = "isBooleanOrSubtype";
                break;
            }
            case 0x93: {
                arr_object[2] = "isMemberOfAny";
                break;
            }
            case 0x94: 
            case 0x95: {
                arr_object[2] = "isEnum";
                break;
            }
            case 150: 
            case 0x97: {
                arr_object[2] = "isComparable";
                break;
            }
            case 0x98: {
                arr_object[2] = "isCollectionOrNullableCollection";
                break;
            }
            case 0x99: {
                arr_object[2] = "isListOrNullableList";
                break;
            }
            case 0x9A: {
                arr_object[2] = "isSetOrNullableSet";
                break;
            }
            case 0x9B: {
                arr_object[2] = "isMapOrNullableMap";
                break;
            }
            case 0x9C: {
                arr_object[2] = "isIterableOrNullableIterable";
                break;
            }
            case 0x9D: {
                arr_object[2] = "isThrowableOrNullableThrowable";
                break;
            }
            case 0x9E: {
                arr_object[2] = "isThrowable";
                break;
            }
            case 0x9F: {
                arr_object[2] = "isKClass";
                break;
            }
            case 0xA0: {
                arr_object[2] = "isNonPrimitiveArray";
                break;
            }
            case 0xA1: {
                arr_object[2] = "isCloneable";
                break;
            }
            case 0xA2: {
                arr_object[2] = "isDeprecated";
                break;
            }
            case 0xA3: {
                arr_object[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 67: 
            case 69: 
            case 70: 
            case 71: 
            case 75: 
            case 82: 
            case 85: 
            case 87: 
            case 88: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    public static boolean b(X2.e e0, v3.e e1) {
        if(e0 != null) {
            if(e1 != null) {
                return e0.getName().equals(e1.f()) && e1.equals(d.g(e0));
            }
            h.a(105);
            throw null;
        }
        h.a(104);
        throw null;
    }

    public final void c() {
        j.f(h.e, "moduleName");
        m m0 = this.d;
        A a0 = new A(h.e, m0, this, 0x30);
        this.a = a0;
        U2.c.a.getClass();
        U2.c c0 = (U2.c)((w2.c)U2.b.b).getValue();
        A a1 = this.a;
        Iterable iterable0 = this.l();
        Z2.d d0 = this.p();
        Z2.b b0 = this.d();
        ((J3.b)c0).getClass();
        j.f(a1, "builtInsModule");
        j.f(iterable0, "classDescriptorFactories");
        j.f(d0, "platformDependentDeclarationFilter");
        j.f(b0, "additionalClassPartsProvider");
        j.f(n.q, "packageFqNames");
        ArrayList arrayList0 = new ArrayList(k.E(n.q));
        for(Object object0: n.q) {
            a.m.getClass();
            String s = a.a(((v3.c)object0));
            j.f(s, "p0");
            InputStream inputStream0 = J3.d.c(s);
            if(inputStream0 == null) {
                throw new IllegalStateException("Resource not found in classpath: " + s);
            }
            arrayList0.add(a0.k(((v3.c)object0), m0, a1, inputStream0));
        }
        H h0 = new H(arrayList0);
        g g0 = new g(m0, a1);
        b b1 = new b(h0, 3);
        B.c c1 = new B.c(a1, g0, a.m);
        J3.d d1 = new J3.d(m0);
        I3.i i0 = new I3.i(m0, a1, b1, c1, h0, iterable0, g0, b0, d0, a.m.a, null, d1, 0xD0000);
        for(Object object1: arrayList0) {
            ((J3.c)object1).N0(i0);
        }
        a0.p = h0;
        A a2 = this.a;
        a2.getClass();
        a2.o = new b(x2.g.Q(new A[]{a2}), 12);
    }

    public Z2.b d() {
        return Z2.a.b;
    }

    public final M3.A e() {
        M3.A a0 = this.j("Any").k();
        if(a0 != null) {
            return a0;
        }
        h.a(51);
        throw null;
    }

    public final w f(w w0) {
        w w1 = null;
        if(w0 != null) {
            if(h.y(w0)) {
                if(w0.A0().size() != 1) {
                    throw new IllegalStateException();
                }
                w w2 = ((N)w0.A0().get(0)).b();
                if(w2 != null) {
                    return w2;
                }
                h.a(69);
                throw null;
            }
            Z z0 = X.g(w0, false);
            w w3 = (w)((U2.g)this.b.invoke()).b.get(z0);
            if(w3 != null) {
                return w3;
            }
            X2.h h0 = z0.H0().q();
            X2.A a0 = h0 == null ? null : d.e(h0);
            if(a0 != null) {
                X2.h h1 = z0.H0().q();
                if(h1 != null) {
                    f f0 = h1.getName();
                    j.f(f0, "name");
                    if(r.d.contains(f0)) {
                        v3.b b0 = C3.e.f(h1);
                        if(b0 != null) {
                            v3.b b1 = (v3.b)r.b.get(b0);
                            if(b1 != null) {
                                X2.e e0 = X2.w.d(a0, b1);
                                if(e0 != null) {
                                    w1 = e0.k();
                                }
                            }
                        }
                    }
                }
                if(w1 != null) {
                    return w1;
                }
            }
            throw new IllegalStateException("not array: " + w0);
        }
        h.a(68);
        throw null;
    }

    public final M3.A g(Z z0) {
        M3.a0 a00 = M3.a0.k;
        if(z0 != null) {
            return this.h(a00, z0, Y2.g.a);
        }
        h.a(84);
        throw null;
    }

    public final M3.A h(M3.a0 a00, w w0, Y2.h h0) {
        if(w0 != null) {
            List list0 = Collections.singletonList(new M3.F(w0, a00));
            return M3.d.q(M3.c.w(h0), this.j("Array"), list0);
        }
        h.a(80);
        throw null;
    }

    public final X2.e i(v3.c c0) {
        if(c0 != null) {
            X2.e e0 = X2.w.j(this.k(), c0);
            if(e0 != null) {
                return e0;
            }
            h.a(13);
            throw null;
        }
        h.a(12);
        throw null;
    }

    public final X2.e j(String s) {
        if(s != null) {
            f f0 = f.e(s);
            return (X2.e)this.c.b(f0);
        }
        h.a(14);
        throw null;
    }

    public final A k() {
        this.a.getClass();
        A a0 = this.a;
        if(a0 != null) {
            return a0;
        }
        h.a(7);
        throw null;
    }

    public Iterable l() {
        A a0 = this.k();
        Iterable iterable0 = Collections.singletonList(new V2.a(this.d, a0));
        if(iterable0 != null) {
            return iterable0;
        }
        h.a(5);
        throw null;
    }

    public final M3.A m() {
        M3.A a0 = this.o();
        if(a0 != null) {
            return a0;
        }
        h.a(53);
        throw null;
    }

    public final M3.A n() {
        M3.A a0 = this.j("Nothing").k();
        if(a0 != null) {
            return a0;
        }
        h.a(49);
        throw null;
    }

    public final M3.A o() {
        M3.A a0 = this.e().O0(true);
        if(a0 != null) {
            return a0;
        }
        h.a(52);
        throw null;
    }

    public Z2.d p() {
        return Z2.a.d;
    }

    public final M3.A q(U2.j j0) {
        if(j0 != null) {
            M3.A a0 = (M3.A)((U2.g)this.b.invoke()).a.get(j0);
            if(a0 != null) {
                return a0;
            }
            h.a(75);
            throw null;
        }
        h.a(74);
        throw null;
    }

    public static U2.j r(X2.h h0) {
        if(h0 != null) {
            f f0 = h0.getName();
            if(U2.m.a0.contains(f0)) {
                v3.e e0 = d.g(h0);
                return (U2.j)U2.m.c0.get(e0);
            }
            return null;
        }
        h.a(78);
        throw null;
    }

    public final M3.A s(U2.j j0) {
        if(j0 != null) {
            M3.A a0 = this.j(j0.i.b()).k();
            if(a0 != null) {
                return a0;
            }
            h.a(55);
            throw null;
        }
        h.a(54);
        throw null;
    }

    public static U2.j t(X2.e e0) {
        if(e0 != null) {
            f f0 = e0.getName();
            if(U2.m.Z.contains(f0)) {
                v3.e e1 = d.g(e0);
                return (U2.j)U2.m.b0.get(e1);
            }
            return null;
        }
        h.a(77);
        throw null;
    }

    public final M3.A u() {
        M3.A a0 = this.j("String").k();
        if(a0 != null) {
            return a0;
        }
        h.a(66);
        throw null;
    }

    public final X2.e v(int v) {
        f f0 = f.e((V2.j.c.b + v));
        return this.i(n.f.c(f0));
    }

    public final M3.A w() {
        M3.A a0 = this.j("Unit").k();
        if(a0 != null) {
            return a0;
        }
        h.a(65);
        throw null;
    }

    public static boolean x(w w0) {
        if(w0 != null) {
            return h.A(w0, U2.m.a);
        }
        h.a(140);
        throw null;
    }

    public static boolean y(w w0) {
        if(w0 != null) {
            return h.A(w0, U2.m.g);
        }
        h.a(89);
        throw null;
    }

    public static boolean z(X2.k k0) {
        if(k0 != null) {
            return d.j(k0, J3.c.class, false) != null;
        }
        h.a(9);
        throw null;
    }
}

