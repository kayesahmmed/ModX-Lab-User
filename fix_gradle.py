import re

with open('app/build.gradle', 'r') as f:
    lines = f.readlines()

new_lines = []
for line in lines:
    if line.startswith('-e') or 'repositories {' in line or 'google()' in line or 'mavenCentral()' in line or 'jitpack' in line or line.strip() == '}':
        pass
    else:
        new_lines.append(line)

new_content = "".join(new_lines).strip()
if not new_content.endswith('}'):
    new_content += "\n}"

new_content += """

repositories {
    google()
    mavenCentral()
    maven { url 'https://jitpack.io' }
}
"""

with open('app/build.gradle', 'w') as f:
    f.write(new_content)

