/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetAutonomousPatchResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you contact Oracle about
     * a particular request, then you must provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned AutonomousPatch instance.
     */
    private AutonomousPatch autonomousPatch;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAutonomousPatchResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            autonomousPatch(o.getAutonomousPatch());

            return this;
        }
    }
}
