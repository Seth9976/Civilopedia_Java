package x;

import android.graphics.Path;
import android.util.Log;

public final class c {
    public char a;
    public float[] b;

    public static void a(Path path0, float f, float f1, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z1) {
        double f27;
        double f26;
        double f7 = Math.toRadians(f6);
        double f8 = Math.cos(f7);
        double f9 = Math.sin(f7);
        double f10 = (double)f;
        double f11 = (((double)f1) * f9 + ((double)f) * f8) / ((double)f4);
        double f12 = (((double)f1) * f8 + ((double)(-f)) * f9) / ((double)f5);
        double f13 = (double)f1;
        double f14 = (((double)f3) * f9 + ((double)f2) * f8) / ((double)f4);
        double f15 = (((double)f3) * f8 + ((double)(-f2)) * f9) / ((double)f5);
        double f16 = f11 - f14;
        double f17 = f12 - f15;
        double f18 = (f11 + f14) / 2.0;
        double f19 = (f12 + f15) / 2.0;
        double f20 = f17 * f17 + f16 * f16;
        if(f20 == 0.0) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double f21 = 1.0 / f20 - 0.25;
        if(f21 < 0.0) {
            Log.w("PathParser", "Points are too far apart " + f20);
            double f22 = Math.sqrt(f20);
            c.a(path0, f, f1, f2, f3, f4 * ((float)(f22 / 1.99999)), f5 * ((float)(f22 / 1.99999)), f6, z, z1);
            return;
        }
        double f23 = Math.sqrt(f21);
        double f24 = f16 * f23;
        double f25 = f23 * f17;
        if(z == z1) {
            f26 = f18 - f25;
            f27 = f19 + f24;
        }
        else {
            f26 = f18 + f25;
            f27 = f19 - f24;
        }
        double f28 = Math.atan2(f12 - f27, f11 - f26);
        double f29 = Math.atan2(f15 - f27, f14 - f26) - f28;
        int v = 0;
        int v1 = Double.compare(f29, 0.0);
        if(z1 != v1 >= 0) {
            f29 = v1 <= 0 ? f29 + 6.283185 : f29 - 6.283185;
        }
        double f30 = f26 * ((double)f4);
        double f31 = f27 * ((double)f5);
        int v2 = (int)Math.ceil(Math.abs(f29 * 4.0 / 3.141593));
        double f32 = Math.cos(f7);
        double f33 = Math.sin(f7);
        double f34 = Math.cos(f28);
        double f35 = Math.sin(f28);
        double f36 = -((double)f4) * f32;
        double f37 = ((double)f5) * f33;
        double f38 = f36 * f35 - f37 * f34;
        double f39 = -((double)f4) * f33;
        double f40 = ((double)f5) * f32;
        double f41 = f34 * f40 + f35 * f39;
        double f42 = f28;
        while(v < v2) {
            double f43 = f42 + f29 / ((double)v2);
            double f44 = Math.sin(f43);
            double f45 = Math.cos(f43);
            double f46 = ((double)f4) * f32 * f45 + (f30 * f8 - f31 * f9) - f37 * f44;
            double f47 = f40 * f44 + (((double)f4) * f33 * f45 + (f31 * f8 + f30 * f9));
            double f48 = f36 * f44 - f37 * f45;
            double f49 = f45 * f40 + f44 * f39;
            double f50 = f43 - f42;
            double f51 = Math.tan(f50 / 2.0);
            double f52 = (Math.sqrt(f51 * 3.0 * f51 + 4.0) - 1.0) * Math.sin(f50) / 3.0;
            path0.rLineTo(0.0f, 0.0f);
            path0.cubicTo(((float)(f38 * f52 + f10)), ((float)(f41 * f52 + f13)), ((float)(f46 - f52 * f48)), ((float)(f47 - f52 * f49)), ((float)f46), ((float)f47));
            ++v;
            f42 = f43;
            f41 = f49;
            f38 = f48;
            f10 = f46;
            f13 = f47;
        }
    }

