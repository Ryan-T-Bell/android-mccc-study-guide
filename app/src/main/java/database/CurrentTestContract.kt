package database

import android.content.ContentUris
import android.net.Uri
import android.provider.BaseColumns

object CurrentTestContract {

    internal const val TABLE_NAME = "CurrentTest"

    /**
     * The Uri to access the CurrentTest Table
     */
    val CONTENT_URI: Uri = Uri.withAppendedPath(CONTENT_AUTHORITY_URI, TABLE_NAME)
    const val CONTENT_TYPE = "vnd.android.cursor.dir/vnd.$CONTENT_AUTHORITY.$TABLE_NAME"
    const val CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.$CONTENT_AUTHORITY.$TABLE_NAME"

    object Columns: BaseColumns {
        const val SUBJECT = "Subject"
        const val TEST_INDEX = "TestIndex"
        const val TEST = "Test"
        const val TEST_ANSWERS = "TestAnswers"
        const val SET_LENGTH = "SetLength"
        const val SKIPPED_HANDLING = "SkippedHandling"
        const val INCORRECT_HANDLING = "IncorrectHandling"
    }

    fun getId(uri: Uri): Long {
        return ContentUris.parseId(uri)
    }

    fun buildUriFromId(id: Long): Uri {
        return ContentUris.withAppendedId(CONTENT_URI, id)
    }
}