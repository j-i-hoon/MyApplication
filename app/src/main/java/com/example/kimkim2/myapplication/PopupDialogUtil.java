package com.example.kimkim2.myapplication;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Handler;

/**
 * @설명 : 팝업 다이어로그 유틸리티 클래스
 * @클래스명 : PopupDialogUtil
 */
public class PopupDialogUtil {

    private static ProgressDialog mProgressDialog = null;

    /**
     * 프로그래스바 팝업 다이어로그. 타이틀, 메시지 포함
     * */
    public static void showProgressDialog(Context context, String title, String message) {

        dismissProgressDialog();

        mProgressDialog = ProgressDialog.show(context, title, message, true);
        mProgressDialog.setIcon(android.R.drawable.ic_dialog_alert);
        mProgressDialog.show();


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                if(mProgressDialog != null) {
                    dismissProgressDialog();
                }
            }
        }, 5000);
    }

    /**
     * 프로그래스바 팝업 다이어로그. 메시지만 존재
     * */
    public static void showProgressDialog(Context context, String message) {

        dismissProgressDialog();

        mProgressDialog = new ProgressDialog(context);
        mProgressDialog.setMessage(message);
        mProgressDialog.show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                if(mProgressDialog != null) {
                    dismissProgressDialog();
                }
            }
        }, 20000);
    }

    /**
     * 프로그래스바 다이어로그 종료함수
     * */
    public static void dismissProgressDialog() {

        if( mProgressDialog != null) {// && mProgressDialog.getWindow().isActive()) {
            mProgressDialog.dismiss();
        }

        mProgressDialog = null;
    }

    /**
     * 예, 아니오 팝업 다이어로그
     * */
    public static void showYesNoDialog(final Context context, CharSequence title,
                                       CharSequence message,
                                       String yesButtonTitle,
                                       String noButtonTitle,
                                       boolean indeterminate,
                                       boolean cancelable, OnCancelListener cancelListener,
                                       DialogInterface.OnClickListener positiveClickListener,
                                       DialogInterface.OnClickListener negativeClickListener) {
        AlertDialog.Builder builder = new Builder(context);
        builder.setTitle(title);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setMessage(message);
        builder.setCancelable(cancelable);
        builder.setPositiveButton(yesButtonTitle, positiveClickListener);
        builder.setNegativeButton(noButtonTitle, negativeClickListener);
        builder.show();
    }

    /**
     * 예, 아니오 팝업 다이어로그
     * */
    public static void showYesNoDialog(final Context context, int title, int message, int yesButtonTitle,int noButtonTitle, DialogInterface.OnClickListener positiveClickListener, DialogInterface.OnClickListener negativeClickListener) {
        AlertDialog.Builder builder = new Builder(context);
        builder.setTitle(context.getString(title));
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setMessage(context.getString(message));
        builder.setPositiveButton(context.getString(yesButtonTitle), positiveClickListener);
        builder.setNegativeButton(context.getString(noButtonTitle), negativeClickListener);
        builder.create().show();
    }

    /**
     * 확인 팝업 다이어로그
     * */
    public static void showConfirmDialog(final Context context, int title, int message, DialogInterface.OnClickListener positiveClickListener) {
        AlertDialog.Builder builder = new Builder(context);
        builder.setTitle(title);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setMessage(message);
        builder.setPositiveButton(context.getString(android.R.string.yes), positiveClickListener);
        builder.create().show();
    }

    /**
     * 확인 팝업 다이어로그
     * */
    public static void showConfirmDialog(final Context context, String title, String message, DialogInterface.OnClickListener positiveClickListener) {
        AlertDialog.Builder builder = new Builder(context);
        builder.setTitle(title);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setMessage(message);
        builder.setPositiveButton(context.getString(android.R.string.yes), positiveClickListener);
        builder.create().show();
    }
}
