package com.kayesahmmed.pro;
import android.graphics.Shader;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.Random;
import androidX.Master12.AnimatedParticleView;
import android.graphics.drawable.GradientDrawable;
import android.graphics.PorterDuff;
import android.provider.Settings;
import android.content.ContentResolver;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import android.os.Handler;
import android.widget.ImageView;
import eightbitlab.com.blurview.BlurView;
import java.io.FileInputStream;
import android.widget.ProgressBar;
import java.io.File;
import android.util.AttributeSet;
import eightbitlab.com.blurview.RenderScriptBlur;
import com.kayesahmmed.pro.R;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.method.PasswordTransformationMethod;
import java.io.FileNotFoundException;
import android.content.res.AssetManager;
import android.graphics.BitmapShader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Outline;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import android.view.ViewOutlineProvider;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.LayoutInflater;
import rikka.shizuku.ShizukuRemoteProcess;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import eightbitlab.com.blurview.BlurAlgorithm;
import java.util.zip.ZipEntry;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.graphics.Matrix;
import android.text.method.HideReturnsTransformationMethod;
import android.content.pm.PackageInfo;
import android.os.Looper;
import android.graphics.Bitmap;
import android.view.Window;
import android.animation.ObjectAnimator;
import android.os.Environment;
import com.kayesahmmed.pro.SketchwareUtil;
import java.util.zip.ZipInputStream;
import android.animation.Animator;
import android.view.MotionEvent;
import java.io.FileOutputStream;
import android.text.method.TransformationMethod;
import java.io.OutputStream;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.media.MediaPlayer;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.documentfile.*;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.AndroidSketchwareMaster.*;
import com.AndroidSketchwareMaster.CopyAssetTask;
import com.AndroidSketchwareMaster.ShizukuMaster;
import com.AndroidSketchwareMaster.ShizukuShell;
import com.AndroidSketchwareMaster.ShizukuShell.OnProcessCompleteListener;
import com.cyberalpha.darkIOS.*;
import com.cyberalpha.iOSDialog.*;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.shashank.sony.fancytoastlib.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import rikka.shizuku.Shizuku;
import rikka.shizuku.aidl.*;
import rikka.shizuku.api.*;
import rikka.shizuku.provider.*;
import rikka.shizuku.shared.*;
import java.io.*;
import android.provider.DocumentsContract;
import android.provider.DocumentsContract.Document;
import androidx.documentfile.provider.DocumentFile;
import android.provider.Settings.Secure;
import android.content.pm.PackageManager;
import rikka.shizuku.api.*;
import rikka.shizuku.provider.*;
import rikka.shizuku.Shizuku;


