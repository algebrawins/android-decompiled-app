package h2;

import A0.C0001b;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h1.C0283c;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3289a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3290b;

    /* renamed from: c  reason: collision with root package name */
    public int f3291c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3292d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3293e;

    public /* synthetic */ D() {
        this.f3289a = 1;
    }

    public D a() {
        boolean z3;
        if (((j1.i) this.f3292d) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        k1.w.a("execute parameter required", z3);
        return new D(this, (C0283c[]) this.f3293e, this.f3290b, this.f3291c);
    }

    public int b(boolean z3) {
        String str;
        if (!this.f3290b) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new t0.j());
                printWriter.print("  ");
                printWriter.print("mName=");
                printWriter.print((String) null);
                printWriter.print(" mIndex=");
                printWriter.print(this.f3291c);
                printWriter.print(" mCommitted=");
                printWriter.println(this.f3290b);
                ArrayList arrayList = (ArrayList) this.f3292d;
                if (!arrayList.isEmpty()) {
                    printWriter.print("  ");
                    printWriter.println("Operations:");
                    int size = arrayList.size();
                    for (int r5 = 0; r5 < size; r5++) {
                        t0.i iVar = (t0.i) arrayList.get(r5);
                        switch (iVar.f4999a) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                str = "NULL";
                                break;
                            case 1:
                                str = "ADD";
                                break;
                            case 2:
                                str = "REPLACE";
                                break;
                            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                                str = "REMOVE";
                                break;
                            case 4:
                                str = "HIDE";
                                break;
                            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                                str = "SHOW";
                                break;
                            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                str = "DETACH";
                                break;
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                str = "ATTACH";
                                break;
                            case 8:
                                str = "SET_PRIMARY_NAV";
                                break;
                            case 9:
                                str = "UNSET_PRIMARY_NAV";
                                break;
                            case 10:
                                str = "OP_SET_MAX_LIFECYCLE";
                                break;
                            default:
                                str = "cmd=" + iVar.f4999a;
                                break;
                        }
                        printWriter.print("  ");
                        printWriter.print("  Op #");
                        printWriter.print(r5);
                        printWriter.print(": ");
                        printWriter.print(str);
                        printWriter.print(" ");
                        printWriter.println(iVar.f5000b);
                        if (iVar.f5001c != 0 || iVar.f5002d != 0) {
                            printWriter.print("  ");
                            printWriter.print("enterAnim=#");
                            printWriter.print(Integer.toHexString(iVar.f5001c));
                            printWriter.print(" exitAnim=#");
                            printWriter.println(Integer.toHexString(iVar.f5002d));
                        }
                        if (iVar.f5003e != 0 || iVar.f5004f != 0) {
                            printWriter.print("  ");
                            printWriter.print("popEnterAnim=#");
                            printWriter.print(Integer.toHexString(iVar.f5003e));
                            printWriter.print(" popExitAnim=#");
                            printWriter.println(Integer.toHexString(iVar.f5004f));
                        }
                    }
                }
                printWriter.close();
            }
            this.f3290b = true;
            C0001b c0001b = (C0001b) this.f3293e;
            this.f3291c = -1;
            if (z3) {
                synchronized (((ArrayList) c0001b.f84K)) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                }
                return this.f3291c;
            }
            c0001b.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        throw new IllegalStateException("commit already called");
    }

    public String toString() {
        switch (this.f3289a) {
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f3291c >= 0) {
                    sb.append(" #");
                    sb.append(this.f3291c);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public D(D d4, C0283c[] c0283cArr, boolean z3, int r5) {
        this.f3289a = 2;
        this.f3293e = d4;
        this.f3292d = c0283cArr;
        boolean z4 = false;
        if (c0283cArr != null && z3) {
            z4 = true;
        }
        this.f3290b = z4;
        this.f3291c = r5;
    }

    public D(C0001b c0001b) {
        this.f3289a = 3;
        c0001b.getClass();
        this.f3292d = new ArrayList();
        this.f3291c = -1;
        this.f3293e = c0001b;
    }

    public D(C0001b c0001b, KeyEvent keyEvent) {
        this.f3289a = 0;
        this.f3293e = c0001b;
        this.f3291c = ((E[]) c0001b.f85L).length;
        this.f3290b = false;
        this.f3292d = keyEvent;
    }
}
