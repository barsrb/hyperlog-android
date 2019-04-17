
/*
The MIT License (MIT)

Copyright (c) 2015-2017 HyperTrack (http://hypertrack.com)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.hypertrack.hyperlog;

import com.google.gson.annotations.Expose;

/**
 * Created by Aman Jain on 22/09/17.
 */
/** package */
public class DeviceLogModel {

    @Expose(serialize = false, deserialize = false)
    private int id;

    //private String deviceLog;
    private String logLevelName;
    private String tag;
    private String message;
    private String timeStamp;

    public DeviceLogModel(int id, String logLevelName, String tag, String message, String timeStamp) {
        this.id = id;
        this.logLevelName = logLevelName;
        this.tag = tag;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public DeviceLogModel(String logLevelName, String tag, String message, String timeStamp) {
        this.logLevelName = logLevelName;
        this.tag = tag;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogLevelName() {
        return logLevelName;
    }

    public void setLogLevelName(String logLevelName) {
        this.logLevelName = logLevelName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String toFormatedString(LogFormat mLogFormat) {
        return mLogFormat.formatLogMessage(logLevelName, tag, message, timeStamp);
    }
}