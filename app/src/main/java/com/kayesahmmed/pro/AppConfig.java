package com.kayesahmmed.pro;

/**
 * ============================================================================
 * 🛠️ APP CONFIGURATION & BRANDING SETTINGS (অ্যাপের একমাত্র কনফিগারেশন ফাইল)
 * ============================================================================
 * এই একটি ফাইল থেকেই আপনি সম্পূর্ণ অ্যাপের সকল নাম, টাইটেল, সোশ্যাল লিংক
 * এবং ফ্লোটিং মেনুর বাটনগুলোর নাম, Zip ফাইলের নাম ও আনজিপ ডিরেক্টরি
 * পরিবর্তন করতে পারবেন। নিচে প্রতিটি অপশনের উপরে বিস্তারিত নির্দেশনা দেওয়া আছে।
 */
public class AppConfig {

    // ========================================================================
    // 📱 SECTION 1: MAIN SCREEN (মেইন স্ক্রিনের নাম, টেক্সট ও সোশ্যাল লিংক)
    // ========================================================================

    /**
     * [১] মেইন স্ক্রিনের প্রধান ব্র্যান্ডের নাম (Main Brand Name)
     * ডিফল্ট: "MODX LAB"
     */
    public static final String MAIN_BRAND_NAME = "MODX LAB";

    /**
     * [২] মেইন স্ক্রিনের ওয়েলকাম টেক্সট (Main Screen Welcome Text)
     * ডিফল্ট: "WELCOME TO MODX LAB"
     */
    public static final String MAIN_WELCOME_TEXT = "WELCOME TO MODX LAB";

    /**
     * [৩] টেলিগ্রাম কন্টাক্ট বাটন টেক্সট ও টেলিগ্রাম লিংক (Telegram Contact & Link)
     */
    public static final String TELEGRAM_LABEL = "Contact ModX Lab";
    public static final String TELEGRAM_URL = "https://t.me/kayesahmmedpro";

    /**
     * [৪] ফেসবুক কন্টাক্ট বাটন টেক্সট ও ফেসবুক লিংক (Facebook Contact & Link)
     */
    public static final String FACEBOOK_LABEL = "Find me on Facebook";
    public static final String FACEBOOK_URL = "https://www.facebook.com/kayesahmmed00";

    /**
     * ইউটিউব চ্যানেল লিংক (YouTube Channel Link)
     */
    public static final String YOUTUBE_URL = "https://youtube.com/@kayesahmmed-xs3hk?si=CgDSuPLsj_AOuSRH";

    /**
     * [৫] ক্রিয়েটর নাম ও টাইপ ব্যাজ টেক্সট (Creator Name & Type Badge)
     * ডিফল্ট: "CREATOR : MODX LAB  •  TYPE : SAFE"
     */
    public static final String CREATOR_NAME = "ModX Lab";
    public static final String MAIN_CREATOR_TEXT = "CREATOR : MODX LAB  •  TYPE : SAFE";

    /**
     * [৬] মেইন স্ক্রিনের কপিরাইট টেক্সট (Main Screen Copyright Notice)
     * ডিফল্ট: "COPYRIGHT @ MODX LAB ALL RIGHTS RESERVED"
     */
    public static final String COPYRIGHT_TEXT = "COPYRIGHT @ MODX LAB ALL RIGHTS RESERVED";


    // ========================================================================
    // 🪟 SECTION 2: FLOATING MENU HEADER & INFO (ফ্লোটিং মেনুর নাম ও সিস্টেম ইনফো)
    // ========================================================================

    /**
     * [১] ফ্লোটিং মেনুর মূল নাম (Floating Menu Title)
     * ডিফল্ট: "MODX LAB"
     */
    public static final String FLOATING_TITLE = "MODX LAB";

    /**
     * [২] ফ্লোটিং মেনুর সাব-টাইটেল / গেমের নাম (Floating Subtitle)
     * ডিফল্ট: "FREE FIRE MAX"
     */
    public static final String FLOATING_SUB_TITLE = "FREE FIRE MAX";

    /**
     * [৩] সিস্টেম ইনফো ট্যাবের ক্রিয়েটর নাম (System Info Tab Creator Name)
     * ডিফল্ট: "ModX Lab"
     */
    public static final String SYSTEM_INFO_CREATOR = "ModX Lab";


    // ========================================================================
    // 🎮 SECTION 3: FLOATING BUTTONS & ZIP SETTINGS (বাটন নাম, Zip ফাইল ও ডিরেক্টরি)
    // ========================================================================

