/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.modelinglab.utils.serialize.core;

import java.io.IOException;

/**
 *
 */
public class SerializerIOException extends SerializerException {

    public SerializerIOException(IOException ex) {
        super(ex);
    }

    public SerializerIOException(String message, IOException ex) {
        super(message, ex);
    }
}
