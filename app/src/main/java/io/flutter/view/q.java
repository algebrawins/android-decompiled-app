package io.flutter.view;

import A0.C0001b;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0235c;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final View f3740a;

    /* renamed from: b  reason: collision with root package name */
    public final C0001b f3741b;

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f3742c;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityViewEmbedder f3743d;

    /* renamed from: e  reason: collision with root package name */
    public final io.flutter.plugin.platform.g f3744e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f3745f;
    public final HashMap g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f3746h;

    /* renamed from: i  reason: collision with root package name */
    public l f3747i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f3748j;

    /* renamed from: k  reason: collision with root package name */
    public int f3749k;

    /* renamed from: l  reason: collision with root package name */
    public l f3750l;

    /* renamed from: m  reason: collision with root package name */
    public l f3751m;

    /* renamed from: n  reason: collision with root package name */
    public l f3752n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f3753o;

    /* renamed from: p  reason: collision with root package name */
    public int f3754p;

    /* renamed from: q  reason: collision with root package name */
    public Integer f3755q;

    /* renamed from: r  reason: collision with root package name */
    public C0235c f3756r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3757s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3758t;

    /* renamed from: u  reason: collision with root package name */
    public final b f3759u;

    /* renamed from: v  reason: collision with root package name */
    public final c f3760v;

    /* renamed from: w  reason: collision with root package name */
    public final e f3761w;

    /* renamed from: x  reason: collision with root package name */
    public final d f3762x;

    /* renamed from: y  reason: collision with root package name */
    public static final int f3738y = ((h.SCROLL_RIGHT.value | h.SCROLL_LEFT.value) | h.SCROLL_UP.value) | h.SCROLL_DOWN.value;

    /* renamed from: z  reason: collision with root package name */
    public static final int f3739z = ((((((((((j.HAS_CHECKED_STATE.value | j.IS_CHECKED.value) | j.IS_SELECTED.value) | j.IS_TEXT_FIELD.value) | j.IS_FOCUSED.value) | j.HAS_ENABLED_STATE.value) | j.IS_ENABLED.value) | j.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | j.HAS_TOGGLED_STATE.value) | j.IS_TOGGLED.value) | j.IS_FOCUSABLE.value) | j.IS_SLIDER.value;

    /* renamed from: A  reason: collision with root package name */
    public static final int f3737A = (h.DID_GAIN_ACCESSIBILITY_FOCUS.value & h.DID_LOSE_ACCESSIBILITY_FOCUS.value) & h.SHOW_ON_SCREEN.value;

    public q(View view, C0001b c0001b, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.g gVar) {
        int r6;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.g = new HashMap();
        this.f3746h = new HashMap();
        this.f3749k = 0;
        this.f3753o = new ArrayList();
        this.f3754p = 0;
        this.f3755q = 0;
        this.f3757s = false;
        this.f3758t = false;
        this.f3759u = new b(this);
        c cVar = new c(this);
        this.f3760v = cVar;
        d dVar = new d(this, new Handler());
        this.f3762x = dVar;
        this.f3740a = view;
        this.f3741b = c0001b;
        this.f3742c = accessibilityManager;
        this.f3745f = contentResolver;
        this.f3743d = accessibilityViewEmbedder;
        this.f3744e = gVar;
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        e eVar = new e(this, accessibilityManager);
        this.f3761w = eVar;
        eVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(eVar);
        dVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, dVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            r6 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (r6 != Integer.MAX_VALUE && r6 >= 300) {
                this.f3749k |= g.BOLD_TEXT.value;
            } else {
                this.f3749k &= ~g.BOLD_TEXT.value;
            }
            ((FlutterJNI) c0001b.f84K).setAccessibilityFeatures(this.f3749k);
        }
        gVar.b(this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [io.flutter.view.i, java.lang.Object] */
    public final i a(int r4) {
        HashMap hashMap = this.f3746h;
        i iVar = (i) hashMap.get(Integer.valueOf(r4));
        if (iVar == null) {
            ?? obj = new Object();
            obj.f3678c = -1;
            obj.f3677b = r4;
            obj.f3676a = 267386881 + r4;
            hashMap.put(Integer.valueOf(r4), obj);
            return obj;
        }
        return iVar;
    }

    public final l b(int r3) {
        HashMap hashMap = this.g;
        l lVar = (l) hashMap.get(Integer.valueOf(r3));
        if (lVar == null) {
            l lVar2 = new l(this);
            lVar2.f3709b = r3;
            hashMap.put(Integer.valueOf(r3), lVar2);
            return lVar2;
        }
        return lVar;
    }

    public final AccessibilityEvent c(int r3, int r4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(r4);
        View view = this.f3740a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, r3);
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int r18) {
        boolean z3;
        boolean z4;
        String str;
        j jVar;
        int r10;
        int length;
        int r15;
        boolean z5;
        boolean z6;
        boolean z7;
        h(true);
        if (r18 >= 65536) {
            return this.f3743d.createAccessibilityNodeInfo(r18);
        }
        HashMap hashMap = this.g;
        View view = this.f3740a;
        if (r18 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                obtain.setImportantForAccessibility(false);
            }
            return obtain;
        }
        l lVar = (l) hashMap.get(Integer.valueOf(r18));
        if (lVar == null) {
            return null;
        }
        int r11 = lVar.f3715i;
        io.flutter.plugin.platform.g gVar = this.f3744e;
        if (r11 != -1 && gVar.c(r11)) {
            gVar.d(lVar.f3715i);
            return null;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, r18);
        int r13 = Build.VERSION.SDK_INT;
        if (r13 >= 24) {
            if (lVar.i(j.SCOPES_ROUTE) || (l.b(lVar) == null && (lVar.f3711d & (~f3737A)) == 0)) {
                z7 = false;
            } else {
                z7 = true;
            }
            obtain2.setImportantForAccessibility(z7);
        }
        CharSequence charSequence = "";
        obtain2.setViewIdResourceName("");
        String str2 = lVar.f3721o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, r18);
        obtain2.setFocusable(lVar.k());
        l lVar2 = this.f3750l;
        if (lVar2 != null) {
            if (lVar2.f3709b == r18) {
                z6 = true;
            } else {
                z6 = false;
            }
            obtain2.setFocused(z6);
        }
        l lVar3 = this.f3747i;
        if (lVar3 != null) {
            if (lVar3.f3709b == r18) {
                z5 = true;
            } else {
                z5 = false;
            }
            obtain2.setAccessibilityFocused(z5);
        }
        j jVar2 = j.IS_TEXT_FIELD;
        if (lVar.i(jVar2)) {
            obtain2.setPassword(lVar.i(j.IS_OBSCURED));
            if (!lVar.i(j.IS_READ_ONLY)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!lVar.i(jVar));
            int r102 = lVar.g;
            if (r102 != -1 && (r15 = lVar.f3714h) != -1) {
                obtain2.setTextSelection(r102, r15);
            }
            l lVar4 = this.f3747i;
            if (lVar4 != null && lVar4.f3709b == r18) {
                obtain2.setLiveRegion(1);
            }
            if (l.a(lVar, h.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(RecognitionOptions.QR_CODE);
                r10 = 1;
            } else {
                r10 = 0;
            }
            if (l.a(lVar, h.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(RecognitionOptions.UPC_A);
                r10 = 1;
            }
            if (l.a(lVar, h.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(RecognitionOptions.QR_CODE);
                r10 |= 2;
            }
            if (l.a(lVar, h.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(RecognitionOptions.UPC_A);
                r10 |= 2;
            }
            obtain2.setMovementGranularities(r10);
            if (lVar.f3712e >= 0) {
                String str3 = lVar.f3724r;
                if (str3 == null) {
                    length = 0;
                } else {
                    length = str3.length();
                }
                obtain2.setMaxTextLength((length - lVar.f3713f) + lVar.f3712e);
            }
        }
        if (l.a(lVar, h.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (l.a(lVar, h.COPY)) {
            obtain2.addAction(16384);
        }
        if (l.a(lVar, h.CUT)) {
            obtain2.addAction(65536);
        }
        if (l.a(lVar, h.PASTE)) {
            obtain2.addAction(RecognitionOptions.TEZ_CODE);
        }
        if (l.a(lVar, h.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (lVar.i(j.IS_BUTTON)) {
            obtain2.setClassName("android.widget.Button");
        }
        if (lVar.i(j.IS_IMAGE)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (l.a(lVar, h.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        l lVar5 = lVar.f3697P;
        if (lVar5 != null) {
            obtain2.setParent(view, lVar5.f3709b);
        } else {
            obtain2.setParent(view);
        }
        int r22 = lVar.f3683B;
        if (r22 != -1 && r13 >= 22) {
            obtain2.setTraversalAfter(view, r22);
        }
        Rect rect = lVar.f3707Z;
        l lVar6 = lVar.f3697P;
        if (lVar6 != null) {
            Rect rect2 = lVar6.f3707Z;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            obtain2.setBoundsInParent(rect3);
        } else {
            obtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] r23 = new int[2];
        view.getLocationOnScreen(r23);
        rect4.offset(r23[0], r23[1]);
        obtain2.setBoundsInScreen(rect4);
        obtain2.setVisibleToUser(true);
        if (lVar.i(j.HAS_ENABLED_STATE) && !lVar.i(j.IS_ENABLED)) {
            z3 = false;
        } else {
            z3 = true;
        }
        obtain2.setEnabled(z3);
        if (l.a(lVar, h.TAP)) {
            if (lVar.f3701T != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar.f3701T.f3680e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (lVar.i(j.IS_SLIDER)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (l.a(lVar, h.LONG_PRESS)) {
            if (lVar.f3702U != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar.f3702U.f3680e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        h hVar = h.SCROLL_LEFT;
        if (l.a(lVar, hVar) || l.a(lVar, h.SCROLL_UP) || l.a(lVar, h.SCROLL_RIGHT) || l.a(lVar, h.SCROLL_DOWN)) {
            obtain2.setScrollable(true);
            if (lVar.i(j.HAS_IMPLICIT_SCROLLING)) {
                if (!l.a(lVar, hVar) && !l.a(lVar, h.SCROLL_RIGHT)) {
                    if (i(lVar)) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar.f3716j, 0, false));
                    } else {
                        obtain2.setClassName("android.widget.ScrollView");
                    }
                } else if (i(lVar)) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar.f3716j, false));
                } else {
                    obtain2.setClassName("android.widget.HorizontalScrollView");
                }
            }
            if (l.a(lVar, hVar) || l.a(lVar, h.SCROLL_UP)) {
                obtain2.addAction(RecognitionOptions.AZTEC);
            }
            if (l.a(lVar, h.SCROLL_RIGHT) || l.a(lVar, h.SCROLL_DOWN)) {
                obtain2.addAction(8192);
            }
        }
        h hVar2 = h.INCREASE;
        if (l.a(lVar, hVar2) || l.a(lVar, h.DECREASE)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (l.a(lVar, hVar2)) {
                obtain2.addAction(RecognitionOptions.AZTEC);
            }
            if (l.a(lVar, h.DECREASE)) {
                obtain2.addAction(8192);
            }
        }
        if (lVar.i(j.IS_LIVE_REGION)) {
            obtain2.setLiveRegion(1);
        }
        if (lVar.i(jVar2)) {
            obtain2.setText(l.e(lVar.f3724r, lVar.f3725s));
            if (r13 >= 28) {
                CharSequence[] charSequenceArr = {lVar.f(), l.e(lVar.f3730x, lVar.f3731y)};
                CharSequence charSequence2 = null;
                for (int r24 = 0; r24 < 2; r24++) {
                    CharSequence charSequence3 = charSequenceArr[r24];
                    if (charSequence3 != null && charSequence3.length() > 0) {
                        if (charSequence2 != null && charSequence2.length() != 0) {
                            charSequence2 = TextUtils.concat(charSequence2, ", ", charSequence3);
                        } else {
                            charSequence2 = charSequence3;
                        }
                    }
                }
                z4 = false;
                obtain2.setHintText(charSequence2);
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
            if (!lVar.i(j.SCOPES_ROUTE)) {
                CharSequence b3 = l.b(lVar);
                if (r13 < 28 && lVar.f3732z != null) {
                    if (b3 != null) {
                        charSequence = b3;
                    }
                    b3 = ((Object) charSequence) + "\n" + lVar.f3732z;
                }
                if (b3 != null) {
                    obtain2.setContentDescription(b3);
                }
            }
        }
        int r25 = Build.VERSION.SDK_INT;
        if (r25 >= 28 && (str = lVar.f3732z) != null) {
            obtain2.setTooltipText(str);
        }
        boolean i3 = lVar.i(j.HAS_CHECKED_STATE);
        boolean i4 = lVar.i(j.HAS_TOGGLED_STATE);
        obtain2.setCheckable((i3 || i4) ? true : true);
        if (i3) {
            obtain2.setChecked(lVar.i(j.IS_CHECKED));
            if (lVar.i(j.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (i4) {
            obtain2.setChecked(lVar.i(j.IS_TOGGLED));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(lVar.i(j.IS_SELECTED));
        if (r25 >= 28) {
            obtain2.setHeading(lVar.i(j.IS_HEADER));
        }
        l lVar7 = this.f3747i;
        if (lVar7 != null && lVar7.f3709b == r18) {
            obtain2.addAction(RecognitionOptions.ITF);
        } else {
            obtain2.addAction(64);
        }
        ArrayList arrayList = lVar.f3700S;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(iVar.f3676a, iVar.f3679d));
            }
        }
        Iterator it2 = lVar.f3698Q.iterator();
        while (it2.hasNext()) {
            l lVar8 = (l) it2.next();
            if (!lVar8.i(j.IS_HIDDEN)) {
                int r3 = lVar8.f3715i;
                if (r3 != -1) {
                    gVar.d(r3);
                    if (!gVar.c(lVar8.f3715i)) {
                        obtain2.addChild(null);
                    }
                }
                obtain2.addChild(view, lVar8.f3709b);
            }
        }
        return obtain2;
    }

    public final boolean d(MotionEvent motionEvent, boolean z3) {
        l j3;
        if (!this.f3742c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.g;
        if (hashMap.isEmpty()) {
            return false;
        }
        l j4 = ((l) hashMap.get(0)).j(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z3);
        if (j4 != null && j4.f3715i != -1) {
            if (z3) {
                return false;
            }
            return this.f3743d.onAccessibilityHoverEvent(j4.f3709b, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() == 10) {
                l lVar = this.f3752n;
                if (lVar != null) {
                    f(lVar.f3709b, RecognitionOptions.QR_CODE);
                    this.f3752n = null;
                }
            } else {
                motionEvent.toString();
                return false;
            }
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (!hashMap.isEmpty() && (j3 = ((l) hashMap.get(0)).j(new float[]{x3, y3, 0.0f, 1.0f}, z3)) != this.f3752n) {
                if (j3 != null) {
                    f(j3.f3709b, RecognitionOptions.ITF);
                }
                l lVar2 = this.f3752n;
                if (lVar2 != null) {
                    f(lVar2.f3709b, RecognitionOptions.QR_CODE);
                }
                this.f3752n = j3;
            }
        }
        return true;
    }

    public final boolean e(l lVar, int r18, Bundle bundle, boolean z3) {
        int r13;
        int r4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int r5 = lVar.g;
        int r6 = lVar.f3714h;
        if (r6 >= 0 && r5 >= 0) {
            if (r4 != 1) {
                if (r4 != 2) {
                    if (r4 != 4) {
                        if (r4 == 8 || r4 == 16) {
                            if (z3) {
                                lVar.f3714h = lVar.f3724r.length();
                            } else {
                                lVar.f3714h = 0;
                            }
                        }
                    } else if (z3 && r6 < lVar.f3724r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(lVar.f3724r.substring(lVar.f3714h));
                        if (matcher.find()) {
                            lVar.f3714h += matcher.start(1);
                        } else {
                            lVar.f3714h = lVar.f3724r.length();
                        }
                    } else if (!z3 && lVar.f3714h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.f3724r.substring(0, lVar.f3714h));
                        if (matcher2.find()) {
                            lVar.f3714h = matcher2.start(1);
                        } else {
                            lVar.f3714h = 0;
                        }
                    }
                } else if (z3 && r6 < lVar.f3724r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.f3724r.substring(lVar.f3714h));
                    matcher3.find();
                    if (matcher3.find()) {
                        lVar.f3714h += matcher3.start(1);
                    } else {
                        lVar.f3714h = lVar.f3724r.length();
                    }
                } else if (!z3 && lVar.f3714h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.f3724r.substring(0, lVar.f3714h));
                    if (matcher4.find()) {
                        lVar.f3714h = matcher4.start(1);
                    }
                }
            } else if (z3 && r6 < lVar.f3724r.length()) {
                lVar.f3714h++;
            } else if (!z3 && (r13 = lVar.f3714h) > 0) {
                lVar.f3714h = r13 - 1;
            }
            if (!z4) {
                lVar.g = lVar.f3714h;
            }
        }
        if (r5 != lVar.g || r6 != lVar.f3714h) {
            String str = lVar.f3724r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent c4 = c(lVar.f3709b, 8192);
            c4.getText().add(str);
            c4.setFromIndex(lVar.g);
            c4.setToIndex(lVar.f3714h);
            c4.setItemCount(str.length());
            g(c4);
        }
        C0001b c0001b = this.f3741b;
        if (r4 != 1) {
            if (r4 != 2) {
                if (r4 == 4 || r4 == 8 || r4 == 16) {
                    return true;
                }
            } else {
                if (z3) {
                    h hVar = h.MOVE_CURSOR_FORWARD_BY_WORD;
                    if (l.a(lVar, hVar)) {
                        c0001b.A(r18, hVar, Boolean.valueOf(z4));
                        return true;
                    }
                }
                if (!z3) {
                    h hVar2 = h.MOVE_CURSOR_BACKWARD_BY_WORD;
                    if (l.a(lVar, hVar2)) {
                        c0001b.A(r18, hVar2, Boolean.valueOf(z4));
                        return true;
                    }
                }
            }
        } else {
            if (z3) {
                h hVar3 = h.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (l.a(lVar, hVar3)) {
                    c0001b.A(r18, hVar3, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (!z3) {
                h hVar4 = h.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (l.a(lVar, hVar4)) {
                    c0001b.A(r18, hVar4, Boolean.valueOf(z4));
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(int r22, int r3) {
        if (!this.f3742c.isEnabled()) {
            return;
        }
        g(c(r22, r3));
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int r22) {
        if (r22 != 1) {
            if (r22 != 2) {
                return null;
            }
        } else {
            l lVar = this.f3750l;
            if (lVar != null) {
                return createAccessibilityNodeInfo(lVar.f3709b);
            }
        }
        l lVar2 = this.f3747i;
        if (lVar2 != null) {
            return createAccessibilityNodeInfo(lVar2.f3709b);
        }
        Integer num = this.f3748j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(AccessibilityEvent accessibilityEvent) {
        if (!this.f3742c.isEnabled()) {
            return;
        }
        View view = this.f3740a;
        view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final void h(boolean z3) {
        if (this.f3757s == z3) {
            return;
        }
        this.f3757s = z3;
        if (z3) {
            this.f3749k |= g.ACCESSIBLE_NAVIGATION.value;
        } else {
            this.f3749k &= ~g.ACCESSIBLE_NAVIGATION.value;
        }
        ((FlutterJNI) this.f3741b.f84K).setAccessibilityFeatures(this.f3749k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(io.flutter.view.l r3) {
        /*
            r2 = this;
            int r0 = r3.f3716j
            if (r0 <= 0) goto L31
            io.flutter.view.l r0 = r2.f3747i
            r1 = 0
            if (r0 == 0) goto L17
            io.flutter.view.l r0 = r0.f3697P
        Lb:
            if (r0 == 0) goto L13
            if (r0 != r3) goto L10
            goto L14
        L10:
            io.flutter.view.l r0 = r0.f3697P
            goto Lb
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            goto L2f
        L17:
            io.flutter.view.l r3 = r2.f3747i
            if (r3 == 0) goto L2f
            io.flutter.view.l r3 = r3.f3697P
        L1d:
            if (r3 == 0) goto L2c
            io.flutter.view.j r0 = io.flutter.view.j.HAS_IMPLICIT_SCROLLING
            boolean r0 = r3.i(r0)
            if (r0 == 0) goto L29
            r1 = r3
            goto L2c
        L29:
            io.flutter.view.l r3 = r3.f3697P
            goto L1d
        L2c:
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.q.i(io.flutter.view.l):boolean");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r10, int r11, Bundle bundle) {
        String str;
        if (r10 >= 65536) {
            boolean performAction = this.f3743d.performAction(r10, r11, bundle);
            if (performAction && r11 == 128) {
                this.f3748j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.g;
        l lVar = (l) hashMap.get(Integer.valueOf(r10));
        if (lVar == null) {
            return false;
        }
        C0001b c0001b = this.f3741b;
        switch (r11) {
            case 16:
                c0001b.z(r10, h.TAP);
                return true;
            case 32:
                c0001b.z(r10, h.LONG_PRESS);
                return true;
            case RecognitionOptions.EAN_8 /* 64 */:
                if (this.f3747i == null) {
                    this.f3740a.invalidate();
                }
                this.f3747i = lVar;
                c0001b.z(r10, h.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(lVar.f3709b));
                ((a1.i) c0001b.f85L).k(hashMap2, null);
                f(r10, RecognitionOptions.TEZ_CODE);
                if (l.a(lVar, h.INCREASE) || l.a(lVar, h.DECREASE)) {
                    f(r10, 4);
                }
                return true;
            case RecognitionOptions.ITF /* 128 */:
                l lVar2 = this.f3747i;
                if (lVar2 != null && lVar2.f3709b == r10) {
                    this.f3747i = null;
                }
                Integer num = this.f3748j;
                if (num != null && num.intValue() == r10) {
                    this.f3748j = null;
                }
                c0001b.z(r10, h.DID_LOSE_ACCESSIBILITY_FOCUS);
                f(r10, 65536);
                return true;
            case RecognitionOptions.QR_CODE /* 256 */:
                return e(lVar, r10, bundle, true);
            case RecognitionOptions.UPC_A /* 512 */:
                return e(lVar, r10, bundle, false);
            case RecognitionOptions.AZTEC /* 4096 */:
                h hVar = h.SCROLL_UP;
                if (l.a(lVar, hVar)) {
                    c0001b.z(r10, hVar);
                } else {
                    h hVar2 = h.SCROLL_LEFT;
                    if (l.a(lVar, hVar2)) {
                        c0001b.z(r10, hVar2);
                    } else {
                        h hVar3 = h.INCREASE;
                        if (!l.a(lVar, hVar3)) {
                            return false;
                        }
                        lVar.f3724r = lVar.f3726t;
                        lVar.f3725s = lVar.f3727u;
                        f(r10, 4);
                        c0001b.z(r10, hVar3);
                    }
                }
                return true;
            case 8192:
                h hVar4 = h.SCROLL_DOWN;
                if (l.a(lVar, hVar4)) {
                    c0001b.z(r10, hVar4);
                } else {
                    h hVar5 = h.SCROLL_RIGHT;
                    if (l.a(lVar, hVar5)) {
                        c0001b.z(r10, hVar5);
                    } else {
                        h hVar6 = h.DECREASE;
                        if (!l.a(lVar, hVar6)) {
                            return false;
                        }
                        lVar.f3724r = lVar.f3728v;
                        lVar.f3725s = lVar.f3729w;
                        f(r10, 4);
                        c0001b.z(r10, hVar6);
                    }
                }
                return true;
            case 16384:
                c0001b.z(r10, h.COPY);
                return true;
            case RecognitionOptions.TEZ_CODE /* 32768 */:
                c0001b.z(r10, h.PASTE);
                return true;
            case 65536:
                c0001b.z(r10, h.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(lVar.f3714h));
                    hashMap3.put("extent", Integer.valueOf(lVar.f3714h));
                }
                c0001b.A(r10, h.SET_SELECTION, hashMap3);
                l lVar3 = (l) hashMap.get(Integer.valueOf(r10));
                lVar3.g = ((Integer) hashMap3.get("base")).intValue();
                lVar3.f3714h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 1048576:
                c0001b.z(r10, h.DISMISS);
                return true;
            case 2097152:
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
                    str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                } else {
                    str = "";
                }
                c0001b.A(r10, h.SET_TEXT, str);
                lVar.f3724r = str;
                lVar.f3725s = null;
                return true;
            case 16908342:
                c0001b.z(r10, h.SHOW_ON_SCREEN);
                return true;
            default:
                i iVar = (i) this.f3746h.get(Integer.valueOf(r11 - 267386881));
                if (iVar == null) {
                    return false;
                }
                c0001b.A(r10, h.CUSTOM_ACTION, Integer.valueOf(iVar.f3677b));
                return true;
        }
    }
}
