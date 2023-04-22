package io.github.oesolutions.server;

import io.github.oesolutions.shared.Greeter;

public class Server {
    public static void main(String... args) {
        System.out.println(new Greeter().greet("Dore"));
    }
}
