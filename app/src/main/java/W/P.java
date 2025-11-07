package w;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v.C0480b;
import x.AbstractC0547b;
import x.AbstractC0549d;

/* loaded from: classes.dex */
public final class P extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5058a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5059b;

    public P(int r22, List list) {
        Object c0490f;
        this.f5058a = r22;
        switch (r22) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f5059b = arrayList;
                arrayList.addAll(list);
                return;
            default:
                if (list.isEmpty()) {
                    c0490f = new CameraCaptureSession.StateCallback();
                } else if (list.size() == 1) {
                    c0490f = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    c0490f = new C0490F(list);
                }
                this.f5059b = c0490f;
                return;
        }
    }

    @Override // w.b0
    public void a(d0 d0Var) {
        switch (this.f5058a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f5059b).onActive((CameraCaptureSession) ((h2.J) d0Var.s().f3003K).f3303K);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f5059b).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).a(d0Var);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.b0
    public void b(d0 d0Var) {
        switch (this.f5058a) {
            case 1:
                AbstractC0549d.b((CameraCaptureSession.StateCallback) this.f5059b, (CameraCaptureSession) ((h2.J) d0Var.s().f3003K).f3303K);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f5059b).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).b(d0Var);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.b0
    public void c(d0 d0Var) {
        switch (this.f5058a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f5059b).onClosed((CameraCaptureSession) ((h2.J) d0Var.s().f3003K).f3303K);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f5059b).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).c(d0Var);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.b0
    public final void d(d0 d0Var) {
        switch (this.f5058a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                synchronized (((Q) this.f5059b).f5060a) {
                    try {
                        switch (N.f5057a[((Q) this.f5059b).f5070l.ordinal()]) {
                            case 1:
                            case 2:
                            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ((Q) this.f5059b).f5070l);
                            case 4:
                            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                ((Q) this.f5059b).b();
                                break;
                            case 8:
                                x1.X.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                        }
                        x1.X.b("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + ((Q) this.f5059b).f5070l);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f5059b).onConfigureFailed((CameraCaptureSession) ((h2.J) d0Var.s().f3003K).f3303K);
                return;
            default:
                Iterator it = ((ArrayList) this.f5059b).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).d(d0Var);
                }
                return;
        }
    }

    @Override // w.b0
    public final void e(d0 d0Var) {
        switch (this.f5058a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                synchronized (((Q) this.f5059b).f5060a) {
                    try {
                        switch (N.f5057a[((Q) this.f5059b).f5070l.ordinal()]) {
                            case 1:
                            case 2:
                            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            case 8:
                                throw new IllegalStateException("onConfigured() should not be possible in state: " + ((Q) this.f5059b).f5070l);
                            case 4:
                                Q q3 = (Q) this.f5059b;
                                q3.f5070l = O.OPENED;
                                q3.f5065f = d0Var;
                                if (q3.g != null) {
                                    C0480b c0480b = q3.f5067i;
                                    c0480b.getClass();
                                    List<Object> unmodifiableList = Collections.unmodifiableList(new ArrayList(c0480b.f5043a));
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : unmodifiableList) {
                                        if (obj == null) {
                                            arrayList.add(null);
                                        } else {
                                            throw new ClassCastException();
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    if (!it.hasNext()) {
                                        if (!arrayList2.isEmpty()) {
                                            Q q4 = (Q) this.f5059b;
                                            q4.f(q4.m(arrayList2));
                                        }
                                    } else if (it.next() == null) {
                                        throw null;
                                    } else {
                                        throw new ClassCastException();
                                    }
                                }
                                x1.X.a("CaptureSession", "Attempting to send capture request onConfigured");
                                Q q5 = (Q) this.f5059b;
                                q5.h(q5.g);
                                Q q6 = (Q) this.f5059b;
                                ArrayList arrayList3 = q6.f5061b;
                                if (!arrayList3.isEmpty()) {
                                    q6.f(arrayList3);
                                    arrayList3.clear();
                                    break;
                                }
                                break;
                            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                ((Q) this.f5059b).f5065f = d0Var;
                                break;
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                d0Var.i();
                                break;
                        }
                        x1.X.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + ((Q) this.f5059b).f5070l);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f5059b).onConfigured((CameraCaptureSession) ((h2.J) d0Var.s().f3003K).f3303K);
                return;
            default:
                Iterator it2 = ((ArrayList) this.f5059b).iterator();
                while (it2.hasNext()) {
                    ((b0) it2.next()).e(d0Var);
                }
                return;
        }
    }

    @Override // w.b0
    public final void f(d0 d0Var) {
        switch (this.f5058a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                synchronized (((Q) this.f5059b).f5060a) {
                    try {
                        if (N.f5057a[((Q) this.f5059b).f5070l.ordinal()] != 1) {
                            x1.X.a("CaptureSession", "CameraCaptureSession.onReady() " + ((Q) this.f5059b).f5070l);
                        } else {
                            throw new IllegalStateException("onReady() should not be possible in state: " + ((Q) this.f5059b).f5070l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f5059b).onReady((CameraCaptureSession) ((h2.J) d0Var.s().f3003K).f3303K);
                return;
            default:
                Iterator it = ((ArrayList) this.f5059b).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).f(d0Var);
                }
                return;
        }
    }

    @Override // w.b0
    public final void g(d0 d0Var) {
        switch (this.f5058a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                synchronized (((Q) this.f5059b).f5060a) {
                    try {
                        if (((Q) this.f5059b).f5070l != O.UNINITIALIZED) {
                            x1.X.a("CaptureSession", "onSessionFinished()");
                            ((Q) this.f5059b).b();
                        } else {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ((Q) this.f5059b).f5070l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.f5059b).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).g(d0Var);
                }
                return;
        }
    }

    @Override // w.b0
    public void h(d0 d0Var, Surface surface) {
        switch (this.f5058a) {
            case 1:
                AbstractC0547b.a((CameraCaptureSession.StateCallback) this.f5059b, (CameraCaptureSession) ((h2.J) d0Var.s().f3003K).f3303K, surface);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f5059b).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).h(d0Var, surface);
                }
                return;
            default:
                return;
        }
    }

    public P(Q q3) {
        this.f5058a = 0;
        this.f5059b = q3;
    }

    private final void i(d0 d0Var) {
    }
}
