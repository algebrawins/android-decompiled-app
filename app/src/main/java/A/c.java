package A;

import A0.A;
import A0.C0001b;
import A0.V;
import A0.z;
import D.C;
import D.C0028h;
import D.N;
import D.RunnableC0023c;
import D.X;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.EnumC0090s;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.L;
import b1.InterfaceC0147c;
import c0.InterfaceC0157a;
import c1.InterfaceC0160b;
import h2.AbstractActivityC0292d;
import h2.I;
import h2.J;
import io.flutter.plugin.platform.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p.C0419s;
import p.t0;
import q2.n;
import x1.AbstractC0624h4;
import x1.O6;
import x1.P6;
import x1.Q6;
import x1.R6;
import x1.S6;
import x1.T6;
import x1.U6;
import x1.V6;
import x1.W6;
import x1.X6;
import x1.Y6;
import x1.Z6;
import x1.a7;
import z.AbstractC0957j;
import z.C0942C;
import z.o;

/* loaded from: classes.dex */
public final class c implements V, C1.e, C1.d, C1.b, H.c, L, S.j, V1.a, X0.b, InterfaceC0160b, InterfaceC0157a, r2.f {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4J;

    /* renamed from: K  reason: collision with root package name */
    public Object f5K;

    public /* synthetic */ c(int r12, Object obj) {
        this.f4J = r12;
        this.f5K = obj;
    }

    public static int B(int r5, int r6) {
        int r22 = 0;
        int r3 = 0;
        for (int r12 = 0; r12 < r5; r12++) {
            r22++;
            if (r22 == r6) {
                r3++;
                r22 = 0;
            } else if (r22 > r6) {
                r3++;
                r22 = 1;
            }
        }
        if (r22 + 1 > r6) {
            return r3 + 1;
        }
        return r3;
    }

    public static boolean E(int r12) {
        if ((48 > r12 || r12 > 57) && r12 != 35 && r12 != 42) {
            return false;
        }
        return true;
    }

