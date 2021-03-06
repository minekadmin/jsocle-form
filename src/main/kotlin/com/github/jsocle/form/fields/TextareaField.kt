package com.github.jsocle.form.fields

import com.github.jsocle.form.SingleValueField
import com.github.jsocle.form.StringFieldMapper
import com.github.jsocle.html.elements.Textarea

public class TextareaField(default: String? = null) : SingleValueField<String?, Textarea>(StringFieldMapper(), default) {
    override fun render(): Textarea {
        return Textarea(name = name, text_ = raw.firstOrNull())
    }
}