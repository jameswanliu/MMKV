package com.tencent.mmkv;

public interface  MMKVContentChangeNotification {
    // content change notification of other process
    // trigger by getXXX() or setXXX() or checkContentChangedByOuterProcess()
    int onContentChangedByOuterProcess(String mmapID);
}
