package ru.standard.webchat.client;

@FunctionalInterface
public interface Callback {
    void callback(Object... args);
}
