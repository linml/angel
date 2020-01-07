package com.xmsy.server.zxyy.calculate.modules.manager.push.def;

import lombok.Data;

/**
 * 消息实体
 * 
 * @author aleng
 *
 */
@Data
public class MessageEntity {

	public MessageEntity() {
		super();
	}

	public MessageEntity(GameServerMessage server, ClientMessage client) {
		super();
		Server = server;
		Client = client;
	}

	/**
	 * 服务端信息
	 */
	private GameServerMessage Server;
	/**
	 * 客户端信息
	 */
	private ClientMessage Client;

}