    public CharSequence A(q2.e eVar) {
        AbstractActivityC0292d abstractActivityC0292d = (AbstractActivityC0292d) ((B.a) this.f5K).f172K;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0292d.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != q2.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                        } else {
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            } else {
                                AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0292d.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                                CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0292d);
                                if (openTypedAssetFileDescriptor != null) {
                                    try {
                                        openTypedAssetFileDescriptor.close();
                                    } catch (IOException e4) {
                                        charSequence = coerceToText;
                                        e = e4;
                                        Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                        return charSequence;
                                    }
                                }
                                charSequence = coerceToText;
                            }
                        }
                        return charSequence;
                    } catch (IOException e5) {
                        e = e5;
                        charSequence = text;
                    }
                } else {
                    return text;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return null;
            } catch (SecurityException e6) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e6);
                return null;
            }
        } catch (IOException e7) {
            e = e7;
        }
    }

    @Override // A0.V
    public View C(int r22) {
        return ((z) this.f5K).o(r22);
    }

    @Override // V1.a
    public U1.c D() {
        S6 s6 = ((a7) this.f5K).f5849o;
        if (s6 != null) {
            return new U1.c(s6.f5740a, s6.f5741b, s6.f5742c, s6.f5743d, s6.f5744e, s6.f5745f, s6.g, s6.f5746h, s6.f5747i, s6.f5748j, s6.f5749k, s6.f5750l, s6.f5751m, s6.f5752n);
        }
        return null;
    }

    @Override // A0.V
    public int F() {
        z zVar = (z) this.f5K;
        return zVar.f167f - zVar.t();
    }

    @Override // V1.a
    public U1.g G() {
        X6 x6 = ((a7) this.f5K).f5843i;
        if (x6 != null) {
            return new U1.g(x6.f5802a, x6.f5803b, false);
        }
        return null;
    }

    @Override // A0.V
    public int H() {
        return ((z) this.f5K).s();
    }

    @Override // V1.a
    public String I() {
        return ((a7) this.f5K).f5837b;
    }

    public void J(int r12, double d4, double d5) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f5K;
        if (jVar.c(r12)) {
            return;
        }
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) jVar.f3588m.get(r12);
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + r12);
    }

    public void K(String str, String str2) {
        n nVar = (n) this.f5K;
        if (str == null) {
            nVar.c(Boolean.TRUE);
        } else if (str.equals("CameraAccessDenied")) {
            nVar.c(Boolean.FALSE);
        } else {
            nVar.a(str, str2, null);
        }
    }

    public void L(q2.m mVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j3;
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f5K;
        float f2 = jVar.f3578b.getResources().getDisplayMetrics().density;
        int r4 = mVar.f4807a;
        if (jVar.c(r4)) {
            p pVar = (p) jVar.f3583h.get(Integer.valueOf(r4));
            I r5 = new I(mVar.f4821p);
            while (true) {
                J j4 = jVar.f3594s;
                priorityQueue = (PriorityQueue) j4.f3304L;
                boolean isEmpty = priorityQueue.isEmpty();
                longSparseArray = (LongSparseArray) j4.f3303K;
                j3 = r5.f3299a;
                if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j3) {
                    break;
                }
                longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
            }
            if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j3) {
                priorityQueue.poll();
            }
            MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j3);
            longSparseArray.remove(j3);
            ArrayList arrayList = new ArrayList();
            for (List list : (List) mVar.g) {
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
                pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
                pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
                double d4 = f2;
                pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d4);
                pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d4);
                pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d4);
                pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d4);
                pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d4);
                pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d4);
                arrayList.add(pointerCoords);
            }
            int r22 = mVar.f4811e;
            MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[r22]);
            ArrayList arrayList2 = new ArrayList();
            for (List list2 : (List) mVar.f4812f) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list2.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list2.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            MotionEvent.obtain(mVar.f4808b.longValue(), mVar.f4809c.longValue(), mVar.f4810d, mVar.f4811e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[r22]), pointerCoordsArr, mVar.f4813h, mVar.f4814i, mVar.f4815j, mVar.f4816k, mVar.f4817l, mVar.f4818m, mVar.f4819n, mVar.f4820o);
            pVar.getClass();
        } else if (jVar.f3585j.get(r4) == null) {
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + r4);
        } else {
            throw new ClassCastException();
        }
    }

    public void M(q2.l lVar) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f5K;
        int h3 = jVar.h(lVar.f4805b);
        int h4 = jVar.h(lVar.f4806c);
        int r6 = lVar.f4804a;
        if (jVar.c(r6)) {
            float f2 = jVar.f3578b.getResources().getDisplayMetrics().density;
            p pVar = (p) jVar.f3583h.get(Integer.valueOf(r6));
            io.flutter.plugin.editing.k kVar = jVar.f3581e;
            if (kVar != null) {
                if (((io.flutter.plugin.editing.j) kVar.f3547e.f2651b) == io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                    kVar.f3557p = true;
                }
                pVar.getClass();
            }
            pVar.getClass();
            if (h3 == 0 && h4 == 0) {
                throw null;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                throw null;
            }
            throw null;
        } else if (jVar.f3585j.get(r6) == null) {
            io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) jVar.f3588m.get(r6);
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + r6);
        } else {
            throw new ClassCastException();
        }
    }

    public void N(int r4, int r5) {
        if (r5 != 0 && r5 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + r5 + "(view id: " + r4 + ")");
        }
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f5K;
        if (jVar.c(r4)) {
            ((p) jVar.f3583h.get(Integer.valueOf(r4))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + r4);
        } else if (jVar.f3585j.get(r4) == null) {
            Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + r4);
        } else {
            throw new ClassCastException();
        }
    }

    public void O(ArrayList arrayList) {
        int r12;
        B.a aVar = (B.a) this.f5K;
        aVar.getClass();
        if (arrayList.size() == 0) {
            r12 = 5894;
        } else {
            r12 = 1798;
        }
        for (int r22 = 0; r22 < arrayList.size(); r22++) {
            int r3 = io.flutter.plugin.platform.d.f3563b[((q2.j) arrayList.get(r22)).ordinal()];
            if (r3 != 1) {
                if (r3 == 2) {
                    r12 &= -515;
                }
            } else {
                r12 &= -5;
            }
        }
        aVar.f171J = r12;
        aVar.e();
    }

    @Override // A0.V
    public int P(View view) {
        ((z) this.f5K).getClass();
        return view.getRight() + ((A) view.getLayoutParams()).f31a.right + ((ViewGroup.MarginLayoutParams) ((A) view.getLayoutParams())).rightMargin;
    }

    public void Q(q2.i iVar) {
        int r3;
        B.a aVar = (B.a) this.f5K;
        aVar.getClass();
        if (iVar == q2.i.LEAN_BACK) {
            r3 = 1798;
        } else if (iVar == q2.i.IMMERSIVE) {
            r3 = 3846;
        } else if (iVar == q2.i.IMMERSIVE_STICKY) {
            r3 = 5894;
        } else if (iVar == q2.i.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            r3 = 1792;
        } else {
            return;
        }
        aVar.f171J = r3;
        aVar.e();
    }

    public C1.j R(Object obj) {
        ((W1.a) this.f5K).getClass();
        C1.j jVar = new C1.j();
        jVar.h((List) obj);
        return jVar;
    }

    public Class S() {
        Class<?> loadClass = ((ClassLoader) this.f5K).loadClass("java.util.function.Consumer");
        N2.g.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    @Override // V1.a
    public U1.h T() {
        Z6 z6 = ((a7) this.f5K).f5844j;
        if (z6 != null) {
            return new U1.h(z6.f5827c, z6.f5825a, z6.f5826b);
        }
        return null;
    }

    public void U(q2.g gVar) {
        View decorView = ((AbstractActivityC0292d) ((B.a) this.f5K).f172K).getWindow().getDecorView();
        int r4 = io.flutter.plugin.platform.d.f3562a[gVar.ordinal()];
        if (r4 != 1) {
            if (r4 != 2) {
                if (r4 != 3) {
                    if (r4 != 4) {
                        if (r4 == 5) {
                            decorView.performHapticFeedback(4);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        decorView.performHapticFeedback(6);
                        return;
                    } else {
                        return;
                    }
                }
                decorView.performHapticFeedback(3);
                return;
            }
            decorView.performHapticFeedback(1);
            return;
        }
        decorView.performHapticFeedback(0);
    }

    @Override // c1.InterfaceC0160b
    public Object Y() {
        b1.h hVar = (b1.h) ((InterfaceC0147c) this.f5K);
        long c4 = hVar.f2623K.c() - hVar.f2625M.f2610d;
        SQLiteDatabase a4 = hVar.a();
        a4.beginTransaction();
        try {
            int delete = a4.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(c4)});
            a4.setTransactionSuccessful();
            a4.endTransaction();
            return Integer.valueOf(delete);
        } catch (Throwable th) {
            a4.endTransaction();
            throw th;
        }
    }

    @Override // A0.V
    public int Z(View view) {
        ((z) this.f5K).getClass();
        return (view.getLeft() - ((A) view.getLayoutParams()).f31a.left) - ((ViewGroup.MarginLayoutParams) ((A) view.getLayoutParams())).leftMargin;
    }

    @Override // V1.a
    public int a() {
        return ((a7) this.f5K).f5841f;
    }

    @Override // S.j
    public Object a0(S.i iVar) {
        boolean z3;
        H.d dVar = (H.d) this.f5K;
        if (dVar.f697K == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("The result can only set once!", z3);
        dVar.f697K = iVar;
        return "FutureChain[" + dVar + "]";
    }

    @Override // androidx.camera.core.impl.L
    public X acquireLatestImage() {
        if (((B0.e) this.f5K).acquireLatestImage() == null) {
            return null;
        }
        AbstractC0624h4.f("Pending request should not be null", false);
        throw null;
    }

    @Override // C1.e, H.c
    public void b(Object obj) {
        switch (this.f4J) {
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((CountDownLatch) this.f5K).countDown();
                return;
            case 8:
                Void r5 = (Void) obj;
                return;
            case 12:
                S.i iVar = (S.i) this.f5K;
                try {
                    iVar.a(obj);
                    return;
                } catch (Throwable th) {
                    iVar.b(th);
                    return;
                }
            default:
                N.n nVar = (N.n) obj;
                nVar.getClass();
                N.f fVar = (N.f) ((C0001b) this.f5K).f85L;
                if (fVar.f892e.get()) {
                    nVar.close();
                    return;
                } else {
                    fVar.b(new RunnableC0023c(4, fVar, nVar), new N(3, nVar));
                    return;
                }
        }
    }

    @Override // V1.a
    public int c() {
        return ((a7) this.f5K).f5836a;
    }

    @Override // H.c
    public void c0(Throwable th) {
        switch (this.f4J) {
            case 8:
                ((X) this.f5K).close();
                return;
            case 12:
                ((S.i) this.f5K).b(th);
                return;
            default:
                x1.X.h("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th);
                return;
        }
    }

    @Override // androidx.camera.core.impl.L, c0.InterfaceC0157a
    public void close() {
        switch (this.f4J) {
            case 10:
                ((B0.e) this.f5K).close();
                return;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.f5K;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    return;
                }
                return;
        }
    }

    @Override // r2.f
    public void d(String str, r2.d dVar, R1.a aVar) {
        ((j2.j) this.f5K).d(str, dVar, aVar);
    }

    @Override // V1.a
    public t0 d0() {
        Object arrayList;
        R6 r6 = ((a7) this.f5K).f5848n;
        t0 t0Var = null;
        if (r6 == null) {
            return null;
        }
        V6 v6 = r6.f5725a;
        if (v6 != null) {
            t0Var = new t0(v6.f5782a, v6.f5783b, v6.f5784c, v6.f5785d, v6.f5786e, v6.f5787f, v6.g);
        }
        t0 t0Var2 = t0Var;
        ArrayList arrayList2 = new ArrayList();
        W6[] w6Arr = r6.f5728d;
        if (w6Arr != null) {
            for (W6 w6 : w6Arr) {
                if (w6 != null) {
                    arrayList2.add(new U1.f(w6.f5797b, w6.f5796a));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        T6[] t6Arr = r6.f5729e;
        if (t6Arr != null) {
            for (T6 t6 : t6Arr) {
                if (t6 != null) {
                    arrayList3.add(new U1.d(t6.f5759a, t6.f5760b, t6.f5761c, t6.f5762d));
                }
            }
        }
        String[] strArr = r6.f5730f;
        if (strArr != null) {
            arrayList = Arrays.asList(strArr);
        } else {
            arrayList = new ArrayList();
        }
        Object obj = arrayList;
        ArrayList arrayList4 = new ArrayList();
        O6[] o6Arr = r6.g;
        if (o6Arr != null) {
            for (O6 o6 : o6Arr) {
                if (o6 != null) {
                    arrayList4.add(new U1.a(o6.f5692a, o6.f5693b));
                }
            }
        }
        return new t0(t0Var2, r6.f5726b, r6.f5727c, arrayList2, arrayList3, obj, arrayList4);
    }

    @Override // r2.f
    public void e(String str, r2.d dVar) {
        ((j2.j) this.f5K).d(str, dVar, null);
    }

    @Override // V1.a
    public Rect e0() {
        Point[] pointArr = ((a7) this.f5K).f5840e;
        if (pointArr != null) {
            int r22 = Integer.MIN_VALUE;
            int r3 = Integer.MIN_VALUE;
            int r4 = Integer.MAX_VALUE;
            int r5 = Integer.MAX_VALUE;
            for (Point point : pointArr) {
                r4 = Math.min(r4, point.x);
                r22 = Math.max(r22, point.x);
                r5 = Math.min(r5, point.y);
                r3 = Math.max(r3, point.y);
            }
            return new Rect(r4, r5, r22, r3);
        }
        return null;
    }

    public boolean equals(Object obj) {
        switch (this.f4J) {
            case 9:
                return ((C0028h) this.f5K).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // V1.a
    public Point[] f() {
        return ((a7) this.f5K).f5840e;
    }

    @Override // V1.a
    public U1.f g() {
        W6 w6 = ((a7) this.f5K).f5842h;
        if (w6 != null) {
            return new U1.f(w6.f5797b, w6.f5796a);
        }
        return null;
    }

    @Override // A2.a
    public Object get() {
        return this.f5K;
    }

    @Override // androidx.camera.core.impl.L
    public int getHeight() {
        return ((B0.e) this.f5K).getHeight();
    }

    @Override // androidx.camera.core.impl.L
    public Surface getSurface() {
        return ((B0.e) this.f5K).getSurface();
    }

    @Override // androidx.camera.core.impl.L
    public int getWidth() {
        return ((B0.e) this.f5K).getWidth();
    }

    @Override // r2.f
    public void h(String str, ByteBuffer byteBuffer) {
        ((j2.j) this.f5K).i(str, byteBuffer, null);
    }

    @Override // V1.a
    public byte[] h0() {
        return ((a7) this.f5K).f5839d;
    }

    public int hashCode() {
        switch (this.f4J) {
            case 9:
                return ((C0028h) this.f5K).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // r2.f
    public void i(String str, ByteBuffer byteBuffer, r2.e eVar) {
        ((j2.j) this.f5K).i(str, byteBuffer, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r2.k, java.lang.Object] */
    @Override // r2.f
    public R1.a j() {
        return ((j2.j) this.f5K).b(new Object());
    }

    @Override // V1.a
    public String j0() {
        return ((a7) this.f5K).f5838c;
    }

    @Override // androidx.camera.core.impl.L
    public int k() {
        return ((B0.e) this.f5K).k();
    }

    @Override // V1.a
    public t0 k0() {
        U1.b bVar;
        Q6 q6 = ((a7) this.f5K).f5847m;
        U1.b bVar2 = null;
        if (q6 == null) {
            return null;
        }
        P6 p6 = q6.f5720f;
        if (p6 == null) {
            bVar = null;
        } else {
            bVar = new U1.b(p6.f5710h, 0);
        }
        P6 p62 = q6.g;
        if (p62 != null) {
            bVar2 = new U1.b(p62.f5710h, 0);
        }
        return new t0(q6.f5715a, q6.f5716b, q6.f5717c, q6.f5718d, q6.f5719e, bVar, bVar2);
    }

    @Override // V1.a
    public U1.d l() {
        T6 t6 = ((a7) this.f5K).g;
        if (t6 == null) {
            return null;
        }
        return new U1.d(t6.f5759a, t6.f5760b, t6.f5761c, t6.f5762d);
    }

    @Override // androidx.camera.core.impl.L
    public int m() {
        return ((B0.e) this.f5K).m();
    }

    @Override // V1.a
    public U1.e n() {
        U6 u6 = ((a7) this.f5K).f5846l;
        if (u6 != null) {
            return new U1.e(u6.f5774a, u6.f5775b);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.L
    public X o() {
        if (((B0.e) this.f5K).o() == null) {
            return null;
        }
        AbstractC0624h4.f("Pending request should not be null", false);
        throw null;
    }

    @Override // C1.b
    public void p() {
        ((CountDownLatch) this.f5K).countDown();
    }

    @Override // C1.d
    public void q(Exception exc) {
        ((CountDownLatch) this.f5K).countDown();
    }

    @Override // V1.a
    public U1.g r() {
        Y6 y6 = ((a7) this.f5K).f5845k;
        if (y6 != null) {
            return new U1.g(y6.f5815a, y6.f5816b, false);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.L
    public void s() {
        ((B0.e) this.f5K).s();
    }

    @Override // androidx.camera.core.impl.L
    public void t(K k3, Executor executor) {
        ((B0.e) this.f5K).t(new C.f(4, this, k3), executor);
    }

    public String toString() {
        switch (this.f4J) {
            case 9:
                return ((C0028h) this.f5K).toString();
            case 20:
                StringBuilder sb = new StringBuilder("[Result: <");
                sb.append("Value: " + ((EnumC0090s) this.f5K));
                sb.append(">]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        ((C1.j) ((a) this.f5K).f1K).j(null);
    }

    public void v(int r4) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f5K;
        if (jVar.c(r4)) {
            ((p) jVar.f3583h.get(Integer.valueOf(r4))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + r4);
        } else if (jVar.f3585j.get(r4) == null) {
            Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + r4);
        } else {
            throw new ClassCastException();
        }
    }

    @Override // c0.InterfaceC0157a
    public Cursor w(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f5K;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e4) {
            Log.w("FontsProvider", "Unable to query the content provider", e4);
            return null;
        }
    }

    public void x(C0419s c0419s) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f5K;
        jVar.getClass();
        int r12 = c0419s.f4693a;
        int r22 = c0419s.f4694b;
        if (r22 != 0 && r22 != 1) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + r22 + "(view id: " + r12 + ")");
        } else if (jVar.f3588m.get(r12) == null) {
            if (jVar.f3580d != null) {
                if (jVar.f3579c != null) {
                    HashMap hashMap = jVar.f3577a.f1033a;
                    String str = (String) c0419s.f4695c;
                    if (hashMap.get(str) == null) {
                        throw new IllegalStateException(C.I("Trying to create a platform view of unregistered type: ", str));
                    }
                    throw new ClassCastException();
                }
                throw new IllegalStateException(C.w("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", r12));
            }
            throw new IllegalStateException(C.w("Texture registry is null. This means that platform views controller was detached, view id: ", r12));
        } else {
            throw new IllegalStateException(C.w("Trying to create an already created platform view, view id: ", r12));
        }
    }

    public H0.e y(Object obj, N2.d dVar, Activity activity, M0.b bVar) {
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f5K, new Class[]{S()}, new H0.d(dVar, bVar));
        N2.g.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, S()).invoke(obj, activity, newProxyInstance);
        return new H0.e(obj.getClass().getMethod("removeWindowLayoutInfoListener", S()), obj, newProxyInstance);
    }

    public void z(int r3) {
        if (((io.flutter.plugin.platform.j) this.f5K).f3585j.get(r3) == null) {
            Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + r3);
            return;
        }
        throw new ClassCastException();
    }

    public /* synthetic */ c(W1.a aVar, int r22, int r3) {
        this.f4J = 15;
        this.f5K = aVar;
    }

    public c(int r22) {
        this.f4J = r22;
        switch (r22) {
            case 1:
                this.f5K = (o) AbstractC0957j.f6565a.b(o.class);
                return;
            case 2:
                this.f5K = (z.m) AbstractC0957j.f6565a.b(z.m.class);
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f5K = new SparseIntArray();
                return;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                this.f5K = new a(9);
                return;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f5K = new CountDownLatch(1);
                return;
            case 18:
                return;
            default:
                this.f5K = (C0942C) AbstractC0957j.f6565a.b(C0942C.class);
                return;
        }
    }

    public c(Size size, Rect rect, int r4) {
        this.f4J = 9;
        this.f5K = new C0028h(size, rect, r4);
    }

    public c(Context context, Uri uri) {
        this.f4J = 21;
        this.f5K = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
