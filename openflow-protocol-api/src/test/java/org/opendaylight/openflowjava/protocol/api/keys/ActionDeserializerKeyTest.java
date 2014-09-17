/*
 * Copyright (c) 2014 Pantheon Technologies s.r.o. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.openflowjava.protocol.api.keys;

import org.junit.Assert;
import org.junit.Test;
import org.opendaylight.openflowjava.protocol.api.util.EncodeConstants;

/**
 * @author michal.polkorab
 *
 */
public class ActionDeserializerKeyTest {

    /**
     * Test ActionDeserializerKey equals and hashCode
     */
    @Test
    public void test() {
        ActionDeserializerKey key1 = new ActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, 11, 42L);
        ActionDeserializerKey key2 = new ActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, 11, 42L);
        Assert.assertTrue("Wrong equals", key1.equals(key2));
        Assert.assertTrue("Wrong hashcode", key1.hashCode() == key2.hashCode());
        key2 = new ActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, 11, null);
        Assert.assertFalse("Wrong equals", key1.equals(key2));
        Assert.assertFalse("Wrong hashcode", key1.hashCode() == key2.hashCode());
        key2 = new ActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, 11, 55L);
        Assert.assertFalse("Wrong equals", key1.equals(key2));
        Assert.assertFalse("Wrong hashcode", key1.hashCode() == key2.hashCode());
        key2 = new ActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, 0, 42L);
        Assert.assertFalse("Wrong equals", key1.equals(key2));
        Assert.assertFalse("Wrong hashcode", key1.hashCode() == key2.hashCode());
        key2 = new ActionDeserializerKey(EncodeConstants.OF13_VERSION_ID, 11, 42L);
        Assert.assertFalse("Wrong equals", key1.equals(key2));
        Assert.assertFalse("Wrong hashcode", key1.hashCode() == key2.hashCode());
    }
}