    // ------------------------------------------------------------------------
    // 🔘 [BUTTON 1] : বাটন ১ এর নাম ও আনজিপ সেটিংস
    // ------------------------------------------------------------------------
    /**
     * বাটন ১ এর নাম (Button 1 Display Name)
     */
    public static final String BUTTON_1_NAME = "AUTO HEADSHOT";

    /**
     * বাটন ১ ON করার জিপ ফাইল (Assets ফোল্ডারের Zip File Name)
     */
    public static final String BUTTON_1_ON_ZIP = "Hack.zip";

    /**
     * বাটন ১ ON করার আনজিপ ডিরেক্টরি (Unzip Target Directory Path)
     */
    public static final String BUTTON_1_ON_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";

    /**
     * বাটন ১ OFF করার জিপ ফাইল (Assets ফোল্ডারের Zip File Name)
     */
    public static final String BUTTON_1_OFF_ZIP = "Original.zip";

    /**
     * বাটন ১ OFF করার আনজিপ ডিরেক্টরি (Unzip Target Directory Path)
     */
    public static final String BUTTON_1_OFF_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";


    // ------------------------------------------------------------------------
    // 🔘 [BUTTON 2] : বাটন ২ এর নাম ও আনজিপ সেটিংস
    // ------------------------------------------------------------------------
    /**
     * বাটন ২ এর নাম (Button 2 Display Name)
     */
    public static final String BUTTON_2_NAME = "AIM LOCK";

    /**
     * বাটন ২ ON করার জিপ ফাইল (Assets ফোল্ডারের Zip File Name)
     */
    public static final String BUTTON_2_ON_ZIP = "Hack.zip";

    /**
     * বাটন ২ ON করার আনজিপ ডিরেক্টরি (Unzip Target Directory Path)
     */
    public static final String BUTTON_2_ON_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";

    /**
     * বাটন ২ OFF করার জিপ ফাইল (Assets ফোল্ডারের Zip File Name)
     */
    public static final String BUTTON_2_OFF_ZIP = "Original.zip";

    /**
     * বাটন ২ OFF করার আনজিপ ডিরেক্টরি (Unzip Target Directory Path)
     */
    public static final String BUTTON_2_OFF_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";


    // ------------------------------------------------------------------------
    // 🔘 [BUTTON 3] : বাটন ৩ এর নাম ও আনজিপ সেটিংস
    // ------------------------------------------------------------------------
    /**
     * বাটন ৩ এর নাম (Button 3 Display Name)
     */
    public static final String BUTTON_3_NAME = "HOLOGRAM";

    /**
     * বাটন ৩ ON করার জিপ ফাইল (Assets ফোল্ডারের Zip File Name)
     */
    public static final String BUTTON_3_ON_ZIP = "Hack.zip";

    /**
     * বাটন ৩ ON করার আনজিপ ডিরেক্টরি (Unzip Target Directory Path)
     */
    public static final String BUTTON_3_ON_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";

    /**
     * বাটন ৩ OFF করার জিপ ফাইল (Assets ফোল্ডারের Zip File Name)
     */
    public static final String BUTTON_3_OFF_ZIP = "Original.zip";

    /**
     * বাটন ৩ OFF করার আনজিপ ডিরেক্টরি (Unzip Target Directory Path)
     */
    public static final String BUTTON_3_OFF_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";


    // ------------------------------------------------------------------------
    // 🚪 [EXIT BUTTON] : এক্সিট বাটনে ক্লিক করলে আনজিপ সেটিংস
    // ------------------------------------------------------------------------
    /**
     * EXIT বাটনে ক্লিক করলে রিস্টোর করার জিপ ফাইল (Assets ফোল্ডারের Zip File Name)
     */
    public static final String EXIT_RESTORE_ZIP = "Original.zip";

    /**
     * EXIT বাটনের আনজিপ ডিরেক্টরি (Unzip Target Directory Path)
     */
    public static final String EXIT_RESTORE_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";


    // ========================================================================
    // 🔔 SECTION 4: SERVER MESSAGES & TOASTS (সার্ভার মেসেজ ও টোস্ট নোটিফিকেশন)
    // ========================================================================

    /**
     * সার্ভার ভেরিফিকেশন লোডিং টেক্সট
     */
    public static final String LOADING_SERVER_TEXT = "Verifying With Server...";

    /**
     * লগইন সফল হলে প্রদর্শিত টোস্ট মেসেজ
     */
    public static final String LOGIN_SUCCESS_TOAST = "Login Success";
}
