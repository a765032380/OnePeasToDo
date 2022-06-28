package com.gll.libnotification

import android.app.Notification
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Icon
import android.net.Uri
import pub.gll.onepeas.libnotification.R

class CommonNotification {

}

fun main() {
}
fun commonNotification(context: Context){
    val builder : Notification.Builder = Notification.Builder(context)
    val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://baidu.com"))
    val pendingIntent = PendingIntent.getActivity(context,0,intent,PendingIntent.FLAG_IMMUTABLE)
    builder.apply {
        setContentIntent(pendingIntent)
        setSmallIcon(R.mipmap.ic_launcher)
        setLargeIcon(BitmapFactory.decodeResource(context.resources,R.mipmap.ic_launcher))
        setAutoCancel(true)
        setContentText("普通通知")
    }
    builder.build()
}