/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetClusterOptionsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The id of the option set to retrieve. Only \"all\" is supported.
     */
    private String clusterOptionId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetClusterOptionsRequest o) {
            clusterOptionId(o.getClusterOptionId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of GetClusterOptionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetClusterOptionsRequest
         */
        public GetClusterOptionsRequest build() {
            GetClusterOptionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
