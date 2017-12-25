package com.meiji.daily.data.local.converter;

import android.arch.persistence.room.TypeConverter;
import android.support.annotation.NonNull;

import com.google.gson.reflect.TypeToken;
import com.meiji.daily.App;
import com.meiji.daily.bean.ZhuanlanBean;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meiji on 2017/11/28.
 */

public class ZhuanlanBeanConverter {

    @TypeConverter
    public static String toString(@NonNull ZhuanlanBean.AvatarBeanX avatarBeanX) {
        return App.sGson.toJson(avatarBeanX);
    }

    @TypeConverter
    public static ZhuanlanBean.AvatarBeanX toBean(@NonNull String s) {
        return App.sGson.fromJson(s, ZhuanlanBean.AvatarBeanX.class);
    }

    public static List<ZhuanlanBean.AvatarBeanX> toList(@NonNull String s) {
        Type listType = new TypeToken<ArrayList<ZhuanlanBean.AvatarBeanX>>() {
        }.getType();
        return App.sGson.fromJson(s, listType);
    }
}
