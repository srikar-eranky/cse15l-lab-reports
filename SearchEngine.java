import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> stringList = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            String finalStr = "";
            for(String s : stringList){
                finalStr = finalStr + " " + s;
            }
            return String.format(finalStr);
        } else if (url.getPath().equals("/add")) {
            String[] params = url.getQuery().split("=");
            String word = params[1];
            if(params[0].equals("s")){
                stringList.add(word);
            }
            return String.format("%s added! \n", word);
        } else if(url.getPath().equals("/search")){
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                String substring = parameters[1];
                String finalStr = "";
                for(String s : stringList){
                    if(s.indexOf(substring) != -1){
                        finalStr = finalStr + " " + s;
                    }
                }
                if(finalStr.length() == 0){
                    finalStr = "No results found";
                }
                return String.format(finalStr);
            }
        }
        return "404 Not Found";
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
