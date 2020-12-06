package database

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.database.sqlite.SQLiteQueryBuilder
import android.net.Uri
import android.util.Log
import java.lang.IllegalArgumentException

/**
 * Provider for the app.  This is the only class that can utilize [AppDatabase]
 */

private const val TAG = "AppProvider"

private const val QUESTIONS = 100
private const val QUESTIONS_ID = 101

private const val CURRENT_TEST = 200
private const val CURRENT_TEST_ID = 201

//private const val QUESTIONS_DURATIONS = 400
//private const val QUESTIONS_DURATION = 401

const val CONTENT_AUTHORITY = "database.provider"

// Uniform Resource Identifier
val CONTENT_AUTHORITY_URI: Uri = Uri.parse("content://$CONTENT_AUTHORITY")

class AppProvider: ContentProvider() {

    private val uriMatcher by lazy { buildUriMatcher() }

    // Pull table name from CONTENT_AUTHORITY
    private fun buildUriMatcher(): UriMatcher {
        Log.d(TAG, "buildUriMatcher starts")
        val matcher = UriMatcher(UriMatcher.NO_MATCH)

        // Uri matcher to Question TABLE - e.g. content://armyprogrammer.mcccstudyguide.provider/Questions
        matcher.addURI(CONTENT_AUTHORITY, QuestionsContract.TABLE_NAME, QUESTIONS)
        matcher.addURI(CONTENT_AUTHORITY, "${QuestionsContract.TABLE_NAME}/#", QUESTIONS_ID)

        // Uri matcher to CurrentTest TABLE - e.g. content://armyprogrammer.mcccstudyguide.provider/CurrentTest
        matcher.addURI(CONTENT_AUTHORITY, CurrentTestContract.TABLE_NAME, CURRENT_TEST)
        matcher.addURI(CONTENT_AUTHORITY, "${CurrentTestContract.TABLE_NAME}/#", CURRENT_TEST_ID)

        return matcher
    }

    override fun onCreate(): Boolean {
        Log.d(TAG, "onCreate: Starts")
        return true
    }

    override fun getType(uri: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun query(uri: Uri, projection: Array<out String>?, selection: String?, selectionArgs: Array<out String>?,
                       sortOrder: String?): Cursor? {

        Log.d(TAG, "query: Called with uri $uri")
        val match = uriMatcher.match(uri)
        Log.d(TAG, "query: match is $match")

        val queryBuilder = SQLiteQueryBuilder()

        when (match) {
            QUESTIONS -> queryBuilder.tables = QuestionsContract.TABLE_NAME

            QUESTIONS_ID -> {
                queryBuilder.tables = QuestionsContract.TABLE_NAME
                val questionsKey = QuestionsContract.getId(uri)
                queryBuilder.appendWhereEscapeString("${QuestionsContract.Columns.KEY} = $questionsKey")
            }

            CURRENT_TEST -> queryBuilder.tables = CurrentTestContract.TABLE_NAME

            CURRENT_TEST_ID -> {
                queryBuilder.tables = CurrentTestContract.TABLE_NAME
                val currentTestSubject = CurrentTestContract.getId(uri)
                queryBuilder.appendWhereEscapeString("${CurrentTestContract.Columns.SUBJECT} = $currentTestSubject")
            }

            else -> throw IllegalArgumentException("Unknown URI: $uri")
        }

        val db = AppDatabase.getInstance(context!!).readableDatabase
        val cursor = queryBuilder.query(db, projection, selection, selectionArgs, null, null, sortOrder)
        Log.d(TAG, "query: row in returned cursor = ${cursor.count}")

        return cursor
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Not yet implemented")
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {
        TODO("Not yet implemented")
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("Not yet implemented")
    }




}