/*
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package fromjava.hierarchy.ws.soap.service;

import jakarta.jws.WebService;

import fromjava.hierarchy.ws.soap.iface.IFace;

@WebService(name = "SoapService", targetNamespace = "http://fromjava/hierarchy/ws/soap/iface")
public interface ServiceIface extends IFace {
}
