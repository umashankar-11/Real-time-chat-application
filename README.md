# Chat Application

This project implements a simple multi-client chat application using Java sockets. It includes both a server and a client, where the server can handle multiple client connections simultaneously. The chat supports basic features such as sending messages and broadcasting them to all connected clients. The application is divided into two parts:

- **Server**: Listens for incoming client connections, assigns usernames, and broadcasts messages to all connected clients.
- **Client**: Connects to the server, sends messages, and listens for incoming messages from other clients.

## Features

- **Multiple Clients**: The server can handle multiple clients concurrently. Each client can send and receive messages in real-time.
- **Username Assignment**: Each client is prompted to choose a unique username before they can chat.
- **Broadcasting Messages**: When a client sends a message, it is broadcasted to all connected clients, allowing them to see the message in real-time.
- **Connection Management**: Clients are automatically notified when a user joins or leaves the chat.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Basic knowledge of socket programming in Java

## Compilation & Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/chat-application.git
   cd chat-application
   ```

2. Compile the Java files:
   ```bash
   javac ChatApplication.java
   ```

3. Run the server:
   ```bash
   java ChatApplication
   ```

4. The server will automatically start in a separate thread, and the client will start in the main thread. To simulate multiple clients, open multiple terminal windows and run the client on different terminals.

## How It Works

### Server
- The server listens for incoming client connections on port `12345`.
- For each client, a new thread (`ClientHandler`) is created to handle communication.
- Clients send their usernames to the server, and the server broadcasts messages to all connected clients using a shared `Set` of `PrintWriter` objects.
- When a client disconnects, the server removes the client's writer from the list and notifies all other clients.

### Client
- The client connects to the server at `127.0.0.1` (localhost) on port `12345`.
- It prompts the user to enter a username, then establishes a connection with the server.
- The client listens for incoming messages from the server and displays them on the console.
- The user can send messages, which are sent to the server and broadcasted to all connected clients.

## Example Usage

### Server Output:
```
Chat server started...
```

### Client Output (User 1):
```
Enter your username:
John
Welcome, John!
```

### Client Output (User 2):
```
Enter your username:
Jane
Welcome, Jane!
```

### Chat Messages:
```
John: Hello, everyone!
Jane: Hi John!
John: How are you, Jane?
Jane: I'm doing well, thanks!
```

When one user leaves, a notification is broadcast to all users:

```
John has left the chat.
```

## Code Structure

### `ChatApplication.java`
The main class that starts both the server and the client:
- The server runs in a separate thread (`startServer()`), which listens for incoming client connections and handles them with the `ClientHandler` class.
- The client is started in the main thread (`startClient()`), where it connects to the server, sends and receives messages.

### `ClientHandler` Class
- Each instance of `ClientHandler` represents a connected client.
- The server assigns a `PrintWriter` object for each client, which is used to send messages to the client.
- The `broadcast` method is used to send messages to all connected clients.
- When a client disconnects, the `ClientHandler` thread ensures that the client’s output stream is removed from the `clientWriters` set.

### `startServer()` Method
- The server socket listens on port `12345` for incoming client connections.
- For each client connection, a new `ClientHandler` thread is created.

### `startClient()` Method
- The client connects to the server at `127.0.0.1` on port `12345`.
- The client prompts the user to enter a username, sends it to the server, and waits for messages from other clients.
- The client also allows the user to send messages to the server.

## Example Client Interaction

1. **User 1** starts the client and enters the username "John."
   ```
   Enter your username:
   John
   Welcome, John!
   ```

2. **User 2** starts another instance of the client and enters the username "Jane."
   ```
   Enter your username:
   Jane
   Welcome, Jane!
   ```

3. **User 1** sends a message:
   ```
   John: Hello, everyone!
   ```

4. **User 2** sends a message:
   ```
   Jane: Hi John!
   ```

5. **User 1** sends another message:
   ```
   John: How are you, Jane?
   ```

6. If **User 1** disconnects:
   ```
   John has left the chat.
   ```
