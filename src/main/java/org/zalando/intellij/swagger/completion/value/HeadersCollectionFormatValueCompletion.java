package org.zalando.intellij.swagger.completion.value;

import com.intellij.codeInsight.completion.CompletionResultSet;
import org.zalando.intellij.swagger.completion.value.model.Values;
import org.zalando.intellij.swagger.completion.CompletionHelper;

class HeadersCollectionFormatValueCompletion extends ValueCompletion {

    HeadersCollectionFormatValueCompletion(final CompletionHelper completionHelper, final CompletionResultSet completionResultSet) {
        super(completionHelper, completionResultSet);
    }

    @Override
    public void fill() {
        Values.headersCollectionFormat().forEach(this::addValue);
    }
}
