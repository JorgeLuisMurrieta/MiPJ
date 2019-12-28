package com.example.yourrem;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

public class BaseDatos extends SQLiteOpenHelper {
    private static final String NOMBRE_BD="basededatos.db";
    private static final int VERSION_BD=1;
    private static final String TABLA_RECUERDO="CREATE TABLE RECUERDO(ID TEXT PRIMARY KEY, NOMBRE TEXT, INFO TEXT, HORARIO TEXT, FECHA TEXT)";

    public BaseDatos(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_RECUERDO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_RECUERDO);
        sqLiteDatabase.execSQL(TABLA_RECUERDO);
    }
    public void agregarRecuerdos(String id, String nombre, String info, String fecha, String horario){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null){
            bd.execSQL("INSERT INTO RECUERDO VALUES('"+id+"','"+nombre+"','"+info+"','"+horario+"','"+fecha+"')");
            bd.close();
        }
    }
    public void eliminarRegistro(String id){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null){
            bd.execSQL("DELETE FROM RECUERDO WHERE ID='"+id+"'");
            bd.close();
        }

    }
    public List<ListaVO> mostrar(){
        SQLiteDatabase bd=getReadableDatabase();
        Cursor cursor = bd.rawQuery(" SELECT * FROM RECUERDO ",null);
        List<ListaVO> listaVOList=new ArrayList<>();
        if(cursor.moveToFirst()){
            do{
                listaVOList.add(new ListaVO(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4)));
            }while (cursor.moveToNext());
        }
        return listaVOList;
    }
}
