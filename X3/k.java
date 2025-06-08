package x3;

import J2.m;
import J2.r;
import O2.q;
import java.util.Set;
import x2.t;

public final class k implements i {
    public final j A;
    public final j B;
    public final j C;
    public final j D;
    public final j E;
    public final j F;
    public final j G;
    public final j H;
    public final j I;
    public final j J;
    public final j K;
    public final j L;
    public final j M;
    public final j N;
    public final j O;
    public final j P;
    public final j Q;
    public final j R;
    public final j S;
    public final j T;
    public final j U;
    public final j V;
    public final j W;
    public static final q[] X;
    public boolean a;
    public final j b;
    public final j c;
    public final j d;
    public final j e;
    public final j f;
    public final j g;
    public final j h;
    public final j i;
    public final j j;
    public final j k;
    public final j l;
    public final j m;
    public final j n;
    public final j o;
    public final j p;
    public final j q;
    public final j r;
    public final j s;
    public final j t;
    public final j u;
    public final j v;
    public final j w;
    public final j x;
    public final j y;
    public final j z;

    static {
        k.X = new q[]{r.a.d(new m(r.a.b(k.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), r.a.d(new m(r.a.b(k.class), "withDefinedIn", "getWithDefinedIn()Z")), r.a.d(new m(r.a.b(k.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), r.a.d(new m(r.a.b(k.class), "modifiers", "getModifiers()Ljava/util/Set;")), r.a.d(new m(r.a.b(k.class), "startFromName", "getStartFromName()Z")), r.a.d(new m(r.a.b(k.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), r.a.d(new m(r.a.b(k.class), "debugMode", "getDebugMode()Z")), r.a.d(new m(r.a.b(k.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), r.a.d(new m(r.a.b(k.class), "verbose", "getVerbose()Z")), r.a.d(new m(r.a.b(k.class), "unitReturnType", "getUnitReturnType()Z")), r.a.d(new m(r.a.b(k.class), "withoutReturnType", "getWithoutReturnType()Z")), r.a.d(new m(r.a.b(k.class), "enhancedTypes", "getEnhancedTypes()Z")), r.a.d(new m(r.a.b(k.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), r.a.d(new m(r.a.b(k.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), r.a.d(new m(r.a.b(k.class), "renderDefaultModality", "getRenderDefaultModality()Z")), r.a.d(new m(r.a.b(k.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), r.a.d(new m(r.a.b(k.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), r.a.d(new m(r.a.b(k.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), r.a.d(new m(r.a.b(k.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), r.a.d(new m(r.a.b(k.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), r.a.d(new m(r.a.b(k.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), r.a.d(new m(r.a.b(k.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), r.a.d(new m(r.a.b(k.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), r.a.d(new m(r.a.b(k.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), r.a.d(new m(r.a.b(k.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), r.a.d(new m(r.a.b(k.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), r.a.d(new m(r.a.b(k.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), r.a.d(new m(r.a.b(k.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), r.a.d(new m(r.a.b(k.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), r.a.d(new m(r.a.b(k.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), r.a.d(new m(r.a.b(k.class), "receiverAfterName", "getReceiverAfterName()Z")), r.a.d(new m(r.a.b(k.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), r.a.d(new m(r.a.b(k.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), r.a.d(new m(r.a.b(k.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), r.a.d(new m(r.a.b(k.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), r.a.d(new m(r.a.b(k.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), r.a.d(new m(r.a.b(k.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), r.a.d(new m(r.a.b(k.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), r.a.d(new m(r.a.b(k.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), r.a.d(new m(r.a.b(k.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), r.a.d(new m(r.a.b(k.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), r.a.d(new m(r.a.b(k.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), r.a.d(new m(r.a.b(k.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), r.a.d(new m(r.a.b(k.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), r.a.d(new m(r.a.b(k.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), r.a.d(new m(r.a.b(k.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), r.a.d(new m(r.a.b(k.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), r.a.d(new m(r.a.b(k.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), r.a.d(new m(r.a.b(k.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public k() {
        this.b = new j(b.d, this);
        this.c = new j(Boolean.TRUE, this);
        this.d = new j(Boolean.TRUE, this);
        this.e = new j(h.j, this);
        this.f = new j(Boolean.FALSE, this);
        this.g = new j(Boolean.FALSE, this);
        this.h = new j(Boolean.FALSE, this);
        this.i = new j(Boolean.FALSE, this);
        this.j = new j(Boolean.FALSE, this);
        this.k = new j(Boolean.TRUE, this);
        this.l = new j(Boolean.FALSE, this);
        this.m = new j(Boolean.FALSE, this);
        this.n = new j(Boolean.FALSE, this);
        this.o = new j(Boolean.TRUE, this);
        this.p = new j(Boolean.TRUE, this);
        this.q = new j(Boolean.FALSE, this);
        this.r = new j(Boolean.FALSE, this);
        this.s = new j(Boolean.FALSE, this);
        this.t = new j(Boolean.FALSE, this);
        this.u = new j(Boolean.FALSE, this);
        this.v = new j(null, this);
        this.w = new j(Boolean.FALSE, this);
        this.x = new j(Boolean.FALSE, this);
        this.y = new j(d.w, this);
        this.z = new j(d.v, this);
        this.A = new j(Boolean.TRUE, this);
        this.B = new j(n.j, this);
        this.C = new j(e.a, this);
        this.D = new j(s.i, this);
        this.E = new j(o.i, this);
        this.F = new j(Boolean.FALSE, this);
        this.G = new j(Boolean.FALSE, this);
        this.H = new j(p.i, this);
        this.I = new j(Boolean.FALSE, this);
        this.J = new j(Boolean.FALSE, this);
        this.K = new j(t.i, this);
        this.L = new j(l.a, this);
        this.M = new j(null, this);
        this.N = new j(a.k, this);
        this.O = new j(Boolean.FALSE, this);
        this.P = new j(Boolean.TRUE, this);
        this.Q = new j(Boolean.TRUE, this);
        this.R = new j(Boolean.FALSE, this);
        this.S = new j(Boolean.TRUE, this);
        this.T = new j(Boolean.TRUE, this);
        this.U = new j(Boolean.FALSE, this);
        this.V = new j(Boolean.FALSE, this);
        this.W = new j(Boolean.TRUE, this);
    }

    @Override  // x3.i
    public final void a() {
        this.F.b(k.X[30], Boolean.TRUE);
    }

    @Override  // x3.i
    public final void b() {
        this.h.b(k.X[6], Boolean.TRUE);
    }

    @Override  // x3.i
    public final void c(c c0) {
        this.b.b(k.X[0], c0);
    }

    @Override  // x3.i
    public final void d() {
        this.G.b(k.X[0x1F], Boolean.TRUE);
    }

    @Override  // x3.i
    public final void e(o o0) {
        this.E.b(k.X[29], o0);
    }

    @Override  // x3.i
    public final void f(Set set0) {
        J2.j.f(set0, "<set-?>");
        this.e.b(k.X[3], set0);
    }

    @Override  // x3.i
    public final void g() {
        this.f.b(k.X[4], Boolean.TRUE);
    }

    @Override  // x3.i
    public final void h() {
        this.c.b(k.X[1], Boolean.FALSE);
    }

    @Override  // x3.i
    public final void i() {
        this.w.b(k.X[21], Boolean.TRUE);
    }

    @Override  // x3.i
    public final void j() {
        this.D.b(k.X[28], s.j);
    }

    @Override  // x3.i
    public final void k() {
        this.x.b(k.X[22], Boolean.TRUE);
    }

    public final boolean l() {
        return ((Boolean)this.h.a(k.X[6], this)).booleanValue();
    }

    public final Set m() {
        return (Set)this.L.a(k.X[36], this);
    }
}

