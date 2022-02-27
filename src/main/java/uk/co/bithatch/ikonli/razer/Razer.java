/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2015-2022 Andres Almiray
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.bithatch.ikonli.razer;

import org.kordamp.ikonli.Ikon;

/**
 * @author Andres Almiray
 */
public enum Razer implements Ikon {
    // latest is eaea
	RAZER_RIGHT("razer-right", '\ue9ab'),
	RAZER_SCROLL("razer-scroll", '\ue9b3'),
	RAZER_PROFILE_LEDS("razer-profile-leds", '\ue9b7'),
	RAZER_LOGO("razer-logo", '\ue9bb'),
	RAZER_LEFT("razer-left", '\ue9bf'),
	RAZER_FULLY_CHARGED("razer-fully-charged", '\ue9c7'),
	RAZER_FAST_CHARGING("razer-fast-charging", '\ue9cd'),
	RAZER_CUSTOM("razer-custom", '\ue996'),
	RAZER_CHROMA("razer-chroma", '\ue99f'),
	RAZER_CHARGING("razer-charging", '\ue9a1'),
	RAZER_CHANNEL1("razer-channel1", '\ue9a5'),
	RAZER_CHANNEL2("razer-channel2", '\ue9a6'),
	RAZER_CHANNEL3("razer-channel3", '\ue9a7'),
	RAZER_CHANNEL4("razer-channel4", '\ue9a8'),
	RAZER_CHANNEL5("razer-channel5", '\ue9a9'),
	RAZER_CHANNEL6("razer-channel6", '\ue9aa'),
	RAZER_BW2013("razer-bw2013", '\ue990'),
	RAZER_BACKLIGHT("razer-backlight", '\ue992'),
	RAZER_RECORD("razer-record", '\ue989'),
	RAZER_TRAY("razer-tray", '\ue98b'),
	RAZER_TRAY_RECORDING("razer-tray-recording", '\ue98c'),
	RAZER_MOUSE_FAST("razer-mouse-fast", '\ue983'),
	RAZER_MOUSE_SLOW("razer-mouse-slow", '\ue987'),
	RAZER_MACROS("razer-macros", '\ue982'),
	RAZER_EFFECTS("razer-effects", '\ue96e'),
	RAZER_DETAILS("razer-details", '\ue974'),
	RAZER_BRIGHTNESS("razer-brightness", '\ue978'),
	RAZER_APP("razer-app", '\ue981'),
	RAZER_STATIC("razer-static", '\ue96c'),
	RAZER_WAVE("razer-wave", '\ue96d'),
	RAZER_STARLIGHT("razer-starlight", '\ue966'),
	RAZER_SPECTRUM("razer-spectrum", '\ue962'),
	RAZER_SCAN("razer-scan", '\ue95d'),
	RAZER_RIPPLE("razer-ripple", '\ue95b'),
	RAZER_REACTIVE("razer-reactive", '\ue95c'),
	RAZER_PULSATE("razer-pulsate", '\ue94e'),
	RAZER_OFF("razer-off", '\ue952'),
	RAZER_ON("razer-on", '\ue953'),
	RAZER_MATRIX("razer-matrix", '\ue93b'),
	RAZER_IDLE("razer-idle", '\ue93a'),
	RAZER_BREATH("razer-breath", '\ue939'),
	RAZER_BLINK("razer-blink", '\ue92f'),
	RAZER_STRIP("razer-strip", '\ue938'),
	RAZER_AUDIO("razer-audio", '\ue932'),
	RAZER_RAM("razer-ram", '\ue931'),
	RAZER_UNRECOGNISED("razer-unrecognised", '\ue930'),
	RAZER_MOUSEMAT("razer-mousemat", '\ue92a'),
	RAZER_MOUSE("razer-mouse", '\ue924'),
	RAZER_KEYPAD("razer-keypad", '\ue917'),
	RAZER_KEYBOARD("razer-keyboard", '\ue916'),
	RAZER_HEADSET("razer-headset", '\ue915'),
	RAZER_GPU("razer-gpu", '\ue914'),
	RAZER_FAN("razer-fan", '\ue913'),
	RAZER_ACCESSORY("razer-accessory", '\ue900'),
	RAZER_BULB("razer-bulb", '\ue907'),
	RAZER_CHARGER("razer-charger", '\ue908'),
	RAZER_AIO("razer-aio", '\ue901'),
	RAZER_CORE("razer-core", '\ue90c'),
	;

    public static Razer findByDescription(String description) {
        for (Razer font : values()) {
            if (font.getDescription().equals(description)) {
                return font;
            }
        }
        throw new IllegalArgumentException("Icon description '" + description + "' is invalid!");
    }

    private String description;
    private int code;

    Razer(String description, int code) {
        this.description = description;
        this.code = code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCode() {
        return code;
    }
}