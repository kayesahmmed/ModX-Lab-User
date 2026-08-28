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
