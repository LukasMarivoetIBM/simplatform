package dev.galasa.simframe.listener;

import java.net.Socket;

public interface IListener extends Runnable{
	
	public void setSocket(Socket socket);

}