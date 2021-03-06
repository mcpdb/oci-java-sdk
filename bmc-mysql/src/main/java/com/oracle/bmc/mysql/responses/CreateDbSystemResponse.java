/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.responses;

import com.oracle.bmc.mysql.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateDbSystemResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * The URI for the entity being described in the response body.
     */
    private String location;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a specific request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * OCID of the WorkRequest associated with this operation.
     */
    private String opcWorkRequestId;

    /**
     * The returned DbSystem instance.
     */
    private DbSystem dbSystem;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateDbSystemResponse o) {
            etag(o.getEtag());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            dbSystem(o.getDbSystem());

            return this;
        }
    }
}
