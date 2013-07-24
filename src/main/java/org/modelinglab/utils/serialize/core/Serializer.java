/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.modelinglab.utils.serialize.core;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URL;

/**
 * This interface is implemented by all ModelingLab Serializers
 */
public interface Serializer {

    public <E> E load(InputStream is, Class<E> expectedClass) throws SerializerException, ClassCastException;

    public <E> E load(URL resourceUri, Class<E> expectedClass) throws SerializerException, ClassCastException;

    public <E> E load(File resourceFile, Class<E> expectedClass) throws SerializerException, ClassCastException;

    public void save(Object object, OutputStream output) throws SerializerException;

    public void save(Object object, File output) throws SerializerException;
}
