# Lab Report 3

## Code for ChatServer:
---
``
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
``
``
class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> arr = new ArrayList<String>();
``

    public String handleRequest(URI url) {
        String path = url.getPath();
        String query = url.getQuery();
        String[] params = query.split("&");
        if(path.equals("/add-message")){
            String[] messageQuery = params[0].split("=");
            String[] userQuery = params[1].split("=");
            String user = "";
            String message = "";
            if(messageQuery[0].equals("s")){
                message = messageQuery[1];
            }
            if(userQuery[0].equals("user")){
                user = userQuery[1];
            }
            String output = user + ": " + message + "\n";
            arr.add(output);
            String finalStr = "";
            for(String s : arr){
                finalStr += s;
            }
            return finalStr;
        }
        return "Path does not exist";
    }
`}`

``
class ChatServer { <br />
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
``
        `int port = Integer.parseInt(args[0]);`

        Server.start(port, new Handler());

    }
`}`
