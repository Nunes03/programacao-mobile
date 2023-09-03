package io.github.nunes03.pet_shop.datas

import android.util.Log
import io.github.nunes03.pet_shop.datas.entities.UserEntity

fun saveUser(user: UserEntity) {
    Log.d("users", users.toString())

    users.add(user);
}

private val users: ArrayList<UserEntity> = ArrayList();

fun existByEmail(email: String): Boolean {
    for (user in users) {
        if (user.email == email) {
            return true;
        }
    }

    return false;
}

class DataBase {}