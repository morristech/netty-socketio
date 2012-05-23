/**
 * Copyright 2012 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.corundumstudio.socketio;

import java.net.SocketAddress;
import java.util.UUID;

import com.corundumstudio.socketio.parser.Packet;

public interface SocketIOClient {

    /**
     * Client session id, uses {@link UUID} object
     *
     * @return - session id
     */
    UUID getSessionId();

    /**
     * Send message
     *
     * @param message - message to send
     */
    void sendMessage(String message);

    /**
     * Send message with ack callback
     *
     * @param message - message to send
     * @param ackCallback - ack callback
     */
    void sendMessage(String message, AckCallback ackCallback);

    /**
     * Send object. Object will be encoded to json-format.
     *
     * @param object - object to send
     */
    void sendJsonObject(Object object);

    /**
     * Send object with ack callback
     *
     * @param object - object to send
     * @param ackCallback - ack callback
     */
    void sendJsonObject(Object object, AckCallback ackCallback);

    /**
     * Send packet
     *
     * @param packet - packet to send
     */
    void send(Packet packet);

    /**
     * Send packet with ack callback
     *
     * @param packet - packet to send
     * @param ackCallback - ack callback
     */
    void send(Packet packet, AckCallback ackCallback);

    /**
     * Disconnect client
     *
     */
    void disconnect();

    /**
     * Send event
     *
     * @param name - event name
     * @param data - event data
     */
    void sendEvent(String name, Object data);

    /**
     * Send event with ack callback
     *
     * @param name - event name
     * @param data - event data
     * @param ackCallback - ack callback
     */
    void sendEvent(String name, Object data, AckCallback ackCallback);

    SocketAddress getRemoteAddress();

}
