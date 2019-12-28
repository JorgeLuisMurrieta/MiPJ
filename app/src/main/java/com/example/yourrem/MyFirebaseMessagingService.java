package com.example.yourrem;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

import static android.content.ContentValues.TAG;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    Resources mResources;
    Vibrator vibrator;
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        vibrator=(Vibrator) getSystemService(VIBRATOR_SERVICE);
        super.onMessageReceived(remoteMessage);
        if(remoteMessage.getData().isEmpty()){
            showNotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());
            if(Build.VERSION.SDK_INT >=26){
                vibrator.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE));
                long[]frec={500,0,500};
                vibrator.vibrate(frec,-1);
            }else {
                vibrator.vibrate(500);
            }
        }
        else {
            showNotification(remoteMessage.getData());
            if(Build.VERSION.SDK_INT >=26){
                vibrator.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE));
            }
            else {
                vibrator.vibrate(500);
            }

        }
    }
    private void showNotification(Map<String, String> data) {
        String title = data.get("title").toString();
        String body = data.get("body").toString();
        Bitmap bitmap = BitmapFactory.decodeResource(mResources, R.mipmap.ic_launcher);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "MyNotifications")
                .setContentTitle(title)
                .setLargeIcon(bitmap)
                .setSmallIcon(R.drawable.icono)
                .setAutoCancel(true)
                .setContentText(body)
                .setVibrate(new long[]{500,0,500})
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                ;

        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(999, builder.build());
    }

    private void showNotification(String title, String body) {
        Bitmap bitmap = BitmapFactory.decodeResource(mResources, R.mipmap.ic_launcher);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "MyNotifications")
                .setContentTitle(title)
                .setLargeIcon(bitmap)
                .setSmallIcon(R.drawable.icono)
                .setAutoCancel(true)
                .setContentText(body)
                ;

        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(999, builder.build());
    }
}
