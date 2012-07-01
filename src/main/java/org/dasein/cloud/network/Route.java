/**
 * ========= CONFIDENTIAL =========
 *
 * Copyright (C) 2012 enStratus Networks Inc - ALL RIGHTS RESERVED
 *
 * ====================================================================
 *  NOTICE: All information contained herein is, and remains the
 *  property of enStratus Networks Inc. The intellectual and technical
 *  concepts contained herein are proprietary to enStratus Networks Inc
 *  and may be covered by U.S. and Foreign Patents, patents in process,
 *  and are protected by trade secret or copyright law. Dissemination
 *  of this information or reproduction of this material is strictly
 *  forbidden unless prior written permission is obtained from
 *  enStratus Networks Inc.
 * ====================================================================
 */
package org.dasein.cloud.network;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Represents a single route in a routing table. The route includes a destination CIDR and a gateway ID or address.
 * <p>Created by George Reese: 6/30/12 5:16 PM</p>
 * @author George Reese (george.reese@imaginary.com)
 * @since 2012.07
 * @version 2012.07 initial version
 */
@SuppressWarnings("UnusedDeclaration")
public class Route {
    static public Route getRouteToAddress(@Nonnull IPVersion version, @Nonnull String destination, @Nonnull String gatewayAddress) {
        Route r = new Route();
        
        r.version = version;
        r.destinationCidr = destination;
        r.gatewayAddress = gatewayAddress;
        return r;
    }

    static public Route getRouteToGateway(@Nonnull IPVersion version, @Nonnull String destination, @Nonnull String gatewayId) {
        Route r = new Route();

        r.version = version;
        r.destinationCidr = destination;
        r.gatewayId = gatewayId;
        return r;
    }

    static public Route getRouteToNetworkInterface(@Nonnull IPVersion version, @Nonnull String destination, @Nonnull String nicId) {
        Route r = new Route();

        r.version = version;
        r.destinationCidr = destination;
        r.gatewayNetworkInterfaceId = nicId;
        return r;
    }
    
    static public Route getRouteToVirtualMachine(@Nonnull IPVersion version, @Nonnull String destination, @Nonnull String ownerId, @Nonnull String vmId) {
        Route r = new Route();

        r.version = version;
        r.destinationCidr = destination;
        r.gatewayOwnerId = ownerId;
        r.gatewayVirtualMachineId = vmId;
        return r;
    }
    
    private String    destinationCidr;
    private String    gatewayAddress;
    private String    gatewayId;
    private String    gatewayOwnerId;
    private String    gatewayNetworkInterfaceId;
    private String    gatewayVirtualMachineId;
    private IPVersion version;
    
    private Route() { }

    public @Nonnull String getDestinationCidr() {
        return destinationCidr;
    }

    public @Nullable String getGatewayAddress() {
        return gatewayAddress;
    }

    public @Nullable String getGatewayId() {
        return gatewayId;
    }

    public @Nullable String getGatewayNetworkInterfaceId() {
        return gatewayNetworkInterfaceId;
    }
    
    public @Nullable String getGatewayOwnerId() {
        return gatewayOwnerId;
    }
    
    public @Nullable String getGatewayVirtualMachineId() {
        return gatewayVirtualMachineId;
    }

    public @Nonnull IPVersion getVersion() {
        return version;
    }

    public String toString() {
        return (destinationCidr + " [" + version + "] -> " + (gatewayId == null ? gatewayAddress : gatewayId));
    }
}