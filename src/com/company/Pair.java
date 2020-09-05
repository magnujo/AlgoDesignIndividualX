/*
 * Copyright (c) 2010, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.company;

//import javafx.beans.NamedArg;

import java.io.Serializable;

/**
 * <p>A convenience class to represent name-value pairs.</p>
 * @since JavaFX 2.0
 */
public class Pair<Int> implements Comparable <Pair>{

   /**
    * Key of this <code>Pair</code>.
    */
   private int key;

   /**
    * Gets the key for this pair.
    * @return key for this pair
    */
   public int getKey() { return key; }

   /**
    * Value of this this <code>Pair</code>.
    */
   private int value;

   /**
    * Gets the value for this pair.
    * @return value for this pair
    */
   public int getValue() { return value; }

   /**
    * Creates a new pair
    * @param key The key for this pair
    * @param value The value to use for this pair
    */
   public Pair(int key, int value) {
       this.key = key;
       this.value = value;
   }

   /**
    * <p><code>String</code> representation of this
    * <code>Pair</code>.</p>
    *
    * <p>The default name/value delimiter '=' is always used.</p>
    *
    *  @return <code>String</code> representation of this <code>Pair</code>
    */
   @Override
   public String toString() {
       return key + "=" + value;
   }


    @Override
    public int compareTo(Pair o) {
        if(getValue()>o.getValue()) return 1;

        else if (getValue()<o.getValue()) return -1;

        else return 0;
    }
}

