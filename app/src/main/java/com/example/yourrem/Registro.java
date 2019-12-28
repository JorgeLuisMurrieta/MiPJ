package com.example.yourrem;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.NotificationManager;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

import java.util.Calendar;

public class Registro extends AppCompatActivity {



    public static NotificationCompat.Builder notificacion;
    private Button boton;
    private static final int idUnica = 1;
    final Context context = this;

    //base de datos
    EditText edtIdentificador, edtTitulo, edtDetalle, edtHorario, edtFecha;
    Button btnAgregar, btnFecha, btnHorario;
    Vibrator vibrator;
    Resources mResources;
    Calendar calendar;
    int currentHour;
    int currentMinute;
    String amPm;
    TimePickerDialog PickerDialog;
    //////////////////////
    int year;
    int month;
    int dayOfMonth;
    DatePickerDialog datePicker;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        notificacion = new NotificationCompat.Builder(this);
        notificacion.setAutoCancel(true);
        vibrator=(Vibrator) getSystemService(VIBRATOR_SERVICE);
        mResources = getResources();


        //////////////BASE DE DATOS//////////////////////

        edtIdentificador=(EditText)findViewById(R.id.edtCodigo);
        edtTitulo=(EditText)findViewById(R.id.edtTitulo);
        edtDetalle=(EditText)findViewById(R.id.edtDetalle);
        edtFecha=(EditText) findViewById(R.id.edtFecha);
        edtHorario=(EditText)findViewById(R.id.edtHorario);
        btnFecha=(Button)findViewById(R.id.btnFecha);
        btnHorario=(Button)findViewById(R.id.btnHorario);


        btnAgregar=(Button)findViewById(R.id.btnAgregar);

        final BaseDatos baseDatos = new BaseDatos(getApplicationContext());

        //Aqui se crearn las Alarmmanager
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                try{
                    baseDatos.agregarRecuerdos(edtIdentificador.getText().toString(), edtTitulo.getText().toString(),edtDetalle.getText().toString(), edtFecha.getText().toString(), edtHorario.getText().toString());
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    alertDialogBuilder.setTitle("¿Deseas agregar una notificación permanente?");
                    alertDialogBuilder.setMessage("Presiona Sí para confirmar.Esta notificacion te servirá para recordar mejor el evento agregado. Si sientes alguna molestia, recuerda que puedes eliminar la notificación, en la parte de configuración.").setCancelable(false)
                            .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    notificacion.setOngoing(true);
                                    notificacion.setSmallIcon(R.mipmap.ic_launcher);
                                    notificacion.setTicker("Recuerda esto: "+edtTitulo.getText().toString());
                                    notificacion.setWhen(System.currentTimeMillis());
                                    notificacion.setContentTitle("Recuerda esto: "+edtTitulo.getText().toString());
                                    notificacion.setContentText(edtDetalle.getText().toString());
                                    Bitmap bitmap = BitmapFactory.decodeResource(mResources, R.mipmap.ic_launcher);
                                    notificacion.setLargeIcon(bitmap);
                                    notificacion.setStyle(new NotificationCompat.BigTextStyle().bigText(edtDetalle.getText().toString()).setBigContentTitle("Recuerda Esto: "+edtTitulo.getText().toString()));
                                    notificacion.setOngoing(true);

                                    NotificationManager nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                                    nm.notify(idUnica, notificacion.build());
                                    if(Build.VERSION.SDK_INT >=26){
                                        vibrator.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE));
                                    }else {
                                        vibrator.vibrate(200);
                                    }
                                    StyleableToast.makeText(context,"Agregado exitosamente",Toast.LENGTH_SHORT, R.style.exampleToast).show();
                                    Intent intent = new Intent(getApplicationContext(), TabbeedActivity.class);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {
                                    StyleableToast.makeText(context,"Agregado exitosamente",Toast.LENGTH_SHORT, R.style.exampleToast).show();
                                    Intent intent = new Intent(getApplicationContext(), TabbeedActivity.class);
                                    startActivity(intent);
                                }
                            });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();

                }catch (Exception e){
                    StyleableToast.makeText(context,"Escribe otro nombre. El que ingresaste ya esta ocupado",Toast.LENGTH_SHORT, R.style.error).show();
                    limpiar();
                }

            }
        });

        btnHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                currentHour = calendar.get(Calendar.HOUR_OF_DAY);
                currentMinute=calendar.get(Calendar.MINUTE);

                PickerDialog = new TimePickerDialog(Registro.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        if(hourOfDay >= 12){
                            amPm = "PM";
                        }else {
                            amPm="AM";
                        }
                        edtHorario.setText(String.format("%02d:%02d", hourOfDay, minute));
                    }
                },currentHour, currentMinute, false);
                PickerDialog.show();
            }
        });
        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar=Calendar.getInstance();
                year=calendar.get(Calendar.YEAR);
                month=calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePicker = new DatePickerDialog(Registro.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
                        edtFecha.setText(day+"/"+(month+1)+"/"+year);
                    }
                },year, month, dayOfMonth);
                datePicker.show();
            }
        });


    }
    private void limpiar() {
    edtIdentificador.setText("");
    }
}
