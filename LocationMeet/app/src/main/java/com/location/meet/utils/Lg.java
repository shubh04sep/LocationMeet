package com.location.meet.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;


public class Lg
{
	/**
	 * set this to true (for testing and debugging) to show the application
	 * logs.
	 * 
	 * flag will be set based on release or debug mode. See
	 * {@link com.location.meet}
	 */
	public static boolean LOGGING_ENABLED = AppConstants.LOGS_AND_TOASTS_ENABLED;

	public static void i(String tag, String msg)
	{
		if (LOGGING_ENABLED)
		{
			if (msg != null)
				Log.i(tag, msg);
		}
	}

	public static void e(String tag, String msg)
	{
		if (LOGGING_ENABLED)
		{
			if (msg != null)
				Log.e(tag, msg);
		}
	}

	public static void w(String tag, String msg)
	{
		if (LOGGING_ENABLED)
		{
			if (msg != null)
				Log.w(tag, msg);
		}
	}

	public static void d(String tag, String msg)
	{
		if (LOGGING_ENABLED)
		{
			if (msg != null)
				Log.d(tag, msg);
		}
	}

	public static void v(String tag, String msg)
	{
		if (LOGGING_ENABLED)
		{
			if (msg != null)
				Log.v(tag, msg);
		}
	}


    public static void showToast(Context context, String message)
    {
        if (LOGGING_ENABLED)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void printLong(String tag, String message)
    {
        if (LOGGING_ENABLED)
            if (message != null)
            {
                int maxLogSize = 1000;
                for (int i = 0; i <= message.length() / maxLogSize; i++)
                {
                    int start = i * maxLogSize;
                    int end = (i + 1) * maxLogSize;
                    end = end > message.length() ? message.length() : end;
                    Log.i(tag, message.substring(start, end));
                }
            }
    }

}