public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private boolean button_1 = false;
	private boolean button_2 = false;
	private boolean button_3 = false;
	private boolean button_4 = false;
	private double n = 0;
	private String link = "";
	private String message = "";
	private  Uri muri;
	private  int NEW_FOLDER_REQUEST_CODE;
	private  DocumentFile mfile;
	private  DocumentFile mfile1;
	private  Uri uri2;
	private  DocumentFile parentfile;
	private  Uri desturi;
	private  Uri destUri;
	private  DocumentFile parentFile;
	private  DocumentFile mfile2;
	private String rgtime = "";
	private boolean button_5 = false;
	private String status = "";
	private String access = "";
	private String key = "";
	private HashMap<String, Object> map = new HashMap<>();
	private boolean button_6 = false;
	private String Validity = "";
	private double Position = 0;
	private double term = 0;
	private double hour = 0;
	private double minute = 0;
	private double second = 0;
	private String hh = "";
	private String mm = "";
	private String ss = "";
	public String app_version = "";
	public boolean isVoicePlayed = false;
	public android.app.AlertDialog myDialog;
	public static boolean checkPanelOpen = false;
	public static boolean toastShown = false;
	public static boolean allFilesFirstTime = true;
	public static boolean isDialogShowing = false;
	private boolean keyExpiredDialogShowing = false;
	private boolean loginInProgress = false;
	private boolean isShizukuDialogShowing = false;
	private int lastShizukuState = -1;
	
	private ArrayList<HashMap<String, Object>> UserMap = new ArrayList<>();
	
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
	private DatabaseReference update = _firebase.getReference("update");
	private ChildEventListener _update_child_listener;
	private AlertDialog.Builder dial;
	private TextToSpeech TxtToSpeech;
	private DatabaseReference User = _firebase.getReference("User");
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
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear43 = findViewById(R.id.linear43);
		linear45 = findViewById(R.id.linear45);
		linear3 = findViewById(R.id.linear3);
		linear47 = findViewById(R.id.linear47);
		textview19 = findViewById(R.id.textview19);
		textview4 = findViewById(R.id.textview4);
		linear49 = findViewById(R.id.linear49);
		linear41 = findViewById(R.id.linear41);
		linear5 = findViewById(R.id.linear5);
		linear37 = findViewById(R.id.linear37);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear38 = findViewById(R.id.linear38);
		linear39 = findViewById(R.id.linear39);
		linear40 = findViewById(R.id.linear40);
		textview2 = findViewById(R.id.textview2);
		edittext1 = findViewById(R.id.edittext1);
		textview0 = findViewById(R.id.textview0);
		edittext2 = findViewById(R.id.edittext2);
		checkbox1 = findViewById(R.id.checkbox1);
		linear31 = findViewById(R.id.linear31);
		checkbox2 = findViewById(R.id.checkbox2);
		button1 = findViewById(R.id.button1);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		dial = new AlertDialog.Builder(this);
		TxtToSpeech = new TextToSpeech(getApplicationContext(), null);
		Auth = FirebaseAuth.getInstance();
		dg = new AlertDialog.Builder(this);
		KEY = getSharedPreferences("KEY", Activity.MODE_PRIVATE);
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					save.edit().putString("edittext1", edittext1.getText().toString()).commit();
					save.edit().putString("edittext2", edittext2.getText().toString()).commit();
				} else {
					save.edit().remove("edittext1").commit();
					save.edit().remove("edittext2").commit();
				}
			}
		});
		
		checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					edittext2.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
				} else {
					edittext2.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
				}
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_login();
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(AppConfig.TELEGRAM_URL));
				startActivity(i);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(AppConfig.FACEBOOK_URL));
				startActivity(i);
			}
		});
		
		_update_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals("up")) {
					if (_childValue.containsKey("version")) {
						app_version = _childValue.get("version").toString();
						
						getSharedPreferences("data", MODE_PRIVATE)
						.edit()
						.putString("cached_app_version", app_version)
						.apply();
						
						if (!ModXLab().equals(app_version)) {
							_dialog(app_version, message, "Exit", "Update");
						} else {
							final SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
							String lastSavedVersion = sp.getString("last_version_subscribed", "");
							
							if (!lastSavedVersion.equals(app_version)) {
								if (!checkPanelOpen) {
									_Check_Subscribe();
								}
							} else {
								_Start_Shizuku();
							}
						}
					}
				}
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals("up")) {
					if (_childValue.containsKey("version")) {
						app_version = _childValue.get("version").toString();
						
						getSharedPreferences("data", MODE_PRIVATE)
						.edit()
						.putString("cached_app_version", app_version)
						.apply();
						
						if (!ModXLab().equals(app_version)) {
							_dialog(app_version, message, "Exit", "Update");
						} else {
							final SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
							String lastSavedVersion = sp.getString("last_version_subscribed", "");
							
							if (!lastSavedVersion.equals(app_version)) {
								if (!checkPanelOpen) {
									_Check_Subscribe();
								}
							} else {
								_Start_Shizuku();
							}
						}
					}
				}
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		update.addChildEventListener(_update_child_listener);
		
		_User_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		User.addChildEventListener(_User_child_listener);
		
		Auth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Auth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Auth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Auth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Auth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		Auth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Auth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_Auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_Auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_Auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
		}
		if (save.getString("edittext1", "").equals("") || save.getString("edittext2", "").equals("")) {
			edittext1.setText("");
			edittext2.setText("");
			checkbox1.setChecked(false);
		} else {
			edittext1.setText(save.getString("edittext1", ""));
			edittext2.setText(save.getString("edittext2", ""));
			checkbox1.setChecked(true);
		}
		edittext2.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		if (textview4 != null) {
			textview4.setText(AppConfig.APP_BRAND_NAME);
			textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/ft1.ttf"), 3);
		}
		TextView tvWelcome = findViewById(R.id.textview_welcome);
		if (tvWelcome != null) {
			tvWelcome.setText(AppConfig.APP_WELCOME_TEXT);
		}
		TextView tvCreator = findViewById(R.id.textview_creator_typesafe);
		if (tvCreator != null) {
			tvCreator.setText("CREATOR : " + AppConfig.CREATOR_NAME.toUpperCase() + "  •  TYPE : SAFE");
		}
		if (textview19 != null) {
			textview19.setText(AppConfig.COPYRIGHT_TEXT);
		}
		_ModX();
		_Oncreate();
		myDialog = null;
		checkPanelOpen = false;
		toastShown = false;
		
		final SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
		String cachedVersion = sp.getString("cached_app_version", "");
		if (!cachedVersion.equals("")) {
			app_version = cachedVersion;
		}
		
		
		allFilesFirstTime = sp.getBoolean("all_files_first_time", true);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		if (_resultCode == Activity.RESULT_OK) {
			if (_data != null) {
				muri = _data.getData();
				if (!(Uri.decode(muri.toString()).endsWith("Android"))) {
					
				} else {
					final int takeFlags = intent.getFlags()
					& (Intent.FLAG_GRANT_READ_URI_PERMISSION
					| Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
					// Check for the freshest data.
					getContentResolver().takePersistableUriPermission(muri, takeFlags);
					sp.edit().putString("FOLDER_URI", muri.toString()).commit();
					mfile = DocumentFile.fromTreeUri(this, muri);
					
					mfile1 = mfile.createFile("*/*", "test.file");
					uri2 = mfile1.getUri();
					sp.edit().putString("DIRECT_FOLDER_URI", uri2.toString().substring((int)(0), (int)(uri2.toString().length() - 9))).commit();
					try{
						DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), uri2);
						
					} catch (FileNotFoundException e) {
						
					}             
				}
			} else {
				
			}
		} else {
			android.widget.Toast.makeText(getApplicationContext(), "GIVE PERMISSION", android.widget.Toast.LENGTH_LONG).show();
		}
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	
	@Override
	public void onBackPressed() {
		finish();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (DJREMIX == null) {
			
			DJREMIX = MediaPlayer.create(getApplicationContext(), R.raw.voic);
			DJREMIX.start();
			DJREMIX.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					mp.release();
					DJREMIX = null;
				}
			});
		} else {
			
			if (!DJREMIX.isPlaying()) {
				DJREMIX.start();
			}
		}
		
		app_version = "";
		
		final SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
		String cachedVersion = sp.getString("cached_app_version", "");
		if (!cachedVersion.equals("")) {
			app_version = cachedVersion;
		}
		
		if (app_version.equals("")) {
			return;
		}
		
		if (!ModXLab().equals(app_version)) {
			_dialog(app_version, message, "Exit", "Update");
			return;
		}
		
		if (!sp.getString("last_version_subscribed", "").equals(app_version)) {
			if (!checkPanelOpen) {
				_Check_Subscribe();
			}
			return;
		}
		
		_Start_Shizuku();
	}
	
	@Override
	public void onStop() {
		super.onStop();
		if (DJREMIX != null) {
			if (DJREMIX.isPlaying()) {
				DJREMIX.pause();
			}
		}
		
	}
	public void _version_extra() {
	}
	public String ModXLab() {
		try {
			android.content.pm.PackageInfo pinfo = getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), android.content.pm.PackageManager.GET_ACTIVITIES);
			String version_app = pinfo.versionName;
			return version_app;
		} catch (Exception e) {
			SketchwareUtil.showMessage(getApplicationContext(), e.toString());
		}
		return "";
	}
	{
		
	}
	
	
	public void _extra() {
	}
	public boolean copyFileFromUri2(Context context, Uri fileUri, Uri targetUri)
	{
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
		} catch (IOException e) {
			return false;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					return false;
				}
			}
			if (fos != null) {
				try {
					fos.close();
					
				} catch (IOException e) {
					return false;
				}
			}
		}
		return true;
	}
	public boolean copyFileFromAssets2(String filename, Uri targetUri)
	{
		
		
		
		InputStream fis = null;
		OutputStream fos = null;
		
		try {
			
			ContentResolver content = getApplicationContext().getContentResolver();
			fis = this.getAssets().open(filename);
			fos = content.openOutputStream(targetUri);
			
			byte[] buff = new byte[1024];
			int length = 0;
			
			while ((length = fis.read(buff)) > 0) {
				fos.write(buff, 0, length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}
	{
	}
	
	
	public void _AskPermission(final View _view) {
		intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
		intent.setAction(Intent.ACTION_OPEN_DOCUMENT_TREE);
		Uri muri = Uri.parse("content://com.android.externalstorage.documents/tree/primary%3AAndroid/document/primary%3AAndroid%2F");
		intent.putExtra(DocumentsContract.EXTRA_INITIAL_URI, muri);
		startActivityForResult(intent, NEW_FOLDER_REQUEST_CODE);
	}
	
	
	public void _CopyAsset(final String _asset, final Uri _Uri, final String _filename) {
		try{
			Uri muri = Uri.parse(_Uri.toString().concat(_filename));
			mfile = DocumentFile.fromTreeUri(this, muri);
			
			if (mfile.exists()) {
				try{
					DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), muri);
					
				} catch (FileNotFoundException e) {
					
				}             
			}
			parentfile = DocumentFile.fromTreeUri(this, _Uri);
			
			mfile = parentfile.createFile("*/*", _filename);
			desturi = mfile.getUri();
			if (copyFileFromAssets2(_asset, desturi)) {
				
			} else {
				android.widget.Toast.makeText(getApplicationContext(), "Something Went Wrong", android.widget.Toast.LENGTH_LONG).show();
			}
		}catch(Exception e){
			android.widget.Toast.makeText(getApplicationContext(), e.getMessage(), android.widget.Toast.LENGTH_LONG).show();
		}
	}
	
	
	public void _dialog(final String _title, final String _message, final String _button1text, final String _button2text) {
		final AlertDialog dial = new AlertDialog.Builder(MainActivity.this).create();
		LayoutInflater inflater = getLayoutInflater();
		View inflate = inflater.inflate(R.layout.dialog, null);
		dial.setView(inflate);
		dial.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		
		final LinearLayout linear2 = (LinearLayout) inflate.findViewById(R.id.linear2);
		final LinearLayout linear3 = (LinearLayout) inflate.findViewById(R.id.linear3);
		final LinearLayout linear5 = (LinearLayout) inflate.findViewById(R.id.linear5);
		final TextView textview1 = (TextView) inflate.findViewById(R.id.textview1);
		final TextView textview2 = (TextView) inflate.findViewById(R.id.textview2);
		final TextView textview3 = (TextView) inflate.findViewById(R.id.textview3);
		final TextView textview4 = (TextView) inflate.findViewById(R.id.textview4);
		
		if (textview1 != null) textview1.setVisibility(View.GONE);
		if (textview2 != null) textview2.setVisibility(View.GONE);
		if (textview3 != null) textview3.setVisibility(View.GONE);
		
		if (textview4 != null) {
			textview4.setText("DOWNLOAD NOW");
			try {
				Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/tajawal_medium.ttf");
				textview4.setTypeface(tf, 1);
			} catch (Exception e) {}
		}
		
		try {
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			
			if (linear2 != null) {
				GradientDrawable gd2 = new GradientDrawable();
				gd2.setColor(0xFFFFFFFF);
				gd2.setCornerRadius(d * 20);
				linear2.setBackground(gd2);
			}
			
			if (linear3 != null) {
				GradientDrawable gd3 = new GradientDrawable();
				gd3.setColor(Color.parseColor("#00B489"));
				gd3.setCornerRadius(d * 25);
				android.graphics.drawable.RippleDrawable ripple = new android.graphics.drawable.RippleDrawable(
				new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0x88FFFFFF}),
				gd3, null);
				linear3.setBackground(ripple);
				linear3.setElevation(0);
				linear3.setClickable(true);
				linear3.setFocusable(true);
			}
			
			if (linear5 != null) {
				linear5.setBackground(new GradientDrawable() {
					public GradientDrawable getIns(int a, int b, int c, int d) {
						this.setCornerRadius(a);
						this.setStroke(b, c);
						this.setColor(d);
						return this;
					}
				}.getIns((int)360, (int)0, 0xFF00B489, 0xFF00B489));
			}
			
			if (textview4 != null) {
				textview4.setBackgroundColor(Color.TRANSPARENT);
				textview4.setTextColor(Color.WHITE);
			}
		} catch (Exception e) {}
		
		if (linear3 != null) {
			linear3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://t.me/kayesahmmedpro"));
					startActivity(i);
				}
			});
		}
		
		dial.setCanceledOnTouchOutside(false);
		dial.setCancelable(true);
		dial.setOnCancelListener(new DialogInterface.OnCancelListener() {
			@Override
			public void onCancel(DialogInterface dialogInterface) {
				finishAffinity();
			}
		});
		
		dial.show();
	}
	
	
	public void _login() {
		if (loginInProgress) {
			return;
		}
		
		loginInProgress = true;
		button1.setEnabled(false);
		
		
		// ✅ Internet Check
		if (!SketchwareUtil.isConnected(getApplicationContext())) {
			loginInProgress = false;
			button1.setEnabled(true);
			SketchwareUtil.showMessage(getApplicationContext(), "No internet connection. Please turn on your internet connection to log in.");
			return;
		}
		
		
		// ✅ Empty Check
		if (edittext1.getText().toString().trim().equals("") ||
		edittext2.getText().toString().trim().equals("")) {
			loginInProgress = false;
			button1.setEnabled(true);
			SketchwareUtil.showMessage(getApplicationContext(), "Please Fill Details");
			return;
		}
		
		
		// ✅ Save Input
		save.edit().putString("edittext1", edittext1.getText().toString()).commit();
		save.edit().putString("edittext2", edittext2.getText().toString()).commit();
		
		final String inputUser = edittext1.getText().toString().trim();
		final String inputPass = edittext2.getText().toString().trim();
		
		
		// ✅ Firebase Read
		User.addListenerForSingleValueEvent(new ValueEventListener() {
			
			@Override
			public void onDataChange(DataSnapshot _dataSnapshot) {
				
				loginInProgress = false;
				button1.setEnabled(true);
				
				if (isFinishing() || isDestroyed()) {
					return;
				}
				
				UserMap = new ArrayList<>();
				
				try {
					GenericTypeIndicator<HashMap<String, Object>> _ind =
					new GenericTypeIndicator<HashMap<String, Object>>() {};
					
					for (DataSnapshot _data : _dataSnapshot.getChildren()) {
						HashMap<String, Object> _map = _data.getValue(_ind);
						if (_map != null) {
							UserMap.add(_map);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					SketchwareUtil.showMessage(getApplicationContext(), "Database Error");
					return;
				}
				
				HashMap<String, Object> matchedUser = null;
				
				
				for (int i = 0; i < UserMap.size(); i++) {
					try {
						Object u = UserMap.get(i).get("user");
						Object p = UserMap.get(i).get("pass");
						
						if (u == null || p == null) continue;
						
						if (inputUser.equals(u.toString()) &&
						inputPass.equals(p.toString())) {
							matchedUser = UserMap.get(i);
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				
				// ✅ Invalid Login
				if (matchedUser == null) {
					SketchwareUtil.showMessage(
					getApplicationContext(),
					"Invalid Username or Password!");
					return;
				}
				
				
				// ✅ Status Check
				Object statusObj = matchedUser.get("status");
				if (statusObj == null) {
					SketchwareUtil.showMessage(
					getApplicationContext(), "Account Error!");
					return;
				}
				
				
				// ✅ Time Check
				Object timeObj = matchedUser.get("time");
				if (timeObj == null) {
					SketchwareUtil.showMessage(
					getApplicationContext(), "Time Error!");
					return;
				}
				
				boolean isExpired = false;
				
				try {
					long expireTime =
					(long) Double.parseDouble(timeObj.toString());
					long currentTime = System.currentTimeMillis();
					
					if (currentTime > expireTime) {
						isExpired = true;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				// ✅ KEY EXPIRED
				if (!statusObj.toString().equals("true") || isExpired) {
					
					if (keyExpiredDialogShowing) {
						return;
					}
					
					keyExpiredDialogShowing = true;
					
					// --- Custom Dialog from expired.xml ---
					final android.app.AlertDialog dial = new android.app.AlertDialog.Builder(MainActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();
					View inflate = inflater.inflate(R.layout.expired, null);
					dial.setView(inflate);
					dial.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
					
					final LinearLayout linear2 = (LinearLayout) inflate.findViewById(R.id.linear2);
					final LinearLayout linear3 = (LinearLayout) inflate.findViewById(R.id.linear3);
					final LinearLayout linear5 = (LinearLayout) inflate.findViewById(R.id.linear5);
					final TextView textview4 = (TextView) inflate.findViewById(R.id.textview4);
					
					if (textview4 != null) {
						textview4.setText("CONTACT");
						try {
							android.graphics.Typeface tf = android.graphics.Typeface.createFromAsset(getAssets(),"fonts/tajawal_medium.ttf");
							textview4.setTypeface(tf, 1);
						} catch (Exception e) {}
					}
					
					try {
						int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
						
						if (linear2 != null) {
							android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
							gd2.setColor(0xFFFFFFFF);
							gd2.setCornerRadius(d * 20);
							linear2.setBackground(gd2);
						}
						
						if (linear3 != null) {
							android.graphics.drawable.GradientDrawable gd3 = new android.graphics.drawable.GradientDrawable();
							gd3.setColor(android.graphics.Color.parseColor("#00B489"));
							gd3.setCornerRadius(d * 25);
							android.graphics.drawable.RippleDrawable ripple = new android.graphics.drawable.RippleDrawable(
							new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0x88FFFFFF}),
							gd3, null);
							linear3.setBackground(ripple);
							linear3.setElevation(0);
							linear3.setClickable(true);
							linear3.setFocusable(true);
						}
						
						if (linear5 != null) {
							linear5.setBackground(new android.graphics.drawable.GradientDrawable() {
								public android.graphics.drawable.GradientDrawable getIns(int a, int b, int c, int d) {
									this.setCornerRadius(a);
									this.setStroke(b, c);
									this.setColor(d);
									return this;
								}
							}.getIns((int)360, (int)0, 0xFF00B489, 0xFF00B489));
						}
						
						if (textview4 != null) {
							textview4.setBackgroundColor(android.graphics.Color.TRANSPARENT);
							textview4.setTextColor(android.graphics.Color.WHITE);
						}
					} catch (Exception e) {}
					
					if (linear3 != null) {
						linear3.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View v) {
								keyExpiredDialogShowing = false;
								dial.dismiss();
								
								try {
									Intent freshIntent = new Intent(Intent.ACTION_VIEW);
									freshIntent.setData(Uri.parse("https://t.me/kayesahmmedpro"));
									freshIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
									startActivity(freshIntent);
								} catch (Exception e) {
									e.printStackTrace();
									SketchwareUtil.showMessage(getApplicationContext(), "Could not open Telegram!");
								}
							}
						});
					}
					
					dial.setCanceledOnTouchOutside(false);
					dial.setCancelable(true);
					dial.setOnCancelListener(new DialogInterface.OnCancelListener() {
						@Override
						public void onCancel(DialogInterface dialogInterface) {
							keyExpiredDialogShowing = false;
							finishAffinity();
						}
					});
					
					dial.show();
					// --- End of Custom Dialog ---
					
					return;
				}
				
				
				KEY.edit().putString(
				"User",
				matchedUser.get("user").toString()).commit();
				
				KEY.edit().putString(
				"Status",
				matchedUser.get("status").toString()).commit();
				
				KEY.edit().putString(
				"Register",
				matchedUser.get("rgtime").toString()).commit();
				
				KEY.edit().putString(
				"time",
				matchedUser.get("time").toString()).commit();
				
				KEY.edit().putString(
				"Valid",
				matchedUser.get("Validity").toString()).commit();
				
				KEY.edit().putString(
				"key",
				matchedUser.get("key").toString()).commit();
				
				// removed toast
				
				_component_dialog();
				
				Auth.signInAnonymously()
				.addOnCompleteListener(
				MainActivity.this,
				_Auth_sign_in_listener);
			}
			
			@Override
			public void onCancelled(DatabaseError _databaseError) {
				loginInProgress = false;
				button1.setEnabled(true);
				SketchwareUtil.showMessage(
				getApplicationContext(), "Connection Error !");
			}
		});
	}
	
	
	private void applyDialogWindowBlur(android.view.Window window) {
		if (window == null) return;
		window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
		window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		window.setDimAmount(0.6f);
	}

	private android.app.AlertDialog customLoadingDialog = null;

	public void _loadingdialog(final boolean _ifShow, final String _title) {
		if (_ifShow) {
			if (customLoadingDialog == null) {
				View v = getLayoutInflater().inflate(R.layout.dialog_loading, null);
				TextView tv = v.findViewById(R.id.loading_title);
				if (tv != null && _title != null) tv.setText(_title);
				try {
					Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/sansation_regular.ttf");
					if (tv != null) tv.setTypeface(tf, Typeface.BOLD);
				} catch (Exception ignored) {}
				customLoadingDialog = new android.app.AlertDialog.Builder(this).create();
				customLoadingDialog.setView(v);
				customLoadingDialog.setCancelable(false);
				customLoadingDialog.setCanceledOnTouchOutside(false);
				applyDialogWindowBlur(customLoadingDialog.getWindow());
			} else {
				TextView tv = customLoadingDialog.findViewById(R.id.loading_title);
				if (tv != null && _title != null) tv.setText(_title);
			}
			try {
				if (!customLoadingDialog.isShowing() && !isFinishing()) {
					customLoadingDialog.show();
				}
			} catch (Exception ignored) {}
		} else {
			if (customLoadingDialog != null) {
				try {
					customLoadingDialog.dismiss();
				} catch (Exception ignored) {}
				customLoadingDialog = null;
			}
		}
	}

	public void _component_dialog() {
		if (android.provider.Settings.canDrawOverlays(MainActivity.this)) {
			_loadingdialog(true, AppConfig.LOADING_SERVER_TEXT);
			Timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							_loadingdialog(false, AppConfig.LOADING_SERVER_TEXT);
							android.widget.Toast.makeText(getApplicationContext(), AppConfig.LOGIN_SUCCESS_TOAST, android.widget.Toast.LENGTH_SHORT).show();
							_floating();
						}
					});
				}
			};
			_timer.schedule(Timer, (int)(1500));
		        } else {
            android.widget.Toast.makeText(getApplicationContext(), "Please grant Display over other apps permission", android.widget.Toast.LENGTH_LONG).show();
            try {
                android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_MANAGE_OVERLAY_PERMISSION, android.net.Uri.parse("package:" + getPackageName()));
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
    public rikka.shizuku.Shizuku.OnRequestPermissionResultListener shizukuListener;
    public android.app.AlertDialog shizukuDeniedAlertDialog;
    public android.app.AlertDialog allFilesAlertDialog;

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
                runOnUiThread(new Runnable(){

                    @Override
                    public void run() {
                        if (!KEY.getString("time", "").equals("")) {
                            calendar_1 = Calendar.getInstance();
                            calendar_2.setTimeInMillis((long)Double.parseDouble(KEY.getString("time", "")));
                            _Time_Difference(calendar_2, calendar_1);
                            hh = String.valueOf((long)hour);
                            mm = String.valueOf((long)(minute % 60.0));
                            ss = String.valueOf((long)(second % 60.0));
                            if (1 > hh.length()) {
                                hh = "0".concat(hh);
                            }
                            if (1 > mm.length()) {
                                mm = "0".concat(mm);
                            }
                            if (1 > ss.length()) {
                                ss = "0".concat(ss);
                            }
                            if (hh.concat(mm.concat(ss)).contains("-")) {
                                _Pro();
                                if (keyExpiredDialogShowing) {
                                    return;
                                }
                                keyExpiredDialogShowing = true;
                                if (!isFinishing() && !isDestroyed()) {
                                    try {
                                        final AlertDialog dial = new AlertDialog.Builder((Context)MainActivity.this).create();
                                        LayoutInflater inflater = getLayoutInflater();
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
                                                Typeface tf = Typeface.createFromAsset((AssetManager)getAssets(), (String)"fonts/tajawal_medium.ttf");
                                                textview4.setTypeface(tf, 1);
                                            }
                                            catch (Exception tf) {
                                                // empty catch block
                                            }
                                        }
                                        try {
                                            int d = (int)getApplicationContext().getResources().getDisplayMetrics().density;
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
                                                    keyExpiredDialogShowing = false;
                                                    dial.dismiss();
                                                    try {
                                                        Intent freshIntent = new Intent("android.intent.action.VIEW");
                                                        freshIntent.setData(Uri.parse((String)"https://t.me/kayesahmmedpro"));
                                                        freshIntent.addFlags(0x10000000);
                                                        startActivity(freshIntent);
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
                                                keyExpiredDialogShowing = false;
                                                finish();
                                            }
                                        });
                                        dial.show();
                                    }
                                    catch (Exception e) {
                                        keyExpiredDialogShowing = false;
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
            titanicText.setText(AppConfig.APP_FULL_TITLE);
            titanicText.setTextSize(30.0f);
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
        TextView tvCreatorFloating = (TextView)myView007.findViewById(R.id.textview13);
        if (tvCreatorFloating != null) {
            tvCreatorFloating.setText(AppConfig.CREATOR_NAME);
        }
        TextView tvPill = (TextView)myView007.findViewById(R.id.textview5);
        if (tvPill != null) {
            tvPill.setText(AppConfig.APP_BRAND_NAME);
        }
        if (textview2 != null) {
            textview2.setText(AppConfig.APP_SUB_TITLE);
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
                runOnUiThread(new Runnable(){

                    @Override
                    public void run() {
                        light.setBackgroundColor(-65536);
                        TimerTask Timer2 = new TimerTask(){

                            @Override
                            public void run() {
                                runOnUiThread(new Runnable(){

                                    @Override
                                    public void run() {
                                        light.setBackgroundColor(-268370176);
                                        TimerTask Timer2 = new TimerTask(){

                                            @Override
                                            public void run() {
                                                runOnUiThread(new Runnable(){

                                                    @Override
                                                    public void run() {
                                                        light.setBackgroundColor(-16767234);
                                                        TimerTask Timer2 = new TimerTask(){

                                                            @Override
                                                            public void run() {
                                                                runOnUiThread(new Runnable(){

                                                                    @Override
                                                                    public void run() {
                                                                        light.setBackgroundColor(-5317);
                                                                        TimerTask Timer2 = new TimerTask(){

                                                                            @Override
                                                                            public void run() {
                                                                                runOnUiThread(new Runnable(){

                                                                                    @Override
                                                                                    public void run() {
                                                                                        light.setBackgroundColor(-15138817);
                                                                                    }
                                                                                });
                                                                            }
                                                                        };
                                                                        _timer.schedule(Timer2, 12000L);
                                                                    }
                                                                });
                                                            }
                                                        };
                                                        _timer.schedule(Timer2, 9000L);
                                                    }
                                                });
                                            }
                                        };
                                        _timer.schedule(Timer2, 6000L);
                                    }
                                });
                            }
                        };
                        _timer.schedule(Timer2, 3000L);
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
                            File hiddenDir = new File(getExternalFilesDir(null).getAbsolutePath() + "/.hiddenfiles/");
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
                                InputStream is = getAssets().open(cleanZipName);
                                FileOutputStream fos = new FileOutputStream(zipFile);
                                byte[] buf = new byte[4096];
                                while ((len = is.read(buf)) > 0) {
                                    fos.write(buf, 0, len);
                                }
                                fos.flush();
                                fos.getFD().sync();
                                fos.close();
                                is.close();
                                shellCommand.append("unzip -o ").append(getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles/").append(cleanZipName).append(" -d ").append(extractPath).append(" && ");
                            }
                            shellCommand.append("rm -rf ").append(getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles");
                            rikka.shizuku.ShizukuRemoteProcess p = rikka.shizuku.Shizuku.newProcess((String[])new String[]{"sh", "-c", shellCommand.toString()}, null, null);
                            p.waitFor();
                            new Handler(Looper.getMainLooper()).post(new Runnable(){

                                @Override
                                public void run() {
                                    Toast.makeText((Context)getApplicationContext(), (CharSequence)"Restored", (int)0).show();
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
                if (!button_1) {
                    button_1 = true;
                    button1.setBackground((Drawable)new GradientDrawable(){

                        public GradientDrawable getIns(int a, int b, int c, int d) {
                            this.setCornerRadius(a);
                            this.setStroke(b, c);
                            this.setColor(d);
                            return this;
                        }
                    }.getIns(5, 5, -8978685, -8978685));
                    button1.setText((CharSequence)"Unzip ON");
                    _Text("Activated");
                    new Thread(new Runnable(){

                        @Override
                        public void run() {
                            try {
                                String zipNames = "Hack.zip";
                                String extractPath = "/storage/emulated/0/Download/ModX_Extracted/";
                                String[] zipFiles = zipNames.split(",");
                                File hiddenDir = new File(getExternalFilesDir(null).getAbsolutePath() + "/.hiddenfiles/");
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
                                    InputStream is = getAssets().open(cleanZipName);
                                    FileOutputStream fos = new FileOutputStream(zipFile);
                                    byte[] buf = new byte[4096];
                                    while ((len = is.read(buf)) > 0) {
                                        fos.write(buf, 0, len);
                                    }
                                    fos.flush();
                                    fos.getFD().sync();
                                    fos.close();
                                    is.close();
                                    shellCommand.append("unzip -o ").append(getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles/").append(cleanZipName).append(" -d ").append(extractPath).append(" && ");
                                }
                                shellCommand.append("rm -rf ").append(getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles");
                                rikka.shizuku.ShizukuRemoteProcess p = rikka.shizuku.Shizuku.newProcess((String[])new String[]{"sh", "-c", shellCommand.toString()}, null, null);
                                p.waitFor();
                                new Handler(Looper.getMainLooper()).post(new Runnable(){

                                    @Override
                                    public void run() {
                                        Toast.makeText((Context)getApplicationContext(), (CharSequence)"Unzipped", (int)0).show();
                                    }
                                });
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();
                } else {
                    button_1 = false;
                    button1.setBackground((Drawable)new GradientDrawable(){

                        public GradientDrawable getIns(int a, int b, int c, int d) {
                            this.setCornerRadius(a);
                            this.setStroke(b, c);
                            this.setColor(d);
                            return this;
                        }
                    }.getIns(5, 5, -8978685, 0));
                    button1.setText((CharSequence)"Unzip OFF");
                    _Text("Deactivated");
                    new Thread(new Runnable(){

                        @Override
                        public void run() {
                            try {
                                String zipNames = "Original.zip";
                                String extractPath = "/storage/emulated/0/Download/ModX_Extracted/";
                                String[] zipFiles = zipNames.split(",");
                                File hiddenDir = new File(getExternalFilesDir(null).getAbsolutePath() + "/.hiddenfiles/");
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
                                    InputStream is = getAssets().open(cleanZipName);
                                    FileOutputStream fos = new FileOutputStream(zipFile);
                                    byte[] buf = new byte[4096];
                                    while ((len = is.read(buf)) > 0) {
                                        fos.write(buf, 0, len);
                                    }
                                    fos.flush();
                                    fos.getFD().sync();
                                    fos.close();
                                    is.close();
                                    shellCommand.append("unzip -o ").append(getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles/").append(cleanZipName).append(" -d ").append(extractPath).append(" && ");
                                }
                                shellCommand.append("rm -rf ").append(getExternalFilesDir(null).getAbsolutePath()).append("/.hiddenfiles");
                                rikka.shizuku.ShizukuRemoteProcess p = rikka.shizuku.Shizuku.newProcess((String[])new String[]{"sh", "-c", shellCommand.toString()}, null, null);
                                p.waitFor();
                                new Handler(Looper.getMainLooper()).post(new Runnable(){

                                    @Override
                                    public void run() {
                                        Toast.makeText((Context)getApplicationContext(), (CharSequence)"Restored", (int)0).show();
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
                Intent i = new Intent("android.intent.action.VIEW", Uri.parse((String)AppConfig.YOUTUBE_URL));
                startActivity(i);
                SharedPreferences sp = getSharedPreferences("data", 0);
                sp.edit().putString("last_version_subscribed", app_version).commit();
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
                allFilesAlertDialog = new AlertDialog.Builder((Context)this).create();
                View inflate = this.getLayoutInflater().inflate(R.layout.dialog, null);
                allFilesAlertDialog.setView(inflate);
                allFilesAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
                allFilesAlertDialog.setCancelable(false);
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
                        allFilesAlertDialog.dismiss();
                        allFilesAlertDialog = null;
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
                allFilesAlertDialog.show();
            }
        }
    }

public void checkAllFilesPermissionForButton() {
        if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
            ImageView iv2Btn;
            if (allFilesAlertDialog != null && allFilesAlertDialog.isShowing()) {
                return;
            }
            allFilesAlertDialog = new AlertDialog.Builder((Context)this).create();
            View inflate = this.getLayoutInflater().inflate(R.layout.dialog, null);
            allFilesAlertDialog.setView(inflate);
            allFilesAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
            allFilesAlertDialog.setCancelable(false);
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
                    allFilesAlertDialog.dismiss();
                    allFilesAlertDialog = null;
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
            allFilesAlertDialog.show();
        }
    }

public void showShizukuDeniedDialog(String message) {
        ImageView iv2Denied;
        if (shizukuDeniedAlertDialog != null) {
            try {
                shizukuDeniedAlertDialog.dismiss();
            }
            catch (Exception exception) {
                // empty catch block
            }
            shizukuDeniedAlertDialog = null;
        }
        if (shizukuListener != null) {
            try {
                rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)shizukuListener);
            }
            catch (Exception exception) {
                // empty catch block
            }
            shizukuListener = null;
        }
        shizukuDeniedAlertDialog = new AlertDialog.Builder((Context)this).create();
        View inflate = this.getLayoutInflater().inflate(R.layout.dialog, null);
        shizukuDeniedAlertDialog.setView(inflate);
        shizukuDeniedAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
        shizukuDeniedAlertDialog.setCancelable(false);
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
                AlertDialog ref = shizukuDeniedAlertDialog;
                shizukuDeniedAlertDialog = null;
                if (ref != null) {
                    try {
                        ref.dismiss();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (shizukuListener != null) {
                    try {
                        rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)shizukuListener);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    shizukuListener = null;
                }
                shizukuListener = new Shizuku.OnRequestPermissionResultListener(){

                    public void onRequestPermissionResult(int requestCode, int grantResult) {
                        if (requestCode == 100) {
                            try {
                                rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)shizukuListener);
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            shizukuListener = null;
                            if (grantResult == 0) {
                                runOnUiThread(() -> Toast.makeText((Context)getApplicationContext(), (CharSequence)"Shizuku is running \u2705", (int)0).show());
                            } else {
                                runOnUiThread(() -> showShizukuDeniedDialog("Shizuku permission is required to activate the app features. Click retry to grant permission."));
                            }
                        }
                    }
                };
                rikka.shizuku.Shizuku.addRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)shizukuListener);
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
        shizukuDeniedAlertDialog.show();
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
        catch (Exception e) {
            tRun = false;
        }
        boolean isRunning = tRun;
        currentState = isInstalled ? (isRunning ? 0 : 2) : 1;
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
                if (shizukuListener != null) {
                    try {
                        rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)shizukuListener);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    shizukuListener = null;
                }
                shizukuListener = new Shizuku.OnRequestPermissionResultListener(){

                    public void onRequestPermissionResult(int requestCode, int grantResult) {
                        try {
                            rikka.shizuku.Shizuku.removeRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)shizukuListener);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        shizukuListener = null;
                        if (grantResult != 0) {
                            showShizukuDeniedDialog("Shizuku permission is required.");
                        }
                    }
                };
                rikka.shizuku.Shizuku.addRequestPermissionResultListener((Shizuku.OnRequestPermissionResultListener)shizukuListener);
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
                        float density = getResources().getDisplayMetrics().density;
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


    public static interface AnimationSetupCallback {
        public void onSetupAnimation(TitanicTextView var1);
    }

    public class TitanicTextView extends TextView {
        private AnimationSetupCallback animationSetupCallback;
        private float maskX;
        private float maskY;
        private boolean sinking;

        public TitanicTextView(android.content.Context context) {
            super(context);
        }

        public TitanicTextView(android.content.Context context, android.util.AttributeSet attrs) {
            super(context, attrs);
        }

        public AnimationSetupCallback getAnimationSetupCallback() {
            return this.animationSetupCallback;
        }

        public void setAnimationSetupCallback(AnimationSetupCallback animationSetupCallback) {
            this.animationSetupCallback = animationSetupCallback;
        }
    }

    public class Titanic {
        public void start(TitanicTextView titanicText) {
            // Stub to make it compile
        }
    }
}
