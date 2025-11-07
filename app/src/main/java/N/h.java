package N;

import D.C0042x;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.AbstractC0624h4;
import x1.X;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: n  reason: collision with root package name */
    public static final String f900n;

    /* renamed from: o  reason: collision with root package name */
    public static final String f901o;

    /* renamed from: p  reason: collision with root package name */
    public static final String f902p;

    /* renamed from: q  reason: collision with root package name */
    public static final String f903q;

    /* renamed from: r  reason: collision with root package name */
    public static final FloatBuffer f904r;

    /* renamed from: s  reason: collision with root package name */
    public static final FloatBuffer f905s;

    /* renamed from: t  reason: collision with root package name */
    public static final b f906t;

    /* renamed from: c  reason: collision with root package name */
    public Thread f909c;

    /* renamed from: f  reason: collision with root package name */
    public EGLConfig f912f;

    /* renamed from: h  reason: collision with root package name */
    public Surface f913h;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f907a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f908b = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public EGLDisplay f910d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e  reason: collision with root package name */
    public EGLContext f911e = EGL14.EGL_NO_CONTEXT;
    public EGLSurface g = EGL14.EGL_NO_SURFACE;

    /* renamed from: i  reason: collision with root package name */
    public int f914i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f915j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f916k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f917l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f918m = -1;

    static {
        Locale locale = Locale.US;
        f900n = "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f901o = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f902p = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        f903q = "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}";
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f904r = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        f905s = asFloatBuffer2;
        f906t = new b(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    public static void e(String str, int r3) {
        if (r3 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static EGLSurface j(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static int n(String str, int r5) {
        int glCreateShader = GLES20.glCreateShader(r5);
        b("glCreateShader type=" + r5);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] r12 = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, r12, 0);
        if (r12[0] != 0) {
            return glCreateShader;
        }
        X.g("OpenGlRenderer", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + r5 + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public final void c() {
        boolean z3;
        if (this.f909c == Thread.currentThread()) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("Method call must be called on the GL thread.", z3);
    }

    public final void d(boolean z3) {
        boolean z4;
        String str;
        if (z3 == this.f907a.get()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        AbstractC0624h4.f(str, z4);
    }

    public final void f(C0042x c0042x) {
        int r11;
        int r13;
        int r19;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f910d = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int r22 = 2;
            int[] r3 = new int[2];
            if (EGL14.eglInitialize(this.f910d, r3, 0, r3, 1)) {
                if (c0042x.a()) {
                    r11 = 10;
                } else {
                    r11 = 8;
                }
                if (c0042x.a()) {
                    r13 = 2;
                } else {
                    r13 = 8;
                }
                if (c0042x.a()) {
                    r19 = 64;
                } else {
                    r19 = 4;
                }
                int r7 = r11;
                int r9 = r11;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f910d, new int[]{12324, r7, 12323, r9, 12322, r11, 12321, r13, 12325, 0, 12326, 0, 12352, r19, 12610, !c0042x.a(), 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (c0042x.a()) {
                        r22 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f910d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, r22, 12344}, 0);
                    a("eglCreateContext");
                    this.f912f = eGLConfig;
                    this.f911e = eglCreateContext;
                    int[] r32 = new int[1];
                    EGL14.eglQueryContext(this.f910d, eglCreateContext, 12440, r32, 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + r32[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f910d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(D.C0042x r10) {
        /*
            r9 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r2 = -1
            boolean r3 = r10.a()     // Catch: java.lang.IllegalArgumentException -> Le java.lang.IllegalStateException -> L14
            if (r3 == 0) goto L16
            java.lang.String r3 = N.h.f901o     // Catch: java.lang.IllegalArgumentException -> Le java.lang.IllegalStateException -> L14
            goto L18
        Le:
            r10 = move-exception
        Lf:
            r0 = -1
            r3 = -1
        L11:
            r4 = -1
            goto L81
        L14:
            r10 = move-exception
            goto Lf
        L16:
            java.lang.String r3 = N.h.f900n     // Catch: java.lang.IllegalArgumentException -> Le java.lang.IllegalStateException -> L14
        L18:
            r4 = 35633(0x8b31, float:4.9932E-41)
            int r3 = n(r3, r4)     // Catch: java.lang.IllegalArgumentException -> Le java.lang.IllegalStateException -> L14
            boolean r10 = r10.a()     // Catch: java.lang.IllegalArgumentException -> L7c java.lang.IllegalStateException -> L7f
            if (r10 == 0) goto L28
            java.lang.String r10 = N.h.f903q     // Catch: java.lang.IllegalArgumentException -> L7c java.lang.IllegalStateException -> L7f
            goto L2a
        L28:
            java.lang.String r10 = N.h.f902p     // Catch: java.lang.IllegalArgumentException -> L7c java.lang.IllegalStateException -> L7f
        L2a:
            r4 = 35632(0x8b30, float:4.9931E-41)
            int r10 = n(r10, r4)     // Catch: java.lang.IllegalArgumentException -> L7c java.lang.IllegalStateException -> L7f
            int r4 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L77 java.lang.IllegalStateException -> L7a
            java.lang.String r5 = "glCreateProgram"
            b(r5)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            android.opengl.GLES20.glAttachShader(r4, r3)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            b(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            android.opengl.GLES20.glAttachShader(r4, r10)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            b(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            android.opengl.GLES20.glLinkProgram(r4)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            r0 = 1
            int[] r5 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            r6 = 35714(0x8b82, float:5.0046E-41)
            r7 = 0
            android.opengl.GLES20.glGetProgramiv(r4, r6, r5, r7)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            r5 = r5[r7]     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            if (r5 != r0) goto L61
            r9.f915j = r4     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            return
        L5a:
            r0 = move-exception
        L5b:
            r8 = r0
            r0 = r10
            r10 = r8
            goto L81
        L5f:
            r0 = move-exception
            goto L5b
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            r5.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r4)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            r5.append(r1)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            java.lang.String r1 = r5.toString()     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
            throw r0     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.IllegalStateException -> L5f
        L77:
            r0 = move-exception
        L78:
            r4 = -1
            goto L5b
        L7a:
            r0 = move-exception
            goto L78
        L7c:
            r10 = move-exception
        L7d:
            r0 = -1
            goto L11
        L7f:
            r10 = move-exception
            goto L7d
        L81:
            if (r3 == r2) goto L86
            android.opengl.GLES20.glDeleteShader(r3)
        L86:
            if (r0 == r2) goto L8b
            android.opengl.GLES20.glDeleteShader(r0)
        L8b:
            if (r4 == r2) goto L90
            android.opengl.GLES20.glDeleteProgram(r4)
        L90:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: N.h.g(D.x):void");
    }

    public final void h() {
        EGLDisplay eGLDisplay = this.f910d;
        EGLConfig eGLConfig = this.f912f;
        Objects.requireNonNull(eGLConfig);
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.g = eglCreatePbufferSurface;
            return;
        }
        throw new IllegalStateException("surface was null");
    }

    public final void i() {
        int[] r12 = new int[1];
        GLES20.glGenTextures(1, r12, 0);
        b("glGenTextures");
        int r02 = r12[0];
        GLES20.glBindTexture(36197, r02);
        b("glBindTexture " + r02);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        this.f914i = r02;
    }

    public final String k(C0042x c0042x) {
        String str = "";
        d(false);
        try {
            f(c0042x);
            h();
            o(this.g);
            String glGetString = GLES20.glGetString(7939);
            if (glGetString != null) {
                str = glGetString;
            }
            return str;
        } catch (IllegalStateException e4) {
            X.h("OpenGlRenderer", "Failed to get GL extensions: " + e4.getMessage(), e4);
            return "";
        } finally {
            p();
        }
    }

    public final void l(C0042x c0042x) {
        d(false);
        try {
            if (c0042x.a() && !k(c0042x).contains("GL_EXT_YUV_target")) {
                Log.w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                c0042x = C0042x.f480d;
            }
            f(c0042x);
            h();
            o(this.g);
            g(c0042x);
            m();
            i();
            s();
            this.f909c = Thread.currentThread();
            this.f907a.set(true);
        } catch (IllegalArgumentException e4) {
            e = e4;
            p();
            throw e;
        } catch (IllegalStateException e5) {
            e = e5;
            p();
            throw e;
        }
    }

    public final void m() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f915j, "aPosition");
        this.f917l = glGetAttribLocation;
        e("aPosition", glGetAttribLocation);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f915j, "aTextureCoord");
        this.f918m = glGetAttribLocation2;
        e("aTextureCoord", glGetAttribLocation2);
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f915j, "uTexMatrix");
        this.f916k = glGetUniformLocation;
        e("uTexMatrix", glGetUniformLocation);
    }

    public final void o(EGLSurface eGLSurface) {
        this.f910d.getClass();
        this.f911e.getClass();
        if (EGL14.eglMakeCurrent(this.f910d, eGLSurface, eGLSurface, this.f911e)) {
            return;
        }
        throw new IllegalStateException("eglMakeCurrent failed");
    }

    public final void p() {
        int r02 = this.f915j;
        if (r02 != -1) {
            GLES20.glDeleteProgram(r02);
            this.f915j = -1;
        }
        if (!Objects.equals(this.f910d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f910d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = this.f908b;
            for (b bVar : hashMap.values()) {
                if (!Objects.equals(bVar.f872a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f910d, bVar.f872a)) {
                    try {
                        a("eglDestroySurface");
                    } catch (IllegalStateException e4) {
                        X.c("OpenGlRenderer", e4.toString(), e4);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals(this.g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f910d, this.g);
                this.g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f911e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f910d, this.f911e);
                this.f911e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f910d);
            this.f910d = EGL14.EGL_NO_DISPLAY;
        }
        this.f912f = null;
        this.f915j = -1;
        this.f916k = -1;
        this.f917l = -1;
        this.f918m = -1;
        this.f914i = -1;
        this.f913h = null;
        this.f909c = null;
    }

    public final void q(Surface surface, boolean z3) {
        b bVar;
        if (this.f913h == surface) {
            this.f913h = null;
            o(this.g);
        }
        HashMap hashMap = this.f908b;
        b bVar2 = f906t;
        if (z3) {
            bVar = (b) hashMap.remove(surface);
        } else {
            bVar = (b) hashMap.put(surface, bVar2);
        }
        if (bVar != null && bVar != bVar2) {
            try {
                EGL14.eglDestroySurface(this.f910d, bVar.f872a);
            } catch (RuntimeException e4) {
                X.h("OpenGlRenderer", "Failed to destroy EGL surface: " + e4.getMessage(), e4);
            }
        }
    }

    public final void r(long j3, float[] fArr, Surface surface) {
        d(true);
        c();
        HashMap hashMap = this.f908b;
        AbstractC0624h4.f("The surface is not registered.", hashMap.containsKey(surface));
        b bVar = (b) hashMap.get(surface);
        Objects.requireNonNull(bVar);
        if (bVar == f906t) {
            try {
                EGLDisplay eGLDisplay = this.f910d;
                EGLConfig eGLConfig = this.f912f;
                Objects.requireNonNull(eGLConfig);
                EGLSurface j4 = j(eGLDisplay, eGLConfig, surface);
                int[] r6 = new int[1];
                EGL14.eglQuerySurface(this.f910d, j4, 12375, r6, 0);
                int r4 = r6[0];
                int[] r7 = new int[1];
                EGL14.eglQuerySurface(this.f910d, j4, 12374, r7, 0);
                Size size = new Size(r4, r7[0]);
                bVar = new b(j4, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException | IllegalStateException e4) {
                X.h("OpenGlRenderer", "Failed to create EGL surface: " + e4.getMessage(), e4);
                bVar = null;
            }
            if (bVar == null) {
                return;
            }
            hashMap.put(surface, bVar);
        }
        Surface surface2 = this.f913h;
        EGLSurface eGLSurface = bVar.f872a;
        if (surface != surface2) {
            o(eGLSurface);
            this.f913h = surface;
            int r12 = bVar.f873b;
            int r22 = bVar.f874c;
            GLES20.glViewport(0, 0, r12, r22);
            GLES20.glScissor(0, 0, r12, r22);
        }
        GLES20.glUniformMatrix4fv(this.f916k, 1, false, fArr, 0);
        b("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f910d, eGLSurface, j3);
        if (!EGL14.eglSwapBuffers(this.f910d, eGLSurface)) {
            X.g("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            q(surface, false);
        }
    }

    public final void s() {
        GLES20.glUseProgram(this.f915j);
        b("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f914i);
        GLES20.glEnableVertexAttribArray(this.f917l);
        b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f917l, 2, 5126, false, 0, (Buffer) f904r);
        b("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f918m);
        b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f918m, 2, 5126, false, 0, (Buffer) f905s);
        b("glVertexAttribPointer");
    }
}
