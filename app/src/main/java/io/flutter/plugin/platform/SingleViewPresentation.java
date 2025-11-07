package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private l rootView;
    private boolean startFocused;
    private final o state;
    private int viewId;

    /* JADX WARN: Type inference failed for: r2v1, types: [io.flutter.plugin.platform.o, java.lang.Object] */
    public SingleViewPresentation(Context context, Display display, e eVar, a aVar, int r6, View.OnFocusChangeListener onFocusChangeListener) {
        super(new m(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = r6;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new Object();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public o detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public e getView() {
        this.state.getClass();
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        o oVar = this.state;
        if (oVar.f3603b == null) {
            oVar.f3603b = new k(getContext());
        }
        if (this.state.f3602a == null) {
            o oVar2 = this.state;
            oVar2.f3602a = new q((WindowManager) getContext().getSystemService("window"), oVar2.f3603b);
        }
        this.container = new FrameLayout(getContext());
        new n(getContext(), this.state.f3602a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, a aVar, o oVar, View.OnFocusChangeListener onFocusChangeListener, boolean z3) {
        super(new m(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = oVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z3;
    }
}
