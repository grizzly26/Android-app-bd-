package com.example.bd

import android.app.Application
import com.example.bd.data.MainDb

class App:Application() {
    val database by lazy { MainDb.createDataBase(this) }
}