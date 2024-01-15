package com.pon.helloworld;
public class HellocatResponse {
    private String name;
    private String greeting;
    private String voice;

    public HellocatResponse(String name, String greeting, String voice) {
        this.name = name;
        this.greeting = greeting;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getVoice() {
        return voice;
    }
}
