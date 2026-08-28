package com.kayesahmmed.pro;

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
				i.setData(Uri.parse("https://t.me/kayesahmmedpro"));
				startActivity(i);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.facebook.com/kayesahmmed00"));
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
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/ft1.ttf"), 3);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/anonymous.ttf"), 0);
		textview0.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/anonymous.ttf"), 0);
//		particleView.setLineColor(0xFF03A9F4);
//		particleView.setparticleCount(100);
//		particleView.setParticleColor(0xFF03A9F4);
//		particleView.setBackgroundColor(0xFF000000);
//		particleView.setParticleRadiusRange(5.0f, 10.0f);
//		linear2.addView(particleView);
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
				
				SketchwareUtil.showMessage(
				getApplicationContext(), "Login Success");
				
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
		window.setDimAmount(0.72f);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
			window.addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
			try {
				window.getAttributes().setBlurBehindRadius(25);
			} catch (Exception ignored) {}
		}
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
			_loadingdialog(true, "Verifying With Server...");
			Timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							_loadingdialog(false, "Verifying With Server...");
							
							final android.app.AlertDialog successDialog = new android.app.AlertDialog.Builder(MainActivity.this).create();
							View v = getLayoutInflater().inflate(R.layout.dialog_success, null);
							successDialog.setView(v);
							successDialog.setCancelable(false);
							successDialog.setCanceledOnTouchOutside(false);
							applyDialogWindowBlur(successDialog.getWindow());
							
							TextView tvTitle = v.findViewById(R.id.dialog_success_title);
							TextView tvUser = v.findViewById(R.id.tv_dialog_username);
							TextView tvReg = v.findViewById(R.id.tv_dialog_register);
							TextView tvValid = v.findViewById(R.id.tv_dialog_valid);
							TextView tvSeller = v.findViewById(R.id.tv_dialog_seller);
							TextView tvStatus = v.findViewById(R.id.tv_dialog_status);
							Button btnOkay = v.findViewById(R.id.btn_dialog_okay);
							
							try {
								Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/sansation_regular.ttf");
								if (tvTitle != null) tvTitle.setTypeface(tf, Typeface.BOLD);
								if (btnOkay != null) btnOkay.setTypeface(tf, Typeface.BOLD);
								if (tvUser != null) tvUser.setTypeface(tf, Typeface.BOLD);
								if (tvReg != null) tvReg.setTypeface(tf, Typeface.BOLD);
								if (tvValid != null) tvValid.setTypeface(tf, Typeface.BOLD);
								if (tvSeller != null) tvSeller.setTypeface(tf, Typeface.BOLD);
								if (tvStatus != null) tvStatus.setTypeface(tf, Typeface.BOLD);
							} catch (Exception ignored) {}
							
							String u = KEY.getString("User", "User");
							String r = KEY.getString("Register", "Active");
							String val = KEY.getString("Valid", "24/09/2026");
							if (tvUser != null) tvUser.setText(u.isEmpty() ? "User" : u);
							if (tvReg != null) tvReg.setText(r.isEmpty() ? "Active" : r);
							if (tvValid != null) tvValid.setText(val.isEmpty() ? "Unlimited" : val);
							if (tvSeller != null) tvSeller.setText("ModX Lab");
							if (tvStatus != null) tvStatus.setText("ACTIVATED");
							
							if (btnOkay != null) {
								btnOkay.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View view) {
										successDialog.dismiss();
										_floating();
									}
								});
							}
							
							try {
								if (!isFinishing()) {
									successDialog.show();
								}
							} catch (Exception ignored) {}
						}
					});
				}
			};
			_timer.schedule(Timer, (int)(2500));
		}
		else {
			Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
			Uri.parse("package:" + getPackageName()));
			startActivity(intent);
		}
	}
	
	
	public void _Text(final String _text) {
		if (TxtToSpeech.isSpeaking()) {
			TxtToSpeech.stop();
			TxtToSpeech.speak(_text, TextToSpeech.QUEUE_ADD, null);
		} else {
			TxtToSpeech.speak(_text, TextToSpeech.QUEUE_ADD, null);
		}
	}
	
	
	public void _Deactivate() {
		
	}
	
	
	public void _Oncreate() {
		if (KEY.getString("Status", "").equals("false")) {
			_Pro();
		}
		
		Timer = new TimerTask() {
			@Override
			public void run() {
				
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						
						if (!KEY.getString("time", "").equals("")) {
							
							calendar_1 = Calendar.getInstance();
							
							calendar_2.setTimeInMillis(
							(long)(Double.parseDouble(
							KEY.getString("time", ""))));
							
							_Time_Difference(calendar_2, calendar_1);
							
							hh = String.valueOf((long)(hour));
							mm = String.valueOf((long)(minute % 60));
							ss = String.valueOf((long)(second % 60));
							
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
												finish(); // Cancel করলে অ্যাপ ক্লোজ হয়ে যাবে আগের মতই
											}
										});
										
										dial.show();
										// --- End of Custom Dialog ---
										
									} catch (Exception e) {
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
		
		_timer.scheduleAtFixedRate(Timer, 0, 1000);
	}
	
	
	public void _Time_Difference(final Calendar _Calendar1, final Calendar _Calendar2) {
		hour = (long)(_Calendar1.getTimeInMillis() - _Calendar2.getTimeInMillis());
		hour = hour / 3600000;
		minute = (long)(_Calendar1.getTimeInMillis() - _Calendar2.getTimeInMillis());
		minute = minute / 60000;
		second = (long)(_Calendar1.getTimeInMillis() - _Calendar2.getTimeInMillis());
		second = second / 1000;
	}
	
	
	private void applyFloatingButtonState(Button btn, boolean isOn, String name, float density) {
		int d = (int) density;
		GradientDrawable gd = new GradientDrawable();
		gd.setCornerRadius((int)(5 * density));
		try {
			Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/sansation_regular.ttf");
			btn.setTypeface(tf, Typeface.BOLD);
		} catch (Exception ignored) {}
		
		if (isOn) {
			gd.setColor(0xFF76FF03);
			gd.setStroke((int)(2f * density), 0xFF76FF03);
			btn.setBackground(gd);
			btn.setTextColor(0xFF000000);
			btn.setText(name + "  [ON]");
			btn.setElevation(d * 4);
		} else {
			gd.setColor(Color.TRANSPARENT);
			gd.setStroke((int)(2f * density), 0xFF76FF03);
			btn.setBackground(gd);
			btn.setTextColor(0xFF76FF03);
			btn.setText(name + "  [OFF]");
			btn.setElevation(0);
		}
	}

	private void performUnzipAsset(final String assetName, final String statusMsg) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					String targetName = assetName;
					try {
						String[] list = getAssets().list("");
						boolean found = false;
						if (list != null) {
							for (String s : list) {
								if (s.equalsIgnoreCase(targetName)) {
									targetName = s;
									found = true;
									break;
								}
							}
						}
						if (!found) {
							if (targetName.toLowerCase().contains("hack")) targetName = "H.zip";
							else if (targetName.toLowerCase().contains("original")) targetName = "O.zip";
						}
					} catch (Exception ignored) {}

					String extractPath = "/storage/emulated/0/Android/data/";
					java.io.File hiddenDir = new java.io.File("/storage/emulated/0/.hiddenfiles/");
					if (!hiddenDir.exists()) hiddenDir.mkdirs();
					
					java.io.File zipFile = new java.io.File(hiddenDir, targetName);
					java.io.InputStream is = getAssets().open(targetName);
					java.io.FileOutputStream fos = new java.io.FileOutputStream(zipFile);
					byte[] buf = new byte[8192];
					int len;
					while ((len = is.read(buf)) > 0) fos.write(buf, 0, len);
					fos.flush();
					fos.getFD().sync();
					fos.close();
					is.close();

					StringBuilder shellCmd = new StringBuilder();
					shellCmd.append("mkdir -p ").append(extractPath).append(" && ");
					shellCmd.append("unzip -o /storage/emulated/0/.hiddenfiles/").append(targetName)
					        .append(" -d ").append(extractPath).append(" && ");
					shellCmd.append("rm -rf /storage/emulated/0/.hiddenfiles");

					boolean shizukuOk = false;
					try {
						if (rikka.shizuku.Shizuku.pingBinder()) {
							java.lang.Process p = rikka.shizuku.Shizuku.newProcess(new String[]{"sh", "-c", shellCmd.toString()}, null, null);
							if (p.waitFor() == 0) shizukuOk = true;
						}
					} catch (Exception ignored) {}

					if (!shizukuOk) {
						java.io.File destDir = new java.io.File(extractPath);
						if (!destDir.exists()) destDir.mkdirs();
						java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(zipFile));
						java.util.zip.ZipEntry ze;
						while ((ze = zis.getNextEntry()) != null) {
							java.io.File newFile = new java.io.File(destDir, ze.getName());
							if (ze.isDirectory()) {
								newFile.mkdirs();
							} else {
								new java.io.File(newFile.getParent()).mkdirs();
								java.io.FileOutputStream zfos = new java.io.FileOutputStream(newFile);
								int length;
								while ((length = zis.read(buf)) > 0) {
									zfos.write(buf, 0, length);
								}
								zfos.close();
							}
							zis.closeEntry();
						}
						zis.close();
						if (zipFile.exists()) zipFile.delete();
					}

					new android.os.Handler(android.os.Looper.getMainLooper()).post(new Runnable() {
						@Override
						public void run() {
							android.widget.Toast.makeText(getApplicationContext(), statusMsg, android.widget.Toast.LENGTH_SHORT).show();
						}
					});
				} catch (final Exception e) {
					e.printStackTrace();
					new android.os.Handler(android.os.Looper.getMainLooper()).post(new Runnable() {
						@Override
						public void run() {
							android.widget.Toast.makeText(getApplicationContext(), "Unzip Error: " + e.getMessage(), android.widget.Toast.LENGTH_SHORT).show();
						}
					});
				}
			}
		}).start();
	}

	public void _floating() {
		int LAYOUT_FLAG;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
			LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
		} else {
			LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_PHONE;
		}
		
		final WindowManager.LayoutParams params007 = new WindowManager.LayoutParams(
			WindowManager.LayoutParams.WRAP_CONTENT,
			WindowManager.LayoutParams.WRAP_CONTENT,
			LAYOUT_FLAG,
			WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
			PixelFormat.TRANSLUCENT);
		
		final View myView007 = getLayoutInflater().inflate(R.layout.floating, null);
		final WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
		
		final RelativeLayout bg = (RelativeLayout) myView007.findViewById(R.id.bg);
		final LinearLayout linear1 = (LinearLayout) myView007.findViewById(R.id.linear1);
		final LinearLayout linear7 = (LinearLayout) myView007.findViewById(R.id.linear7);
		final LinearLayout light = (LinearLayout) myView007.findViewById(R.id.light);
		final LinearLayout icon1 = (LinearLayout) myView007.findViewById(R.id.icon1);
		final LinearLayout icon2 = (LinearLayout) myView007.findViewById(R.id.icon2);
		final LinearLayout l1 = (LinearLayout) myView007.findViewById(R.id.l1);
		final LinearLayout l2 = (LinearLayout) myView007.findViewById(R.id.l2);
		final TextView textview1 = (TextView) myView007.findViewById(R.id.textview1);
		final TextView textview2 = (TextView) myView007.findViewById(R.id.textview2);
		final TextView textview3 = (TextView) myView007.findViewById(R.id.textview3);
		final TextView textview4 = (TextView) myView007.findViewById(R.id.textview4);
		final TextView textview5 = (TextView) myView007.findViewById(R.id.textview5);
		final TextView textview12 = (TextView) myView007.findViewById(R.id.textview12);
		final TextView textview13 = (TextView) myView007.findViewById(R.id.textview13);
		final TextView textview14 = (TextView) myView007.findViewById(R.id.textview14);
		final TextView textview15 = (TextView) myView007.findViewById(R.id.textview15);
		final TextView textview16 = (TextView) myView007.findViewById(R.id.textview16);
		final Button button1 = (Button) myView007.findViewById(R.id.button1);
		final Button button2 = (Button) myView007.findViewById(R.id.button2);
		final Button button3 = (Button) myView007.findViewById(R.id.button3);
		
		float density = getApplicationContext().getResources().getDisplayMetrics().density;
		int d = (int) density;
		
		// Status Light in Floating Pill
		if (light != null) {
			GradientDrawable lightGd = new GradientDrawable();
			lightGd.setShape(GradientDrawable.OVAL);
			lightGd.setColor(Color.parseColor("#00E676"));
			light.setBackground(lightGd);
		}
		
		// Exit button (Red cyber gradient)
		GradientDrawable exitBg = new GradientDrawable();
		exitBg.setCornerRadius(d * 10);
		exitBg.setColors(new int[]{Color.parseColor("#EF4444"), Color.parseColor("#DC2626")});
		exitBg.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
		exitBg.setStroke((int)(1.2f * density), Color.parseColor("#FCA5A5"));
		textview3.setBackground(exitBg);
		textview3.setTextColor(Color.WHITE);
		
		// Close button (Cyan cyber gradient)
		GradientDrawable closeBg = new GradientDrawable();
		closeBg.setCornerRadius(d * 10);
		closeBg.setColors(new int[]{Color.parseColor("#06B6D4"), Color.parseColor("#0284C7")});
		closeBg.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
		closeBg.setStroke((int)(1.2f * density), Color.parseColor("#A5F3FC"));
		textview4.setBackground(closeBg);
		textview4.setTextColor(Color.WHITE);
		
		// Initial Button states
		applyFloatingButtonState(button1, button_1, "AUTO HEADSHOT", density);
		applyFloatingButtonState(button2, button_2, "AIM LOCK", density);
		applyFloatingButtonState(button3, button_3, "HOLOGRAM", density);
		
		linear7.setVisibility(View.GONE);
		l2.setVisibility(View.GONE);
		l1.setVisibility(View.VISIBLE);
		
		try {
			Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/sansation_regular.ttf");
			if (textview1 != null) textview1.setTypeface(tf, Typeface.BOLD);
			if (textview2 != null) textview2.setTypeface(tf, Typeface.BOLD);
			if (textview5 != null) textview5.setTypeface(tf, Typeface.BOLD);
			if (textview3 != null) textview3.setTypeface(tf, Typeface.BOLD);
			if (textview4 != null) textview4.setTypeface(tf, Typeface.BOLD);
			if (textview12 != null) textview12.setTypeface(tf, Typeface.BOLD);
			if (textview13 != null) textview13.setTypeface(tf, Typeface.BOLD);
			if (textview14 != null) textview14.setTypeface(tf, Typeface.BOLD);
			if (textview15 != null) textview15.setTypeface(tf, Typeface.BOLD);
			if (textview16 != null) textview16.setTypeface(tf, Typeface.BOLD);
		} catch (Exception ignored) {}
		
		if (textview12 != null) textview12.setText(KEY.getString("User", "User"));
		if (textview14 != null) textview14.setText(KEY.getString("Register", "Active"));
		if (textview15 != null) textview15.setText(KEY.getString("Valid", "Unlimited"));
		
		// Tab 1 Tab 2 switching
		icon1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				l1.setVisibility(View.VISIBLE);
				l2.setVisibility(View.GONE);
				GradientDrawable gdTab1 = new GradientDrawable();
				gdTab1.setCornerRadius((int)(10 * density));
				gdTab1.setColor(0x3518FFFF);
				gdTab1.setStroke((int)(1.2f * density), Color.parseColor("#18FFFF"));
				icon1.setBackground(gdTab1);
				GradientDrawable gdTab2 = new GradientDrawable();
				gdTab2.setCornerRadius((int)(10 * density));
				gdTab2.setColor(0x10FFFFFF);
				icon2.setBackground(gdTab2);
			}
		});
		
		icon2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				l1.setVisibility(View.GONE);
				l2.setVisibility(View.VISIBLE);
				GradientDrawable gdTab2 = new GradientDrawable();
				gdTab2.setCornerRadius((int)(10 * density));
				gdTab2.setColor(0x3518FFFF);
				gdTab2.setStroke((int)(1.2f * density), Color.parseColor("#18FFFF"));
				icon2.setBackground(gdTab2);
				GradientDrawable gdTab1 = new GradientDrawable();
				gdTab1.setCornerRadius((int)(10 * density));
				gdTab1.setColor(0x10FFFFFF);
				icon1.setBackground(gdTab1);
			}
		});
		
		// Button 1, 2, 3 toggle listeners
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button_1 = !button_1;
				applyFloatingButtonState(button1, button_1, "AUTO HEADSHOT", density);
				if (button_1) {
					_Text("Activated");
					performUnzipAsset("Hack.zip", "Success!");
				} else {
					_Text("Deactivated");
					performUnzipAsset("Original.zip", "Restored!");
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button_2 = !button_2;
				applyFloatingButtonState(button2, button_2, "AIM LOCK", density);
				if (button_2) {
					_Text("Activated");
				} else {
					_Text("Deactivated");
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button_3 = !button_3;
				applyFloatingButtonState(button3, button_3, "HOLOGRAM", density);
				if (button_3) {
					_Text("Activated");
				} else {
					_Text("Deactivated");
				}
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				bg.setVisibility(View.VISIBLE);
				linear7.setVisibility(View.GONE);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				bg.setVisibility(View.GONE);
				linear7.setVisibility(View.VISIBLE);
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					if (myView007 != null) {
						wm.removeView(myView007);
					}
				} catch (Exception ignored) {}
			}
		});
		
		// Dragging support
		final int[] touchCoords = new int[2];
		View.OnTouchListener dragTouchListener = new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
					case MotionEvent.ACTION_DOWN:
						touchCoords[0] = (int) event.getRawX();
						touchCoords[1] = (int) event.getRawY();
						break;
					case MotionEvent.ACTION_MOVE:
						int nowX = (int) event.getRawX();
						int nowY = (int) event.getRawY();
						params007.x += (nowX - touchCoords[0]);
						params007.y += (nowY - touchCoords[1]);
						touchCoords[0] = nowX;
						touchCoords[1] = nowY;
						try {
							wm.updateViewLayout(myView007, params007);
						} catch (Exception ignored) {}
						break;
				}
				return false;
			}
		};
		
		linear7.setOnTouchListener(dragTouchListener);
		linear1.setOnTouchListener(dragTouchListener);
		
		params007.gravity = Gravity.TOP | Gravity.LEFT;
		params007.x = 100;
		params007.y = 200;
		
		try {
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
				if (!android.provider.Settings.canDrawOverlays(MainActivity.this)) {
					Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
					startActivity(intent);
					android.widget.Toast.makeText(getApplicationContext(), "Please grant overlay permission", android.widget.Toast.LENGTH_SHORT).show();
					return;
				}
			}
			wm.addView(myView007, params007);
		} catch (Exception e) {
			e.printStackTrace();
			android.widget.Toast.makeText(getApplicationContext(), "Floating menu: " + e.getMessage(), android.widget.Toast.LENGTH_SHORT).show();
		}
	}
	
	
	public void _Titanic() {
	}
	
	
	public class Titanic {
		
		private AnimatorSet animatorSet;
		private Animator.AnimatorListener animatorListener;
		
		public Animator.AnimatorListener getAnimatorListener() {
			return animatorListener;
		}
		
		public void setAnimatorListener(Animator.AnimatorListener animatorListener) {
			this.animatorListener = animatorListener;
		}
		
		public void start(final TitanicTextView textView) {
			
			final Runnable animate = new Runnable() {
				@Override
				public void run() {
					
					textView.setSinking(true);
					
					ObjectAnimator maskXAnimator = ObjectAnimator.ofFloat(textView, "maskX", 0, 200);
					maskXAnimator.setRepeatCount(ValueAnimator.INFINITE);
					maskXAnimator.setDuration(1000);
					maskXAnimator.setStartDelay(0);
					
					int h = textView.getHeight();
					
					ObjectAnimator maskYAnimator = ObjectAnimator.ofFloat(textView, "maskY", h/2, - h/2);
					maskYAnimator.setRepeatCount(ValueAnimator.INFINITE);
					maskYAnimator.setRepeatMode(ValueAnimator.REVERSE);
					maskYAnimator.setDuration(10000);
					maskYAnimator.setStartDelay(0);
					
					animatorSet = new AnimatorSet();
					animatorSet.playTogether(maskXAnimator, maskYAnimator);
					animatorSet.setInterpolator(new LinearInterpolator());
					animatorSet.addListener(new Animator.AnimatorListener() {
						@Override
						public void onAnimationStart(Animator animation) {
						}
						
						@Override
						public void onAnimationEnd(Animator animation) {
							textView.setSinking(false);
							
							if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
								textView.postInvalidate();
							} else {
								textView.postInvalidateOnAnimation();
							}
							
							animatorSet = null;
						}
						
						@Override
						public void onAnimationCancel(Animator animation) {
							
						}
						
						@Override
						public void onAnimationRepeat(Animator animation) {
							
						}
					});
					
					
					if (animatorListener != null) {
						animatorSet.addListener(animatorListener);
					}
					
					animatorSet.start();
				}
			};
			
			if (!textView.isSetUp()) {
				textView.setAnimationSetupCallback(new AnimationSetupCallback() {
					@Override
					public void onSetupAnimation(final TitanicTextView target) {
						animate.run();
					}
				});
			} else {
				animate.run();
			}
		}
		
		public void cancel() {
			if (animatorSet != null) {
				animatorSet.cancel();
			}
		}
	}
	
	
	public interface AnimationSetupCallback {
		public void onSetupAnimation(TitanicTextView titanicTextView);
	}
	
	
	public class TitanicTextView extends TextView {
		// callback fired at first onSizeChanged
		private AnimationSetupCallback animationSetupCallback;
		// wave shader coordinates
		private float maskX, maskY;
		// if true, the shader will display the wave
		private boolean sinking;
		// true after the first onSizeChanged
		private boolean setUp;
		
		// shader containing a repeated wave
		private BitmapShader shader;
		// shader matrix
		private Matrix shaderMatrix;
		// wave drawable
		private android.graphics.drawable.Drawable wave;
		// (getHeight() - waveHeight) / 2
		private float offsetY;
		
		public TitanicTextView(Context context) {
			super(context);
			init();
		}
		
		public TitanicTextView(Context context, AttributeSet attrs) {
			super(context, attrs);
			init();
		}
		
		public TitanicTextView(Context context, AttributeSet attrs, int defStyle) {
			super(context, attrs, defStyle);
			init();
		}
		
		private void init() {
			shaderMatrix = new Matrix();
		}
		
		public AnimationSetupCallback getAnimationSetupCallback() {
			return animationSetupCallback;
		}
		
		public void setAnimationSetupCallback(AnimationSetupCallback animationSetupCallback) {
			this.animationSetupCallback = animationSetupCallback;
		}
		
		public float getMaskX() {
			return maskX;
		}
		
		public void setMaskX(float maskX) {
			this.maskX = maskX;
			invalidate();
		}
		
		public float getMaskY() {
			return maskY;
		}
		
		public void setMaskY(float maskY) {
			this.maskY = maskY;
			invalidate();
		}
		
		public boolean isSinking() {
			return sinking;
		}
		
		public void setSinking(boolean sinking) {
			this.sinking = sinking;
		}
		
		public boolean isSetUp() {
			return setUp;
		}
		
		@Override
		public void setTextColor(int color) {
			super.setTextColor(color);
			createShader();
		}
		
		@Override
		public void setTextColor(android.content.res.ColorStateList colors) {
			super.setTextColor(colors);
			createShader();
		}
		
		@Override
		protected void onSizeChanged(int w, int h, int oldw, int oldh) {
			super.onSizeChanged(w, h, oldw, oldh);
			
			createShader();
			
			if (!setUp) {
				setUp = true;
				if (animationSetupCallback != null) {
					animationSetupCallback.onSetupAnimation(TitanicTextView.this);
				}
			}
		}
		
		
		@SuppressWarnings("deprecation")
		private void createShader() {
			
			if (wave == null) {
				wave = getResources().getDrawable(R.drawable.wave);
			}
			
			int waveW = wave.getIntrinsicWidth();
			int waveH = wave.getIntrinsicHeight();
			
			Bitmap b = Bitmap.createBitmap(waveW, waveH, Bitmap.Config.ARGB_8888);
			Canvas c = new Canvas(b);
			
			c.drawColor(getCurrentTextColor());
			
			wave.setBounds(0, 0, waveW, waveH);
			wave.draw(c);
			
			shader = new BitmapShader(b, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
			getPaint().setShader(shader);
			
			offsetY = (getHeight() - waveH) / 2;
			
		}
		
		@Override
		protected void onDraw(Canvas canvas) {
			
			// modify text paint shader according to sinking state
			if (sinking && shader != null) {
				
				// first call after sinking, assign it to our paint
				if (getPaint().getShader() == null) {
					getPaint().setShader(shader);
				}
				
				// translate shader accordingly to maskX maskY positions
				// maskY is affected by the offset to vertically center the wave
				shaderMatrix.setTranslate(maskX, maskY + offsetY);
				
				// assign matrix to invalidate the shader
				shader.setLocalMatrix(shaderMatrix);
			} else {
				getPaint().setShader(null);
			}
			
			super.onDraw(canvas);
		}
	}
	
	public void nothing() {
		
		
	}
	
	
	public void _Check_Subscribe() {
		checkPanelOpen = true;
		
		final AlertDialog checkDial = new AlertDialog.Builder(MainActivity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.check, null);
		checkDial.setView(inflate);
		checkDial.setCancelable(false);
		applyDialogWindowBlur(checkDial.getWindow());
		
		final LinearLayout linear2 = (LinearLayout) inflate.findViewById(R.id.linear2);
		final LinearLayout linear6 = (LinearLayout) inflate.findViewById(R.id.linear6);
		final ProgressBar pg = (ProgressBar) inflate.findViewById(R.id.progressbar1);
		final TextView tvPercent = (TextView) inflate.findViewById(R.id.tv_progress_percent);
		final Button btnYoutube = (Button) inflate.findViewById(R.id.button1);
		final TextView tvTitle = (TextView) inflate.findViewById(R.id.textview1);
		final TextView tvSub = (TextView) inflate.findViewById(R.id.textview2);
		
		float density = getApplicationContext().getResources().getDisplayMetrics().density;
		int d = (int) density;
		
		GradientDrawable sd = new GradientDrawable();
		sd.setColor(0x30FF3B30);
		sd.setCornerRadius(d * 12);
		sd.setStroke((int)(d * 1f), 0x60FF3B30);
		linear6.setBackground(sd);
		
		GradientDrawable initialGd = new GradientDrawable();
		initialGd.setColor(0x20FFFFFF);
		initialGd.setCornerRadius(d * 12);
		initialGd.setStroke((int)(d * 1f), 0x40FFFFFF);
		btnYoutube.setBackground(initialGd);
		btnYoutube.setEnabled(false);
		btnYoutube.setAlpha(0.8f);
		btnYoutube.setText("PLEASE WAIT...");
		
		try {
			Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/sansation_regular.ttf");
			if (tvTitle != null) tvTitle.setTypeface(tf, Typeface.BOLD);
			if (tvSub != null) tvSub.setTypeface(tf, Typeface.BOLD);
			if (tvPercent != null) tvPercent.setTypeface(tf, Typeface.BOLD);
			if (btnYoutube != null) btnYoutube.setTypeface(tf, Typeface.BOLD);
		} catch (Exception ignored) {}
		
		pg.getProgressDrawable().setColorFilter(Color.parseColor("#00FF88"), PorterDuff.Mode.SRC_IN);
		
		ObjectAnimator anim = ObjectAnimator.ofInt(pg, "progress", 0, 100);
		anim.setDuration(2500);
		anim.setInterpolator(new DecelerateInterpolator());
		
		anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				int progress = (int) animation.getAnimatedValue();
				btnYoutube.setText("PLEASE WAIT...");
				if (tvPercent != null) {
					tvPercent.setText(progress + "%");
				}
			}
		});
		
		anim.addListener(new AnimatorListenerAdapter() {
			@Override
			public void onAnimationEnd(Animator animation) {
				btnYoutube.setEnabled(true);
				btnYoutube.setAlpha(1.0f);
				GradientDrawable redGd = new GradientDrawable();
				redGd.setColors(new int[]{Color.parseColor("#EF4444"), Color.parseColor("#DC2626")});
				redGd.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
				redGd.setCornerRadius(d * 12);
				redGd.setStroke((int)(d * 1.2f), Color.parseColor("#FCA5A5"));
				btnYoutube.setBackground(redGd);
				btnYoutube.setText("SUBSCRIBE TO UNLOCK");
				btnYoutube.setTextColor(Color.WHITE);
				if (tvSub != null) {
					tvSub.setText("Verification Success ! Now Subscribe . Otherwise You Will Get Ban !!");
					tvSub.setTextColor(Color.WHITE);
				}
			}
		});
		anim.start();
		
		btnYoutube.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@kayesahmmed-xs3hk?si=CgDSuPLsj_AOuSRH"));
				startActivity(i);
				final SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
				sp.edit().putString("last_version_subscribed", app_version).commit();
				
				checkPanelOpen = false;
				checkDial.dismiss();
			}
		});
		
		checkDial.show();
	}
	
	
	public void _File_Permission() {
	}
	private android.app.AlertDialog shizukuDeniedAlertDialog = null;
	private android.app.AlertDialog allFilesAlertDialog = null;
	
	
	private rikka.shizuku.Shizuku.OnRequestPermissionResultListener shizukuListener = null;
	
	
	public void checkAllFilesPermission() {
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
			if (!android.os.Environment.isExternalStorageManager()) {
				
				android.content.SharedPreferences prefs = getSharedPreferences("app_prefs", MODE_PRIVATE);
				boolean isFirstTime = prefs.getBoolean("all_files_first_time", true);
				
				if (isFirstTime) {
					prefs.edit()
					.putBoolean("all_files_first_time", false)
					.apply();
					
					try {
						android.content.Intent intent = new android.content.Intent(
						android.provider.Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION,
						android.net.Uri.parse("package:" + getPackageName()));
						startActivity(intent);
					} catch (Exception e) {
						android.content.Intent intent = new android.content.Intent(
						android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
						startActivity(intent);
					}
					
				} else {
					allFilesAlertDialog = new android.app.AlertDialog.Builder(this).create();
                    android.view.View inflate = getLayoutInflater().inflate(R.layout.dialog, null);
                    allFilesAlertDialog.setView(inflate);
                    allFilesAlertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                    allFilesAlertDialog.setCancelable(false);
                    
                    android.widget.TextView title = inflate.findViewById(R.id.textview6);
                    android.widget.TextView msg = inflate.findViewById(R.id.textview5);
                    android.widget.TextView btnText = inflate.findViewById(R.id.textview4);
                    android.widget.LinearLayout btnLayout = inflate.findViewById(R.id.linear3);
                    android.widget.LinearLayout linear2 = inflate.findViewById(R.id.linear2);
                    android.widget.LinearLayout linear5 = inflate.findViewById(R.id.linear5);

                    if (title != null) title.setText("All Files Access Required");
                    if (msg != null) msg.setText("All files access permission is required to activate the app features. Please allow it to continue.");
                    if (btnText != null) {
                        btnText.setText("OPEN SETTINGS");
                        btnText.setTextColor(0xFFFFFFFF);
                    }

                    int d = (int) getResources().getDisplayMetrics().density;
                    if (linear2 != null) {
                        android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
                        gd2.setColor(0xFFFFFFFF); gd2.setCornerRadius(d * 20); linear2.setBackground(gd2);
                    }
                    if (btnLayout != null) {
                        android.graphics.drawable.GradientDrawable gd3 = new android.graphics.drawable.GradientDrawable();
                        gd3.setColor(android.graphics.Color.parseColor("#00B489")); gd3.setCornerRadius(d * 25);
                        btnLayout.setBackground(gd3);
                        btnLayout.setOnClickListener(v -> {
                            allFilesAlertDialog.dismiss();
							allFilesAlertDialog = null;
							try {
								android.content.Intent intent = new android.content.Intent(
								android.provider.Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION,
								android.net.Uri.parse("package:" + getPackageName()));
								startActivity(intent);
							} catch (Exception e) {
								android.content.Intent intent = new android.content.Intent(
								android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
								startActivity(intent);
							}
                        });
                    }
                    if (linear5 != null) {
                        android.graphics.drawable.GradientDrawable gd5 = new android.graphics.drawable.GradientDrawable();
                        gd5.setColor(android.graphics.Color.parseColor("#00B489")); gd5.setCornerRadius(d * 90); linear5.setBackground(gd5);
                    }
                    android.widget.ImageView iv2 = inflate.findViewById(R.id.imageview2);
                    if (iv2 != null) iv2.setColorFilter(0xFFFFFFFF);
					allFilesAlertDialog.show();
				}
			}
		}
	}
	
	
	public void checkAllFilesPermissionForButton() {
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
			if (!android.os.Environment.isExternalStorageManager()) {
				
				if (allFilesAlertDialog != null && allFilesAlertDialog.isShowing()) {
					return;
				}
				
				allFilesAlertDialog = new android.app.AlertDialog.Builder(this).create();
                android.view.View inflate = getLayoutInflater().inflate(R.layout.dialog, null);
                allFilesAlertDialog.setView(inflate);
                allFilesAlertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                allFilesAlertDialog.setCancelable(false);
                
                android.widget.TextView title = inflate.findViewById(R.id.textview6);
                android.widget.TextView msg = inflate.findViewById(R.id.textview5);
                android.widget.TextView btnText = inflate.findViewById(R.id.textview4);
                android.widget.LinearLayout btnLayout = inflate.findViewById(R.id.linear3);
                android.widget.LinearLayout linear2 = inflate.findViewById(R.id.linear2);
                android.widget.LinearLayout linear5 = inflate.findViewById(R.id.linear5);

                if (title != null) title.setText("All Files Access Required");
                if (msg != null) msg.setText("All files access permission is required. Please allow it to continue.");
                if (btnText != null) {
                    btnText.setText("OPEN SETTINGS");
                    btnText.setTextColor(0xFFFFFFFF);
                }

                int d = (int) getResources().getDisplayMetrics().density;
                if (linear2 != null) {
                    android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
                    gd2.setColor(0xFFFFFFFF); gd2.setCornerRadius(d * 20); linear2.setBackground(gd2);
                }
                if (btnLayout != null) {
                    android.graphics.drawable.GradientDrawable gd3 = new android.graphics.drawable.GradientDrawable();
                    gd3.setColor(android.graphics.Color.parseColor("#00B489")); gd3.setCornerRadius(d * 25);
                    btnLayout.setBackground(gd3);
                    btnLayout.setOnClickListener(v -> {
                        allFilesAlertDialog.dismiss();
						allFilesAlertDialog = null;
						try {
							android.content.Intent intent = new android.content.Intent(
							android.provider.Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION,
							android.net.Uri.parse("package:" + getPackageName()));
							startActivity(intent);
						} catch (Exception e) {
							android.content.Intent intent = new android.content.Intent(
							android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
							startActivity(intent);
						}
                    });
                }
                if (linear5 != null) {
                    android.graphics.drawable.GradientDrawable gd5 = new android.graphics.drawable.GradientDrawable();
                    gd5.setColor(android.graphics.Color.parseColor("#00B489")); gd5.setCornerRadius(d * 90); linear5.setBackground(gd5);
                }
                android.widget.ImageView iv2Btn = inflate.findViewById(R.id.imageview2);
                if (iv2Btn != null) iv2Btn.setColorFilter(0xFFFFFFFF);
				allFilesAlertDialog.show();
			}
		}
	}
	
	
	
	public void showShizukuDeniedDialog(String message) {
		
		if (shizukuDeniedAlertDialog != null) {
			try { shizukuDeniedAlertDialog.dismiss(); } catch (Exception ignored) {}
			shizukuDeniedAlertDialog = null;
		}
		
		if (shizukuListener != null) {
			try { rikka.shizuku.Shizuku.removeRequestPermissionResultListener(shizukuListener); } catch (Exception ignored) {}
			shizukuListener = null;
		}
		
		shizukuDeniedAlertDialog = new android.app.AlertDialog.Builder(this).create();
		android.view.View inflate = getLayoutInflater().inflate(R.layout.dialog, null);
		shizukuDeniedAlertDialog.setView(inflate);
		shizukuDeniedAlertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		shizukuDeniedAlertDialog.setCancelable(false);
		
		android.widget.TextView title = inflate.findViewById(R.id.textview6);
		android.widget.TextView msg = inflate.findViewById(R.id.textview5);
		android.widget.TextView btnText = inflate.findViewById(R.id.textview4);
		android.widget.LinearLayout btnLayout = inflate.findViewById(R.id.linear3);
		android.widget.LinearLayout linear2 = inflate.findViewById(R.id.linear2);
		android.widget.LinearLayout linear5 = inflate.findViewById(R.id.linear5);
		
		if (title != null) title.setText("Permission Required");
		if (msg != null) msg.setText(message);
		if (btnText != null) {
            btnText.setText("RETRY");
            btnText.setTextColor(0xFFFFFFFF);
        }
		
		int d = (int) getResources().getDisplayMetrics().density;
		if (linear2 != null) {
			android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
			gd2.setColor(0xFFFFFFFF); gd2.setCornerRadius(d * 20); linear2.setBackground(gd2);
		}
		if (btnLayout != null) {
			android.graphics.drawable.GradientDrawable gd3 = new android.graphics.drawable.GradientDrawable();
			gd3.setColor(android.graphics.Color.parseColor("#00B489")); gd3.setCornerRadius(d * 25);
			btnLayout.setBackground(gd3);
			btnLayout.setOnClickListener(v -> {
				final android.app.AlertDialog ref = shizukuDeniedAlertDialog;
				shizukuDeniedAlertDialog = null;
				if (ref != null) {
					try { ref.dismiss(); } catch (Exception ignored) {}
				}
				if (shizukuListener != null) {
					try { rikka.shizuku.Shizuku.removeRequestPermissionResultListener(shizukuListener); } catch (Exception ignored) {}
					shizukuListener = null;
				}
				shizukuListener = new rikka.shizuku.Shizuku.OnRequestPermissionResultListener() {
					@Override
					public void onRequestPermissionResult(int requestCode, int grantResult) {
						if (requestCode == 100) {
							try { rikka.shizuku.Shizuku.removeRequestPermissionResultListener(shizukuListener); } catch (Exception ignored) {}
							shizukuListener = null;
							if (grantResult == android.content.pm.PackageManager.PERMISSION_GRANTED) {
								MainActivity.this.runOnUiThread(() -> android.widget.Toast.makeText(getApplicationContext(), "Shizuku is running ✅", android.widget.Toast.LENGTH_SHORT).show());
							} else {
								MainActivity.this.runOnUiThread(() -> MainActivity.this.showShizukuDeniedDialog("Shizuku permission is required to activate the app features. Click retry to grant permission."));
							}
						}
					}
				};
				rikka.shizuku.Shizuku.addRequestPermissionResultListener(shizukuListener);
				rikka.shizuku.Shizuku.requestPermission(100);
			});
		}
		if (linear5 != null) {
			android.graphics.drawable.GradientDrawable gd5 = new android.graphics.drawable.GradientDrawable();
			gd5.setColor(android.graphics.Color.parseColor("#00B489")); gd5.setCornerRadius(d * 90); linear5.setBackground(gd5);
		}
		android.widget.ImageView iv2Denied = inflate.findViewById(R.id.imageview2);
		if (iv2Denied != null) iv2Denied.setColorFilter(0xFFFFFFFF);
        shizukuDeniedAlertDialog.show();
	}
	
	{ // Created by ModX Lab
	}
	
	
	public void _Start_Shizuku() {
		boolean tInst = false;
		try { getPackageManager().getPackageInfo("moe.shizuku.privileged.api", 0); tInst = true; } catch (Exception e) { tInst = false; }
		final boolean isInstalled = tInst;
		
		boolean tRun = false;
		try { tRun = rikka.shizuku.Shizuku.pingBinder(); } catch (Throwable e) { tRun = false; }
		final boolean isRunning = tRun;
		
		int currentState = (isInstalled) ? (isRunning ? 0 : 2) : 1;
		
		if (myDialog != null && myDialog.isShowing()) {
			if (lastShizukuState == currentState) {
				return; 
			} else {
				myDialog.dismiss();
				myDialog = null;
			}
		}
		
		lastShizukuState = currentState;
		
		if (currentState != 0) {
			toastShown = false;
			
			myDialog = new android.app.AlertDialog.Builder(MainActivity.this).create();
            android.view.View inflate = getLayoutInflater().inflate(R.layout.dialog, null);
            myDialog.setView(inflate);
            myDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            myDialog.setCancelable(false);
			
			myDialog.setOnDismissListener(dialog -> {
				myDialog = null;
			});
			
			android.widget.TextView title = inflate.findViewById(R.id.textview6);
            android.widget.TextView msg = inflate.findViewById(R.id.textview5);
            android.widget.TextView btnText = inflate.findViewById(R.id.textview4);
            android.widget.LinearLayout btnLayout = inflate.findViewById(R.id.linear3);
            android.widget.LinearLayout linear2 = inflate.findViewById(R.id.linear2);
            android.widget.LinearLayout linear5 = inflate.findViewById(R.id.linear5);

            if (title != null) title.setText(currentState == 1 ? "Shizuku Required" : "Start Shizuku");
            if (msg != null) msg.setText(currentState == 1 ? "Shizuku is not installed. Please install it to continue." : "Shizuku service is not running. Please start it.");
            if (btnText != null) {
                btnText.setText(currentState == 1 ? "GO TO PLAY STORE" : "OPEN SHIZUKU");
                btnText.setTextColor(0xFFFFFFFF);
            }

            int d = (int) getResources().getDisplayMetrics().density;
            if (linear2 != null) {
                android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
                gd2.setColor(0xFFFFFFFF); gd2.setCornerRadius(d * 20); linear2.setBackground(gd2);
            }
            if (btnLayout != null) {
                android.graphics.drawable.GradientDrawable gd3 = new android.graphics.drawable.GradientDrawable();
                gd3.setColor(android.graphics.Color.parseColor("#00B489")); gd3.setCornerRadius(d * 25);
                btnLayout.setBackground(gd3);
                btnLayout.setOnClickListener(v -> {
                    if (currentState == 1) {
						try {
							startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW,
							android.net.Uri.parse("market://details?id=moe.shizuku.privileged.api")));
						} catch (Exception e) {
							startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW,
							android.net.Uri.parse("https://play.google.com/store/apps/details?id=moe.shizuku.privileged.api")));
						}
					} else {
						android.content.Intent intent = getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
						if (intent != null) startActivity(intent);
					}
                });
            }
            if (linear5 != null) {
                android.graphics.drawable.GradientDrawable gd5 = new android.graphics.drawable.GradientDrawable();
                gd5.setColor(android.graphics.Color.parseColor("#00B489")); gd5.setCornerRadius(d * 90); linear5.setBackground(gd5);
            }
            android.widget.ImageView iv2Start = inflate.findViewById(R.id.imageview2);
            if (iv2Start != null) iv2Start.setColorFilter(0xFFFFFFFF);
			
			myDialog.show();
			
		} else {
			if (!toastShown) {
				android.widget.Toast.makeText(getApplicationContext(), "Shizuku is running ✅", android.widget.Toast.LENGTH_SHORT).show();
				toastShown = true;
			}
			
			if (rikka.shizuku.Shizuku.checkSelfPermission() != android.content.pm.PackageManager.PERMISSION_GRANTED) {
				if (shizukuListener != null) {
					try { rikka.shizuku.Shizuku.removeRequestPermissionResultListener(shizukuListener); } catch (Exception ignored) {}
					shizukuListener = null;
				}
				shizukuListener = new rikka.shizuku.Shizuku.OnRequestPermissionResultListener() {
					@Override
					public void onRequestPermissionResult(int requestCode, int grantResult) {
						try { rikka.shizuku.Shizuku.removeRequestPermissionResultListener(shizukuListener); } catch (Exception ignored) {}
						shizukuListener = null;
						
						if (grantResult != android.content.pm.PackageManager.PERMISSION_GRANTED) {
							MainActivity.this.showShizukuDeniedDialog("Shizuku permission is required.");
						}
					}
				};
				rikka.shizuku.Shizuku.addRequestPermissionResultListener(shizukuListener);
				rikka.shizuku.Shizuku.requestPermission(100);
			}
		}
	}
	
	
	public void _ModX() {
		try {
			eightbitlab.com.blurview.BlurView blurView = findViewById(R.id.blur_view);
			if (blurView != null) {
				View decorView = getWindow().getDecorView();
				ViewGroup rootView = decorView.findViewById(android.R.id.content);
				Drawable windowBackground = decorView.getBackground();
				blurView.setupWith(rootView, new eightbitlab.com.blurview.RenderScriptBlur(this))
						.setFrameClearDrawable(windowBackground)
						.setBlurRadius(18f);
			}
		} catch (Exception ignored) {}
		try {
			float density = getApplicationContext().getResources().getDisplayMetrics().density;
			int d = (int) density;
			if (linear3 != null) {
				GradientDrawable gd3 = new GradientDrawable();
				gd3.setColor(0x280F172A);
				gd3.setCornerRadius(d * 18);
				gd3.setStroke((int)(d * 1.2f), 0x55FFFFFF);
				linear3.setBackground(gd3);
			}
			if (linear5 != null) {
				linear5.setBackgroundColor(Color.TRANSPARENT);
			}
			if (linear6 != null) {
				linear6.setBackgroundColor(Color.TRANSPARENT);
			}
			if (button1 != null) {
				GradientDrawable gdB = new GradientDrawable();
				gdB.setColor(Color.parseColor("#00B489"));
				gdB.setCornerRadius(d * 12);
				android.graphics.drawable.RippleDrawable ripple = new android.graphics.drawable.RippleDrawable(
					new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0x66FFFFFF}),
					gdB, null);
				button1.setBackground(ripple);
			}

			final View lineUser = findViewById(R.id.line_username);
			final ImageView ivUser = findViewById(R.id.iv_user_icon);
			final EditText etUser = findViewById(R.id.edittext1);
			if (etUser != null) {
				etUser.setOnFocusChangeListener(new View.OnFocusChangeListener() {
					@Override
					public void onFocusChange(View v, boolean hasFocus) {
						if (hasFocus) {
							if (lineUser != null) lineUser.setBackgroundColor(Color.parseColor("#18FFFF"));
							if (ivUser != null) ivUser.setColorFilter(Color.parseColor("#18FFFF"));
						} else {
							if (lineUser != null) lineUser.setBackgroundColor(0x55FFFFFF);
							if (ivUser != null) ivUser.setColorFilter(0x80FFFFFF);
						}
					}
				});
			}

			final View linePass = findViewById(R.id.line_password);
			final ImageView ivPass = findViewById(R.id.iv_lock_icon);
			final EditText etPass = findViewById(R.id.edittext2);
			if (etPass != null) {
				etPass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
					@Override
					public void onFocusChange(View v, boolean hasFocus) {
						if (hasFocus) {
							if (linePass != null) linePass.setBackgroundColor(Color.parseColor("#18FFFF"));
							if (ivPass != null) ivPass.setColorFilter(Color.parseColor("#18FFFF"));
						} else {
							if (linePass != null) linePass.setBackgroundColor(0x55FFFFFF);
							if (ivPass != null) ivPass.setColorFilter(0x80FFFFFF);
						}
					}
				});
			}

			try {
				Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/sansation_regular.ttf");
				if (etUser != null) etUser.setTypeface(tf);
				if (etPass != null) etPass.setTypeface(tf);
				if (button1 != null) button1.setTypeface(tf, Typeface.BOLD);
			} catch (Exception ignored) {}

		} catch (Exception ignored) {}
		TextView textView = findViewById(R.id.textview19);
		if (textView != null) {
			ObjectAnimator colorCycle = ObjectAnimator.ofArgb(textView, "textColor", Color.parseColor("#18FFFF"), Color.parseColor("#FFEB3B"), Color.parseColor("#00E676"), Color.parseColor("#FF4081"));
			colorCycle.setDuration(4000);
			colorCycle.setRepeatCount(ValueAnimator.INFINITE);
			colorCycle.start();
		}
	}
	
	
	public void _Lab() {
	}
	public static class AutoTypeTextView extends TextView {
		
		public static int PRECISSION_LOW = 8;
		public static int PRECISSION_MED = 9;
		public static int PRECISSION_HIGH = 11;
		
		private int decryptionSpeed = 10;
		private int encryptionSpeed = 10;
		private int typingSpeed =100;
		private int precision = 5;
		private String animateEncryption = "";
		private String animateDecryption = "";
		private String animateTextTyping = "";
		private String animateTextTypingWithMistakes = "";
		
		private Handler handler;
		private int counter=0;
		private boolean misstakeFound = false;
		private boolean executed = false;
		private Random ran = new Random();
		public String misstakeValues = "qwertyuiop[]asdfghjkl;zxcvbnm,./!@#$^&*()_+1234567890";
		private String encryptedText;
		private int countLetter=0;
		private int cocatation=0;
		
		public AutoTypeTextView(Context context) {
			super(context);
		}
		
		public AutoTypeTextView(Context context, AttributeSet attrs) {
			super(context, attrs);
		}
		
		private void setupAttributes() {
			if(animateTextTyping!=null)
			setTextAutoTyping(animateTextTyping);
			
			if(animateTextTypingWithMistakes!=null) {
				if (precision < 6)
				precision = 6;
				setTextAutoTypingWithMistakes(animateTextTypingWithMistakes, precision);
			}
			
			if(animateDecryption!=null)
			animateDecryption(animateDecryption);
			
			if(animateEncryption!=null)
			animateEncryption(animateEncryption);
		}
		
		public void setTextAutoTyping(final String text) {
			if(!executed) {
				executed = true;
				counter = 0;
				handler = new Handler();
				handler.postDelayed(new Runnable() {
					@Override
					public void run() {
						setText(text.substring(0, counter));
						counter++;
						if (text.length() >= counter) {
							postDelayed(this, getTypingSpeed());
						} else {
							executed = false;
						}
					}
				}, getTypingSpeed());
			}
		}
		
		public void setTextAutoTypingWithMistakes(final String text, final int precission) {
			if(!executed) {
				executed = true;
				counter = 0;
				handler = new Handler();
				ran = new Random();
				handler.postDelayed(new Runnable() {
					@Override
					public void run() {
						int num = ran.nextInt(10) + 1;
						if (num > precission && counter > 1 && !misstakeFound) {
							setText(chooseTypeOfMistake(text, counter));
							counter--;
						} else {
							counter++;
							setText(text.substring(0, counter));
							misstakeFound = false;
						}
						if (text.length() > counter) {
							postDelayed(this, getTypingSpeed());
						} else {
							executed = false;
						}
					}
				}, getTypingSpeed());
			}
		}
		
		public void animateDecryption(final String text) {
			encryptedText = text;
			ran = new Random();
			handler = new Handler();
			cocatation = ran.nextInt(10);
			counter = 0;
			countLetter = 0;
			if(!executed) {
				executed = true;
				for(int i=0; i<text.length(); i++) {
					encryptedText = replaceCharAt(encryptedText, i, misstakeValues.charAt(ran.nextInt(misstakeValues.length())));
					setText(encryptedText);
				}
				handler = new Handler();
				handler.postDelayed(new Runnable() {
					@Override
					public void run() {
						if(counter <= cocatation) {
							encryptedText = replaceCharAt(encryptedText,countLetter,misstakeValues.charAt(ran.nextInt(misstakeValues.length())));
							setText(encryptedText);
							counter++;
						} else {
							encryptedText = replaceCharAt(encryptedText, countLetter, text.charAt(countLetter));
							setText(encryptedText);
							countLetter++;
							cocatation = ran.nextInt(10);
							counter = 0;
						}
						if(text.length() > countLetter) {
							postDelayed(this, getDecryptionSpeed());
						} else {
							executed = false;
						}
					}
				}, getDecryptionSpeed());
			}
		}
		
		public void animateEncryption(final String text) {
			encryptedText = text;
			ran = new Random();
			handler = new Handler();
			cocatation = ran.nextInt(10);
			counter = 0;
			countLetter = 0;
			if(!executed) {
				executed = true;
				handler = new Handler();
				handler.postDelayed(new Runnable() {
					@Override
					public void run() {
						if(counter <= cocatation) {
							encryptedText = replaceCharAt(encryptedText,countLetter,misstakeValues.charAt(ran.nextInt(misstakeValues.length())));
							setText(encryptedText);
							counter++;
						} else {
							countLetter++;
							cocatation = ran.nextInt(10);
							counter = 0;
						}
						if(text.length() > countLetter) {
							postDelayed(this, getDecryptionSpeed());
						} else {
							executed = false;
						}
					}
				}, getDecryptionSpeed());
			}
		}
		
		private String chooseTypeOfMistake(String text, int counter) {
			int misstake = ran.nextInt(3)+1;
			String result = text.substring(0,counter);
			switch(misstake) {
				case 1 :
				result = text.substring(0,counter-1) + randomChar();
				break;
				case 2 :
				switch (ran.nextInt(2)+1) {
					case 1:
					result = text.substring(0, counter - 1) + String.valueOf(text.charAt(counter)).toLowerCase();
					break;
					case 2:
					result = text.substring(0, counter-1) + String.valueOf(text.charAt(counter)).toUpperCase();
					break;
				}
				break;
				case 3 :
				result = text.substring(0, counter-1);
				break;
			}
			misstakeFound = true;
			return result;
		}
		
		private char randomChar() {
			return misstakeValues.charAt(ran.nextInt(misstakeValues.length()));
		}
		
		public static String replaceCharAt(String text, int pos, char c) {
			return text.substring(0, pos) + c + text.substring(pos + 1);
		}
		
		public int getTypingSpeed() {
			return typingSpeed;
		}
		
		public void setTypingSpeed(int typingSpeed) {
			this.typingSpeed = typingSpeed;
		}
		
		public int getDecryptionSpeed() {
			return decryptionSpeed;
		}
		
		public void setDecryptionSpeed(int decryptionSpeed) {
			this.decryptionSpeed = decryptionSpeed;
		}
		
		public int getEncryptionSpeed() {
			return encryptionSpeed;
		}
		
		public void setEncryptionSpeed(int encryptionSpeed) {
			this.encryptionSpeed = encryptionSpeed;
		}
		
		public boolean isRunning() {
			return executed;
		}
	}
	{
	}
	
	
	public void _Pro() {
		
	}
	
}
