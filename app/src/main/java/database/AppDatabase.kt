package database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.lang.IllegalStateException

/**
 * Basic database class for the application.
 * Interact with app database defined in [QuestionsContract] and [CurrentTestContract].
 * The only class that should use this is [AppProvider].
 */

private const val TAG = "AppDatabase"
private const val DATABASE_NAME = "StudyGuide.db"
private const val DATABASE_VERSION = 3

internal class AppDatabase private constructor(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    init {
        Log.d(TAG, "AppDatabase: Initializing")
    }

    override fun onCreate(db: SQLiteDatabase) {
        Log.d(TAG, "onCreate: starts")

        createQuestionsTable(db)
        createCurrentTestTable(db)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        Log.d(TAG, "onUpgrade: starts")
        when(oldVersion) {
            1 -> {
                // upgrade logic from version 1
            }
            else -> throw IllegalStateException("onUpgrade() with unknown newVersion: $newVersion")
        }
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Questions Table
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    private fun createQuestionsTable(db: SQLiteDatabase) {
        val sSQL = """CREATE TABLE ${QuestionsContract.TABLE_NAME} (
        ${QuestionsContract.Columns.KEY} TEXT PRIMARY KEY NOT NULL,
        ${QuestionsContract.Columns.CORRECT} INTEGER NOT NULL,
        ${QuestionsContract.Columns.INCORRECT} INTEGER NOT NULL);""".replaceIndent(" ")
        Log.d(TAG, sSQL)
        db.execSQL(sSQL)
    }


    private fun dropQuestionsTable(db: SQLiteDatabase) {
        val sSQL = "DROP TABLE IF EXISTS ${QuestionsContract.TABLE_NAME}"
        Log.d(TAG, sSQL)
        db.execSQL(sSQL)
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Current Test Table
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    private fun createCurrentTestTable(db: SQLiteDatabase) {
        val sSQL = """CREATE TABLE ${CurrentTestContract.TABLE_NAME} (
            ${CurrentTestContract.Columns.SUBJECT} TEXT PRIMARY KEY NOT NULL,
            ${CurrentTestContract.Columns.TEST_INDEX} INTEGER NOT NULL,
            ${CurrentTestContract.Columns.TEST} TEXT NOT NULL,
            ${CurrentTestContract.Columns.TEST_ANSWERS} TEXT NOT NULL,
            ${CurrentTestContract.Columns.SET_LENGTH} INTEGER NOT NULL,
            ${CurrentTestContract.Columns.SKIPPED_HANDLING} TEXT NOT NULL,
            ${CurrentTestContract.Columns.INCORRECT_HANDLING} TEXT NOT NULL);""".replaceIndent(" ")
        Log.d(TAG, sSQL)
        db.execSQL(sSQL)
    }


    private fun dropCurrentTestTable(db: SQLiteDatabase) {
        val sSQL = "DROP TABLE IF EXISTS ${CurrentTestContract.TABLE_NAME}"
        Log.d(TAG, sSQL)
        db.execSQL(sSQL)
    }

    // Prevent multiple instances of the database
    companion object {

        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =

            // If DB isn't null it creates new AppDatabase.
            // Prevents multiple Databases from being created in different threads
            instance ?: synchronized(this) {
                instance ?: AppDatabase(context).also { instance = it }
            }
    }
}