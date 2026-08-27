#!/bin/bash
cat << 'INNER_EOF' > /tmp/file_permissions.txt
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
                        gd5.setColor(0xFFFFFFFF); gd5.setCornerRadius(d * 90); linear5.setBackground(gd5);
                    }
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
                    gd5.setColor(0xFFFFFFFF); gd5.setCornerRadius(d * 90); linear5.setBackground(gd5);
                }
				allFilesAlertDialog.show();
			}
		}
	}
INNER_EOF

# The original checkAllFilesPermission starts at line 2351 and checkAllFilesPermissionForButton ends at 2478
sed -i -e '/public void checkAllFilesPermission() {/,/^	}/c\' -e "$(cat /tmp/file_permissions.txt | sed 's/$/\\/')" app/src/main/java/com/kayesahmmed/pro/MainActivity.java
sed -i 's/\\$//' app/src/main/java/com/kayesahmmed/pro/MainActivity.java
