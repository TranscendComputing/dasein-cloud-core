/**
 * Copyright (C) 2009-2012 enStratus Networks Inc.
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.dasein.cloud.network;

/**
 * <p>
 * A network protocol for firewall rules.
 * </p>
 * @author George Reese @ enStratus (http://www.enstratus.com)
 * @version 2013.01 Added IPSec (Issue #15)
 * @version 2013.02 Added ANY (issue #31)
 */
public enum Protocol {
    /**
     * The TCP protocol.
     */
    TCP, 
    /**
     * The UDP datagram protocol.
     */
    UDP, 
    /**
     * The ICMP protocol. 
     */
    ICMP,
    /**
     * IPsec
     */
    IPSEC,
    /**
     * Any protocol
     */
    ANY
}
