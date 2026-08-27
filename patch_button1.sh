#!/bin/bash
sed -i 's/button1.setBackground.*0xFF03A9F4));/button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)0, Color.TRANSPARENT, 0x802962FF));/g' app/src/main/java/com/kayesahmmed/pro/MainActivity.java
