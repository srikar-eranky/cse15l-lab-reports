# Lab Report 3

## Code for ChatServer:
---

`import java.io.IOException;` <br />
`import java.net.URI;` <br />
`import java.util.ArrayList;` <br />

`class Handler implements URLHandler {` <br />
    * `// The one bit of state on the server: a number that will be manipulated by` <br />
    * `// various requests.` <br />
    * `ArrayList<String> arr = new ArrayList<String>();` <br />

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
