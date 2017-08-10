package org.zalando.intellij.swagger.completion.field.model.common;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class CommonFields {

    public static List<Field> info() {
        return ImmutableList.of(
                new StringField("title", true),
                new StringField("description"),
                new StringField("termsOfService"),
                new ContactField(),
                new LicenseField(),
                new StringField("version", true)
        );
    }

    public static List<Field> tag() {
        return ImmutableList.of(
                new StringField("name", true),
                new StringField("description"),
                new ExternalDocsField()
        );
    }

    public static List<Field> externalDocs() {
        return ImmutableList.of(
                new StringField("url", true),
                new StringField("description")
        );
    }

    public static List<Field> contact() {
        return ImmutableList.of(
                new StringField("name"),
                new StringField("url"),
                new StringField("email")
        );
    }

    public static List<Field> license() {
        return ImmutableList.of(
                new StringField("name", true),
                new StringField("url")
        );
    }

    public static List<Field> responses() {
        return ImmutableList.of(
                new ObjectField("default"),
                new ResponseField("200"),
                new ResponseField("201"),
                new ResponseField("202"),
                new ResponseField("203"),
                new ResponseField("204"),
                new ResponseField("205"),
                new ResponseField("206"),
                new ResponseField("207"),
                new ResponseField("208"),
                new ResponseField("226"),

                new ResponseField("300"),
                new ResponseField("301"),
                new ResponseField("302"),
                new ResponseField("303"),
                new ResponseField("304"),
                new ResponseField("305"),
                new ResponseField("306"),
                new ResponseField("307"),
                new ResponseField("308"),

                new ResponseField("400"),
                new ResponseField("401"),
                new ResponseField("402"),
                new ResponseField("403"),
                new ResponseField("404"),
                new ResponseField("405"),
                new ResponseField("406"),
                new ResponseField("407"),
                new ResponseField("408"),
                new ResponseField("409"),
                new ResponseField("410"),
                new ResponseField("411"),
                new ResponseField("412"),
                new ResponseField("413"),
                new ResponseField("414"),
                new ResponseField("415"),
                new ResponseField("416"),
                new ResponseField("417"),
                new ResponseField("418"),
                new ResponseField("421"),
                new ResponseField("422"),
                new ResponseField("423"),
                new ResponseField("424"),
                new ResponseField("426"),
                new ResponseField("428"),
                new ResponseField("429"),
                new ResponseField("431"),
                new ResponseField("451"),

                new ResponseField("500"),
                new ResponseField("501"),
                new ResponseField("502"),
                new ResponseField("503"),
                new ResponseField("504"),
                new ResponseField("505"),
                new ResponseField("506"),
                new ResponseField("507"),
                new ResponseField("508"),
                new ResponseField("510"),
                new ResponseField("511")
        );
    }
}
