package database

import android.net.Uri
import android.content.ContentUris
import android.provider.BaseColumns

object QuestionsContract {

    internal const val TABLE_NAME = "Questions"

    /**
     * The Uri to access the Questions Table
     */
    val CONTENT_URI: Uri = Uri.withAppendedPath(CONTENT_AUTHORITY_URI, TABLE_NAME)
    const val CONTENT_TYPE = "vnd.android.cursor.dir/vnd.$CONTENT_AUTHORITY.$TABLE_NAME"
    const val CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.$CONTENT_AUTHORITY.$TABLE_NAME"

    // Fields
    object Columns: BaseColumns {
        const val KEY = "Key"
        const val CORRECT = "Correct"
        const val INCORRECT = "Incorrect"
    }

    fun getId(uri: Uri): Long {
        return ContentUris.parseId(uri)
    }

    fun buildUriFromId(id: Long): Uri {
        return ContentUris.withAppendedId(CONTENT_URI, id)
    }
}