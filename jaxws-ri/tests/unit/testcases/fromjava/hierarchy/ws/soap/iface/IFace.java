/*
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package fromjava.hierarchy.ws.soap.iface;

import jakarta.jws.WebMethod;

import fromjava.hierarchy.ws.iface.SomeObject;

public interface IFace extends fromjava.hierarchy.ws.iface.IFace {
    @Override
    @WebMethod(action = "http://fromjava/hierarchy/ws/soap/iface/getSomeObject")
    public SomeObject getSomeObject();
}
