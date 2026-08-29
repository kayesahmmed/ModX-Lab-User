package com.kayesahmmed.pro;

/**
 * ============================================================================
 * 🛠️ APP CONFIGURATION & BRANDING SETTINGS
 * ============================================================================
 * You can customize all app brand names, titles, social links,
 * floating menu button names, Zip file names, and unzip directories
 * directly from this single file.
 */
public class AppConfig {

    // ========================================================================
    // 📱 SECTION 1: MAIN SCREEN (Brand Name, Welcome Text & Social Links)
    // ========================================================================

    /**
     * [1] Main screen primary brand name
     * Default: "MODX LAB"
     */
    public static final String MAIN_BRAND_NAME = "MODX LAB";

    /**
     * [2] Main screen welcome text
     * Default: "WELCOME TO MODX LAB"
     */
    public static final String MAIN_WELCOME_TEXT = "WELCOME TO MODX LAB";

    /**
     * [3] Telegram contact button label and URL
     */
    public static final String TELEGRAM_LABEL = "Contact ModX Lab";
    public static final String TELEGRAM_URL = "https://t.me/kayesahmmedpro";

    /**
     * [4] Facebook contact button label and URL
     */
    public static final String FACEBOOK_LABEL = "Find me on Facebook";
    public static final String FACEBOOK_URL = "https://www.facebook.com/kayesahmmed00";

    /**
     * YouTube channel URL
     */
    public static final String YOUTUBE_URL = "https://youtube.com/@kayesahmmed-xs3hk?si=CgDSuPLsj_AOuSRH";

    /**
     * [5] Creator name and type badge text
     * Default: "CREATOR : MODX LAB  •  TYPE : SAFE"
     */
    public static final String CREATOR_NAME = "ModX Lab";
    public static final String MAIN_CREATOR_TEXT = "CREATOR : MODX LAB  •  TYPE : SAFE";

    /**
     * [6] Main screen copyright notice
     * Default: "COPYRIGHT @ MODX LAB ALL RIGHTS RESERVED"
     */
    public static final String COPYRIGHT_TEXT = "COPYRIGHT @ MODX LAB ALL RIGHTS RESERVED";


    // ========================================================================
    // 🪟 SECTION 2: FLOATING MENU HEADER & INFO (Menu Title & Subtitle)
    // ========================================================================

    /**
     * [1] Floating menu title (with wave animation)
     * Default: "MODX LAB"
     */
    public static final String FLOATING_TITLE = "MODX LAB";

    /**
     * [2] Floating menu subtitle / Game name
     * Default: "FREE FIRE MAX"
     */
    public static final String FLOATING_SUB_TITLE = "FREE FIRE MAX";

    /**
     * [3] System info tab creator name
     * Default: "ModX Lab"
     */
    public static final String SYSTEM_INFO_CREATOR = "ModX Lab";


    // ========================================================================
    // 🎮 SECTION 3: FLOATING BUTTONS & ZIP SETTINGS (Names, Zip Files & Paths)
    // ========================================================================

    // ------------------------------------------------------------------------
    // 🔘 [BUTTON 1] : Button 1 display name & zip configuration
    // ------------------------------------------------------------------------
    /**
     * Button 1 display label
     */
    public static final String BUTTON_1_NAME = "AUTO HEADSHOT";

    /**
     * Zip file from Assets folder when turning Button 1 ON
     */
    public static final String BUTTON_1_ON_ZIP = "Hack.zip";

    /**
     * Unzip destination path when turning Button 1 ON
     */
    public static final String BUTTON_1_ON_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";

    /**
     * Zip file from Assets folder when turning Button 1 OFF
     */
    public static final String BUTTON_1_OFF_ZIP = "Original.zip";

    /**
     * Unzip destination path when turning Button 1 OFF
     */
    public static final String BUTTON_1_OFF_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";


    // ------------------------------------------------------------------------
    // 🔘 [BUTTON 2] : Button 2 display name & zip configuration
    // ------------------------------------------------------------------------
    /**
     * Button 2 display label
     */
    public static final String BUTTON_2_NAME = "AIM LOCK";

    /**
     * Zip file from Assets folder when turning Button 2 ON
     */
    public static final String BUTTON_2_ON_ZIP = "Hack.zip";

    /**
     * Unzip destination path when turning Button 2 ON
     */
    public static final String BUTTON_2_ON_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";

    /**
     * Zip file from Assets folder when turning Button 2 OFF
     */
    public static final String BUTTON_2_OFF_ZIP = "Original.zip";

    /**
     * Unzip destination path when turning Button 2 OFF
     */
    public static final String BUTTON_2_OFF_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";


    // ------------------------------------------------------------------------
    // 🔘 [BUTTON 3] : Button 3 display name & zip configuration
    // ------------------------------------------------------------------------
    /**
     * Button 3 display label
     */
    public static final String BUTTON_3_NAME = "HOLOGRAM";

    /**
     * Zip file from Assets folder when turning Button 3 ON
     */
    public static final String BUTTON_3_ON_ZIP = "Hack.zip";

    /**
     * Unzip destination path when turning Button 3 ON
     */
    public static final String BUTTON_3_ON_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";

    /**
     * Zip file from Assets folder when turning Button 3 OFF
     */
    public static final String BUTTON_3_OFF_ZIP = "Original.zip";

    /**
     * Unzip destination path when turning Button 3 OFF
     */
    public static final String BUTTON_3_OFF_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";


    // ------------------------------------------------------------------------
    // 🚪 [EXIT BUTTON] : Exit restore zip configuration
    // ------------------------------------------------------------------------
    /**
     * Zip file to restore when clicking EXIT button
     */
    public static final String EXIT_RESTORE_ZIP = "Original.zip";

    /**
     * Unzip target directory path for EXIT button
     */
    public static final String EXIT_RESTORE_UNZIP_PATH = "/storage/emulated/0/Download/ModX_Extracted/";


    // ========================================================================
    // 🔔 SECTION 4: SERVER MESSAGES & TOASTS (Loading and Toast Texts)
    // ========================================================================

    /**
     * Server verification loading dialog title
     */
    public static final String LOADING_SERVER_TEXT = "Verifying With Server...";

    /**
     * Toast notification on successful login
     */
    public static final String LOGIN_SUCCESS_TOAST = "Login Success";
}
