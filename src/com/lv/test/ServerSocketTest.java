package com.lv.test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

public class ServerSocketTest {
	
	
	private int blockSize = 4096;
	
	private ByteBuffer sendBuffer =  ByteBuffer.allocate(blockSize);
	
	private ByteBuffer recevBuffer = ByteBuffer.allocate(blockSize);
	
	private Selector selector;
	
	public  ServerSocketTest(int port) throws IOException {
		ServerSocketChannel serverSocketChannel =  ServerSocketChannel.open();
		//设置是否阻塞
		serverSocketChannel.configureBlocking(false);
		//获取ServerSocket实例
		ServerSocket serverSocket = serverSocketChannel.socket();
		//绑定端口
		serverSocket.bind(new InetSocketAddress(port));
		
		selector = Selector.open();
		serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
		System.out.println("server start -> " + port);
	}
	
	//监听
	public void listen() throws IOException {
		while(true) {
			selector.select();
			Set<SelectionKey> selectionKeys = selector.selectedKeys();
			Iterator<SelectionKey> keys = selectionKeys.iterator();
			while (keys.hasNext())  {
				SelectionKey sk = keys.next();
				keys.remove();
			}
		}
	}
	
	public void handleKey(SelectionKey key) {
		
	}
	
	public static void main(String[] args) {
        
	}
}
