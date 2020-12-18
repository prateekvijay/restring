package dev.b3nedikt.restring.example

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.widget.CheckedTextView
import androidx.appcompat.widget.AppCompatCheckedTextView
import dev.b3nedikt.reword.creator.ViewCreator

class CheckedTextViewCreator : ViewCreator<CheckedTextView> {

    override val viewName: String
        get() = "CheckedTextView"

    override fun createView(context: Context, attrs: AttributeSet?): CheckedTextView {

        val themedContext = ContextThemeWrapper(context, R.style.AppTheme)

        return AppCompatCheckedTextView(themedContext, attrs)
    }
}