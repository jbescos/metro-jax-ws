/*
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package fromjava.packages.x;

import fromjava.packages.IName;

import jakarta.xml.bind.annotation.XmlType;

@XmlType(name="NameAX")
public class NameA implements IName {

    @Override
    public String getName() {
        return "x";
    }

}
