package x1;

import A0.C0001b;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.example.catering_inventory.R;
import java.io.File;
import z2.C0960b;

/* renamed from: x1.v4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727v4 implements r2.m {

    /* renamed from: J  reason: collision with root package name */
    public Object f6108J;

    /* renamed from: K  reason: collision with root package name */
    public Object f6109K;

    @Override // r2.m
    public void i(h2.J j3, q2.n nVar) {
        int r6;
        Toast toast;
        N2.g.e(j3, "call");
        String str = (String) j3.f3303K;
        View view = null;
        if (N2.g.a(str, "showToast")) {
            String valueOf = String.valueOf(j3.p("msg"));
            String valueOf2 = String.valueOf(j3.p("length"));
            String valueOf3 = String.valueOf(j3.p("gravity"));
            Number number = (Number) j3.p("bgcolor");
            Number number2 = (Number) j3.p("textcolor");
            Number number3 = (Number) j3.p("fontSize");
            String str2 = (String) j3.p("fontAsset");
            if (valueOf3.equals("top")) {
                r6 = 48;
            } else if (valueOf3.equals("center")) {
                r6 = 17;
            } else {
                r6 = 80;
            }
            boolean equals = valueOf2.equals("long");
            Context context = (Context) this.f6108J;
            if (number != null) {
                Object systemService = context.getSystemService("layout_inflater");
                N2.g.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.text);
                textView.setText(valueOf);
                Drawable drawable = context.getDrawable(R.drawable.corner);
                N2.g.b(drawable);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView.setBackground(drawable);
                if (number3 != null) {
                    textView.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(context);
                this.f6109K = toast2;
                toast2.setDuration(equals ? 1 : 0);
                if (str2 != null) {
                    AssetManager assets = context.getAssets();
                    N2.g.d(assets, "getAssets(...)");
                    String str3 = ((String) ((l2.c) C0001b.L().f85L).f4112d.f1532c) + File.separator + str2;
                    N2.g.d(str3, "getLookupKeyForAsset(...)");
                    textView.setTypeface(Typeface.createFromAsset(assets, str3));
                }
                Toast toast3 = (Toast) this.f6109K;
                if (toast3 != null) {
                    toast3.setView(inflate);
                }
            } else {
                Log.d("KARTHIK", "showToast: " + number + " " + number2 + " " + number3 + " " + str2);
                Toast makeText = Toast.makeText(context, valueOf, equals ? 1 : 0);
                this.f6109K = makeText;
                if (Build.VERSION.SDK_INT < 30) {
                    if (makeText != null) {
                        view = makeText.getView();
                    }
                    N2.g.b(view);
                    View findViewById = view.findViewById(16908299);
                    N2.g.d(findViewById, "findViewById(...)");
                    TextView textView2 = (TextView) findViewById;
                    if (number3 != null) {
                        textView2.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView2.setTextColor(number2.intValue());
                    }
                    if (str2 != null) {
                        AssetManager assets2 = context.getAssets();
                        N2.g.d(assets2, "getAssets(...)");
                        String str4 = ((String) ((l2.c) C0001b.L().f85L).f4112d.f1532c) + File.separator + str2;
                        N2.g.d(str4, "getLookupKeyForAsset(...)");
                        textView2.setTypeface(Typeface.createFromAsset(assets2, str4));
                    }
                }
            }
            try {
                if (r6 != 17) {
                    if (r6 != 48) {
                        Toast toast4 = (Toast) this.f6109K;
                        if (toast4 != null) {
                            toast4.setGravity(r6, 0, 100);
                        }
                    } else {
                        Toast toast5 = (Toast) this.f6109K;
                        if (toast5 != null) {
                            toast5.setGravity(r6, 0, 100);
                        }
                    }
                } else {
                    Toast toast6 = (Toast) this.f6109K;
                    if (toast6 != null) {
                        toast6.setGravity(r6, 0, 0);
                    }
                }
            } catch (Exception unused) {
            }
            if (context instanceof Activity) {
                N2.g.c(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).runOnUiThread(new D.N(25, this));
            } else {
                Toast toast7 = (Toast) this.f6109K;
                if (toast7 != null) {
                    toast7.show();
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (toast = (Toast) this.f6109K) != null) {
                toast.addCallback(new C0960b(this));
            }
            nVar.c(Boolean.TRUE);
        } else if (N2.g.a(str, "cancel")) {
            Toast toast8 = (Toast) this.f6109K;
            if (toast8 != null) {
                toast8.cancel();
                this.f6109K = null;
            }
            nVar.c(Boolean.TRUE);
        } else {
            nVar.b();
        }
    }
}
