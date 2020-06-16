/*
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package fromjava.packages;

import java.rmi.Remote;
import java.rmi.RemoteException;


import jakarta.jws.WebService;

@WebService(targetNamespace="portypeNamespace")
public interface EchoIF {
    public String getX(fromjava.packages.x.NameA x);
    public String getY(fromjava.packages.y.NameA y);
}

