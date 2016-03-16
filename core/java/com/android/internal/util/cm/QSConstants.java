/*
 * Copyright (C) 2015 The CyanogenMod Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.android.internal.util.cm;

import java.util.ArrayList;

public class QSConstants {
    private QSConstants() {}

    public static final String TILE_WIFI = "wifi";
    public static final String TILE_BLUETOOTH = "bt";
    public static final String TILE_INVERSION = "inversion";
    public static final String TILE_DND = "dnd";
    public static final String TILE_CELLULAR = "cell";
    public static final String TILE_AIRPLANE = "airplane";
    public static final String TILE_ROTATION = "rotation";
    public static final String TILE_FLASHLIGHT = "flashlight";
    public static final String TILE_LOCATION = "location";
    public static final String TILE_CAST = "cast";
    public static final String TILE_HOTSPOT = "hotspot";
	public static final String TILE_SCREEN_TIMEOUT = "screen_timeout";
	public static final String TILE_SCREEN_OFF = "screen_off";
	public static final String TILE_REBOOT = "reboot";
	public static final String TILE_AMBIENT_DISPLAY = "ambient_display";
        public static final String TILE_SOUND = "sound";
	public static final String TILE_EDIT = "edit";
        public static final String TILE_HEADSUP = "headsup";
        public static final String TILE_EXPANDED_DESKTOP = "expanded_desktop";
        public static final String TILE_BATTERY_SAVER = "battery_saver";
        public static final String TILE_MUSIC = "music";
        public static final String TILE_SCREENSHOT = "screenshot"; 
        public static final String TILE_USB_TETHER = "usb_tether";
        public static final String TILE_NFC = "nfc"; 
        public static final String TILE_SYNC = "sync";
   protected static final ArrayList<String> STATIC_TILES_AVAILABLE = new ArrayList<String>();
    protected static final ArrayList<String> TILES_AVAILABLE = new ArrayList<String>();

    static {
        STATIC_TILES_AVAILABLE.add(TILE_WIFI);
        STATIC_TILES_AVAILABLE.add(TILE_BLUETOOTH);
        STATIC_TILES_AVAILABLE.add(TILE_CELLULAR);
        STATIC_TILES_AVAILABLE.add(TILE_AIRPLANE);
        STATIC_TILES_AVAILABLE.add(TILE_ROTATION);
        STATIC_TILES_AVAILABLE.add(TILE_FLASHLIGHT);
        STATIC_TILES_AVAILABLE.add(TILE_LOCATION);
        STATIC_TILES_AVAILABLE.add(TILE_EDIT);
        STATIC_TILES_AVAILABLE.add(TILE_CAST);
        STATIC_TILES_AVAILABLE.add(TILE_HOTSPOT);
        STATIC_TILES_AVAILABLE.add(TILE_INVERSION);
        STATIC_TILES_AVAILABLE.add(TILE_DND);
//        STATIC_TILES_AVAILABLE.add(TILE_NOTIFICATIONS);
//        STATIC_TILES_AVAILABLE.add(TILE_DATA);
//        STATIC_TILES_AVAILABLE.add(TILE_ROAMING);
//        STATIC_TILES_AVAILABLE.add(TILE_DDS);
//        STATIC_TILES_AVAILABLE.add(TILE_APN);
		STATIC_TILES_AVAILABLE.add(TILE_SCREEN_TIMEOUT);
		STATIC_TILES_AVAILABLE.add(TILE_SCREEN_OFF);
		STATIC_TILES_AVAILABLE.add(TILE_REBOOT);
		STATIC_TILES_AVAILABLE.add(TILE_AMBIENT_DISPLAY);
                STATIC_TILES_AVAILABLE.add(TILE_SOUND);
                STATIC_TILES_AVAILABLE.add(TILE_HEADSUP);
                STATIC_TILES_AVAILABLE.add(TILE_EXPANDED_DESKTOP);
                STATIC_TILES_AVAILABLE.add(TILE_BATTERY_SAVER);
                STATIC_TILES_AVAILABLE.add(TILE_MUSIC);
                STATIC_TILES_AVAILABLE.add(TILE_SCREENSHOT);
                STATIC_TILES_AVAILABLE.add(TILE_USB_TETHER);
                STATIC_TILES_AVAILABLE.add(TILE_NFC);
                STATIC_TILES_AVAILABLE.add(TILE_SYNC);
        TILES_AVAILABLE.addAll(STATIC_TILES_AVAILABLE);
    }
}
