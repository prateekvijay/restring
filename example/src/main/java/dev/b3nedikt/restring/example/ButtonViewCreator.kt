package dev.b3nedikt.restring.example

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import dev.b3nedikt.reword.creator.ViewCreator

class ButtonViewCreator : ViewCreator<Button> {

    override val viewName: String
        get() = "Button"

    override fun createView(context: Context, attrs: AttributeSet?): Button {

        val themedContext = ContextThemeWrapper(context, R.style.AppTheme)

        return AppCompatButton(themedContext, attrs)
    }
}