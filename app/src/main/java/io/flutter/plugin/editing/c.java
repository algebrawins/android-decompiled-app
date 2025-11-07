package io.flutter.plugin.editing;

import A0.C0001b;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import h2.J;
import h2.t;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends BaseInputConnection implements e {

    /* renamed from: a  reason: collision with root package name */
    public final t f3506a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3507b;

    /* renamed from: c  reason: collision with root package name */
    public final J f3508c;

    /* renamed from: d  reason: collision with root package name */
    public final f f3509d;

    /* renamed from: e  reason: collision with root package name */
    public final EditorInfo f3510e;

    /* renamed from: f  reason: collision with root package name */
    public ExtractedTextRequest f3511f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public CursorAnchorInfo.Builder f3512h;

    /* renamed from: i  reason: collision with root package name */
    public final ExtractedText f3513i;

    /* renamed from: j  reason: collision with root package name */
    public final InputMethodManager f3514j;

    /* renamed from: k  reason: collision with root package name */
    public final DynamicLayout f3515k;

    /* renamed from: l  reason: collision with root package name */
    public final A.c f3516l;

    /* renamed from: m  reason: collision with root package name */
    public final C0001b f3517m;

    /* renamed from: n  reason: collision with root package name */
    public int f3518n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, int r11, J j3, C0001b c0001b, f fVar, EditorInfo editorInfo) {
        super(tVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.g = false;
        this.f3513i = new ExtractedText();
        this.f3518n = 0;
        this.f3506a = tVar;
        this.f3507b = r11;
        this.f3508c = j3;
        this.f3509d = fVar;
        fVar.a(this);
        this.f3510e = editorInfo;
        this.f3517m = c0001b;
        this.f3516l = new A.c(25, flutterJNI);
        this.f3515k = new DynamicLayout(fVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3514j = (InputMethodManager) tVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.e
    public final void a(boolean z3) {
        f fVar = this.f3509d;
        fVar.getClass();
        this.f3514j.updateSelection(this.f3506a, Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar), BaseInputConnection.getComposingSpanStart(fVar), BaseInputConnection.getComposingSpanEnd(fVar));
        ExtractedTextRequest extractedTextRequest = this.f3511f;
        InputMethodManager inputMethodManager = this.f3514j;
        t tVar = this.f3506a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(tVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.g) {
            inputMethodManager.updateCursorAnchorInfo(tVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f3512h;
        if (builder == null) {
            this.f3512h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f3512h;
        f fVar = this.f3509d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        fVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(fVar));
        fVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        fVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        if (composingSpanStart >= 0 && composingSpanEnd > composingSpanStart) {
            this.f3512h.setComposingText(composingSpanStart, fVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        } else {
            this.f3512h.setComposingText(-1, "");
        }
        return this.f3512h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f3509d.b();
        this.f3518n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f3513i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f3509d;
        charSequence.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f3509d.e(this);
        while (this.f3518n > 0) {
            endBatchEdit();
            this.f3518n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int r9, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        int r6;
        if (Build.VERSION.SDK_INT >= 25 && (r9 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.f3506a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        r6 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        r6 = -1;
                                    }
                                    if (r6 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        J j3 = this.f3508c;
                                        j3.getClass();
                                        ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f3507b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, r6);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x003f A[EDGE_INSN: B:195:0x003f->B:18:0x003f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01af A[EDGE_INSN: B:201:0x01af->B:107:0x01af ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.c.d(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
        f fVar = this.f3509d;
        fVar.getClass();
        if (Selection.getSelectionStart(fVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(r3, r4);
    }

    public final boolean e(boolean z3, boolean z4) {
        f fVar = this.f3509d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f3515k;
        if (z5) {
            if (z3) {
                Selection.moveUp(fVar, dynamicLayout);
            } else {
                Selection.moveDown(fVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(fVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z3) {
                Selection.extendUp(fVar, dynamicLayout);
            } else {
                Selection.extendDown(fVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f3518n--;
        this.f3509d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f3509d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int r4) {
        ExtractedTextRequest extractedTextRequest2;
        boolean z3 = true;
        if ((r4 & 1) == 0) {
            z3 = false;
        }
        if (z3) {
            extractedTextRequest2 = extractedTextRequest;
        } else {
            extractedTextRequest2 = null;
        }
        this.f3511f = extractedTextRequest2;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int r8) {
        beginBatchEdit();
        boolean z3 = true;
        f fVar = this.f3509d;
        if (r8 == 16908319) {
            setSelection(0, fVar.length());
        } else {
            t tVar = this.f3506a;
            if (r8 == 16908320) {
                int selectionStart = Selection.getSelectionStart(fVar);
                int selectionEnd = Selection.getSelectionEnd(fVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(min, max)));
                    fVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (r8 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(fVar);
                int selectionEnd2 = Selection.getSelectionEnd(fVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (r8 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(tVar.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(fVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(fVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        fVar.delete(min2, max4);
                    }
                    fVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z3 = false;
            }
        }
        endBatchEdit();
        return z3;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int r9) {
        int r5 = this.f3507b;
        J j3 = this.f3508c;
        if (r9 != 0) {
            if (r9 != 1) {
                if (r9 != 2) {
                    if (r9 != 3) {
                        if (r9 != 4) {
                            if (r9 != 5) {
                                if (r9 != 7) {
                                    j3.getClass();
                                    ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r5), "TextInputAction.done"), null);
                                } else {
                                    j3.getClass();
                                    ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r5), "TextInputAction.previous"), null);
                                }
                            } else {
                                j3.getClass();
                                ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r5), "TextInputAction.next"), null);
                            }
                        } else {
                            j3.getClass();
                            ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r5), "TextInputAction.send"), null);
                        }
                    } else {
                        j3.getClass();
                        ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r5), "TextInputAction.search"), null);
                    }
                } else {
                    j3.getClass();
                    ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r5), "TextInputAction.go"), null);
                }
            } else {
                j3.getClass();
                ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r5), "TextInputAction.newline"), null);
            }
        } else {
            j3.getClass();
            ((C0001b) j3.f3303K).M("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r5), "TextInputAction.unspecified"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        J j3 = this.f3508c;
        j3.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((C0001b) j3.f3303K).M("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f3507b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int r4) {
        boolean z3;
        if ((r4 & 1) != 0) {
            this.f3514j.updateCursorAnchorInfo(this.f3506a, b());
        }
        if ((r4 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.g = z3;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f3517m.K(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int r3) {
        boolean composingText;
        beginBatchEdit();
        if (charSequence.length() == 0) {
            composingText = super.commitText(charSequence, r3);
        } else {
            composingText = super.setComposingText(charSequence, r3);
        }
        endBatchEdit();
        return composingText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int r12, int r22) {
        beginBatchEdit();
        boolean selection = super.setSelection(r12, r22);
        endBatchEdit();
        return selection;
    }
}
