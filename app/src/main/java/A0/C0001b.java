package A0;

import A0.C0001b;
import D.N;
import D.RunnableC0023c;
import D.X;
import a1.C0071b;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import androidx.camera.core.impl.C;
import androidx.camera.core.impl.EnumC0083k;
import androidx.camera.core.impl.EnumC0084l;
import androidx.camera.core.impl.EnumC0085m;
import androidx.camera.core.impl.InterfaceC0086n;
import androidx.camera.core.impl.InterfaceC0091t;
import androidx.recyclerview.widget.RecyclerView;
import b1.C0145a;
import b1.C0146b;
import b1.C0149e;
import b1.InterfaceC0147c;
import b1.InterfaceC0150f;
import c1.InterfaceC0160b;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0235c;
import e0.InterfaceC0247a;
import e1.AbstractC0248a;
import h1.C0287g;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import k0.AbstractC0318e;
import k0.C0322i;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0426z;
import p.C0416o;
import p.C0419s;
import r2.C0444a;
import w2.C0535e;
import w2.C0537g;
import w2.InterfaceC0536f;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;

/* renamed from: A0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001b implements H.c, S.j, X0.b, InterfaceC0160b, InterfaceC0150f, r2.d, InterfaceC0536f {

    /* renamed from: N  reason: collision with root package name */
    public static C0001b f82N;

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f83J;

    /* renamed from: K  reason: collision with root package name */
    public Object f84K;

    /* renamed from: L  reason: collision with root package name */
    public Object f85L;

    /* renamed from: M  reason: collision with root package name */
    public Object f86M;

    public /* synthetic */ C0001b(int r12, boolean z3) {
        this.f83J = r12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [g2.a, java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l2.c] */
    public static C0001b L() {
        if (f82N == null) {
            Object obj = new Object();
            ?? obj2 = new Object();
            obj2.f3243a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(obj2);
            FlutterJNI flutterJNI = new FlutterJNI();
            ?? obj3 = new Object();
            obj3.f4109a = false;
            obj3.f4113e = flutterJNI;
            obj3.f4114f = newCachedThreadPool;
            C0001b c0001b = new C0001b(15, false);
            c0001b.f85L = obj3;
            c0001b.f84K = obj;
            c0001b.f86M = newCachedThreadPool;
            f82N = c0001b;
        }
        return f82N;
    }

    public static void O(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static C0001b P(Context context, AttributeSet attributeSet, int[] r4, int r5) {
        return new C0001b(context, context.obtainStyledAttributes(attributeSet, r4, r5, 0));
    }

    public void A(int r22, io.flutter.view.h hVar, Serializable serializable) {
        ((FlutterJNI) this.f84K).dispatchSemanticsAction(r22, hVar, serializable);
    }

    public void B(X x3) {
        InterfaceC0086n interfaceC0086n;
        D.U g = x3.g();
        Object obj = null;
        if (g instanceof I.b) {
            interfaceC0086n = ((I.b) g).f746a;
        } else {
            interfaceC0086n = null;
        }
        if ((interfaceC0086n.g() != EnumC0084l.LOCKED_FOCUSED && interfaceC0086n.g() != EnumC0084l.PASSIVE_FOCUSED) || interfaceC0086n.j() != EnumC0083k.CONVERGED || interfaceC0086n.d() != EnumC0085m.CONVERGED) {
            ((I.c) this.f86M).getClass();
            x3.close();
            return;
        }
        synchronized (this.f84K) {
            try {
                if (((ArrayDeque) this.f85L).size() >= 3) {
                    obj = w();
                }
                ((ArrayDeque) this.f85L).addFirst(x3);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((I.c) this.f86M) != null && obj != null) {
            ((X) obj).close();
        }
    }

    public int C(int r4, int r5) {
        ArrayList arrayList = (ArrayList) this.f86M;
        int size = arrayList.size();
        while (r5 < size) {
            ((AbstractC0000a) arrayList.get(r5)).getClass();
            r5++;
        }
        return r4;
    }

    public ColorStateList D(int r4) {
        int resourceId;
        ColorStateList b3;
        TypedArray typedArray = (TypedArray) this.f84K;
        if (typedArray.hasValue(r4) && (resourceId = typedArray.getResourceId(r4, 0)) != 0 && (b3 = j.b.b((Context) this.f85L, resourceId)) != null) {
            return b3;
        }
        return typedArray.getColorStateList(r4);
    }

    public Drawable E(int r3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f84K;
        if (typedArray.hasValue(r3) && (resourceId = typedArray.getResourceId(r3, 0)) != 0) {
            return j.b.c((Context) this.f85L, resourceId);
        }
        return typedArray.getDrawable(r3);
    }

    public Typeface F(int r17, int r18, C0419s c0419s) {
        int resourceId = ((TypedArray) this.f84K).getResourceId(r17, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f86M) == null) {
            this.f86M = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f86M;
        ThreadLocal threadLocal = X.m.f1566a;
        Context context = (Context) this.f85L;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                c0419s.a();
                return null;
            }
            int r4 = typedValue.assetCookie;
            R.f fVar = Y.e.f1644b;
            Typeface typeface = (Typeface) fVar.a(Y.e.b(resources, resourceId, charSequence2, r4, r18));
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0023c(7, c0419s, typeface));
                return typeface;
            }
            try {
                if (charSequence2.toLowerCase().endsWith(".xml")) {
                    X.e i3 = X.b.i(resources.getXml(resourceId), resources);
                    if (i3 == null) {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        c0419s.a();
                        return null;
                    }
                    return Y.e.a(context, i3, resources, resourceId, charSequence2, typedValue.assetCookie, r18, c0419s);
                }
                int r7 = typedValue.assetCookie;
                Typeface d4 = Y.e.f1643a.d(context, resources, resourceId, charSequence2, r18);
                if (d4 != null) {
                    fVar.b(Y.e.b(resources, resourceId, charSequence2, r7, r18), d4);
                }
                if (d4 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0023c(7, c0419s, d4));
                } else {
                    c0419s.a();
                }
                return d4;
            } catch (IOException e4) {
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e4);
                c0419s.a();
                return null;
            } catch (XmlPullParserException e5) {
                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e5);
                c0419s.a();
                return null;
            }
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
    }

    public V0.h G(S0.b bVar, S0.d dVar) {
        Set set = (Set) this.f85L;
        if (set.contains(bVar)) {
            return new V0.h((V0.c) this.f84K, bVar, dVar, (V0.i) this.f86M);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }

    public View H(int r22) {
        return ((RecyclerView) ((A.a) this.f85L).f1K).getChildAt(r22);
    }

    public int I() {
        return ((RecyclerView) ((A.a) this.f85L).f1K).getChildCount();
    }

    public File J(Context context) {
        ((C0287g) this.f84K).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, E.d] */
    public boolean K(KeyEvent keyEvent) {
        if (((HashSet) this.f84K).remove(keyEvent)) {
            return false;
        }
        h2.E[] eArr = (h2.E[]) this.f85L;
        if (eArr.length > 0) {
            h2.D d4 = new h2.D(this, keyEvent);
            for (A.f fVar : eArr) {
                ?? obj = new Object();
                obj.f508b = d4;
                obj.f507a = false;
                fVar.e(keyEvent, obj);
            }
            return true;
        }
        Q(keyEvent);
        return true;
    }

    public void M(String str, Object obj, q2.n nVar) {
        C0444a c0444a;
        ByteBuffer d4 = ((r2.n) this.f86M).d(new h2.J(str, obj, 17, false));
        if (nVar == null) {
            c0444a = null;
        } else {
            c0444a = new C0444a(1, this, nVar);
        }
        ((r2.f) this.f85L).i((String) this.f84K, d4, c0444a);
    }

    public void N(int r8) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f85L;
        C0001b P3 = P(imageView.getContext(), null, i.a.f3388e, r8);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) P3.f84K;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = j.b.c(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC0426z.b(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList D3 = P3.D(2);
                int r5 = Build.VERSION.SDK_INT;
                AbstractC0318e.c(imageView, D3);
                if (r5 == 21 && (drawable2 = imageView.getDrawable()) != null && AbstractC0318e.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode d4 = AbstractC0426z.d(typedArray.getInt(3, -1), null);
                int r22 = Build.VERSION.SDK_INT;
                AbstractC0318e.d(imageView, d4);
                if (r22 == 21 && (drawable = imageView.getDrawable()) != null && AbstractC0318e.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            P3.S();
        } catch (Throwable th) {
            P3.S();
            throw th;
        }
    }

    public void Q(KeyEvent keyEvent) {
        io.flutter.plugin.editing.c cVar;
        h2.F f2 = (h2.F) this.f86M;
        if (f2 != null) {
            h2.t tVar = (h2.t) f2;
            io.flutter.plugin.editing.k kVar = tVar.f3365T;
            boolean z3 = false;
            if (kVar.f3544b.isAcceptingText() && (cVar = kVar.f3551j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    z3 = cVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    z3 = cVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    z3 = cVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    z3 = cVar.e(false, keyEvent.isShiftPressed());
                } else {
                    if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                        EditorInfo editorInfo = cVar.f3510e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            cVar.performEditorAction(editorInfo.imeOptions & 255);
                            z3 = true;
                        }
                    }
                    io.flutter.plugin.editing.f fVar = cVar.f3509d;
                    int selectionStart = Selection.getSelectionStart(fVar);
                    int selectionEnd = Selection.getSelectionEnd(fVar);
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                        int min = Math.min(selectionStart, selectionEnd);
                        int max = Math.max(selectionStart, selectionEnd);
                        cVar.beginBatchEdit();
                        if (min != max) {
                            fVar.delete(min, max);
                        }
                        fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                        int r3 = min + 1;
                        cVar.setSelection(r3, r3);
                        cVar.endBatchEdit();
                        z3 = true;
                    }
                }
            }
            if (!z3) {
                HashSet hashSet = (HashSet) this.f84K;
                hashSet.add(keyEvent);
                tVar.getRootView().dispatchKeyEvent(keyEvent);
                if (hashSet.remove(keyEvent)) {
                    Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
                }
            }
        }
    }

    public void R(Activity activity, K0.l lVar) {
        N2.g.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f84K;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f86M;
        try {
            if (lVar.equals((K0.l) weakHashMap.get(activity))) {
                return;
            }
            K0.l lVar2 = (K0.l) weakHashMap.put(activity, lVar);
            reentrantLock.unlock();
            Iterator it = ((N0.k) ((A.a) this.f85L).f1K).f977b.iterator();
            while (it.hasNext()) {
                N0.j jVar = (N0.j) it.next();
                if (jVar.f971a.equals(activity)) {
                    jVar.f973c = lVar;
                    jVar.f972b.accept(lVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void S() {
        ((TypedArray) this.f84K).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r4 = r3.f2650a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r4 >= r6.length) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        r6[r4] = r2;
        r3.f2650a = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T(java.util.ArrayList r8) {
        /*
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L42
            java.lang.Object r2 = r8.get(r1)
            A0.a r2 = (A0.AbstractC0000a) r2
            r2.getClass()
            java.lang.Object r3 = r7.f85L
            c0.f r3 = (c0.f) r3
            r3.getClass()
            java.lang.String r4 = "instance"
            N2.g.e(r2, r4)
            int r4 = r3.f2650a
            r5 = 0
        L1f:
            java.lang.Object r6 = r3.f2651b
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r5 >= r4) goto L34
            r6 = r6[r5]
            if (r6 == r2) goto L2c
            int r5 = r5 + 1
            goto L1f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r8.<init>(r0)
            throw r8
        L34:
            int r4 = r3.f2650a
            int r5 = r6.length
            if (r4 >= r5) goto L3f
            r6[r4] = r2
            int r4 = r4 + 1
            r3.f2650a = r4
        L3f:
            int r1 = r1 + 1
            goto L5
        L42:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.C0001b.T(java.util.ArrayList):void");
    }

    public void U(r2.m mVar) {
        h2.J j3;
        if (mVar == null) {
            j3 = null;
        } else {
            j3 = new h2.J(18, this, mVar);
        }
        ((r2.f) this.f85L).e((String) this.f84K, j3);
    }

    public void V(r2.h hVar) {
        C0001b c0001b;
        if (hVar == null) {
            c0001b = null;
        } else {
            c0001b = new C0001b(this, hVar);
        }
        ((r2.f) this.f85L).e((String) this.f84K, c0001b);
    }

    @Override // c1.InterfaceC0160b
    public Object Y() {
        Z0.b bVar = (Z0.b) this.f85L;
        b1.h hVar = (b1.h) bVar.f1764d;
        hVar.getClass();
        V0.c cVar = (V0.c) this.f84K;
        V0.b bVar2 = (V0.b) this.f86M;
        String concat = "TransportRuntime.".concat("SQLiteEventStore");
        Log.d(concat, "Storing event with priority=" + cVar.f1370c + ", name=" + bVar2.f1362a + " for destination " + cVar.f1368a);
        ((Long) hVar.f(new C0001b(hVar, cVar, bVar2, 14))).getClass();
        bVar.f1761a.a(cVar, 1, false);
        return null;
    }

    @Override // w2.InterfaceC0536f
    public void a(String str, String str2, C0537g c0537g) {
        v(c0537g).edit().putString(str, str2).apply();
    }

    @Override // S.j
    public Object a0(S.i iVar) {
        RunnableC0004e runnableC0004e = new RunnableC0004e(4, this);
        G.a a4 = AbstractC0636k0.a();
        S.m mVar = iVar.f1189c;
        if (mVar != null) {
            mVar.a(runnableC0004e, a4);
        }
        ((G.d) this.f86M).f668J.set(iVar);
        return "HandlerScheduledFuture-" + ((Callable) this.f84K).toString();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, V0.a] */
    @Override // b1.InterfaceC0150f
    public Object apply(Object obj) {
        boolean z3;
        S0.b bVar;
        S0.b bVar2;
        long insert;
        boolean z4;
        byte[] bArr;
        switch (this.f83J) {
            case 13:
                Cursor cursor = (Cursor) obj;
                S0.b bVar3 = b1.h.f2621N;
                while (cursor.moveToNext()) {
                    long j3 = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ?? obj2 = new Object();
                    obj2.f1361O = new HashMap();
                    String string = cursor.getString(1);
                    if (string != null) {
                        obj2.f1356J = string;
                        obj2.f1359M = Long.valueOf(cursor.getLong(2));
                        obj2.f1360N = Long.valueOf(cursor.getLong(3));
                        if (z3) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                bVar2 = b1.h.f2621N;
                            } else {
                                bVar2 = new S0.b(string2);
                            }
                            obj2.f1358L = new V0.f(bVar2, cursor.getBlob(5));
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                bVar = b1.h.f2621N;
                            } else {
                                bVar = new S0.b(string3);
                            }
                            obj2.f1358L = new V0.f(bVar, (byte[]) b1.h.k(((b1.h) this.f85L).a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num"), C0149e.f2616K));
                        }
                        if (!cursor.isNull(6)) {
                            obj2.f1357K = Integer.valueOf(cursor.getInt(6));
                        }
                        ((ArrayList) this.f84K).add(new C0146b(j3, (V0.c) this.f86M, obj2.c()));
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            default:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                S0.b bVar4 = b1.h.f2621N;
                b1.h hVar = (b1.h) this.f85L;
                long simpleQueryForLong = hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C0145a c0145a = hVar.f2625M;
                if (hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * simpleQueryForLong >= c0145a.f2607a) {
                    return -1L;
                }
                V0.c cVar = (V0.c) this.f84K;
                Long b3 = b1.h.b(sQLiteDatabase, cVar);
                if (b3 != null) {
                    insert = b3.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", cVar.f1368a);
                    contentValues.put("priority", Integer.valueOf(AbstractC0248a.a(cVar.f1370c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr2 = cVar.f1369b;
                    if (bArr2 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr2, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                V0.b bVar5 = (V0.b) this.f86M;
                V0.f fVar = bVar5.f1364c;
                byte[] bArr3 = fVar.f1377b;
                int length = bArr3.length;
                int r6 = c0145a.f2611e;
                if (length <= r6) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", bVar5.f1362a);
                contentValues2.put("timestamp_ms", Long.valueOf(bVar5.f1365d));
                contentValues2.put("uptime_ms", Long.valueOf(bVar5.f1366e));
                contentValues2.put("payload_encoding", fVar.f1376a.f1196a);
                contentValues2.put("code", bVar5.f1363b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z4));
                if (z4) {
                    bArr = bArr3;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z4) {
                    int ceil = (int) Math.ceil(bArr3.length / r6);
                    for (int r12 = 1; r12 <= ceil; r12++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr3, (r12 - 1) * r6, Math.min(r12 * r6, bArr3.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(r12));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(bVar5.f1367f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
        }
    }

    @Override // H.c
    public void b(Object obj) {
        Surface surface = (Surface) obj;
        H.f.e(true, (E1.a) this.f85L, (S.i) this.f84K, AbstractC0636k0.a());
    }

    @Override // w2.InterfaceC0536f
    public void c(String str, double d4, C0537g c0537g) {
        SharedPreferences.Editor edit = v(c0537g).edit();
        edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).apply();
    }

    @Override // H.c
    public void c0(Throwable th) {
        boolean z3 = th instanceof CancellationException;
        S.i iVar = (S.i) this.f84K;
        if (z3) {
            AbstractC0624h4.f(null, iVar.b(new RuntimeException(D.C.z(new StringBuilder(), (String) this.f86M, " cancelled."), th)));
        } else {
            iVar.a(null);
        }
    }

    @Override // w2.InterfaceC0536f
    public Boolean d(String str, C0537g c0537g) {
        SharedPreferences v3 = v(c0537g);
        if (v3.contains(str)) {
            return Boolean.valueOf(v3.getBoolean(str, true));
        }
        return null;
    }

    @Override // w2.InterfaceC0536f
    public void e(String str, boolean z3, C0537g c0537g) {
        v(c0537g).edit().putBoolean(str, z3).apply();
    }

    public void f() {
        ImageView imageView = (ImageView) this.f85L;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0426z.b(drawable);
        }
        if (drawable != null) {
            int r22 = Build.VERSION.SDK_INT;
            if (r22 <= 21 && r22 == 21) {
                if (((B0.d) this.f86M) == null) {
                    this.f86M = new Object();
                }
                B0.d dVar = (B0.d) this.f86M;
                dVar.f181c = null;
                dVar.f180b = false;
                dVar.f182d = null;
                dVar.f179a = false;
                ColorStateList a4 = AbstractC0318e.a(imageView);
                if (a4 != null) {
                    dVar.f180b = true;
                    dVar.f181c = a4;
                }
                PorterDuff.Mode b3 = AbstractC0318e.b(imageView);
                if (b3 != null) {
                    dVar.f179a = true;
                    dVar.f182d = b3;
                }
                if (dVar.f180b || dVar.f179a) {
                    C0416o.c(drawable, dVar, imageView.getDrawableState());
                    return;
                }
            }
            B0.d dVar2 = (B0.d) this.f84K;
            if (dVar2 != null) {
                C0416o.c(drawable, dVar2, imageView.getDrawableState());
            }
        }
    }

    @Override // w2.InterfaceC0536f
    public String g(String str, C0537g c0537g) {
        SharedPreferences v3 = v(c0537g);
        if (v3.contains(str)) {
            return v3.getString(str, "");
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, d1.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, d1.a] */
    @Override // A2.a
    public Object get() {
        switch (this.f83J) {
            case 10:
                return new V0.i(new Object(), new Object(), (Z0.c) ((E.c) this.f85L).get(), (a1.g) ((V0.a) this.f84K).get(), (a1.h) ((a1.i) this.f86M).get());
            default:
                return new a1.d((Context) ((A.c) this.f85L).f5K, (InterfaceC0147c) ((A2.a) this.f84K).get(), (C0071b) ((R1.a) this.f86M).get());
        }
    }

    public V0.c h() {
        String str;
        if (((String) this.f85L) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((S0.c) this.f86M) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new V0.c((String) this.f85L, (byte[]) this.f84K, (S0.c) this.f86M);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // w2.InterfaceC0536f
    public List i(List list, C0537g c0537g) {
        Set set;
        Map<String, ?> all = v(c0537g).getAll();
        N2.g.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            N2.g.d(key, "<get-key>(...)");
            String str = key;
            Object value = entry.getValue();
            if (list != null) {
                set = C2.i.n(list);
            } else {
                set = null;
            }
            if (w2.K.b(str, value, set)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C2.i.l(linkedHashMap.keySet());
    }

    @Override // w2.InterfaceC0536f
    public Long j(String str, C0537g c0537g) {
        long j3;
        SharedPreferences v3 = v(c0537g);
        if (v3.contains(str)) {
            try {
                j3 = v3.getLong(str, 0L);
            } catch (ClassCastException unused) {
                j3 = v3.getInt(str, 0);
            }
            return Long.valueOf(j3);
        }
        return null;
    }

    @Override // w2.InterfaceC0536f
    public Double k(String str, C0537g c0537g) {
        SharedPreferences v3 = v(c0537g);
        if (v3.contains(str)) {
            Object c4 = w2.K.c(v3.getString(str, ""), (O1.a) this.f86M);
            N2.g.c(c4, "null cannot be cast to non-null type kotlin.Double");
            return (Double) c4;
        }
        return null;
    }

    @Override // w2.InterfaceC0536f
    public w2.O l(String str, C0537g c0537g) {
        SharedPreferences v3 = v(c0537g);
        if (!v3.contains(str)) {
            return null;
        }
        String string = v3.getString(str, "");
        N2.g.b(string);
        if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new w2.O(string, w2.M.JSON_ENCODED);
        }
        if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            return new w2.O(null, w2.M.PLATFORM_ENCODED);
        }
        return new w2.O(null, w2.M.UNEXPECTED_STRING);
    }

    @Override // w2.InterfaceC0536f
    public void m(String str, String str2, C0537g c0537g) {
        v(c0537g).edit().putString(str, str2).apply();
    }

    @Override // w2.InterfaceC0536f
    public Map n(List list, C0537g c0537g) {
        Set set;
        Object value;
        Map<String, ?> all = v(c0537g).getAll();
        N2.g.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            if (list != null) {
                set = C2.i.n(list);
            } else {
                set = null;
            }
            if (w2.K.b(key, value2, set) && (value = entry.getValue()) != null) {
                String key2 = entry.getKey();
                Object c4 = w2.K.c(value, (O1.a) this.f86M);
                N2.g.c(c4, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key2, c4);
            }
        }
        return hashMap;
    }

    @Override // r2.d
    public void o(ByteBuffer byteBuffer, j2.g gVar) {
        C0001b c0001b = (C0001b) this.f86M;
        String str = (String) ((r2.s) c0001b.f86M).b(byteBuffer).f3303K;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f84K;
        String str2 = (String) c0001b.f84K;
        r2.s sVar = (r2.s) c0001b.f86M;
        r2.h hVar = (r2.h) this.f85L;
        if (equals) {
            r2.g gVar2 = new r2.g(this);
            if (((r2.g) atomicReference.getAndSet(gVar2)) != null) {
                try {
                    hVar.e();
                } catch (RuntimeException e4) {
                    Log.e("EventChannel#" + str2, "Failed to close existing event stream", e4);
                }
            }
            try {
                hVar.b(gVar2);
                gVar.a(sVar.a(null));
            } catch (RuntimeException e5) {
                atomicReference.set(null);
                Log.e("EventChannel#" + str2, "Failed to open event stream", e5);
                gVar.a(sVar.f("error", e5.getMessage(), null));
            }
        } else if (str.equals("cancel")) {
            if (((r2.g) atomicReference.getAndSet(null)) != null) {
                try {
                    hVar.e();
                    gVar.a(sVar.a(null));
                    return;
                } catch (RuntimeException e6) {
                    Log.e("EventChannel#" + str2, "Failed to close event stream", e6);
                    gVar.a(sVar.f("error", e6.getMessage(), null));
                    return;
                }
            }
            gVar.a(sVar.f("error", "No active stream to cancel", null));
        } else {
            gVar.a(null);
        }
    }

    @Override // w2.InterfaceC0536f
    public void p(String str, List list, C0537g c0537g) {
        v(c0537g).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((O1.a) this.f86M).a(list))).apply();
    }

    @Override // w2.InterfaceC0536f
    public void q(String str, long j3, C0537g c0537g) {
        v(c0537g).edit().putLong(str, j3).apply();
    }

    @Override // w2.InterfaceC0536f
    public void r(List list, C0537g c0537g) {
        Set set;
        SharedPreferences v3 = v(c0537g);
        SharedPreferences.Editor edit = v3.edit();
        N2.g.d(edit, "edit(...)");
        Map<String, ?> all = v3.getAll();
        N2.g.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            Object obj = all.get(str);
            if (list != null) {
                set = C2.i.n(list);
            } else {
                set = null;
            }
            if (w2.K.b(str, obj, set)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        N2.g.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            N2.g.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // w2.InterfaceC0536f
    public ArrayList s(String str, C0537g c0537g) {
        List list;
        SharedPreferences v3 = v(c0537g);
        ArrayList arrayList = null;
        if (v3.contains(str)) {
            String string = v3.getString(str, "");
            N2.g.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) w2.K.c(v3.getString(str, ""), (O1.a) this.f86M)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public void t(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f84K;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f86M).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        switch (this.f83J) {
            case 1:
                return ((C0002c) this.f86M).toString() + ", hidden list:" + ((ArrayList) this.f84K).size();
            case 28:
                StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(N.m mVar, Map.Entry entry) {
        InterfaceC0091t interfaceC0091t;
        final N.m mVar2 = (N.m) entry.getValue();
        final Size size = mVar.f940f.f2192a;
        final int r4 = ((N.c) entry.getKey()).f877c;
        final Rect rect = ((N.c) entry.getKey()).f878d;
        final int r7 = ((N.c) entry.getKey()).f880f;
        final boolean z3 = ((N.c) entry.getKey()).g;
        if (mVar.f937c) {
            interfaceC0091t = (InterfaceC0091t) this.f84K;
        } else {
            interfaceC0091t = null;
        }
        final InterfaceC0091t interfaceC0091t2 = interfaceC0091t;
        mVar2.getClass();
        AbstractC0612g0.a();
        mVar2.a();
        AbstractC0624h4.f("Consumer can only be linked once.", !mVar2.f943j);
        mVar2.f943j = true;
        final N.l lVar = mVar2.f945l;
        H.b f2 = H.f.f(lVar.c(), new H.a() { // from class: N.k
            @Override // H.a
            public final E1.a apply(Object obj) {
                l lVar2 = lVar;
                Surface surface = (Surface) obj;
                m mVar3 = m.this;
                surface.getClass();
                try {
                    lVar2.d();
                    n nVar = new n(surface, r4, mVar3.f940f.f2192a, size, rect, r7, z3, interfaceC0091t2);
                    nVar.f957S.f1193K.a(new N(6, lVar2), AbstractC0636k0.a());
                    mVar3.f942i = nVar;
                    return H.f.c(nVar);
                } catch (C e4) {
                    return new H.h(1, e4);
                }
            }
        }, AbstractC0636k0.d());
        A.c cVar = new A.c(14, this);
        f2.a(new H.e(0, f2, cVar), AbstractC0636k0.d());
    }

    public SharedPreferences v(C0537g c0537g) {
        String str = c0537g.f5371a;
        Context context = (Context) this.f84K;
        if (str == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
            N2.g.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        N2.g.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public Object w() {
        Object removeLast;
        synchronized (this.f84K) {
            removeLast = ((ArrayDeque) this.f85L).removeLast();
        }
        return removeLast;
    }

    public void x(boolean z3) {
        for (t0.e eVar : ((h2.J) this.f85L).x()) {
            if (eVar != null && z3) {
                eVar.f4986M.x(true);
            }
        }
    }

    public void y(boolean z3) {
        for (t0.e eVar : ((h2.J) this.f85L).x()) {
            if (eVar != null && z3) {
                eVar.f4986M.y(true);
            }
        }
    }

    public void z(int r22, io.flutter.view.h hVar) {
        ((FlutterJNI) this.f84K).dispatchSemanticsAction(r22, hVar);
    }

    public /* synthetic */ C0001b(Object obj, Object obj2, Object obj3, int r4) {
        this.f83J = r4;
        this.f85L = obj;
        this.f84K = obj2;
        this.f86M = obj3;
    }

    public C0001b(int r3) {
        this.f83J = r3;
        switch (r3) {
            case 23:
                this.f85L = new ConcurrentLinkedQueue();
                return;
            case 28:
                this.f84K = new ArrayList();
                this.f85L = new h2.J(19);
                new ArrayList();
                new CopyOnWriteArrayList();
                this.f86M = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new ArrayList();
                N2.g.e(this, "fragmentManager");
                new CopyOnWriteArrayList();
                new CopyOnWriteArrayList();
                new InterfaceC0247a(this) { // from class: t0.f

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ C0001b f4998b;

                    {
                        this.f4998b = this;
                    }

                    @Override // e0.InterfaceC0247a
                    public final void accept(Object obj) {
                        switch (r2) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                Configuration configuration = (Configuration) obj;
                                C0001b c0001b = this.f4998b;
                                c0001b.getClass();
                                c0001b.x(false);
                                return;
                            case 1:
                                C0001b c0001b2 = this.f4998b;
                                c0001b2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    c0001b2.y(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj == null) {
                                    this.f4998b.getClass();
                                    throw null;
                                }
                                throw new ClassCastException();
                            default:
                                if (obj == null) {
                                    this.f4998b.getClass();
                                    throw null;
                                }
                                throw new ClassCastException();
                        }
                    }
                };
                new InterfaceC0247a(this) { // from class: t0.f

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ C0001b f4998b;

                    {
                        this.f4998b = this;
                    }

                    @Override // e0.InterfaceC0247a
                    public final void accept(Object obj) {
                        switch (r2) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                Configuration configuration = (Configuration) obj;
                                C0001b c0001b = this.f4998b;
                                c0001b.getClass();
                                c0001b.x(false);
                                return;
                            case 1:
                                C0001b c0001b2 = this.f4998b;
                                c0001b2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    c0001b2.y(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj == null) {
                                    this.f4998b.getClass();
                                    throw null;
                                }
                                throw new ClassCastException();
                            default:
                                if (obj == null) {
                                    this.f4998b.getClass();
                                    throw null;
                                }
                                throw new ClassCastException();
                        }
                    }
                };
                new InterfaceC0247a(this) { // from class: t0.f

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ C0001b f4998b;

                    {
                        this.f4998b = this;
                    }

                    @Override // e0.InterfaceC0247a
                    public final void accept(Object obj) {
                        switch (r2) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                Configuration configuration = (Configuration) obj;
                                C0001b c0001b = this.f4998b;
                                c0001b.getClass();
                                c0001b.x(false);
                                return;
                            case 1:
                                C0001b c0001b2 = this.f4998b;
                                c0001b2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    c0001b2.y(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj == null) {
                                    this.f4998b.getClass();
                                    throw null;
                                }
                                throw new ClassCastException();
                            default:
                                if (obj == null) {
                                    this.f4998b.getClass();
                                    throw null;
                                }
                                throw new ClassCastException();
                        }
                    }
                };
                new InterfaceC0247a(this) { // from class: t0.f

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ C0001b f4998b;

                    {
                        this.f4998b = this;
                    }

                    @Override // e0.InterfaceC0247a
                    public final void accept(Object obj) {
                        switch (r2) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                Configuration configuration = (Configuration) obj;
                                C0001b c0001b = this.f4998b;
                                c0001b.getClass();
                                c0001b.x(false);
                                return;
                            case 1:
                                C0001b c0001b2 = this.f4998b;
                                c0001b2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    c0001b2.y(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj == null) {
                                    this.f4998b.getClass();
                                    throw null;
                                }
                                throw new ClassCastException();
                            default:
                                if (obj == null) {
                                    this.f4998b.getClass();
                                    throw null;
                                }
                                throw new ClassCastException();
                        }
                    }
                };
                new ArrayDeque();
                new RunnableC0004e(21, this);
                return;
            default:
                Object obj = new Object();
                Object obj2 = new Object();
                this.f85L = new HashSet();
                this.f84K = obj;
                this.f86M = obj2;
                return;
        }
    }

    public C0001b(ImageView imageView) {
        this.f83J = 20;
        this.f85L = imageView;
    }

    public C0001b(I.c cVar) {
        this.f83J = 4;
        this.f84K = new Object();
        this.f85L = new ArrayDeque(3);
        this.f86M = cVar;
    }

    public C0001b(A.a aVar) {
        this.f83J = 1;
        this.f85L = aVar;
        this.f86M = new C0002c();
        this.f84K = new ArrayList();
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public C0001b(r2.f fVar, String str, int r4) {
        this(fVar, str, r2.s.f4896a, 26);
        this.f83J = r4;
        switch (r4) {
            case 26:
                return;
            default:
                r2.s sVar = r2.s.f4896a;
                this.f85L = fVar;
                this.f84K = str;
                this.f86M = sVar;
                return;
        }
    }

    public C0001b(Context context, TypedArray typedArray) {
        this.f83J = 21;
        this.f85L = context;
        this.f84K = typedArray;
    }

    public C0001b(R1.a aVar) {
        this.f83J = 0;
        this.f85L = new c0.f(30);
        this.f84K = new ArrayList();
        this.f86M = new ArrayList();
    }

    public C0001b(j2.b bVar, FlutterJNI flutterJNI) {
        this.f83J = 22;
        C0322i c0322i = new C0322i(6, this);
        a1.i iVar = new a1.i((r2.f) bVar, "flutter/accessibility", (r2.l) r2.r.f4893a, (R1.a) null);
        this.f85L = iVar;
        iVar.l(c0322i);
        this.f84K = flutterJNI;
    }

    public C0001b(InterfaceC0091t interfaceC0091t, N.f fVar) {
        this.f83J = 5;
        this.f84K = interfaceC0091t;
        this.f85L = fVar;
    }

    public C0001b(h2.F f2) {
        this.f83J = 16;
        this.f84K = new HashSet();
        this.f86M = f2;
        h2.t tVar = (h2.t) f2;
        this.f85L = new h2.E[]{new h2.C(tVar.getBinaryMessenger()), new A.f(new C0235c(tVar.getBinaryMessenger()))};
        new C0322i(tVar.getBinaryMessenger()).f3983K = this;
    }

    public C0001b(C0001b c0001b, r2.h hVar) {
        this.f83J = 24;
        this.f86M = c0001b;
        this.f84K = new AtomicReference(null);
        this.f85L = hVar;
    }

    public C0001b(G.d dVar, Handler handler, Callable callable) {
        this.f83J = 3;
        this.f86M = dVar;
        this.f85L = handler;
        this.f84K = callable;
    }

    public C0001b(r2.f fVar, Context context, O1.a aVar) {
        this.f83J = 29;
        N2.g.e(fVar, "messenger");
        N2.g.e(context, "context");
        this.f85L = fVar;
        this.f84K = context;
        this.f86M = aVar;
        try {
            InterfaceC0536f.f5370I.getClass();
            C0535e.b(fVar, this, "shared_preferences");
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e4);
        }
    }

    public C0001b(A.a aVar, byte b3) {
        this.f83J = 6;
        this.f85L = aVar;
        this.f84K = new ReentrantLock();
        this.f86M = new WeakHashMap();
    }
}
