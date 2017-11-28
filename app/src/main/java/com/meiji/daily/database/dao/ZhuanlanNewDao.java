package com.meiji.daily.database.dao;

/**
 * Created by Meiji on 2017/11/28.
 */

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.meiji.daily.bean.ZhuanlanBean;

import java.util.List;

@Dao
public interface ZhuanlanNewDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insert(ZhuanlanBean zhuanlanBean);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(List<ZhuanlanBean> list);

    @Query("SELECT * FROM zhuanlans WHERE type = :type ")
    List<ZhuanlanBean> query(int type);

    @Query("DELETE FROM zhuanlans WHERE slug = :slug")
    void delete(String slug);
}
