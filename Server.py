import socket 
from threading import Thread 
from SocketServer import ThreadingMixIn 

# mesaj -> typte-value 
# seklinde string olacaktır.

class Client(Thread): 
 
    def __init__(self,ip,port,connection):
        Thread.__init__(self) 
        self.ip = ip 
        self.port = port
		self.connection=connection
		self.isRunning=False


	def workIt(self):
		self.isRunning=True
		self.start() #thread nesnesinde run fonksiyonunu çalıştırır
		
	def stop(self):
		self.isRunning=False
		self.connection.close()	
		
    def run(self):
        while isRunning : 
            message = self.connection.recv(2048) #mesaj bekleme
			self.messageReceived(message)
            
	def messageReceived(self,message):
		print(message)
		
	def sendMessage(self,message):
		self.connection.send(message) 
		

		
class Server(Thread): #server sadece port gerekir

	def __init(self,port):
		Thread.__init__(self)
		self.ip = '0.0.0.0' 
		self.port = port 
		self.buffer_size = 1024
		self.serverSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
		self.serverSocket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1) 
		self.serverSocket.bind((self.ip, self.port)) 
		self.clients = []
		self.isRunning=False
		
	def run(self):
		while self.isRunning: 
			self.serverSocket.listen(4) 
			print( "Multithreaded Python server : Waiting for connections from TCP clients..." )
			(connection, (ip,port)) = self.serverSocket.accept() #client bekleme
			newClient = Client(ip,port,connection) 
			self.clients.append(newClient) 
	
	def workIt(self):
		self.isRunning=True
		self.start()

	def stop(self):
		self.isRunning=False
		for theClient in self.clients:
			theClient.stop()
			theClient.join()
