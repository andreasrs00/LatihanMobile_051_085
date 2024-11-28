package com.example.latihanmobile_051_085

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.latihanmobile_051_085.DatabaseContract.HomeworkColumns.Companion.TABLE_NAME

internal class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "dbhomework"
        private const val DATABASE_VERSION = 1
        private const val SQL_CREATE_TABLE_NOTE = "CREATE TABLE $TABLE_NAME" +
        " ($(HoneworkColumns._ID) INTEGER PRIMARY KEY AUTOINCREMENT," +
        " $(HoneworkColumns.TITLE) TEXT NOT NULL," +
        " $(HoneworkColumns.DESCRIPTION) TEXT NOT NULL," +
        " $(HoneworkColumns.DATE) TEXT NOT NULL)"
    }
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_TABLE_NOTE)
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
}
