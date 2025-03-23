package com.modernjava.javaimprovements;

public class MultiLineTextBlockExample {
    public static void main(String[] args) {
        String str = """
                    Hello World
                    Using
                    text block !""";
        System.out.println("str = " + str);
        String phrase = """
                        {
                        employee : "Anthony"
                        employeeId: 10001;
                        employeeType: FT
                        }""";
        System.out.println("phrase = " + phrase);

        String html = """
                    <html>
                        <body>
                        <p>"Java, Programming"</p>
                        </body>
                    """;
        System.out.println("html = " + html);

        String str2 = str.concat("This is my first text block");
        System.out.println("str2 = " + str2);
    }
}
