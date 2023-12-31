package io.github.nunes03.pet_shop.database

import android.util.Log
import io.github.nunes03.pet_shop.entities.UserEntity

class UserRepository {

    companion object {
        private val users: ArrayList<UserEntity> = ArrayList();

        fun saveUser(user: UserEntity) {
            Log.d("users", users.toString())

            users.add(user);
        }

        fun existByEmail(email: String): Boolean {
            for (user in users) {
                if (user.email == email) {
                    return true;
                }
            }

            return false;
        }

        fun existByEmailAndPassword(email: String, password: String): Boolean {
            for (user in users) {
                if (user.email == email && user.password == password) {
                    return true;
                }
            }

            return false;
        }
    }
}