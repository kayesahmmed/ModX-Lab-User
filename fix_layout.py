import re

with open('app/src/main/res/layout/main.xml', 'r') as f:
    content = f.read()

# Replace <com.github.mmin18.widget.RealtimeBlurView ... />
# with <eightbitlab.com.blurview.BlurView ... />

content = re.sub(
    r'<com\.github\.mmin18\.widget\.RealtimeBlurView[^>]+/>',
    '''<eightbitlab.com.blurview.BlurView
						android:id="@+id/blurView"
						android:layout_width="match_parent"
						android:layout_height="match_parent"
						app:blurOverlayColor="#20FFFFFF"/>''',
    content
)

with open('app/src/main/res/layout/main.xml', 'w') as f:
    f.write(content)

