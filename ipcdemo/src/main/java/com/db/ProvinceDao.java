package com.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class ProvinceDao {

    private ProvinceDataHelper helper;
    private SQLiteDatabase db = null;

    public ProvinceDao(Context mContext){
        helper = new ProvinceDataHelper(mContext);
    }

    /**
     * 从本地数据库获取省份列表
     * @return
     */
    public List<String> getProvinceList(){
        List<String> proList = new ArrayList<String>();
        try{
            db = helper.getReadableDatabase();
            Cursor cursor = db.rawQuery("select * from province", null);
            if(null != cursor){
                while(cursor.moveToNext()){
                    int id = cursor.getInt(cursor.getColumnIndex("id"));
                    String name = cursor.getString(cursor.getColumnIndex("name"));
//                    String bean = new ProvinceBean();
//                    bean.setId(id);
//                    bean.setName(name);
//
//                    proList.add(bean);
                }
            }
            cursor.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(null != db){
                db.close();
            }
        }
        return proList;
    }
}
