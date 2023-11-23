package com.example.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.SensorEventListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.PowerManager;

public class MainActivitybatman extends AppCompatActivity implements SensorEventListener{
    private SensorManager sensorManager;
    private Sensor accelerometer;
    private MediaPlayer mediaPlayer;
    private PowerManager.WakeLock wakeLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybatman);

            sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
            if (sensorManager != null) {
                accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            }

            mediaPlayer = MediaPlayer.create(this, R.raw.audiobatman);
            PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
            if (powerManager != null) {
                wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "MyApp::MyWakelockTag");
            }
        }

        @Override
        protected void onResume() {
            super.onResume();
            if (accelerometer != null) {
                sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
            }
        }

        @Override
        protected void onPause() {
            super.onPause();
            sensorManager.unregisterListener(this);
        }

        @Override
        public void onSensorChanged(SensorEvent event) {
            float[] values = event.values;
            float x = values[0];
            float y = values[1];
            float z = values[2];

            double acceleration = Math.sqrt(x * x + y * y + z * z);

            if (acceleration > 2.5) {
                playAudio();
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }

        private void playAudio() {
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
        }
    public void btnvoltarbat(View vb) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void txtvideobat (View viba) {
        Uri uri = Uri.parse("https://youtu.be/sTtHbO5b5GE?si=b6emhCfFd6V5AGWB");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}