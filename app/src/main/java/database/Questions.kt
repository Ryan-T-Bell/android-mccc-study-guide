package database

import android.util.Log

/**
 * Middle object between Database and Flash Card Displayer.
 *    Database -> MutableMap<"KEY", Question()> -> FlashCardDisplayer -> StudyFragment
 */
class Questions constructor(subject: String, category: String, front: String, back: String) {
    private val TAG = "Question"

    private var subject: String? = null
    private var category: String? = null
    private var front: String? = null
    private var back: String? = null

    private var correct: Int? = null
    private var incorrect: Int? = null


    init {
        Log.d(TAG, "Initialize Question Object")
        this.subject = subject
        this.category = category
        this.front = front
        this.back = back
    }

    /**
     * Set Values from SQLite DB
     * @param correct Number of times question was answered correctly
     * @param incorrect Number of times question was answered incorrectly
     */
    fun setDatabaseValues(correct: Int, incorrect: Int) {
        Log.d(TAG, "Set Question Object Database Values")
        this.correct = correct
        this.incorrect = incorrect
    }
}