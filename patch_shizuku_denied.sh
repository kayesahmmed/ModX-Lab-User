#!/bin/bash
cat << 'INNER_EOF' > /tmp/shizuku_denied.txt
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
			gd5.setColor(0xFFFFFFFF); gd5.setCornerRadius(d * 90); linear5.setBackground(gd5);
		}
        shizukuDeniedAlertDialog.show();
	}
INNER_EOF

# Now we need to replace the original showShizukuDeniedDialog function with this new one
# It starts at line 2481 and ends around 2568
sed -i -e '/public void showShizukuDeniedDialog(String message) {/,/^	}/c\' -e "$(cat /tmp/shizuku_denied.txt | sed 's/$/\\/')" app/src/main/java/com/kayesahmmed/pro/MainActivity.java
sed -i 's/\\$//' app/src/main/java/com/kayesahmmed/pro/MainActivity.java
