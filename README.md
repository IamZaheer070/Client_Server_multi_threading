**Client-Server Application Project** With socket Programming  **Port Scanning with Sockets**

This project contains a series of client-server applications developed in Java. Each application demonstrates different aspects of client-server communication, multithreading, and network programming.

**Project Overview**
1. **String Manipulation with Multithreading**
**Client-Server Communication:** The client sends a string (e.g., "Hello") to the server.

**Server-Side Processing:**

The server reverses the characters of the string.
The server reverses the capitalization (e.g., "network" becomes "OLLEH").

**Multi-Client Support:** 

The server can handle multiple clients simultaneously using multithreading.
**Client-Side Display:** 

The client receives the processed string from the server and displays it.

2. **Interactive Question-Answer System**
Client-Server Interaction:

The server asks a series of questions (e.g., "What is your name?") and the client responds.

Server Logic: 
The server handles the client's responses and provides relevant answers based on predefined conditions (e.g., if the question contains "name", the server responds with "hamza").

Scalability:
The server is designed to handle multiple clients simultaneously through multithreading.

4. **Port Scanning with Sockets**
Network Security:

The program scans the ports of a server to identify which ports are open.
**Socket Programming:**

Utilizes Java's socket API to connect to each port on the server.
Multi-Threading: The port scanning operation can be optimized with multithreading to enhance the scanning speed
