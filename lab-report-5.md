# Lab Report 5

## Part 1 - Debugging Scenario

### Original Post:
Hi, I have a question about ChatServer.java - my server only prints each individual message rather than the full chat history when I query add-message in the link. How can I fix this?

First message: 
![Image](first_call.png)
Second message:
![Image](second_call.png)

### TA Post:
Thank you for the post. Are you returning the output string by chance? Find a way to save previous strings so that you can return all of them. You can use `curl "http://localhost:<port>/add-message?s=<message>&user=<user>"`.