    public static void b(c[] arr_c, Path path0) {
        int v5;
        float f32;
        float f31;
        float f30;
        float f29;
        float f23;
        float f22;
        float f21;
        float f20;
        float f17;
        float f16;
        int v7;
        int v6;
        float[] arr_f1;
        int v3;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int v = 109;
        int v1 = 0;
        while(v1 < arr_c.length) {
            c c0 = arr_c[v1];
            int v2 = c0.a;
            float[] arr_f = c0.b;
            float f6 = f;
            float f7 = f1;
            float f8 = f2;
            float f9 = f3;
            switch(v2) {
                case 65: 
                case 97: {
                    v3 = 7;
                    break;
                }
                case 67: 
                case 99: {
                    v3 = 6;
                    break;
                }
                case 81: 
                case 83: 
                case 0x71: 
                case 0x73: {
                    v3 = 4;
                    break;
                }
                case 72: 
                case 86: 
                case 104: 
                case 0x76: {
                    v3 = 1;
                    break;
                }
                case 90: 
                case 0x7A: {
                    path0.close();
                    path0.moveTo(f4, f5);
                    f6 = f4;
                    f8 = f6;
                    f7 = f5;
                    f9 = f7;
                    v3 = 2;
                    break;
                }
                default: {
                    v3 = 2;
                }
            }
            float f10 = f4;
            float f11 = f5;
            float f12 = f6;
            float f13 = f7;
            int v4 = 0;
            while(v4 < arr_f.length) {
                switch(v2) {
                    case 65: {
                        v5 = v4;
                        arr_f1 = arr_f;
                        v6 = 65;
                        v7 = v1;
                        c.a(path0, f12, f13, arr_f1[v5 + 5], arr_f1[v5 + 6], arr_f1[v5], arr_f1[v5 + 1], arr_f1[v5 + 2], arr_f1[v5 + 3] != 0.0f, arr_f1[v5 + 4] != 0.0f);
                        f12 = arr_f1[v5 + 5];
                        f13 = arr_f1[v5 + 6];
                        f9 = f13;
                        f8 = f12;
                        break;
                    }
                    case 67: {
                        v5 = v4;
                        arr_f1 = arr_f;
                        v6 = 67;
                        v7 = v1;
                        path0.cubicTo(arr_f1[v5], arr_f1[v5 + 1], arr_f1[v5 + 2], arr_f1[v5 + 3], arr_f1[v5 + 4], arr_f1[v5 + 5]);
                        f12 = arr_f1[v5 + 4];
                        f13 = arr_f1[v5 + 5];
                        f8 = arr_f1[v5 + 2];
                        f9 = arr_f1[v5 + 3];
                        break;
                    }
                    case 72: {
                        v5 = v4;
                        arr_f1 = arr_f;
                        v6 = 72;
                        v7 = v1;
                        path0.lineTo(arr_f1[v5], f13);
                        f12 = arr_f1[v5];
                        break;
                    }
                    case 76: {
                        v5 = v4;
                        path0.lineTo(arr_f[v5], arr_f[v5 + 1]);
                        f12 = arr_f[v5];
                        f13 = arr_f[v5 + 1];
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        break;
                    }
                    case 77: {
                        v5 = v4;
                        f12 = arr_f[v5];
                        f13 = arr_f[v5 + 1];
                        if(v5 > 0) {
                            path0.lineTo(f12, f13);
                        }
                        else {
                            path0.moveTo(f12, f13);
                            f11 = f13;
                            f10 = f12;
                        }
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        break;
                    }
                    case 81: {
                        v5 = v4;
                        arr_f1 = arr_f;
                        v6 = 81;
                        v7 = v1;
                        path0.quadTo(arr_f1[v5], arr_f1[v5 + 1], arr_f1[v5 + 2], arr_f1[v5 + 3]);
                        float f14 = arr_f1[v5];
                        float f15 = arr_f1[v5 + 1];
                        f12 = arr_f1[v5 + 2];
                        f13 = arr_f1[v5 + 3];
                        f8 = f14;
                        f9 = f15;
                        break;
                    }
                    case 83: {
                        v5 = v4;
                        if(v == 99 || v == 0x73 || v == 67 || v == 83) {
                            f17 = f13 * 2.0f - f9;
                            f16 = f12 * 2.0f - f8;
                        }
                        else {
                            f16 = f12;
                            f17 = f13;
                        }
                        path0.cubicTo(f16, f17, arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3]);
                        float f18 = arr_f[v5];
                        float f19 = arr_f[v5 + 1];
                        f12 = arr_f[v5 + 2];
                        f13 = arr_f[v5 + 3];
                        f9 = f19;
                        f8 = f18;
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        break;
                    }
                    case 84: {
                        v5 = v4;
                        if(v == 0x71 || v == 0x74 || v == 81 || v == 84) {
                            f20 = f12 * 2.0f - f8;
                            f21 = f13 * 2.0f - f9;
                        }
                        else {
                            f20 = f12;
                            f21 = f13;
                        }
                        path0.quadTo(f20, f21, arr_f[v5], arr_f[v5 + 1]);
                        f22 = arr_f[v5];
                        f23 = arr_f[v5 + 1];
                        goto label_193;
                    }
                    case 86: {
                        v5 = v4;
                        arr_f1 = arr_f;
                        v6 = 86;
                        v7 = v1;
                        path0.lineTo(f12, arr_f1[v5]);
                        f13 = arr_f1[v5];
                        break;
                    }
                    case 97: {
                        v5 = v4;
                        arr_f1 = arr_f;
                        v6 = 97;
                        v7 = v1;
                        c.a(path0, f12, f13, arr_f[v5 + 5] + f12, arr_f[v5 + 6] + f13, arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3] != 0.0f, arr_f[v5 + 4] != 0.0f);
                        f12 += arr_f1[v5 + 5];
                        f13 += arr_f1[v5 + 6];
                        f9 = f13;
                        f8 = f12;
                        break;
                    }
                    case 99: {
                        v5 = v4;
                        path0.rCubicTo(arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3], arr_f[v5 + 4], arr_f[v5 + 5]);
                        f20 = f12 + arr_f[v5 + 2];
                        f21 = f13 + arr_f[v5 + 3];
                        f22 = f12 + arr_f[v5 + 4];
                        f23 = arr_f[v5 + 5] + f13;
                        goto label_193;
                    }
                    case 104: {
                        v5 = v4;
                        path0.rLineTo(arr_f[v5], 0.0f);
                        f12 += arr_f[v5];
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        break;
                    }
                    case 108: {
                        v5 = v4;
                        path0.rLineTo(arr_f[v5], arr_f[v5 + 1]);
                        f12 += arr_f[v5];
                        f13 += arr_f[v5 + 1];
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        break;
                    }
                    case 109: {
                        v5 = v4;
                        float f24 = arr_f[v5];
                        f12 += f24;
                        float f25 = arr_f[v5 + 1];
                        f13 += f25;
                        if(v5 > 0) {
                            path0.rLineTo(f24, f25);
                        }
                        else {
                            path0.rMoveTo(f24, f25);
                            f11 = f13;
                            f10 = f12;
                        }
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        break;
                    }
                    case 0x71: {
                        v5 = v4;
                        path0.rQuadTo(arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3]);
                        float f26 = f12 + arr_f[v5];
                        float f27 = arr_f[v5 + 1] + f13;
                        float f28 = f12 + arr_f[v5 + 2];
                        f13 += arr_f[v5 + 3];
                        f9 = f27;
                        f8 = f26;
                        arr_f1 = arr_f;
                        v6 = 0x71;
                        v7 = v1;
                        f12 = f28;
                        break;
                    }
                    case 0x73: {
                        if(v == 99 || v == 0x73 || v == 67 || v == 83) {
                            f30 = f13 - f9;
                            f29 = f12 - f8;
                        }
                        else {
                            f29 = 0.0f;
                            f30 = 0.0f;
                        }
                        v5 = v4;
                        path0.rCubicTo(f29, f30, arr_f[v4], arr_f[v4 + 1], arr_f[v4 + 2], arr_f[v4 + 3]);
                        f20 = f12 + arr_f[v5];
                        f21 = f13 + arr_f[v4 + 1];
                        f22 = f12 + arr_f[v4 + 2];
                        f23 = arr_f[v4 + 3] + f13;
                    label_193:
                        f9 = f21;
                        f8 = f20;
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        f12 = f22;
                        f13 = f23;
                        break;
                    }
                    case 0x74: {
                        if(v == 0x71 || v == 0x74 || v == 81 || v == 84) {
                            f32 = f12 - f8;
                            f31 = f13 - f9;
                        }
                        else {
                            f31 = 0.0f;
                            f32 = 0.0f;
                        }
                        path0.rQuadTo(f32, f31, arr_f[v4], arr_f[v4 + 1]);
                        float f33 = f32 + f12;
                        float f34 = f31 + f13;
                        f12 += arr_f[v4];
                        f13 += arr_f[v4 + 1];
                        f9 = f34;
                        v5 = v4;
                        arr_f1 = arr_f;
                        v6 = 0x74;
                        v7 = v1;
                        f8 = f33;
                        break;
                    }
                    case 0x76: {
                        v5 = v4;
                        path0.rLineTo(0.0f, arr_f[v5]);
                        f13 += arr_f[v5];
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        break;
                    }
                    default: {
                        v5 = v4;
                        arr_f1 = arr_f;
                        v6 = v2;
                        v7 = v1;
                        break;
                    }
                }
                v4 = v5 + v3;
                v = v6;
                v2 = v;
                arr_f = arr_f1;
                v1 = v7;
            }
            f = f12;
            f1 = f13;
            f2 = f8;
            f3 = f9;
            f4 = f10;
            f5 = f11;
            int v8 = arr_c[v1].a;
            ++v1;
            v = v8;
        }
    }
}

