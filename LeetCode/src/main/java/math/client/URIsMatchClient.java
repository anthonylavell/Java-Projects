package math.client;

import arraysandstrings.string.URIsMatch;

public class URIsMatchClient {
    public static void main(String[] args) {
        System.out.println(URIsMatch.matchURI("http://abc.com:80/~smith/home.html;http://ABC.com/%7Esmith/home.html") );
    }
}
