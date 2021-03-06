package com.vondear.rxtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/**
 * Created by Administrator on 2017/3/15.
 */

public class RxBroadcastUtils {


    /**
     * 网络状态改变广播
     */
    public class BroadcastReceiverNetWork extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            RxNetUtils.getNetWorkType(context);
        }
    }


    /**
     * 注册监听网络状态的广播
     * @param context
     * @return
     */
    private BroadcastReceiverNetWork initRegisterReceiverNetWork(Context context) {
        // 注册监听网络状态的服务
        BroadcastReceiverNetWork mReceiverNetWork = new BroadcastReceiverNetWork();
        IntentFilter mFilter = new IntentFilter();
        mFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        context.registerReceiver(mReceiverNetWork, mFilter);
        return mReceiverNetWork;
    }
}
