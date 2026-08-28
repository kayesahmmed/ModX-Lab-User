/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageInfo
 *  android.content.res.AssetManager
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Environment
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.provider.DocumentsContract
 *  android.provider.Settings
 *  android.speech.tts.TextToSpeech
 *  android.text.method.HideReturnsTransformationMethod
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewOutlineProvider
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.LinearInterpolator
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidX.Master12.AnimatedParticleView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.documentfile.provider.DocumentFile
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.FirebaseApp
 *  com.google.firebase.auth.AuthResult
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.database.ChildEventListener
 *  com.google.firebase.database.DataSnapshot
 *  com.google.firebase.database.DatabaseError
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.FirebaseDatabase
 *  com.google.firebase.database.GenericTypeIndicator
 *  com.google.firebase.database.ValueEventListener
 *  com.kayesahmmed.pro.R$drawable
 *  com.kayesahmmed.pro.R$id
 *  com.kayesahmmed.pro.R$layout
 *  com.kayesahmmed.pro.R$raw
 *  eightbitlab.com.blurview.BlurAlgorithm
 *  eightbitlab.com.blurview.BlurView
 *  eightbitlab.com.blurview.RenderScriptBlur
 *  rikka.shizuku.Shizuku
 *  rikka.shizuku.Shizuku$OnRequestPermissionResultListener
 *  rikka.shizuku.ShizukuRemoteProcess
 */
package com.kayesahmmed.pro;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidX.Master12.AnimatedParticleView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.documentfile.provider.DocumentFile;
import com.AndroidSketchwareMaster.ShizukuMaster;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.kayesahmmed.pro.R;
import com.kayesahmmed.pro.SketchwareUtil;
import eightbitlab.com.blurview.BlurAlgorithm;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rikka.shizuku.Shizuku;
import rikka.shizuku.ShizukuRemoteProcess;

