#!/bin/bash
cat << 'INNER_EOF' > /tmp/shizuku_start.txt
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
                gd5.setColor(0xFFFFFFFF); gd5.setCornerRadius(d * 90); linear5.setBackground(gd5);
            }
			
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
INNER_EOF

# The original _Start_Shizuku runs from line 2560 to 2673
sed -i -e '/public void _Start_Shizuku() {/,/^	}/c\' -e "$(cat /tmp/shizuku_start.txt | sed 's/$/\\/')" app/src/main/java/com/kayesahmmed/pro/MainActivity.java
sed -i 's/\\$//' app/src/main/java/com/kayesahmmed/pro/MainActivity.java
