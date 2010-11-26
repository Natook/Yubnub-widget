package se.natook.yubnub;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;

public class YubnubWidgetProvider extends AppWidgetProvider {

	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[]appWidgetIds){
		
		RemoteViews remoteViews;
        ComponentName watchWidget;

        remoteViews = new RemoteViews( context.getPackageName(), R.layout.yubnub_appwidget );
        watchWidget = new ComponentName( context, YubnubWidgetProvider.class );
        remoteViews.setTextViewText( R.id.input, "Time = ");
        appWidgetManager.updateAppWidget( watchWidget, remoteViews );
    }
		
	
	
}