public class MainActivity
extends AppCompatActivity {
    private Timer _timer = new Timer();
    private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
    private boolean button_1 = false;
    private boolean button_2 = false;
    private boolean button_3 = false;
    private boolean button_4 = false;
    private double n = 0.0;
    private String link = "";
    private String message = "";
    private Uri muri;
    private int NEW_FOLDER_REQUEST_CODE;
    private DocumentFile mfile;
    private DocumentFile mfile1;
    private Uri uri2;
    private DocumentFile parentfile;
    private Uri desturi;
    private Uri destUri;
    private DocumentFile parentFile;
    private DocumentFile mfile2;
    private String rgtime = "";
    private boolean button_5 = false;
    private String status = "";
    private String access = "";
    private String key = "";
    private HashMap<String, Object> map = new HashMap();
    private boolean button_6 = false;
    private String Validity = "";
    private double Position = 0.0;
    private double term = 0.0;
    private double hour = 0.0;
    private double minute = 0.0;
    private double second = 0.0;
    private String hh = "";
    private String mm = "";
    private String ss = "";
    public String app_version = "";
    public boolean isVoicePlayed = false;
    public AlertDialog myDialog;
    public static boolean checkPanelOpen = false;
    public static boolean toastShown = false;
    public static boolean allFilesFirstTime = true;
    public static boolean isDialogShowing = false;
    private boolean keyExpiredDialogShowing = false;
    private boolean loginInProgress = false;
    private boolean isShizukuDialogShowing = false;
    private int lastShizukuState = -1;
    private ArrayList<HashMap<String, Object>> UserMap = new ArrayList();
    private RelativeLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear43;
    private LinearLayout linear45;
    private LinearLayout linear3;
    private LinearLayout linear47;
    private TextView textview19;
    private TextView textview4;
    private LinearLayout linear49;
    private LinearLayout linear41;
    private LinearLayout linear5;
    private LinearLayout linear37;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private LinearLayout linear38;
    private LinearLayout linear39;
    private LinearLayout linear40;
    private TextView textview2;
    private EditText edittext1;
    private TextView textview0;
    private EditText edittext2;
    private CheckBox checkbox1;
    private LinearLayout linear31;
    private CheckBox checkbox2;
    private Button button1;
    private TextView textview6;
    private TextView textview7;
    private TextView textview8;
    private TextView textview9;
    private SharedPreferences save;
    private Intent intent = new Intent();
    private SharedPreferences sp;
    private TimerTask Timer;
    private TimerTask timer;
    private MediaPlayer DJREMIX;
    private DatabaseReference update = this._firebase.getReference("update");
    private ChildEventListener _update_child_listener;
    private AlertDialog.Builder dial;
    private TextToSpeech TxtToSpeech;
    private DatabaseReference User = this._firebase.getReference("User");
    private ChildEventListener _User_child_listener;
    private FirebaseAuth Auth;
    private OnCompleteListener<AuthResult> _Auth_create_user_listener;
    private OnCompleteListener<AuthResult> _Auth_sign_in_listener;
    private OnCompleteListener<Void> _Auth_reset_password_listener;
    private OnCompleteListener<Void> Auth_updateEmailListener;
    private OnCompleteListener<Void> Auth_updatePasswordListener;
    private OnCompleteListener<Void> Auth_emailVerificationSentListener;
    private OnCompleteListener<Void> Auth_deleteUserListener;
    private OnCompleteListener<Void> Auth_updateProfileListener;
    private OnCompleteListener<AuthResult> Auth_phoneAuthListener;
    private OnCompleteListener<AuthResult> Auth_googleSignInListener;
    private Calendar calendar_1 = Calendar.getInstance();
    private Calendar calendar_2 = Calendar.getInstance();
    private Calendar calendar = Calendar.getInstance();
    private AlertDialog.Builder dg;
    private SharedPreferences KEY;
    private ShizukuMaster Shizuku;
    private AlertDialog customLoadingDialog = null;
    private AlertDialog shizukuDeniedAlertDialog = null;
    private AlertDialog allFilesAlertDialog = null;
    private Shizuku.OnRequestPermissionResultListener shizukuListener = null;

    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        this.setContentView(R.layout.main);
        this.initialize(_savedInstanceState);
        FirebaseApp.initializeApp((Context)this);
        this.initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        this.linear1 = (RelativeLayout)this.findViewById(R.id.linear1);
        this.linear2 = (LinearLayout)this.findViewById(R.id.linear2);
        this.linear43 = (LinearLayout)this.findViewById(R.id.linear43);
        this.linear45 = (LinearLayout)this.findViewById(R.id.linear45);
        this.linear3 = (LinearLayout)this.findViewById(R.id.linear3);
        this.linear47 = (LinearLayout)this.findViewById(R.id.linear47);
        this.textview19 = (TextView)this.findViewById(R.id.textview19);
        this.textview4 = (TextView)this.findViewById(R.id.textview4);
        this.linear49 = (LinearLayout)this.findViewById(R.id.linear49);
        this.linear41 = (LinearLayout)this.findViewById(R.id.linear41);
        this.linear5 = (LinearLayout)this.findViewById(R.id.linear5);
        this.linear37 = (LinearLayout)this.findViewById(R.id.linear37);
        this.linear6 = (LinearLayout)this.findViewById(R.id.linear6);
        this.linear7 = (LinearLayout)this.findViewById(R.id.linear7);
        this.linear8 = (LinearLayout)this.findViewById(R.id.linear8);
        this.linear38 = (LinearLayout)this.findViewById(R.id.linear38);
        this.linear39 = (LinearLayout)this.findViewById(R.id.linear39);
        this.linear40 = (LinearLayout)this.findViewById(R.id.linear40);
        this.textview2 = (TextView)this.findViewById(R.id.textview2);
        this.edittext1 = (EditText)this.findViewById(R.id.edittext1);
        this.textview0 = (TextView)this.findViewById(R.id.textview0);
        this.edittext2 = (EditText)this.findViewById(R.id.edittext2);
        this.checkbox1 = (CheckBox)this.findViewById(R.id.checkbox1);
        this.linear31 = (LinearLayout)this.findViewById(R.id.linear31);
        this.checkbox2 = (CheckBox)this.findViewById(R.id.checkbox2);
        this.button1 = (Button)this.findViewById(R.id.button1);
        this.textview6 = (TextView)this.findViewById(R.id.textview6);
        this.textview7 = (TextView)this.findViewById(R.id.textview7);
        this.textview8 = (TextView)this.findViewById(R.id.textview8);
        this.textview9 = (TextView)this.findViewById(R.id.textview9);
        this.save = this.getSharedPreferences("save", 0);
        this.sp = this.getSharedPreferences("sp", 0);
        this.dial = new AlertDialog.Builder((Context)this);
        this.TxtToSpeech = new TextToSpeech(this.getApplicationContext(), null);
        this.Auth = FirebaseAuth.getInstance();
        this.dg = new AlertDialog.Builder((Context)this);
        this.KEY = this.getSharedPreferences("KEY", 0);
        this.checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
                boolean _isChecked = _param2;
                if (_isChecked) {
                    MainActivity.this.save.edit().putString("edittext1", MainActivity.this.edittext1.getText().toString()).commit();
                    MainActivity.this.save.edit().putString("edittext2", MainActivity.this.edittext2.getText().toString()).commit();
                } else {
                    MainActivity.this.save.edit().remove("edittext1").commit();
                    MainActivity.this.save.edit().remove("edittext2").commit();
                }
            }
        });
        this.checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
                boolean _isChecked = _param2;
                if (_isChecked) {
                    MainActivity.this.edittext2.setTransformationMethod((TransformationMethod)HideReturnsTransformationMethod.getInstance());
                } else {
                    MainActivity.this.edittext2.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
                }
            }
        });
        this.button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                MainActivity.this._login();
            }
        });
        this.textview7.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                Intent i = new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse((String)"https://t.me/kayesahmmedpro"));
                MainActivity.this.startActivity(i);
            }
        });
        this.textview9.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                Intent i = new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse((String)"https://www.facebook.com/kayesahmmed00"));
                MainActivity.this.startActivity(i);
            }
        });
        this._update_child_listener = new ChildEventListener(){

            public void onChildAdded(DataSnapshot _param1, String _param2) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>(){};
                String _childKey = _param1.getKey();
                HashMap _childValue = (HashMap)_param1.getValue((GenericTypeIndicator)_ind);
                if (_childKey.equals("up") && _childValue.containsKey("version")) {
                    MainActivity.this.app_version = _childValue.get("version").toString();
                    MainActivity.this.getSharedPreferences("data", 0).edit().putString("cached_app_version", MainActivity.this.app_version).apply();
                    if (!MainActivity.this.ModXLab().equals(MainActivity.this.app_version)) {
                        MainActivity.this._dialog(MainActivity.this.app_version, MainActivity.this.message, "Exit", "Update");
                    } else {
                        SharedPreferences sp = MainActivity.this.getSharedPreferences("data", 0);
                        String lastSavedVersion = sp.getString("last_version_subscribed", "");
                        if (!lastSavedVersion.equals(MainActivity.this.app_version)) {
                            if (!checkPanelOpen) {
                                MainActivity.this._Check_Subscribe();
                            }
                        } else {
                            MainActivity.this._Start_Shizuku();
                        }
                    }
                }
            }

            public void onChildChanged(DataSnapshot _param1, String _param2) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>(){};
                String _childKey = _param1.getKey();
                HashMap _childValue = (HashMap)_param1.getValue((GenericTypeIndicator)_ind);
                if (_childKey.equals("up") && _childValue.containsKey("version")) {
                    MainActivity.this.app_version = _childValue.get("version").toString();
                    MainActivity.this.getSharedPreferences("data", 0).edit().putString("cached_app_version", MainActivity.this.app_version).apply();
                    if (!MainActivity.this.ModXLab().equals(MainActivity.this.app_version)) {
                        MainActivity.this._dialog(MainActivity.this.app_version, MainActivity.this.message, "Exit", "Update");
                    } else {
                        SharedPreferences sp = MainActivity.this.getSharedPreferences("data", 0);
                        String lastSavedVersion = sp.getString("last_version_subscribed", "");
                        if (!lastSavedVersion.equals(MainActivity.this.app_version)) {
                            if (!checkPanelOpen) {
                                MainActivity.this._Check_Subscribe();
                            }
                        } else {
                            MainActivity.this._Start_Shizuku();
                        }
                    }
                }
            }

            public void onChildMoved(DataSnapshot _param1, String _param2) {
            }

            public void onChildRemoved(DataSnapshot _param1) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>(){};
                String _childKey = _param1.getKey();
                HashMap _childValue = (HashMap)_param1.getValue((GenericTypeIndicator)_ind);
            }

            public void onCancelled(DatabaseError _param1) {
                int _errorCode = _param1.getCode();
                String _errorMessage = _param1.getMessage();
            }
        };
        this.update.addChildEventListener(this._update_child_listener);
        this._User_child_listener = new ChildEventListener(){

            public void onChildAdded(DataSnapshot _param1, String _param2) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>(){};
                String _childKey = _param1.getKey();
                HashMap _childValue = (HashMap)_param1.getValue((GenericTypeIndicator)_ind);
            }

            public void onChildChanged(DataSnapshot _param1, String _param2) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>(){};
                String _childKey = _param1.getKey();
                HashMap _childValue = (HashMap)_param1.getValue((GenericTypeIndicator)_ind);
            }

            public void onChildMoved(DataSnapshot _param1, String _param2) {
            }

            public void onChildRemoved(DataSnapshot _param1) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>(){};
                String _childKey = _param1.getKey();
                HashMap _childValue = (HashMap)_param1.getValue((GenericTypeIndicator)_ind);
            }

            public void onCancelled(DatabaseError _param1) {
                int _errorCode = _param1.getCode();
                String _errorMessage = _param1.getMessage();
            }
        };
        this.User.addChildEventListener(this._User_child_listener);
        this.Auth_updateEmailListener = new OnCompleteListener<Void>(){

            public void onComplete(Task<Void> _param1) {
                boolean _success = _param1.isSuccessful();
                String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
            }
        };
        this.Auth_updatePasswordListener = new OnCompleteListener<Void>(){

            public void onComplete(Task<Void> _param1) {
                boolean _success = _param1.isSuccessful();
                String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
            }
        };
        this.Auth_emailVerificationSentListener = new OnCompleteListener<Void>(){

            public void onComplete(Task<Void> _param1) {
                boolean _success = _param1.isSuccessful();
                String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
            }
        };
        this.Auth_deleteUserListener = new OnCompleteListener<Void>(){

            public void onComplete(Task<Void> _param1) {
                boolean _success = _param1.isSuccessful();
                String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
            }
        };
        this.Auth_phoneAuthListener = new OnCompleteListener<AuthResult>(){

            public void onComplete(Task<AuthResult> task) {
                boolean _success = task.isSuccessful();
                String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
            }
        };
        this.Auth_updateProfileListener = new OnCompleteListener<Void>(){

            public void onComplete(Task<Void> _param1) {
                boolean _success = _param1.isSuccessful();
                String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
            }
        };
        this.Auth_googleSignInListener = new OnCompleteListener<AuthResult>(){

            public void onComplete(Task<AuthResult> task) {
                boolean _success = task.isSuccessful();
                String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
            }
        };
        this._Auth_create_user_listener = new OnCompleteListener<AuthResult>(){

            public void onComplete(Task<AuthResult> _param1) {
                boolean _success = _param1.isSuccessful();
                String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
            }
        };
        this._Auth_sign_in_listener = new OnCompleteListener<AuthResult>(){

            public void onComplete(Task<AuthResult> _param1) {
                boolean _success = _param1.isSuccessful();
                String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
            }
        };
        this._Auth_reset_password_listener = new OnCompleteListener<Void>(){

            public void onComplete(Task<Void> _param1) {
                boolean _success = _param1.isSuccessful();
            }
        };
    }

    private void initializeLogic() {
        Window w;
        if (Build.VERSION.SDK_INT > 19) {
            w = this.getWindow();
            w.clearFlags(0x4000000);
            w.addFlags(Integer.MIN_VALUE);
            w.setStatusBarColor(-16777216);
        }
        if (this.save.getString("edittext1", "").equals("") || this.save.getString("edittext2", "").equals("")) {
            this.edittext1.setText((CharSequence)"");
            this.edittext2.setText((CharSequence)"");
            this.checkbox1.setChecked(false);
        } else {
            this.edittext1.setText((CharSequence)this.save.getString("edittext1", ""));
            this.edittext2.setText((CharSequence)this.save.getString("edittext2", ""));
            this.checkbox1.setChecked(true);
        }
        this.edittext2.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        if (Build.VERSION.SDK_INT >= 19) {
            w = this.getWindow();
            w.setFlags(512, 512);
        }
        this.textview4.setTypeface(Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/ft1.ttf"), 3);
        this._ModX();
        this._Oncreate();
        this.myDialog = null;
        checkPanelOpen = false;
        toastShown = false;
        SharedPreferences sp = this.getSharedPreferences("data", 0);
        String cachedVersion = sp.getString("cached_app_version", "");
        if (!cachedVersion.equals("")) {
            this.app_version = cachedVersion;
        }
        allFilesFirstTime = sp.getBoolean("all_files_first_time", true);
    }

    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
        super.onActivityResult(_requestCode, _resultCode, _data);
        if (_resultCode == -1) {
            if (_data != null) {
                this.muri = _data.getData();
                if (Uri.decode((String)this.muri.toString()).endsWith("Android")) {
                    int takeFlags = this.intent.getFlags() & 3;
                    this.getContentResolver().takePersistableUriPermission(this.muri, takeFlags);
                    this.sp.edit().putString("FOLDER_URI", this.muri.toString()).commit();
                    this.mfile = DocumentFile.fromTreeUri((Context)this, (Uri)this.muri);
                    this.mfile1 = this.mfile.createFile("*/*", "test.file");
                    this.uri2 = this.mfile1.getUri();
                    this.sp.edit().putString("DIRECT_FOLDER_URI", this.uri2.toString().substring(0, this.uri2.toString().length() - 9)).commit();
                    try {
                        DocumentsContract.deleteDocument((ContentResolver)this.getApplicationContext().getContentResolver(), (Uri)this.uri2);
                    }
                    catch (FileNotFoundException fileNotFoundException) {}
                }
            }
        } else {
            Toast.makeText((Context)this.getApplicationContext(), (CharSequence)"GIVE PERMISSION", (int)1).show();
        }
        switch (_requestCode) {
            default: 
        }
    }

    public void onBackPressed() {
        this.finish();
    }

    public void onStart() {
        super.onStart();
        if (this.DJREMIX == null) {
            this.DJREMIX = MediaPlayer.create((Context)this.getApplicationContext(), (int)R.raw.voic);
            this.DJREMIX.start();
            this.DJREMIX.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){

                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                    MainActivity.this.DJREMIX = null;
                }
            });
        } else if (!this.DJREMIX.isPlaying()) {
            this.DJREMIX.start();
        }
        this.app_version = "";
        SharedPreferences sp = this.getSharedPreferences("data", 0);
        String cachedVersion = sp.getString("cached_app_version", "");
        if (!cachedVersion.equals("")) {
            this.app_version = cachedVersion;
        }
        if (this.app_version.equals("")) {
            return;
        }
        if (!this.ModXLab().equals(this.app_version)) {
            this._dialog(this.app_version, this.message, "Exit", "Update");
            return;
        }
        if (!sp.getString("last_version_subscribed", "").equals(this.app_version)) {
            if (!checkPanelOpen) {
                this._Check_Subscribe();
            }
            return;
        }
        this._Start_Shizuku();
    }

    public void onStop() {
        super.onStop();
        if (this.DJREMIX != null && this.DJREMIX.isPlaying()) {
            this.DJREMIX.pause();
        }
    }

    public void _version_extra() {
    }

    public String ModXLab() {
        try {
            PackageInfo pinfo = this.getPackageManager().getPackageInfo(this.getApplicationContext().getPackageName(), 1);
            String version_app = pinfo.versionName;
            return version_app;
        }
        catch (Exception e) {
            SketchwareUtil.showMessage(this.getApplicationContext(), e.toString());
            return "";
        }
    }

    public void _extra() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean copyFileFromUri2(Context context, Uri fileUri, Uri targetUri) {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            ContentResolver content = context.getContentResolver();
            fis = content.openInputStream(fileUri);
            fos = content.openOutputStream(targetUri);
            byte[] buff = new byte[1024];
            int length = 0;
            while ((length = fis.read(buff)) > 0) {
                fos.write(buff, 0, length);
            }
        }
        catch (IOException e) {
            boolean bl = false;
            return bl;
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                }
                catch (IOException e) {
                    return false;
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                }
                catch (IOException e) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean copyFileFromAssets2(String filename, Uri targetUri) {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            ContentResolver content = this.getApplicationContext().getContentResolver();
            fis = this.getAssets().open(filename);
            fos = content.openOutputStream(targetUri);
            byte[] buff = new byte[1024];
            int length = 0;
            while ((length = fis.read(buff)) > 0) {
                fos.write(buff, 0, length);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public void _AskPermission(View _view) {
        this.intent.addFlags(3);
        this.intent.setAction("android.intent.action.OPEN_DOCUMENT_TREE");
        Uri muri = Uri.parse((String)"content://com.android.externalstorage.documents/tree/primary%3AAndroid/document/primary%3AAndroid%2F");
        this.intent.putExtra("android.provider.extra.INITIAL_URI", (Parcelable)muri);
        this.startActivityForResult(this.intent, this.NEW_FOLDER_REQUEST_CODE);
    }

    public void _CopyAsset(String _asset, Uri _Uri, String _filename) {
        try {
            Uri muri = Uri.parse((String)_Uri.toString().concat(_filename));
            this.mfile = DocumentFile.fromTreeUri((Context)this, (Uri)muri);
            if (this.mfile.exists()) {
                try {
                    DocumentsContract.deleteDocument((ContentResolver)this.getApplicationContext().getContentResolver(), (Uri)muri);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    // empty catch block
                }
            }
            this.parentfile = DocumentFile.fromTreeUri((Context)this, (Uri)_Uri);
            this.mfile = this.parentfile.createFile("*/*", _filename);
            this.desturi = this.mfile.getUri();
            if (!this.copyFileFromAssets2(_asset, this.desturi)) {
                Toast.makeText((Context)this.getApplicationContext(), (CharSequence)"Something Went Wrong", (int)1).show();
            }
        }
        catch (Exception e) {
            Toast.makeText((Context)this.getApplicationContext(), (CharSequence)e.getMessage(), (int)1).show();
        }
    }

    public void _dialog(String _title, String _message, String _button1text, String _button2text) {
        AlertDialog dial = new AlertDialog.Builder((Context)this).create();
        LayoutInflater inflater = this.getLayoutInflater();
        View inflate = inflater.inflate(R.layout.dialog, null);
        dial.setView(inflate);
        dial.getWindow().setBackgroundDrawableResource(17170445);
        LinearLayout linear2 = (LinearLayout)inflate.findViewById(R.id.linear2);
        LinearLayout linear3 = (LinearLayout)inflate.findViewById(R.id.linear3);
        LinearLayout linear5 = (LinearLayout)inflate.findViewById(R.id.linear5);
        TextView textview1 = (TextView)inflate.findViewById(R.id.textview1);
        TextView textview2 = (TextView)inflate.findViewById(R.id.textview2);
        TextView textview3 = (TextView)inflate.findViewById(R.id.textview3);
        TextView textview4 = (TextView)inflate.findViewById(R.id.textview4);
        if (textview1 != null) {
            textview1.setVisibility(8);
        }
        if (textview2 != null) {
            textview2.setVisibility(8);
        }
        if (textview3 != null) {
            textview3.setVisibility(8);
        }
        if (textview4 != null) {
            textview4.setText((CharSequence)"DOWNLOAD NOW");
            try {
                Typeface tf = Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/tajawal_medium.ttf");
                textview4.setTypeface(tf, 1);
            }
            catch (Exception tf) {
                // empty catch block
            }
        }
        try {
            int d = (int)this.getApplicationContext().getResources().getDisplayMetrics().density;
            if (linear2 != null) {
                GradientDrawable gd2 = new GradientDrawable();
                gd2.setColor(-1);
                gd2.setCornerRadius((float)(d * 20));
                linear2.setBackground((Drawable)gd2);
            }
            if (linear3 != null) {
                GradientDrawable gd3 = new GradientDrawable();
                gd3.setColor(Color.parseColor((String)"#00B489"));
                gd3.setCornerRadius((float)(d * 25));
                RippleDrawable ripple = new RippleDrawable(new ColorStateList((int[][])new int[][]{new int[0]}, new int[]{-1996488705}), (Drawable)gd3, null);
                linear3.setBackground((Drawable)ripple);
                linear3.setElevation(0.0f);
                linear3.setClickable(true);
                linear3.setFocusable(true);
            }
            if (linear5 != null) {
                linear5.setBackground((Drawable)new GradientDrawable(){

                    public GradientDrawable getIns(int a, int b, int c, int d) {
                        this.setCornerRadius(a);
                        this.setStroke(b, c);
                        this.setColor(d);
                        return this;
                    }
                }.getIns(360, 0, -16730999, -16730999));
            }
            if (textview4 != null) {
                textview4.setBackgroundColor(0);
                textview4.setTextColor(-1);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (linear3 != null) {
            linear3.setOnClickListener(new View.OnClickListener(){

                public void onClick(View v) {
                    Intent i = new Intent("android.intent.action.VIEW");
                    i.setData(Uri.parse((String)"https://t.me/kayesahmmedpro"));
                    MainActivity.this.startActivity(i);
                }
            });
        }
        dial.setCanceledOnTouchOutside(false);
        dial.setCancelable(true);
        dial.setOnCancelListener(new DialogInterface.OnCancelListener(){

            public void onCancel(DialogInterface dialogInterface) {
                MainActivity.this.finishAffinity();
            }
        });
        dial.show();
    }

    public void _login() {
        if (this.loginInProgress) {
            return;
        }
        this.loginInProgress = true;
        this.button1.setEnabled(false);
        if (!SketchwareUtil.isConnected(this.getApplicationContext())) {
            this.loginInProgress = false;
            this.button1.setEnabled(true);
            SketchwareUtil.showMessage(this.getApplicationContext(), "No internet connection. Please turn on your internet connection to log in.");
            return;
        }
        if (this.edittext1.getText().toString().trim().equals("") || this.edittext2.getText().toString().trim().equals("")) {
            this.loginInProgress = false;
            this.button1.setEnabled(true);
            SketchwareUtil.showMessage(this.getApplicationContext(), "Please Fill Details");
            return;
        }
        this.save.edit().putString("edittext1", this.edittext1.getText().toString()).commit();
        this.save.edit().putString("edittext2", this.edittext2.getText().toString()).commit();
        final String inputUser = this.edittext1.getText().toString().trim();
        final String inputPass = this.edittext2.getText().toString().trim();
        this.User.addListenerForSingleValueEvent(new ValueEventListener(){

            public void onDataChange(DataSnapshot _dataSnapshot) {
                MainActivity.this.loginInProgress = false;
                MainActivity.this.button1.setEnabled(true);
                if (MainActivity.this.isFinishing() || MainActivity.this.isDestroyed()) {
                    return;
                }
                MainActivity.this.UserMap = new ArrayList();
                try {
                    GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>(){};
                    for (DataSnapshot _data : _dataSnapshot.getChildren()) {
                        HashMap _map = (HashMap)_data.getValue((GenericTypeIndicator)_ind);
                        if (_map == null) continue;
                        MainActivity.this.UserMap.add(_map);
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                    SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "Database Error");
                    return;
                }
                HashMap matchedUser = null;
                for (int i = 0; i < MainActivity.this.UserMap.size(); ++i) {
                    try {
                        Object u = ((HashMap)MainActivity.this.UserMap.get(i)).get("user");
                        Object p = ((HashMap)MainActivity.this.UserMap.get(i)).get("pass");
                        if (u == null || p == null || !inputUser.equals(u.toString()) || !inputPass.equals(p.toString())) continue;
                        matchedUser = (HashMap)MainActivity.this.UserMap.get(i);
                        break;
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (matchedUser == null) {
                    SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "Invalid Username or Password!");
                    return;
                }
                Object statusObj = matchedUser.get("status");
                if (statusObj == null) {
                    SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "Account Error!");
                    return;
                }
                Object timeObj = matchedUser.get("time");
                if (timeObj == null) {
                    SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "Time Error!");
                    return;
                }
                boolean isExpired = false;
                try {
                    long expireTime = (long)Double.parseDouble(timeObj.toString());
                    long currentTime = System.currentTimeMillis();
                    if (currentTime > expireTime) {
                        isExpired = true;
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                if (!statusObj.toString().equals("true") || isExpired) {
                    if (MainActivity.this.keyExpiredDialogShowing) {
                        return;
                    }
                    MainActivity.this.keyExpiredDialogShowing = true;
                    final AlertDialog dial = new AlertDialog.Builder((Context)MainActivity.this).create();
                    LayoutInflater inflater = MainActivity.this.getLayoutInflater();
                    View inflate = inflater.inflate(R.layout.expired, null);
                    dial.setView(inflate);
                    dial.getWindow().setBackgroundDrawableResource(17170445);
                    LinearLayout linear2 = (LinearLayout)inflate.findViewById(R.id.linear2);
                    LinearLayout linear3 = (LinearLayout)inflate.findViewById(R.id.linear3);
                    LinearLayout linear5 = (LinearLayout)inflate.findViewById(R.id.linear5);
                    TextView textview4 = (TextView)inflate.findViewById(R.id.textview4);
                    if (textview4 != null) {
                        textview4.setText((CharSequence)"CONTACT");
                        try {
                            Typeface tf = Typeface.createFromAsset((AssetManager)MainActivity.this.getAssets(), (String)"fonts/tajawal_medium.ttf");
                            textview4.setTypeface(tf, 1);
                        }
                        catch (Exception tf) {
                            // empty catch block
                        }
                    }
                    try {
                        int d = (int)MainActivity.this.getApplicationContext().getResources().getDisplayMetrics().density;
                        if (linear2 != null) {
                            GradientDrawable gd2 = new GradientDrawable();
                            gd2.setColor(-1);
                            gd2.setCornerRadius((float)(d * 20));
                            linear2.setBackground((Drawable)gd2);
                        }
                        if (linear3 != null) {
                            GradientDrawable gd3 = new GradientDrawable();
                            gd3.setColor(Color.parseColor((String)"#00B489"));
                            gd3.setCornerRadius((float)(d * 25));
                            RippleDrawable ripple = new RippleDrawable(new ColorStateList((int[][])new int[][]{new int[0]}, new int[]{-1996488705}), (Drawable)gd3, null);
                            linear3.setBackground((Drawable)ripple);
                            linear3.setElevation(0.0f);
                            linear3.setClickable(true);
                            linear3.setFocusable(true);
                        }
                        if (linear5 != null) {
                            linear5.setBackground((Drawable)new GradientDrawable(){

                                public GradientDrawable getIns(int a, int b, int c, int d) {
                                    this.setCornerRadius(a);
                                    this.setStroke(b, c);
                                    this.setColor(d);
                                    return this;
                                }
                            }.getIns(360, 0, -16730999, -16730999));
                        }
                        if (textview4 != null) {
                            textview4.setBackgroundColor(0);
                            textview4.setTextColor(-1);
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (linear3 != null) {
                        linear3.setOnClickListener(new View.OnClickListener(){

                            public void onClick(View v) {
                                MainActivity.this.keyExpiredDialogShowing = false;
                                dial.dismiss();
                                try {
                                    Intent freshIntent = new Intent("android.intent.action.VIEW");
                                    freshIntent.setData(Uri.parse((String)"https://t.me/kayesahmmedpro"));
                                    freshIntent.addFlags(0x10000000);
                                    MainActivity.this.startActivity(freshIntent);
                                }
                                catch (Exception e) {
                                    e.printStackTrace();
                                    SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "Could not open Telegram!");
                                }
                            }
                        });
                    }
                    dial.setCanceledOnTouchOutside(false);
                    dial.setCancelable(true);
                    dial.setOnCancelListener(new DialogInterface.OnCancelListener(){

                        public void onCancel(DialogInterface dialogInterface) {
                            MainActivity.this.keyExpiredDialogShowing = false;
                            MainActivity.this.finishAffinity();
                        }
                    });
                    dial.show();
                    return;
                }
                MainActivity.this.KEY.edit().putString("User", matchedUser.get("user").toString()).commit();
                MainActivity.this.KEY.edit().putString("Status", matchedUser.get("status").toString()).commit();
                MainActivity.this.KEY.edit().putString("Register", matchedUser.get("rgtime").toString()).commit();
                MainActivity.this.KEY.edit().putString("time", matchedUser.get("time").toString()).commit();
                MainActivity.this.KEY.edit().putString("Valid", matchedUser.get("Validity").toString()).commit();
                MainActivity.this.KEY.edit().putString("key", matchedUser.get("key").toString()).commit();
                SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "Login Success");
                MainActivity.this._component_dialog();
                MainActivity.this.Auth.signInAnonymously().addOnCompleteListener((Activity)MainActivity.this, MainActivity.this._Auth_sign_in_listener);
            }

            public void onCancelled(DatabaseError _databaseError) {
                MainActivity.this.loginInProgress = false;
                MainActivity.this.button1.setEnabled(true);
                SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "Connection Error !");
            }
        });
    }

    private void applyDialogWindowBlur(Window window) {
        if (window == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        window.setDimAmount(0.72f);
        if (Build.VERSION.SDK_INT >= 31) {
            window.addFlags(4);
            try {
                window.getAttributes().setBlurBehindRadius(25);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public void _loadingdialog(boolean _ifShow, String _title) {
        if (_ifShow) {
            if (this.customLoadingDialog == null) {
                View v = this.getLayoutInflater().inflate(R.layout.dialog_loading, null);
                TextView tv = (TextView)v.findViewById(R.id.loading_title);
                if (tv != null && _title != null) {
                    tv.setText((CharSequence)_title);
                }
                try {
                    Typeface tf = Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/sansation_regular.ttf");
                    if (tv != null) {
                        tv.setTypeface(tf, 1);
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.customLoadingDialog = new AlertDialog.Builder((Context)this).create();
                this.customLoadingDialog.setView(v);
                this.customLoadingDialog.setCancelable(false);
                this.customLoadingDialog.setCanceledOnTouchOutside(false);
                this.applyDialogWindowBlur(this.customLoadingDialog.getWindow());
            } else {
                TextView tv = (TextView)this.customLoadingDialog.findViewById(R.id.loading_title);
                if (tv != null && _title != null) {
                    tv.setText((CharSequence)_title);
                }
            }
            try {
                if (!this.customLoadingDialog.isShowing() && !this.isFinishing()) {
                    this.customLoadingDialog.show();
                }
            }
            catch (Exception exception) {}
        } else if (this.customLoadingDialog != null) {
            try {
                this.customLoadingDialog.dismiss();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.customLoadingDialog = null;
        }
    }

    public void _component_dialog() {
        if (Settings.canDrawOverlays((Context)this)) {
            this._loadingdialog(true, "Verifying With Server...");
            this.Timer = new TimerTask(){

                @Override
                public void run() {
                    MainActivity.this.runOnUiThread(new Runnable(){

                        @Override
                        public void run() {
                            MainActivity.this._loadingdialog(false, "Verifying With Server...");
                            final AlertDialog successDialog = new AlertDialog.Builder((Context)MainActivity.this).create();
                            View v = MainActivity.this.getLayoutInflater().inflate(R.layout.dialog_success, null);
                            successDialog.setView(v);
                            successDialog.setCancelable(false);
                            successDialog.setCanceledOnTouchOutside(false);
                            MainActivity.this.applyDialogWindowBlur(successDialog.getWindow());
                            TextView tvTitle = (TextView)v.findViewById(R.id.dialog_success_title);
                            TextView tvUser = (TextView)v.findViewById(R.id.tv_dialog_username);
                            TextView tvReg = (TextView)v.findViewById(R.id.tv_dialog_register);
                            TextView tvValid = (TextView)v.findViewById(R.id.tv_dialog_valid);
                            TextView tvSeller = (TextView)v.findViewById(R.id.tv_dialog_seller);
                            TextView tvStatus = (TextView)v.findViewById(R.id.tv_dialog_status);
                            Button btnOkay = (Button)v.findViewById(R.id.btn_dialog_okay);
                            try {
                                Typeface tf = Typeface.createFromAsset((AssetManager)MainActivity.this.getAssets(), (String)"fonts/sansation_regular.ttf");
                                if (tvTitle != null) {
                                    tvTitle.setTypeface(tf, 1);
                                }
                                if (btnOkay != null) {
                                    btnOkay.setTypeface(tf, 1);
                                }
                                if (tvUser != null) {
                                    tvUser.setTypeface(tf, 1);
                                }
                                if (tvReg != null) {
                                    tvReg.setTypeface(tf, 1);
                                }
                                if (tvValid != null) {
                                    tvValid.setTypeface(tf, 1);
                                }
                                if (tvSeller != null) {
                                    tvSeller.setTypeface(tf, 1);
                                }
                                if (tvStatus != null) {
                                    tvStatus.setTypeface(tf, 1);
                                }
                            }
                            catch (Exception tf) {
                                // empty catch block
                            }
                            String u = MainActivity.this.KEY.getString("User", "User");
                            String r = MainActivity.this.KEY.getString("Register", "Active");
                            String val = MainActivity.this.KEY.getString("Valid", "24/09/2026");
                            if (tvUser != null) {
                                tvUser.setText((CharSequence)(u.isEmpty() ? "User" : u));
                            }
                            if (tvReg != null) {
                                tvReg.setText((CharSequence)(r.isEmpty() ? "Active" : r));
                            }
                            if (tvValid != null) {
                                tvValid.setText((CharSequence)(val.isEmpty() ? "Unlimited" : val));
                            }
                            if (tvSeller != null) {
                                tvSeller.setText((CharSequence)"ModX Lab");
                            }
                            if (tvStatus != null) {
                                tvStatus.setText((CharSequence)"ACTIVATED");
                            }
                            if (btnOkay != null) {
                                btnOkay.setOnClickListener(new View.OnClickListener(){

                                    public void onClick(View view) {
                                        successDialog.dismiss();
                                        MainActivity.this._floating();
                                    }
                                });
                            }
                            try {
                                if (!MainActivity.this.isFinishing()) {
                                    successDialog.show();
                                }
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                        }
                    });
                }
            };
            this._timer.schedule(this.Timer, 2500L);
        } else {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse((String)("package:" + this.getPackageName())));
            this.startActivity(intent);
        }
    }

    public void _Text(String _text) {
        if (this.TxtToSpeech.isSpeaking()) {
            this.TxtToSpeech.stop();
            this.TxtToSpeech.speak(_text, 1, null);
        } else {
            this.TxtToSpeech.speak(_text, 1, null);
        }
    }

    public void _Deactivate() {
    }

    public void _Oncreate() {
        if (this.KEY.getString("Status", "").equals("false")) {
            this._Pro();
        }
        this.Timer = new TimerTask(){

            @Override
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() {
                        if (!MainActivity.this.KEY.getString("time", "").equals("")) {
                            MainActivity.this.calendar_1 = Calendar.getInstance();
                            MainActivity.this.calendar_2.setTimeInMillis((long)Double.parseDouble(MainActivity.this.KEY.getString("time", "")));
                            MainActivity.this._Time_Difference(MainActivity.this.calendar_2, MainActivity.this.calendar_1);
                            MainActivity.this.hh = String.valueOf((long)MainActivity.this.hour);
                            MainActivity.this.mm = String.valueOf((long)(MainActivity.this.minute % 60.0));
                            MainActivity.this.ss = String.valueOf((long)(MainActivity.this.second % 60.0));
                            if (1 > MainActivity.this.hh.length()) {
                                MainActivity.this.hh = "0".concat(MainActivity.this.hh);
                            }
                            if (1 > MainActivity.this.mm.length()) {
                                MainActivity.this.mm = "0".concat(MainActivity.this.mm);
                            }
                            if (1 > MainActivity.this.ss.length()) {
                                MainActivity.this.ss = "0".concat(MainActivity.this.ss);
                            }
                            if (MainActivity.this.hh.concat(MainActivity.this.mm.concat(MainActivity.this.ss)).contains("-")) {
                                MainActivity.this._Pro();
                                if (MainActivity.this.keyExpiredDialogShowing) {
                                    return;
                                }
                                MainActivity.this.keyExpiredDialogShowing = true;
                                if (!MainActivity.this.isFinishing() && !MainActivity.this.isDestroyed()) {
                                    try {
                                        final AlertDialog dial = new AlertDialog.Builder((Context)MainActivity.this).create();
                                        LayoutInflater inflater = MainActivity.this.getLayoutInflater();
                                        View inflate = inflater.inflate(R.layout.expired, null);
                                        dial.setView(inflate);
                                        dial.getWindow().setBackgroundDrawableResource(17170445);
                                        LinearLayout linear2 = (LinearLayout)inflate.findViewById(R.id.linear2);
                                        LinearLayout linear3 = (LinearLayout)inflate.findViewById(R.id.linear3);
                                        LinearLayout linear5 = (LinearLayout)inflate.findViewById(R.id.linear5);
                                        TextView textview4 = (TextView)inflate.findViewById(R.id.textview4);
                                        if (textview4 != null) {
                                            textview4.setText((CharSequence)"CONTACT");
                                            try {
                                                Typeface tf = Typeface.createFromAsset((AssetManager)MainActivity.this.getAssets(), (String)"fonts/tajawal_medium.ttf");
                                                textview4.setTypeface(tf, 1);
                                            }
                                            catch (Exception tf) {
                                                // empty catch block
                                            }
                                        }
                                        try {
                                            int d = (int)MainActivity.this.getApplicationContext().getResources().getDisplayMetrics().density;
                                            if (linear2 != null) {
                                                GradientDrawable gd2 = new GradientDrawable();
                                                gd2.setColor(-1);
                                                gd2.setCornerRadius((float)(d * 20));
                                                linear2.setBackground((Drawable)gd2);
                                            }
                                            if (linear3 != null) {
                                                GradientDrawable gd3 = new GradientDrawable();
                                                gd3.setColor(Color.parseColor((String)"#00B489"));
                                                gd3.setCornerRadius((float)(d * 25));
                                                RippleDrawable ripple = new RippleDrawable(new ColorStateList((int[][])new int[][]{new int[0]}, new int[]{-1996488705}), (Drawable)gd3, null);
                                                linear3.setBackground((Drawable)ripple);
                                                linear3.setElevation(0.0f);
                                                linear3.setClickable(true);
                                                linear3.setFocusable(true);
                                            }
                                            if (linear5 != null) {
                                                linear5.setBackground((Drawable)new GradientDrawable(){

                                                    public GradientDrawable getIns(int a, int b, int c, int d) {
                                                        this.setCornerRadius(a);
                                                        this.setStroke(b, c);
                                                        this.setColor(d);
                                                        return this;
                                                    }
                                                }.getIns(360, 0, -16730999, -16730999));
                                            }
                                            if (textview4 != null) {
                                                textview4.setBackgroundColor(0);
                                                textview4.setTextColor(-1);
                                            }
                                        }
                                        catch (Exception exception) {
                                            // empty catch block
                                        }
                                        if (linear3 != null) {
                                            linear3.setOnClickListener(new View.OnClickListener(){

                                                public void onClick(View v) {
                                                    MainActivity.this.keyExpiredDialogShowing = false;
                                                    dial.dismiss();
                                                    try {
                                                        Intent freshIntent = new Intent("android.intent.action.VIEW");
                                                        freshIntent.setData(Uri.parse((String)"https://t.me/kayesahmmedpro"));
                                                        freshIntent.addFlags(0x10000000);
                                                        MainActivity.this.startActivity(freshIntent);
                                                    }
                                                    catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            });
                                        }
                                        dial.setCanceledOnTouchOutside(false);
                                        dial.setCancelable(true);
                                        dial.setOnCancelListener(new DialogInterface.OnCancelListener(){

                                            public void onCancel(DialogInterface dialogInterface) {
                                                MainActivity.this.keyExpiredDialogShowing = false;
                                                MainActivity.this.finish();
                                            }
                                        });
                                        dial.show();
                                    }
                                    catch (Exception e) {
                                        MainActivity.this.keyExpiredDialogShowing = false;
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                });
            }
        };
        this._timer.scheduleAtFixedRate(this.Timer, 0L, 1000L);
    }

    public void _Time_Difference(Calendar _Calendar1, Calendar _Calendar2) {
        this.hour = _Calendar1.getTimeInMillis() - _Calendar2.getTimeInMillis();
        this.hour /= 3600000.0;
        this.minute = _Calendar1.getTimeInMillis() - _Calendar2.getTimeInMillis();
        this.minute /= 60000.0;
        this.second = _Calendar1.getTimeInMillis() - _Calendar2.getTimeInMillis();
        this.second /= 1000.0;
    }

    private void applyFloatingButtonState(Button btn, boolean isOn, String name, float density) {
        int d = (int)density;
        GradientDrawable gd = new GradientDrawable();
        gd.setCornerRadius((float)((int)(5.0f * density)));
        try {
            Typeface tf = Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/sansation_regular.ttf");
            btn.setTypeface(tf, 1);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (isOn) {
            gd.setColor(-8978685);
            gd.setStroke((int)(2.0f * density), -8978685);
            btn.setBackground((Drawable)gd);
            btn.setTextColor(-16777216);
            btn.setText((CharSequence)(name + "  [ON]"));
            btn.setElevation((float)(d * 4));
        } else {
            gd.setColor(0);
            gd.setStroke((int)(2.0f * density), -8978685);
            btn.setBackground((Drawable)gd);
            btn.setTextColor(-8978685);
            btn.setText((CharSequence)(name + "  [OFF]"));
            btn.setElevation(0.0f);
        }
    }

    private void performUnzipAsset(final String assetName, final String statusMsg) {
        new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    int len;
                    String targetName = assetName;
                    try {
                        String[] list = MainActivity.this.getAssets().list("");
                        boolean found = false;
                        if (list != null) {
                            for (String s : list) {
                                if (!s.equalsIgnoreCase(targetName)) continue;
                                targetName = s;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            if (targetName.toLowerCase().contains("hack")) {
                                targetName = "Hack.zip";
                            } else if (targetName.toLowerCase().contains("original")) {
                                targetName = "O.zip";
                            }
                        }
                    }
                    catch (Exception list) {
                        // empty catch block
                    }
                    String extractPath = "/storage/emulated/0/Android/data/";
                    File hiddenDir = new File(MainActivity.this.getExternalFilesDir(null).getAbsolutePath() + "/.hiddenfiles/");
                    if (!hiddenDir.exists()) {
                        hiddenDir.mkdirs();
                    }
                    File zipFile = new File(hiddenDir, targetName);
                    InputStream is = MainActivity.this.getAssets().open(targetName);
                    FileOutputStream fos = new FileOutputStream(zipFile);
                    byte[] buf = new byte[8192];
                    while ((len = is.read(buf)) > 0) {
                        fos.write(buf, 0, len);
                    }
                    fos.flush();
                    fos.getFD().sync();
                    fos.close();
                    is.close();
                    StringBuilder shellCmd = new StringBuilder();
                    shellCmd.append("mkdir -p ").append(extractPath).append(" && ");
                    shellCmd.append("unzip -o /storage/emulated/0/.hiddenfiles/").append(targetName).append(" -d ").append(extractPath).append(" && ");
                    shellCmd.append("rm -rf /storage/emulated/0/.hiddenfiles");
                    boolean shizukuOk = false;
                    try {
                        ShizukuRemoteProcess p;
                        if (rikka.shizuku.Shizuku.pingBinder() && (p = rikka.shizuku.Shizuku.newProcess((String[])new String[]{"sh", "-c", shellCmd.toString()}, null, null)).waitFor() == 0) {
                            shizukuOk = true;
                        }
                    }
                    catch (Exception p) {
                        // empty catch block
                    }
                    if (!shizukuOk) {
                        ZipEntry ze;
                        File destDir = new File(extractPath);
                        if (!destDir.exists()) {
                            destDir.mkdirs();
                        }
                        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));
                        while ((ze = zis.getNextEntry()) != null) {
                            File newFile = new File(destDir, ze.getName());
                            if (ze.isDirectory()) {
                                newFile.mkdirs();
                            } else {
                                int length;
                                new File(newFile.getParent()).mkdirs();
                                FileOutputStream zfos = new FileOutputStream(newFile);
                                while ((length = zis.read(buf)) > 0) {
                                    zfos.write(buf, 0, length);
                                }
                                zfos.close();
                            }
                            zis.closeEntry();
                        }
                        zis.close();
                        if (zipFile.exists()) {
                            zipFile.delete();
                        }
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable(){

                        @Override
                        public void run() {
                            Toast.makeText((Context)MainActivity.this.getApplicationContext(), (CharSequence)statusMsg, (int)0).show();
                        }
                    });
                }
                catch (Exception e) {
                    e.printStackTrace();
                    new Handler(Looper.getMainLooper()).post(new Runnable(){

                        @Override
                        public void run() {
                            Toast.makeText((Context)MainActivity.this.getApplicationContext(), (CharSequence)("Unzip Error: " + e.getMessage()), (int)0).show();
                        }
                    });
                }
            }
        }).start();
    }

    public void _floating() {
        int childIndex;
        ViewGroup parentGroup2;
        TitanicTextView titanicText;
        int LAYOUT_FLAG = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        final WindowManager.LayoutParams params007 = new WindowManager.LayoutParams(-2, -2, LAYOUT_FLAG, 32, -3);
        final View myView007 = this.getLayoutInflater().inflate(R.layout.floating, null);
        params007.flags = 40;
        final WindowManager wm = (WindowManager)this.getSystemService("window");
        LayoutInflater inflater = (LayoutInflater)this.getSystemService("layout_inflater");
        final RelativeLayout bg = (RelativeLayout)myView007.findViewById(R.id.bg);
        LinearLayout main = (LinearLayout)myView007.findViewById(R.id.main);
        LinearLayout linear1 = (LinearLayout)myView007.findViewById(R.id.linear1);
        LinearLayout linear2 = (LinearLayout)myView007.findViewById(R.id.linear2);
        final LinearLayout linear7 = (LinearLayout)myView007.findViewById(R.id.linear7);
        final LinearLayout light = (LinearLayout)myView007.findViewById(R.id.light);
        final LinearLayout icon1 = (LinearLayout)myView007.findViewById(R.id.icon1);
        final LinearLayout icon2 = (LinearLayout)myView007.findViewById(R.id.icon2);
        final LinearLayout l1 = (LinearLayout)myView007.findViewById(R.id.l1);
        final LinearLayout l2 = (LinearLayout)myView007.findViewById(R.id.l2);
        TextView textview3 = (TextView)myView007.findViewById(R.id.textview3);
        TextView textview4 = (TextView)myView007.findViewById(R.id.textview4);
        TextView textview12 = (TextView)myView007.findViewById(R.id.textview12);
        TextView textview14 = (TextView)myView007.findViewById(R.id.textview14);
        TextView textview15 = (TextView)myView007.findViewById(R.id.textview15);
        final Button button1 = (Button)myView007.findViewById(R.id.button1);
        Button button2 = (Button)myView007.findViewById(R.id.button2);
        Button button3 = (Button)myView007.findViewById(R.id.button3);
        TextView textview2 = (TextView)myView007.findViewById(R.id.textview2);
        textview3.setBackground((Drawable)new GradientDrawable(){

            public GradientDrawable getIns(int a, int b, int c, int d) {
                this.setCornerRadius(a);
                this.setStroke(b, c);
                this.setColor(d);
                return this;
            }
        }.getIns(0, 0, -16777216, 0));
        bg.setBackground((Drawable)new GradientDrawable(){

            public GradientDrawable getIns(int a, int b, int c, int d) {
                this.setCornerRadius(a);
                this.setStroke(b, c);
                this.setColor(d);
                return this;
            }
        }.getIns(8, 4, -1, -14606047));
        textview4.setBackground((Drawable)new GradientDrawable(){

            public GradientDrawable getIns(int a, int b, int c, int d) {
                this.setCornerRadius(a);
                this.setStroke(b, c);
                this.setColor(d);
                return this;
            }
        }.getIns(0, 0, -16777216, 0));
        button1.setBackground((Drawable)new GradientDrawable(){

            public GradientDrawable getIns(int a, int b, int c, int d) {
                this.setCornerRadius(a);
                this.setStroke(b, c);
                this.setColor(d);
                return this;
            }
        }.getIns(5, 5, -8978685, 0));
        button2.setBackground((Drawable)new GradientDrawable(){

            public GradientDrawable getIns(int a, int b, int c, int d) {
                this.setCornerRadius(a);
                this.setStroke(b, c);
                this.setColor(d);
                return this;
            }
        }.getIns(5, 5, -8978685, 0));
        button3.setBackground((Drawable)new GradientDrawable(){

            public GradientDrawable getIns(int a, int b, int c, int d) {
                this.setCornerRadius(a);
                this.setStroke(b, c);
                this.setColor(d);
                return this;
            }
        }.getIns(5, 5, -8978685, 0));
        linear7.setVisibility(8);
        l2.setVisibility(8);
        try {
            textview4.setTypeface(Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/satisfy.ttf"), 1);
            textview3.setTypeface(Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/satisfy.ttf"), 1);
            if (textview2 != null) {
                textview2.setTypeface(Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/satisfy.ttf"), 1);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        button1.setText((CharSequence)"Unzip [OFF]");
        button2.setText((CharSequence)"Unzip  [OFF]");
        button3.setText((CharSequence)"Unzip [OFF]");
        TextView targetView = (TextView)myView007.findViewById(R.id.textview1);
        if (targetView != null) {
            titanicText = new TitanicTextView((Context)this);
            titanicText.setText("MODX LAB");
            titanicText.setTextSize(25.0f);
            titanicText.setGravity(17);
            titanicText.setTextColor(-15138817);
            try {
                titanicText.setTypeface(Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/satisfy.ttf"), 0);
            }
            catch (Exception exception) {
                // empty catch block
            }
            titanicText.setLayoutParams(targetView.getLayoutParams());
            if (targetView.getParent() != null) {
                parentGroup2 = (ViewGroup)targetView.getParent();
                childIndex = parentGroup2.indexOfChild((View)targetView);
                parentGroup2.removeView((View)targetView);
                parentGroup2.addView((View)titanicText, childIndex);
                new Titanic().start(titanicText);
            }
        }
        if ((targetView = (TextView)myView007.findViewById(R.id.textview17)) != null) {
            titanicText = new TitanicTextView((Context)this);
            titanicText.setText("PRO");
            titanicText.setTextSize(25.0f);
            titanicText.setGravity(17);
            titanicText.setTextColor(-15138817);
            try {
                titanicText.setTypeface(Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/satisfy.ttf"), 0);
            }
            catch (Exception parentGroup2) {
                // empty catch block
            }
            titanicText.setLayoutParams(targetView.getLayoutParams());
            if (targetView.getParent() != null) {
                parentGroup2 = (ViewGroup)targetView.getParent();
                childIndex = parentGroup2.indexOfChild((View)targetView);
                parentGroup2.removeView((View)targetView);
                parentGroup2.addView((View)titanicText, childIndex);
                new Titanic().start(titanicText);
            }
        }
        textview12.setText((CharSequence)this.KEY.getString("User", ""));
        textview14.setText((CharSequence)this.KEY.getString("Register", ""));
        textview15.setText((CharSequence)this.KEY.getString("Valid", ""));
        final GradientDrawable highlightDrawable = new GradientDrawable();
        highlightDrawable.setColor(622395391);
        highlightDrawable.setCornerRadius(10.0f);
        final GradientDrawable normalDrawable = new GradientDrawable();
        normalDrawable.setColor(0x10FFFFFF);
        normalDrawable.setCornerRadius(10.0f);
        icon1.setBackground((Drawable)highlightDrawable);
        icon2.setBackground((Drawable)normalDrawable);
        TimerTask timer = new TimerTask(){

            @Override
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() {
                        light.setBackgroundColor(-65536);
                        TimerTask Timer2 = new TimerTask(){

                            @Override
                            public void run() {
                                MainActivity.this.runOnUiThread(new Runnable(){

                                    @Override
                                    public void run() {
                                        light.setBackgroundColor(-268370176);
                                        TimerTask Timer2 = new TimerTask(){

                                            @Override
                                            public void run() {
                                                MainActivity.this.runOnUiThread(new Runnable(){

                                                    @Override
                                                    public void run() {
                                                        light.setBackgroundColor(-16767234);
                                                        TimerTask Timer2 = new TimerTask(){

                                                            @Override
                                                            public void run() {
                                                                MainActivity.this.runOnUiThread(new Runnable(){

                                                                    @Override
                                                                    public void run() {
                                                                        light.setBackgroundColor(-5317);
                                                                        TimerTask Timer2 = new TimerTask(){

                                                                            @Override
                                                                            public void run() {
                                                                                MainActivity.this.runOnUiThread(new Runnable(){

                                                                                    @Override
                                                                                    public void run() {
                                                                                        light.setBackgroundColor(-15138817);
                                                                                    }
                                                                                });
                                                                            }
                                                                        };
                                                                        MainActivity.this._timer.schedule(Timer2, 12000L);
                                                                    }
                                                                });
                                                            }
                                                        };
                                                        MainActivity.this._timer.schedule(Timer2, 9000L);
                                                    }
                                                });
                                            }
                                        };
                                        MainActivity.this._timer.schedule(Timer2, 6000L);
                                    }
                                });
                            }
                        };
                        MainActivity.this._timer.schedule(Timer2, 3000L);
                    }
                });
            }
        };
        this._timer.scheduleAtFixedRate(timer, 0L, 15000L);
        try {
            AnimatedParticleView particleView = new AnimatedParticleView((Context)this);
            particleView.setLineColor(-8978685);
            particleView.setparticleCount(60);
            particleView.setParticleColor(-8978685);
            particleView.setBackgroundColor(-16777216);
            particleView.setParticleRadiusRange(5.0f, 10.0f);
            particleView.setAnimationMode(0);
            main.addView((View)particleView, 0);
        }
        catch (Exception particleView) {
            // empty catch block
        }
        linear7.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                bg.setVisibility(0);
                linear7.setVisibility(8);
            }
        });
        textview4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                bg.setVisibility(8);
                linear7.setVisibility(0);
            }
        });
        icon1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                l1.setVisibility(0);
                l2.setVisibility(8);
                icon1.setBackground((Drawable)highlightDrawable);
                icon2.setBackground((Drawable)normalDrawable);
            }
        });
        icon2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                l1.setVisibility(8);
                l2.setVisibility(0);
                icon1.setBackground((Drawable)normalDrawable);
                icon2.setBackground((Drawable)highlightDrawable);
            }
        });
        linear1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
            }
        });
        textview3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                try {
                    if (myView007 != null) {
                        wm.removeView(myView007);
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                new Thread(new Runnable(){

                    @Override
                    public void run() {
                        try {
                            String zipNames = "Original.zip";
                            String extractPath = "/storage/emulated/0/Download/ModX_Extracted/";
                            String[] zipFiles = zipNames.split(",");
                            File hiddenDir = new File(MainActivity.this.getExternalFilesDir(null).getAbsolutePath() + "/.hiddenfiles/");
                            if (!hiddenDir.exists()) {
                                hiddenDir.mkdirs();
                            }
                            StringBuilder shellCommand = new StringBuilder();
                            shellCommand.append("mkdir -p ").append(extractPath).append(" && ");
                            for (String zipName : zipFiles) {
                                int len;
                                String cleanZipName = zipName.trim();
                                if (cleanZipName.isEmpty()) continue;
                                File zipFile = new File(hiddenDir, cleanZipName);
                                InputStream is = MainActivity.this.getAssets().open(cleanZipName);
                                FileOutputStream fos = new FileOutputStream(zipFile);
                                byte[] buf = new byte[4096];
                                while ((len = is.read(buf)) > 0) {
                                    fos.write(buf, 0, len);
                                }
                                fos.flush();
                                fos.getFD().sync();
                                fos.close();
                                is.close();
                                shellCommand.append("unzip -o ").append(MainActivity.this.getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles/").append(cleanZipName).append(" -d ").append(extractPath).append(" && ");
                            }
                            shellCommand.append("rm -rf ").append(MainActivity.this.getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles");
                            ShizukuRemoteProcess p = rikka.shizuku.Shizuku.newProcess((String[])new String[]{"sh", "-c", shellCommand.toString()}, null, null);
                            p.waitFor();
                            new Handler(Looper.getMainLooper()).post(new Runnable(){

                                @Override
                                public void run() {
                                    Toast.makeText((Context)MainActivity.this.getApplicationContext(), (CharSequence)"Restored", (int)0).show();
                                }
                            });
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View _view) {
                if (!MainActivity.this.button_1) {
                    MainActivity.this.button_1 = true;
                    button1.setBackground((Drawable)new GradientDrawable(){

                        public GradientDrawable getIns(int a, int b, int c, int d) {
                            this.setCornerRadius(a);
                            this.setStroke(b, c);
                            this.setColor(d);
                            return this;
                        }
                    }.getIns(5, 5, -8978685, -8978685));
                    button1.setText((CharSequence)"Unzip ON");
                    MainActivity.this._Text("Activated");
                    new Thread(new Runnable(){

                        @Override
                        public void run() {
                            try {
                                String zipNames = "Hack.zip";
                                String extractPath = "/storage/emulated/0/Download/ModX_Extracted/";
                                String[] zipFiles = zipNames.split(",");
                                File hiddenDir = new File(MainActivity.this.getExternalFilesDir(null).getAbsolutePath() + "/.hiddenfiles/");
                                if (!hiddenDir.exists()) {
                                    hiddenDir.mkdirs();
                                }
                                StringBuilder shellCommand = new StringBuilder();
                                shellCommand.append("mkdir -p ").append(extractPath).append(" && ");
                                for (String zipName : zipFiles) {
                                    int len;
                                    String cleanZipName = zipName.trim();
                                    if (cleanZipName.isEmpty()) continue;
                                    File zipFile = new File(hiddenDir, cleanZipName);
                                    InputStream is = MainActivity.this.getAssets().open(cleanZipName);
                                    FileOutputStream fos = new FileOutputStream(zipFile);
                                    byte[] buf = new byte[4096];
                                    while ((len = is.read(buf)) > 0) {
                                        fos.write(buf, 0, len);
                                    }
                                    fos.flush();
                                    fos.getFD().sync();
                                    fos.close();
                                    is.close();
                                    shellCommand.append("unzip -o ").append(MainActivity.this.getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles/").append(cleanZipName).append(" -d ").append(extractPath).append(" && ");
                                }
                                shellCommand.append("rm -rf ").append(MainActivity.this.getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles");
                                ShizukuRemoteProcess p = rikka.shizuku.Shizuku.newProcess((String[])new String[]{"sh", "-c", shellCommand.toString()}, null, null);
                                p.waitFor();
                                new Handler(Looper.getMainLooper()).post(new Runnable(){

                                    @Override
                                    public void run() {
                                        Toast.makeText((Context)MainActivity.this.getApplicationContext(), (CharSequence)"Unzipped", (int)0).show();
                                    }
                                });
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();
                } else {
                    MainActivity.this.button_1 = false;
                    button1.setBackground((Drawable)new GradientDrawable(){

                        public GradientDrawable getIns(int a, int b, int c, int d) {
                            this.setCornerRadius(a);
                            this.setStroke(b, c);
                            this.setColor(d);
                            return this;
                        }
                    }.getIns(5, 5, -8978685, 0));
                    button1.setText((CharSequence)"Unzip OFF");
                    MainActivity.this._Text("Deactivated");
                    new Thread(new Runnable(){

                        @Override
                        public void run() {
                            try {
                                String zipNames = "Original.zip";
                                String extractPath = "/storage/emulated/0/Download/ModX_Extracted/";
                                String[] zipFiles = zipNames.split(",");
                                File hiddenDir = new File(MainActivity.this.getExternalFilesDir(null).getAbsolutePath() + "/.hiddenfiles/");
                                if (!hiddenDir.exists()) {
                                    hiddenDir.mkdirs();
                                }
                                StringBuilder shellCommand = new StringBuilder();
                                shellCommand.append("mkdir -p ").append(extractPath).append(" && ");
                                for (String zipName : zipFiles) {
                                    int len;
                                    String cleanZipName = zipName.trim();
                                    if (cleanZipName.isEmpty()) continue;
                                    File zipFile = new File(hiddenDir, cleanZipName);
                                    InputStream is = MainActivity.this.getAssets().open(cleanZipName);
                                    FileOutputStream fos = new FileOutputStream(zipFile);
                                    byte[] buf = new byte[4096];
                                    while ((len = is.read(buf)) > 0) {
                                        fos.write(buf, 0, len);
                                    }
                                    fos.flush();
                                    fos.getFD().sync();
                                    fos.close();
                                    is.close();
                                    shellCommand.append("unzip -o ").append(MainActivity.this.getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles/").append(cleanZipName).append(" -d ").append(extractPath).append(" && ");
                                }
                                shellCommand.append("rm -rf ").append(MainActivity.this.getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles");
                                ShizukuRemoteProcess p = rikka.shizuku.Shizuku.newProcess((String[])new String[]{"sh", "-c", shellCommand.toString()}, null, null);
                                p.waitFor();
                                new Handler(Looper.getMainLooper()).post(new Runnable(){

                                    @Override
                                    public void run() {
                                        Toast.makeText((Context)MainActivity.this.getApplicationContext(), (CharSequence)"Restored", (int)0).show();
                                    }
                                });
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();
                }
            }
        });
        final boolean[] move = new boolean[]{true};
        View.OnTouchListener dragTouchListener = new View.OnTouchListener(){
            private int x;
            private int y;

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case 0: {
                        this.x = (int)event.getRawX();
                        this.y = (int)event.getRawY();
                        move[0] = false;
                        return true;
                    }
                    case 1: {
                        this.x = (int)event.getRawX();
                        this.y = (int)event.getRawY();
                        v.performClick();
                        return true;
                    }
                    case 2: {
                        int nowX = (int)event.getRawX();
                        int nowY = (int)event.getRawY();
                        int movedX = nowX - this.x;
                        int movedY = nowY - this.y;
                        this.x = nowX;
                        this.y = nowY;
                        params007.x += movedX;
                        params007.y += movedY;
                        try {
                            wm.updateViewLayout(myView007, (ViewGroup.LayoutParams)params007);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        move[0] = true;
                        return true;
                    }
                }
                return false;
            }
        };
        linear7.setOnTouchListener(dragTouchListener);
        linear1.setOnTouchListener(dragTouchListener);
        params007.gravity = 51;
        params007.x = 0;
        params007.y = 0;
        if (Build.VERSION.SDK_INT < 23) {
            wm.addView(myView007, (ViewGroup.LayoutParams)params007);
        } else if (Settings.canDrawOverlays((Context)this.getApplicationContext())) {
            wm.addView(myView007, (ViewGroup.LayoutParams)params007);
        } else {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse((String)("package:" + this.getPackageName())));
            this.startActivity(intent);
        }
    }

    public void _Titanic() {
    }

    public void nothing() {
    }

    public void _Check_Subscribe() {
        checkPanelOpen = true;
        final AlertDialog checkDial = new AlertDialog.Builder((Context)this).create();
        View inflate = this.getLayoutInflater().inflate(R.layout.check, null);
        checkDial.setView(inflate);
        checkDial.setCancelable(false);
        checkDial.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        LinearLayout linear2 = (LinearLayout)inflate.findViewById(R.id.linear2);
        LinearLayout linear6 = (LinearLayout)inflate.findViewById(R.id.linear6);
        ProgressBar pg = (ProgressBar)inflate.findViewById(R.id.progressbar1);
        final TextView tvPercent = (TextView)inflate.findViewById(R.id.tv_progress_percent);
        final Button btnYoutube = (Button)inflate.findViewById(R.id.button1);
        TextView tvTitle = (TextView)inflate.findViewById(R.id.textview1);
        final TextView tvSub = (TextView)inflate.findViewById(R.id.textview2);
        SharedPreferences sp = this.getSharedPreferences("data", 0);
        GradientDrawable gd = new GradientDrawable();
        gd.setColor(-16382458);
        gd.setCornerRadius(30.0f);
        gd.setStroke(2, -15138817);
        linear2.setBackground((Drawable)gd);
        GradientDrawable sd = new GradientDrawable();
        sd.setColor(-14412523);
        sd.setCornerRadius(15.0f);
        linear6.setBackground((Drawable)sd);
        GradientDrawable initialGd = new GradientDrawable();
        initialGd.setColor(-13882324);
        initialGd.setCornerRadius(30.0f);
        btnYoutube.setBackground((Drawable)initialGd);
        btnYoutube.setEnabled(false);
        btnYoutube.setAlpha(0.8f);
        btnYoutube.setText((CharSequence)"PLEASE WAIT...");
        pg.getProgressDrawable().setColorFilter(Color.parseColor((String)"#00FF88"), PorterDuff.Mode.SRC_IN);
        ObjectAnimator anim = ObjectAnimator.ofInt((Object)pg, (String)"progress", (int[])new int[]{0, 100});
        anim.setDuration(2500L);
        anim.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){

            public void onAnimationUpdate(ValueAnimator animation) {
                int progress = (Integer)animation.getAnimatedValue();
                btnYoutube.setText((CharSequence)"PLEASE WAIT...");
                if (tvPercent != null) {
                    tvPercent.setText((CharSequence)(progress + "%"));
                }
            }
        });
        anim.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(){

            public void onAnimationEnd(Animator animation) {
                btnYoutube.setEnabled(true);
                btnYoutube.setAlpha(1.0f);
                btnYoutube.setBackgroundTintList(ColorStateList.valueOf((int)Color.parseColor((String)"#FF0000")));
                GradientDrawable redGd = new GradientDrawable();
                redGd.setColor(-65536);
                redGd.setCornerRadius(30.0f);
                btnYoutube.setBackground((Drawable)redGd);
                btnYoutube.setText((CharSequence)"SUBSCRIBE TO UNLOCK");
                btnYoutube.setTextColor(-1);
                if (tvSub != null) {
                    tvSub.setText((CharSequence)"Verification Success ! Now Subscribe . Otherwise You Will Get Ban !!");
                    tvSub.setTextColor(-1);
                }
            }
        });
        anim.start();
        btnYoutube.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent i = new Intent("android.intent.action.VIEW", Uri.parse((String)"https://youtube.com/@kayesahmmed-xs3hk?si=CgDSuPLsj_AOuSRH"));
                MainActivity.this.startActivity(i);
                SharedPreferences sp = MainActivity.this.getSharedPreferences("data", 0);
                sp.edit().putString("last_version_subscribed", MainActivity.this.app_version).commit();
                checkPanelOpen = false;
                checkDial.dismiss();
            }
        });
        checkDial.show();
    }

    public void _File_Permission() {
    }

    public void checkAllFilesPermission() {
        if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
            SharedPreferences prefs = this.getSharedPreferences("app_prefs", 0);
            boolean isFirstTime = prefs.getBoolean("all_files_first_time", true);
            if (isFirstTime) {
                prefs.edit().putBoolean("all_files_first_time", false).apply();
                try {
                    Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse((String)("package:" + this.getPackageName())));
                    this.startActivity(intent);
                }
                catch (Exception e) {
                    Intent intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                    this.startActivity(intent);
                }
            } else {
                ImageView iv2;
                this.allFilesAlertDialog = new AlertDialog.Builder((Context)this).create();
                View inflate = this.getLayoutInflater().inflate(R.layout.dialog, null);
                this.allFilesAlertDialog.setView(inflate);
                this.allFilesAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
                this.allFilesAlertDialog.setCancelable(false);
                TextView title = (TextView)inflate.findViewById(R.id.textview6);
                TextView msg = (TextView)inflate.findViewById(R.id.textview5);
                TextView btnText = (TextView)inflate.findViewById(R.id.textview4);
                LinearLayout btnLayout = (LinearLayout)inflate.findViewById(R.id.linear3);
                LinearLayout linear2 = (LinearLayout)inflate.findViewById(R.id.linear2);
                LinearLayout linear5 = (LinearLayout)inflate.findViewById(R.id.linear5);
                if (title != null) {
                    title.setText((CharSequence)"All Files Access Required");
                }
                if (msg != null) {
                    msg.setText((CharSequence)"All files access permission is required to activate the app features. Please allow it to continue.");
                }
                if (btnText != null) {
                    btnText.setText((CharSequence)"OPEN SETTINGS");
                    btnText.setTextColor(-1);
                }
                int d = (int)this.getResources().getDisplayMetrics().density;
                if (linear2 != null) {
                    GradientDrawable gd2 = new GradientDrawable();
                    gd2.setColor(-1);
                    gd2.setCornerRadius((float)(d * 20));
                    linear2.setBackground((Drawable)gd2);
                }
                if (btnLayout != null) {
                    GradientDrawable gd3 = new GradientDrawable();
                    gd3.setColor(Color.parseColor((String)"#00B489"));
                    gd3.setCornerRadius((float)(d * 25));
                    btnLayout.setBackground((Drawable)gd3);
                    btnLayout.setOnClickListener(v -> {
                        this.allFilesAlertDialog.dismiss();
                        this.allFilesAlertDialog = null;
                        try {
                            Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse((String)("package:" + this.getPackageName())));
                            this.startActivity(intent);
                        }
                        catch (Exception e) {
                            Intent intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                            this.startActivity(intent);
                        }
                    });
                }
                if (linear5 != null) {
                    GradientDrawable gd5 = new GradientDrawable();
                    gd5.setColor(Color.parseColor((String)"#00B489"));
                    gd5.setCornerRadius((float)(d * 90));
                    linear5.setBackground((Drawable)gd5);
                }
                if ((iv2 = (ImageView)inflate.findViewById(R.id.imageview2)) != null) {
                    iv2.setColorFilter(-1);
                }
                this.allFilesAlertDialog.show();
            }
        }
    }

    public void checkAllFilesPermissionForButton() {
        if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
            ImageView iv2Btn;
            if (this.allFilesAlertDialog != null && this.allFilesAlertDialog.isShowing()) {
                return;
            }
            this.allFilesAlertDialog = new AlertDialog.Builder((Context)this).create();
            View inflate = this.getLayoutInflater().inflate(R.layout.dialog, null);
            this.allFilesAlertDialog.setView(inflate);
            this.allFilesAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
            this.allFilesAlertDialog.setCancelable(false);
            TextView title = (TextView)inflate.findViewById(R.id.textview6);
            TextView msg = (TextView)inflate.findViewById(R.id.textview5);
            TextView btnText = (TextView)inflate.findViewById(R.id.textview4);
            LinearLayout btnLayout = (LinearLayout)inflate.findViewById(R.id.linear3);
            LinearLayout linear2 = (LinearLayout)inflate.findViewById(R.id.linear2);
            LinearLayout linear5 = (LinearLayout)inflate.findViewById(R.id.linear5);
            if (title != null) {
                title.setText((CharSequence)"All Files Access Required");
            }
            if (msg != null) {
                msg.setText((CharSequence)"All files access permission is required. Please allow it to continue.");
            }
            if (btnText != null) {
                btnText.setText((CharSequence)"OPEN SETTINGS");
                btnText.setTextColor(-1);
            }
            int d = (int)this.getResources().getDisplayMetrics().density;
            if (linear2 != null) {
                GradientDrawable gd2 = new GradientDrawable();
                gd2.setColor(-1);
                gd2.setCornerRadius((float)(d * 20));
                linear2.setBackground((Drawable)gd2);
            }
            if (btnLayout != null) {
                GradientDrawable gd3 = new GradientDrawable();
                gd3.setColor(Color.parseColor((String)"#00B489"));
                gd3.setCornerRadius((float)(d * 25));
                btnLayout.setBackground((Drawable)gd3);
                btnLayout.setOnClickListener(v -> {
                    this.allFilesAlertDialog.dismiss();
                    this.allFilesAlertDialog = null;
                    try {
                        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse((String)("package:" + this.getPackageName())));
                        this.startActivity(intent);
                    }
                    catch (Exception e) {
                        Intent intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                        this.startActivity(intent);
                    }
                });
            }
            if (linear5 != null) {
                GradientDrawable gd5 = new GradientDrawable();
                gd5.setColor(Color.parseColor((String)"#00B489"));
                gd5.setCornerRadius((float)(d * 90));
                linear5.setBackground((Drawable)gd5);
            }
            if ((iv2Btn = (ImageView)inflate.findViewById(R.id.imageview2)) != null) {
                iv2Btn.setColorFilter(-1);
            }
            this.allFilesAlertDialog.show();
        }
    }

    public void showShizukuDeniedDialog(String message) {
        ImageView iv2Denied;
        if (this.shizukuDeniedAlertDialog != null) {
            try {
                this.shizukuDeniedAlertDialog.dismiss();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.shizukuDeniedAlertDialog = null;
        }
        if (this.shizukuListener != null) {
            try {
                rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)this.shizukuListener);
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.shizukuListener = null;
        }
        this.shizukuDeniedAlertDialog = new AlertDialog.Builder((Context)this).create();
        View inflate = this.getLayoutInflater().inflate(R.layout.dialog, null);
        this.shizukuDeniedAlertDialog.setView(inflate);
        this.shizukuDeniedAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
        this.shizukuDeniedAlertDialog.setCancelable(false);
        TextView title = (TextView)inflate.findViewById(R.id.textview6);
        TextView msg = (TextView)inflate.findViewById(R.id.textview5);
        TextView btnText = (TextView)inflate.findViewById(R.id.textview4);
        LinearLayout btnLayout = (LinearLayout)inflate.findViewById(R.id.linear3);
        LinearLayout linear2 = (LinearLayout)inflate.findViewById(R.id.linear2);
        LinearLayout linear5 = (LinearLayout)inflate.findViewById(R.id.linear5);
        if (title != null) {
            title.setText((CharSequence)"Permission Required");
        }
        if (msg != null) {
            msg.setText((CharSequence)message);
        }
        if (btnText != null) {
            btnText.setText((CharSequence)"RETRY");
            btnText.setTextColor(-1);
        }
        int d = (int)this.getResources().getDisplayMetrics().density;
        if (linear2 != null) {
            GradientDrawable gd2 = new GradientDrawable();
            gd2.setColor(-1);
            gd2.setCornerRadius((float)(d * 20));
            linear2.setBackground((Drawable)gd2);
        }
        if (btnLayout != null) {
            GradientDrawable gd3 = new GradientDrawable();
            gd3.setColor(Color.parseColor((String)"#00B489"));
            gd3.setCornerRadius((float)(d * 25));
            btnLayout.setBackground((Drawable)gd3);
            btnLayout.setOnClickListener(v -> {
                AlertDialog ref = this.shizukuDeniedAlertDialog;
                this.shizukuDeniedAlertDialog = null;
                if (ref != null) {
                    try {
                        ref.dismiss();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (this.shizukuListener != null) {
                    try {
                        rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)this.shizukuListener);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    this.shizukuListener = null;
                }
                this.shizukuListener = new Shizuku.OnRequestPermissionResultListener(){

                    public void onRequestPermissionResult(int requestCode, int grantResult) {
                        if (requestCode == 100) {
                            try {
                                rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)MainActivity.this.shizukuListener);
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            MainActivity.this.shizukuListener = null;
                            if (grantResult == 0) {
                                MainActivity.this.runOnUiThread(() -> Toast.makeText((Context)MainActivity.this.getApplicationContext(), (CharSequence)"Shizuku is running \u2705", (int)0).show());
                            } else {
                                MainActivity.this.runOnUiThread(() -> MainActivity.this.showShizukuDeniedDialog("Shizuku permission is required to activate the app features. Click retry to grant permission."));
                            }
                        }
                    }
                };
                rikka.shizuku.Shizuku.addRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)this.shizukuListener);
                rikka.shizuku.Shizuku.requestPermission((int)100);
            });
        }
        if (linear5 != null) {
            GradientDrawable gd5 = new GradientDrawable();
            gd5.setColor(Color.parseColor((String)"#00B489"));
            gd5.setCornerRadius((float)(d * 90));
            linear5.setBackground((Drawable)gd5);
        }
        if ((iv2Denied = (ImageView)inflate.findViewById(R.id.imageview2)) != null) {
            iv2Denied.setColorFilter(-1);
        }
        this.shizukuDeniedAlertDialog.show();
    }

    public void _Start_Shizuku() {
        int currentState;
        boolean tInst = false;
        try {
            this.getPackageManager().getPackageInfo("moe.shizuku.privileged.api", 0);
            tInst = true;
        }
        catch (Exception e) {
            tInst = false;
        }
        boolean isInstalled = tInst;
        boolean tRun = false;
        try {
            tRun = rikka.shizuku.Shizuku.pingBinder();
        }
        catch (Throwable e) {
            tRun = false;
        }
        boolean isRunning = tRun;
        int n = isInstalled ? (isRunning ? 0 : 2) : (currentState = 1);
        if (this.myDialog != null && this.myDialog.isShowing()) {
            if (this.lastShizukuState == currentState) {
                return;
            }
            this.myDialog.dismiss();
            this.myDialog = null;
        }
        this.lastShizukuState = currentState;
        if (currentState != 0) {
            ImageView iv2Start;
            toastShown = false;
            this.myDialog = new AlertDialog.Builder((Context)this).create();
            View inflate = this.getLayoutInflater().inflate(R.layout.dialog, null);
            this.myDialog.setView(inflate);
            this.myDialog.getWindow().setBackgroundDrawableResource(17170445);
            this.myDialog.setCancelable(false);
            this.myDialog.setOnDismissListener(dialog -> {
                this.myDialog = null;
            });
            TextView title = (TextView)inflate.findViewById(R.id.textview6);
            TextView msg = (TextView)inflate.findViewById(R.id.textview5);
            TextView btnText = (TextView)inflate.findViewById(R.id.textview4);
            LinearLayout btnLayout = (LinearLayout)inflate.findViewById(R.id.linear3);
            LinearLayout linear2 = (LinearLayout)inflate.findViewById(R.id.linear2);
            LinearLayout linear5 = (LinearLayout)inflate.findViewById(R.id.linear5);
            if (title != null) {
                title.setText((CharSequence)(currentState == 1 ? "Shizuku Required" : "Start Shizuku"));
            }
            if (msg != null) {
                msg.setText((CharSequence)(currentState == 1 ? "Shizuku is not installed. Please install it to continue." : "Shizuku service is not running. Please start it."));
            }
            if (btnText != null) {
                btnText.setText((CharSequence)(currentState == 1 ? "GO TO PLAY STORE" : "OPEN SHIZUKU"));
                btnText.setTextColor(-1);
            }
            int d = (int)this.getResources().getDisplayMetrics().density;
            if (linear2 != null) {
                GradientDrawable gd2 = new GradientDrawable();
                gd2.setColor(-1);
                gd2.setCornerRadius((float)(d * 20));
                linear2.setBackground((Drawable)gd2);
            }
            if (btnLayout != null) {
                GradientDrawable gd3 = new GradientDrawable();
                gd3.setColor(Color.parseColor((String)"#00B489"));
                gd3.setCornerRadius((float)(d * 25));
                btnLayout.setBackground((Drawable)gd3);
                btnLayout.setOnClickListener(v -> {
                    if (currentState == 1) {
                        try {
                            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"market://details?id=moe.shizuku.privileged.api")));
                        }
                        catch (Exception e) {
                            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/details?id=moe.shizuku.privileged.api")));
                        }
                    } else {
                        Intent intent = this.getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
                        if (intent != null) {
                            this.startActivity(intent);
                        }
                    }
                });
            }
            if (linear5 != null) {
                GradientDrawable gd5 = new GradientDrawable();
                gd5.setColor(Color.parseColor((String)"#00B489"));
                gd5.setCornerRadius((float)(d * 90));
                linear5.setBackground((Drawable)gd5);
            }
            if ((iv2Start = (ImageView)inflate.findViewById(R.id.imageview2)) != null) {
                iv2Start.setColorFilter(-1);
            }
            this.myDialog.show();
        } else {
            if (!toastShown) {
                Toast.makeText((Context)this.getApplicationContext(), (CharSequence)"Shizuku is running \u2705", (int)0).show();
                toastShown = true;
            }
            if (rikka.shizuku.Shizuku.checkSelfPermission() != 0) {
                if (this.shizukuListener != null) {
                    try {
                        rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)this.shizukuListener);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    this.shizukuListener = null;
                }
                this.shizukuListener = new Shizuku.OnRequestPermissionResultListener(){

                    public void onRequestPermissionResult(int requestCode, int grantResult) {
                        try {
                            rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)MainActivity.this.shizukuListener);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        MainActivity.this.shizukuListener = null;
                        if (grantResult != 0) {
                            MainActivity.this.showShizukuDeniedDialog("Shizuku permission is required.");
                        }
                    }
                };
                rikka.shizuku.Shizuku.addRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)this.shizukuListener);
                rikka.shizuku.Shizuku.requestPermission((int)100);
            }
        }
    }

    public void _ModX() {
        TextView textView;
        try {
            BlurView blurView = (BlurView)this.findViewById(R.id.blur_view);
            if (blurView != null) {
                blurView.setOutlineProvider(new ViewOutlineProvider(){

                    public void getOutline(View view, Outline outline) {
                        float density = MainActivity.this.getResources().getDisplayMetrics().density;
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 18.0f * density);
                    }
                });
                blurView.setClipToOutline(true);
                View decorView = this.getWindow().getDecorView();
                ViewGroup rootView = (ViewGroup)decorView.findViewById(0x1020002);
                Drawable windowBackground = decorView.getBackground();
                blurView.setupWith(rootView, (BlurAlgorithm)new RenderScriptBlur((Context)this)).setFrameClearDrawable(windowBackground).setBlurRadius(18.0f);
            }
        }
        catch (Exception blurView) {
            // empty catch block
        }
        try {
            float density = this.getApplicationContext().getResources().getDisplayMetrics().density;
            int d = (int)density;
            if (this.linear3 != null) {
                GradientDrawable gd3 = new GradientDrawable();
                gd3.setColor(672077610);
                gd3.setCornerRadius((float)(d * 18));
                gd3.setStroke((int)((float)d * 1.2f), 0x55FFFFFF);
                this.linear3.setBackground((Drawable)gd3);
            }
            if (this.linear5 != null) {
                this.linear5.setBackgroundColor(0);
            }
            if (this.linear6 != null) {
                this.linear6.setBackgroundColor(0);
            }
            if (this.button1 != null) {
                GradientDrawable gdB = new GradientDrawable();
                gdB.setColor(Color.parseColor((String)"#00B489"));
                gdB.setCornerRadius((float)(d * 12));
                RippleDrawable ripple = new RippleDrawable(new ColorStateList((int[][])new int[][]{new int[0]}, new int[]{0x66FFFFFF}), (Drawable)gdB, null);
                this.button1.setBackground((Drawable)ripple);
            }
            final View lineUser = this.findViewById(R.id.line_username);
            final ImageView ivUser = (ImageView)this.findViewById(R.id.iv_user_icon);
            EditText etUser = (EditText)this.findViewById(R.id.edittext1);
            if (etUser != null) {
                etUser.setOnFocusChangeListener(new View.OnFocusChangeListener(){

                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            if (lineUser != null) {
                                lineUser.setBackgroundColor(Color.parseColor((String)"#18FFFF"));
                            }
                            if (ivUser != null) {
                                ivUser.setColorFilter(Color.parseColor((String)"#18FFFF"));
                            }
                        } else {
                            if (lineUser != null) {
                                lineUser.setBackgroundColor(0x55FFFFFF);
                            }
                            if (ivUser != null) {
                                ivUser.setColorFilter(-2130706433);
                            }
                        }
                    }
                });
            }
            final View linePass = this.findViewById(R.id.line_password);
            final ImageView ivPass = (ImageView)this.findViewById(R.id.iv_lock_icon);
            EditText etPass = (EditText)this.findViewById(R.id.edittext2);
            if (etPass != null) {
                etPass.setOnFocusChangeListener(new View.OnFocusChangeListener(){

                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            if (linePass != null) {
                                linePass.setBackgroundColor(Color.parseColor((String)"#18FFFF"));
                            }
                            if (ivPass != null) {
                                ivPass.setColorFilter(Color.parseColor((String)"#18FFFF"));
                            }
                        } else {
                            if (linePass != null) {
                                linePass.setBackgroundColor(0x55FFFFFF);
                            }
                            if (ivPass != null) {
                                ivPass.setColorFilter(-2130706433);
                            }
                        }
                    }
                });
            }
            try {
                Typeface tf = Typeface.createFromAsset((AssetManager)this.getAssets(), (String)"fonts/sansation_regular.ttf");
                if (this.button1 != null) {
                    this.button1.setTypeface(tf, 1);
                }
            }
            catch (Exception exception) {}
        }
        catch (Exception density) {
            // empty catch block
        }
        if ((textView = (TextView)this.findViewById(R.id.textview19)) != null) {
            ObjectAnimator colorCycle = ObjectAnimator.ofArgb((Object)textView, (String)"textColor", (int[])new int[]{Color.parseColor((String)"#18FFFF"), Color.parseColor((String)"#FFEB3B"), Color.parseColor((String)"#00E676"), Color.parseColor((String)"#FF4081")});
            colorCycle.setDuration(4000L);
            colorCycle.setRepeatCount(-1);
            colorCycle.start();
        }
    }

    public void _Lab() {
    }

    public void _Pro() {
    }

    public class TitanicTextView
    extends TextView {
        private AnimationSetupCallback animationSetupCallback;
        private float maskX;
        private float maskY;
        private boolean sinking;
        private boolean setUp;
        private BitmapShader shader;
        private Matrix shaderMatrix;
        private Drawable wave;
        private float offsetY;

        public TitanicTextView(Context context) {
            super(context);
            this.init();
        }

        public TitanicTextView(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.init();
        }

        public TitanicTextView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            this.init();
        }

        private void init() {
            this.shaderMatrix = new Matrix();
        }

        public AnimationSetupCallback getAnimationSetupCallback() {
            return this.animationSetupCallback;
        }

        public void setAnimationSetupCallback(AnimationSetupCallback animationSetupCallback) {
            this.animationSetupCallback = animationSetupCallback;
        }

        public float getMaskX() {
            return this.maskX;
        }

        public void setMaskX(float maskX) {
            this.maskX = maskX;
            this.invalidate();
        }

        public float getMaskY() {
            return this.maskY;
        }

        public void setMaskY(float maskY) {
            this.maskY = maskY;
            this.invalidate();
        }

        public boolean isSinking() {
            return this.sinking;
        }

        public void setSinking(boolean sinking) {
            this.sinking = sinking;
        }

        public boolean isSetUp() {
            return this.setUp;
        }

        public void setTextColor(int color2) {
            super.setTextColor(color2);
            this.createShader();
        }

        public void setTextColor(ColorStateList colors) {
            super.setTextColor(colors);
            this.createShader();
        }

        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            this.createShader();
            if (!this.setUp) {
                this.setUp = true;
                if (this.animationSetupCallback != null) {
                    this.animationSetupCallback.onSetupAnimation(this);
                }
            }
        }

        private void createShader() {
            if (this.wave == null) {
                this.wave = this.getResources().getDrawable(R.drawable.wave);
            }
            int waveW = this.wave.getIntrinsicWidth();
            int waveH = this.wave.getIntrinsicHeight();
            Bitmap b = Bitmap.createBitmap((int)waveW, (int)waveH, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            Canvas c = new Canvas(b);
            c.drawColor(this.getCurrentTextColor());
            this.wave.setBounds(0, 0, waveW, waveH);
            this.wave.draw(c);
            this.shader = new BitmapShader(b, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
            this.getPaint().setShader((Shader)this.shader);
            this.offsetY = (this.getHeight() - waveH) / 2;
        }

        protected void onDraw(Canvas canvas) {
            if (this.sinking && this.shader != null) {
                if (this.getPaint().getShader() == null) {
                    this.getPaint().setShader((Shader)this.shader);
                }
                this.shaderMatrix.setTranslate(this.maskX, this.maskY + this.offsetY);
                this.shader.setLocalMatrix(this.shaderMatrix);
            } else {
                this.getPaint().setShader(null);
            }
            super.onDraw(canvas);
        }
    }

    public class Titanic {
        private AnimatorSet animatorSet;
        private Animator.AnimatorListener animatorListener;

        public Animator.AnimatorListener getAnimatorListener() {
            return this.animatorListener;
        }

        public void setAnimatorListener(Animator.AnimatorListener animatorListener) {
            this.animatorListener = animatorListener;
        }

        public void start(final TitanicTextView textView) {
            final Runnable animate = new Runnable(){

                @Override
                public void run() {
                    textView.setSinking(true);
                    ObjectAnimator maskXAnimator = ObjectAnimator.ofFloat((Object)((Object)textView), (String)"maskX", (float[])new float[]{0.0f, 200.0f});
                    maskXAnimator.setRepeatCount(-1);
                    maskXAnimator.setDuration(1000L);
                    maskXAnimator.setStartDelay(0L);
                    int h = textView.getHeight();
                    ObjectAnimator maskYAnimator = ObjectAnimator.ofFloat((Object)((Object)textView), (String)"maskY", (float[])new float[]{h / 2, -h / 2});
                    maskYAnimator.setRepeatCount(-1);
                    maskYAnimator.setRepeatMode(2);
                    maskYAnimator.setDuration(10000L);
                    maskYAnimator.setStartDelay(0L);
                    Titanic.this.animatorSet = new AnimatorSet();
                    Titanic.this.animatorSet.playTogether(new Animator[]{maskXAnimator, maskYAnimator});
                    Titanic.this.animatorSet.setInterpolator((TimeInterpolator)new LinearInterpolator());
                    Titanic.this.animatorSet.addListener(new Animator.AnimatorListener(){

                        public void onAnimationStart(Animator animation) {
                        }

                        public void onAnimationEnd(Animator animation) {
                            textView.setSinking(false);
                            if (Build.VERSION.SDK_INT < 16) {
                                textView.postInvalidate();
                            } else {
                                textView.postInvalidateOnAnimation();
                            }
                            Titanic.this.animatorSet = null;
                        }

                        public void onAnimationCancel(Animator animation) {
                        }

                        public void onAnimationRepeat(Animator animation) {
                        }
                    });
                    if (Titanic.this.animatorListener != null) {
                        Titanic.this.animatorSet.addListener(Titanic.this.animatorListener);
                    }
                    Titanic.this.animatorSet.start();
                }
            };
            if (!textView.isSetUp()) {
                textView.setAnimationSetupCallback(new AnimationSetupCallback(){

                    @Override
                    public void onSetupAnimation(TitanicTextView target) {
                        animate.run();
                    }
                });
            } else {
                animate.run();
            }
        }

        public void cancel() {
            if (this.animatorSet != null) {
                this.animatorSet.cancel();
            }
        }
    }

    public static class AutoTypeTextView
    extends TextView {
        public static int PRECISSION_LOW = 8;
        public static int PRECISSION_MED = 9;
        public static int PRECISSION_HIGH = 11;
        private int decryptionSpeed = 10;
        private int encryptionSpeed = 10;
        private int typingSpeed = 100;
        private int precision = 5;
        private String animateEncryption = "";
        private String animateDecryption = "";
        private String animateTextTyping = "";
        private String animateTextTypingWithMistakes = "";
        private Handler handler;
        private int counter = 0;
        private boolean misstakeFound = false;
        private boolean executed = false;
        private Random ran = new Random();
        public String misstakeValues = "qwertyuiop[]asdfghjkl;zxcvbnm,./!@#$^&*()_+1234567890";
        private String encryptedText;
        private int countLetter = 0;
        private int cocatation = 0;

        public AutoTypeTextView(Context context) {
            super(context);
        }

        public AutoTypeTextView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        private void setupAttributes() {
            if (this.animateTextTyping != null) {
                this.setTextAutoTyping(this.animateTextTyping);
            }
            if (this.animateTextTypingWithMistakes != null) {
                if (this.precision < 6) {
                    this.precision = 6;
                }
                this.setTextAutoTypingWithMistakes(this.animateTextTypingWithMistakes, this.precision);
            }
            if (this.animateDecryption != null) {
                this.animateDecryption(this.animateDecryption);
            }
            if (this.animateEncryption != null) {
                this.animateEncryption(this.animateEncryption);
            }
        }

        public void setTextAutoTyping(final String text) {
            if (!this.executed) {
                this.executed = true;
                this.counter = 0;
                this.handler = new Handler();
                this.handler.postDelayed(new Runnable(){

                    @Override
                    public void run() {
                        this.setText(text.substring(0, counter));
                        counter++;
                        if (text.length() >= counter) {
                            this.postDelayed(this, this.getTypingSpeed());
                        } else {
                            executed = false;
                        }
                    }
                }, (long)this.getTypingSpeed());
            }
        }

        public void setTextAutoTypingWithMistakes(final String text, final int precission) {
            if (!this.executed) {
                this.executed = true;
                this.counter = 0;
                this.handler = new Handler();
                this.ran = new Random();
                this.handler.postDelayed(new Runnable(){

                    @Override
                    public void run() {
                        int num = ran.nextInt(10) + 1;
                        if (num > precission && counter > 1 && !misstakeFound) {
                            this.setText(this.chooseTypeOfMistake(text, counter));
                            counter--;
                        } else {
                            counter++;
                            this.setText(text.substring(0, counter));
                            misstakeFound = false;
                        }
                        if (text.length() > counter) {
                            this.postDelayed(this, this.getTypingSpeed());
                        } else {
                            executed = false;
                        }
                    }
                }, (long)this.getTypingSpeed());
            }
        }

        public void animateDecryption(final String text) {
            this.encryptedText = text;
            this.ran = new Random();
            this.handler = new Handler();
            this.cocatation = this.ran.nextInt(10);
            this.counter = 0;
            this.countLetter = 0;
            if (!this.executed) {
                this.executed = true;
                for (int i = 0; i < text.length(); ++i) {
                    this.encryptedText = AutoTypeTextView.replaceCharAt(this.encryptedText, i, this.misstakeValues.charAt(this.ran.nextInt(this.misstakeValues.length())));
                    this.setText(this.encryptedText);
                }
                this.handler = new Handler();
                this.handler.postDelayed(new Runnable(){

                    @Override
                    public void run() {
                        if (counter <= cocatation) {
                            encryptedText = AutoTypeTextView.replaceCharAt(encryptedText, countLetter, misstakeValues.charAt(ran.nextInt(misstakeValues.length())));
                            this.setText(encryptedText);
                            counter++;
                        } else {
                            encryptedText = AutoTypeTextView.replaceCharAt(encryptedText, countLetter, text.charAt(countLetter));
                            this.setText(encryptedText);
                            countLetter++;
                            cocatation = ran.nextInt(10);
                            counter = 0;
                        }
                        if (text.length() > countLetter) {
                            this.postDelayed(this, this.getDecryptionSpeed());
                        } else {
                            executed = false;
                        }
                    }
                }, (long)this.getDecryptionSpeed());
            }
        }

        public void animateEncryption(final String text) {
            this.encryptedText = text;
            this.ran = new Random();
            this.handler = new Handler();
            this.cocatation = this.ran.nextInt(10);
            this.counter = 0;
            this.countLetter = 0;
            if (!this.executed) {
                this.executed = true;
                this.handler = new Handler();
                this.handler.postDelayed(new Runnable(){

                    @Override
                    public void run() {
                        if (counter <= cocatation) {
                            encryptedText = AutoTypeTextView.replaceCharAt(encryptedText, countLetter, misstakeValues.charAt(ran.nextInt(misstakeValues.length())));
                            this.setText(encryptedText);
                            counter++;
                        } else {
                            countLetter++;
                            cocatation = ran.nextInt(10);
                            counter = 0;
                        }
                        if (text.length() > countLetter) {
                            this.postDelayed(this, this.getDecryptionSpeed());
                        } else {
                            executed = false;
                        }
                    }
                }, (long)this.getDecryptionSpeed());
            }
        }

        private String chooseTypeOfMistake(String text, int counter) {
            int misstake = this.ran.nextInt(3) + 1;
            String result = text.substring(0, counter);
            switch (misstake) {
                case 1: {
                    result = text.substring(0, counter - 1) + this.randomChar();
                    break;
                }
                case 2: {
                    switch (this.ran.nextInt(2) + 1) {
                        case 1: {
                            result = text.substring(0, counter - 1) + String.valueOf(text.charAt(counter)).toLowerCase();
                            break;
                        }
                        case 2: {
                            result = text.substring(0, counter - 1) + String.valueOf(text.charAt(counter)).toUpperCase();
                        }
                    }
                    break;
                }
                case 3: {
                    result = text.substring(0, counter - 1);
                }
            }
            this.misstakeFound = true;
            return result;
        }

        private char randomChar() {
            return this.misstakeValues.charAt(this.ran.nextInt(this.misstakeValues.length()));
        }

        public static String replaceCharAt(String text, int pos, char c) {
            return text.substring(0, pos) + c + text.substring(pos + 1);
        }

        public int getTypingSpeed() {
            return this.typingSpeed;
        }

        public void setTypingSpeed(int typingSpeed) {
            this.typingSpeed = typingSpeed;
        }

        public int getDecryptionSpeed() {
            return this.decryptionSpeed;
        }

        public void setDecryptionSpeed(int decryptionSpeed) {
            this.decryptionSpeed = decryptionSpeed;
        }

        public int getEncryptionSpeed() {
            return this.encryptionSpeed;
        }

        public void setEncryptionSpeed(int encryptionSpeed) {
            this.encryptionSpeed = encryptionSpeed;
        }

        public boolean isRunning() {
            return this.executed;
        }
    }

    public static interface AnimationSetupCallback {
        public void onSetupAnimation(TitanicTextView var1);
    }
}
