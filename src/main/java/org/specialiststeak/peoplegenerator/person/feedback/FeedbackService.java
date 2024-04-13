package org.specialiststeak.peoplegenerator.person.feedback;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FeedbackService {

    //    If you see this from the JAR, please let me know. This should be obfuscated.
    public static final String SALT = "*V&P5MzzfjQVrB";
    private static final String PRIMARY_EMAIL = "luke.merletti@gmail.com";

    public static void main(String[] args) {
        FeedbackService.email("Hello", PRIMARY_EMAIL);
    }

    public static void email(String content, String to) {
        sendSimpleMessage(content, to);
    }

    private static void sendSimpleMessage(String body, String to) {
        return;
    }
}