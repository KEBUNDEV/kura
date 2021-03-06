/*******************************************************************************
 * Copyright (c) 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package org.eclipse.kura.asset;

/**
 * This represents all the Kura Asset specific flag codes
 */
public enum AssetFlag {
    /**
     * In case of any failure on the channel
     */
    FAILURE,
    /**
     * In case of successful reading operation
     */
    READ_SUCCESSFUL,

    /**
     * In case of successful writing operation
     */
    WRITE_SUCCESSFUL;
}
