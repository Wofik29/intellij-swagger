package org.zalando.intellij.swagger.completion.field.swagger;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import org.zalando.intellij.swagger.completion.CompletionHelper;
import org.zalando.intellij.swagger.completion.field.FieldCompletion;
import org.zalando.intellij.swagger.completion.field.model.common.ArrayField;
import org.zalando.intellij.swagger.completion.SwaggerCompletionHelper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class RootSecurityCompletion extends FieldCompletion {

    RootSecurityCompletion(final CompletionHelper completionHelper, final CompletionResultSet completionResultSet) {
        super(completionHelper, completionResultSet);
    }

    @Override
    public void fill() {
        getSecurityDefinitions().forEach(field -> {
            final List<PsiElement> security = completionHelper.getChildrenOfRoot("security");
            final List<String> existingNames = extractNames(security);
            if (!existingNames.contains(field.getName())) {
                addUnique(field);
            }
        });
    }

    private List<String> extractNames(final List<PsiElement> securityObjects) {
        return securityObjects.stream()
                .map(completionHelper::extractSecurityNameFromSecurityObject)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    private List<ArrayField> getSecurityDefinitions() {
        return completionHelper.getKeyNamesOfDefinition("securityDefinitions").stream()
                .map(ArrayField::new)
                .collect(Collectors.toList());
    }
}
