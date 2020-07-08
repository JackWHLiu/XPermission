/*
 * Copyright (C) 2019 The JackKnife Open Source Project
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
 * limitations under the License.
 */

package com.lwh.xpermission.bridge;

import com.lwh.xpermission.source.Source;

public final class BridgeRequest {

    public static final int TYPE_APP_DETAILS = 1;
    public static final int TYPE_PERMISSION = 2;
    public static final int TYPE_INSTALL = 3;
    public static final int TYPE_OVERLAY = 4;
    public static final int TYPE_ALERT_WINDOW = 5;
    public static final int TYPE_NOTIFY = 6;
    public static final int TYPE_NOTIFY_LISTENER = 7;
    public static final int TYPE_WRITE_SETTING = 8;

    private final Source mSource;

    private int mType;
    private Callback mCallback;
    private String[] mPermissions;

    public BridgeRequest(Source source) {
        this.mSource = source;
    }

    public Source getSource() {
        return mSource;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        mType = type;
    }

    public Callback getCallback() {
        return mCallback;
    }

    public void setCallback(Callback callback) {
        mCallback = callback;
    }

    public String[] getPermissions() {
        return mPermissions;
    }

    public void setPermissions(String[] permissions) {
        mPermissions = permissions;
    }

    public interface Callback {

        void onCallback();
    }
}